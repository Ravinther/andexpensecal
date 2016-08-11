package com.google.api.client.googleapis.p074d;

import com.google.api.client.googleapis.C0750b;
import com.google.api.client.googleapis.p066a.C0738a;
import com.google.api.client.googleapis.p066a.C0740b;
import com.google.api.client.googleapis.p073c.C0751a;
import com.google.api.client.googleapis.p073c.C0754d;
import com.google.api.client.p050d.C0656w;
import com.google.api.client.p050d.am;
import com.google.api.client.p051b.C0663y;
import com.google.api.client.p051b.C0670l;
import com.google.api.client.p051b.C0672b;
import com.google.api.client.p051b.C0679e;
import com.google.api.client.p051b.C0684i;
import com.google.api.client.p051b.C0686k;
import com.google.api.client.p051b.C0688p;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0694v;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.aj;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.api.client.googleapis.d.c */
public abstract class C0762c<T> extends C0656w {
    private final C0758a abstractGoogleClient;
    private boolean disableGZipContent;
    private C0751a downloader;
    private final C0670l httpContent;
    private C0688p lastResponseHeaders;
    private int lastStatusCode;
    private String lastStatusMessage;
    private C0688p requestHeaders;
    private final String requestMethod;
    private Class<T> responseClass;
    private C0754d uploader;
    private final String uriTemplate;

    protected C0762c(C0758a c0758a, String str, String str2, C0670l c0670l, Class<T> cls) {
        this.requestHeaders = new C0688p();
        this.lastStatusCode = -1;
        this.responseClass = (Class) am.m6911a((Object) cls);
        this.abstractGoogleClient = (C0758a) am.m6911a((Object) c0758a);
        this.requestMethod = (String) am.m6911a((Object) str);
        this.uriTemplate = (String) am.m6911a((Object) str2);
        this.httpContent = c0670l;
        String applicationName = c0758a.getApplicationName();
        if (applicationName != null) {
            this.requestHeaders.m6747l(applicationName);
        }
    }

    private C0692t buildHttpRequest(boolean z) {
        boolean z2 = false;
        am.m6914a(this.uploader == null);
        if (!z || this.requestMethod.equals("GET")) {
            z2 = true;
        }
        am.m6914a(z2);
        C0692t a = getAbstractGoogleClient().getRequestFactory().m6802a(z ? "HEAD" : this.requestMethod, buildHttpRequestUrl(), this.httpContent);
        new C0750b().a_(a);
        a.m6775a(getAbstractGoogleClient().getObjectParser());
        if (this.httpContent == null && (this.requestMethod.equals("POST") || this.requestMethod.equals("PUT") || this.requestMethod.equals("PATCH"))) {
            a.m6772a(new C0679e());
        }
        a.m6786g().putAll(this.requestHeaders);
        if (!this.disableGZipContent) {
            a.m6777a(true);
            a.m6773a(new C0684i());
        }
        a.m6768a(new C0767d(this, a.m6789j(), a));
        return a;
    }

    private C0695x executeUnparsed(boolean z) {
        C0695x n;
        if (this.uploader == null) {
            n = buildHttpRequest(z).m6793n();
        } else {
            C0686k buildHttpRequestUrl = buildHttpRequestUrl();
            boolean m = getAbstractGoogleClient().getRequestFactory().m6802a(this.requestMethod, buildHttpRequestUrl, this.httpContent).m6792m();
            n = this.uploader.m7036a(this.requestHeaders).m7038a(this.disableGZipContent).m7034a(buildHttpRequestUrl);
            n.m6813f().m6775a(getAbstractGoogleClient().getObjectParser());
            if (m && !n.m6810c()) {
                throw newExceptionOnError(n);
            }
        }
        this.lastResponseHeaders = n.m6809b();
        this.lastStatusCode = n.m6811d();
        this.lastStatusMessage = n.m6812e();
        return n;
    }

    public C0692t buildHttpRequest() {
        return buildHttpRequest(false);
    }

    public C0686k buildHttpRequestUrl() {
        return new C0686k(aj.m6630a(this.abstractGoogleClient.getBaseUrl(), this.uriTemplate, (Object) this, true));
    }

    protected C0692t buildHttpRequestUsingHead() {
        return buildHttpRequest(true);
    }

    protected final void checkRequiredParameter(Object obj, String str) {
        boolean z = this.abstractGoogleClient.getSuppressRequiredParameterChecks() || obj != null;
        am.m6916a(z, "Required parameter %s must be specified", str);
    }

    public T execute() {
        C0695x executeUnparsed = executeUnparsed();
        if (!Void.class.equals(this.responseClass)) {
            return executeUnparsed.m6806a(this.responseClass);
        }
        executeUnparsed.m6815h();
        return null;
    }

    public void executeAndDownloadTo(OutputStream outputStream) {
        executeUnparsed().m6808a(outputStream);
    }

    public InputStream executeAsInputStream() {
        return executeUnparsed().m6814g();
    }

    protected C0695x executeMedia() {
        set("alt", (Object) "media");
        return executeUnparsed();
    }

    protected void executeMediaAndDownloadTo(OutputStream outputStream) {
        if (this.downloader == null) {
            executeMedia().m6808a(outputStream);
        } else {
            this.downloader.m7025a(buildHttpRequestUrl(), this.requestHeaders, outputStream);
        }
    }

    protected InputStream executeMediaAsInputStream() {
        return executeMedia().m6814g();
    }

    public C0695x executeUnparsed() {
        return executeUnparsed(false);
    }

    protected C0695x executeUsingHead() {
        am.m6914a(this.uploader == null);
        C0695x executeUnparsed = executeUnparsed(true);
        executeUnparsed.m6815h();
        return executeUnparsed;
    }

    public C0758a getAbstractGoogleClient() {
        return this.abstractGoogleClient;
    }

    public final boolean getDisableGZipContent() {
        return this.disableGZipContent;
    }

    public final C0670l getHttpContent() {
        return this.httpContent;
    }

    public final C0688p getLastResponseHeaders() {
        return this.lastResponseHeaders;
    }

    public final int getLastStatusCode() {
        return this.lastStatusCode;
    }

    public final String getLastStatusMessage() {
        return this.lastStatusMessage;
    }

    public final C0751a getMediaHttpDownloader() {
        return this.downloader;
    }

    public final C0754d getMediaHttpUploader() {
        return this.uploader;
    }

    public final C0688p getRequestHeaders() {
        return this.requestHeaders;
    }

    public final String getRequestMethod() {
        return this.requestMethod;
    }

    public final Class<T> getResponseClass() {
        return this.responseClass;
    }

    public final String getUriTemplate() {
        return this.uriTemplate;
    }

    protected final void initializeMediaDownload() {
        C0694v requestFactory = this.abstractGoogleClient.getRequestFactory();
        this.downloader = new C0751a(requestFactory.m6799a(), requestFactory.m6804b());
    }

    protected final void initializeMediaUpload(C0672b c0672b) {
        C0694v requestFactory = this.abstractGoogleClient.getRequestFactory();
        this.uploader = new C0754d(c0672b, requestFactory.m6799a(), requestFactory.m6804b());
        this.uploader.m7037a(this.requestMethod);
        if (this.httpContent != null) {
            this.uploader.m7035a(this.httpContent);
        }
    }

    protected IOException newExceptionOnError(C0695x c0695x) {
        return new C0663y(c0695x);
    }

    public final <E> void queue(C0740b c0740b, Class<E> cls, C0738a<T, E> c0738a) {
        am.m6915a(this.uploader == null, (Object) "Batching media requests is not supported");
        c0740b.m6995a(buildHttpRequest(), getResponseClass(), cls, c0738a);
    }

    public C0762c<T> set(String str, Object obj) {
        return (C0762c) super.set(str, obj);
    }

    public C0762c<T> setDisableGZipContent(boolean z) {
        this.disableGZipContent = z;
        return this;
    }

    public C0762c<T> setRequestHeaders(C0688p c0688p) {
        this.requestHeaders = c0688p;
        return this;
    }
}
