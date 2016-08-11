package com.google.api.client.googleapis.p074d;

import com.google.api.client.googleapis.p066a.C0740b;
import com.google.api.client.p050d.aj;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.ar;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0686k;
import com.google.api.client.p051b.C0694v;
import com.google.api.client.p051b.ac;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.googleapis.d.a */
public abstract class C0758a {
    static final Logger LOGGER;
    private final String applicationName;
    private final C0764f googleClientRequestInitializer;
    private final aj objectParser;
    private final C0694v requestFactory;
    private final String rootUrl;
    private final String servicePath;
    private boolean suppressPatternChecks;
    private boolean suppressRequiredParameterChecks;

    static {
        LOGGER = Logger.getLogger(C0758a.class.getName());
    }

    @Deprecated
    protected C0758a(ac acVar, C0659w c0659w, String str, String str2, aj ajVar) {
        this(acVar, c0659w, str, str2, ajVar, null, null, false);
    }

    @Deprecated
    protected C0758a(ac acVar, C0659w c0659w, String str, String str2, aj ajVar, C0764f c0764f, String str3, boolean z) {
        this.googleClientRequestInitializer = c0764f;
        this.rootUrl = C0758a.normalizeRootUrl(str);
        this.servicePath = C0758a.normalizeServicePath(str2);
        if (ar.m6924a(str3)) {
            LOGGER.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.applicationName = str3;
        this.requestFactory = c0659w == null ? acVar.m6578a() : acVar.m6579a(c0659w);
        this.objectParser = ajVar;
        this.suppressPatternChecks = z;
    }

    protected C0758a(C0760b c0760b) {
        this.googleClientRequestInitializer = c0760b.googleClientRequestInitializer;
        this.rootUrl = C0758a.normalizeRootUrl(c0760b.rootUrl);
        this.servicePath = C0758a.normalizeServicePath(c0760b.servicePath);
        if (ar.m6924a(c0760b.applicationName)) {
            LOGGER.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.applicationName = c0760b.applicationName;
        this.requestFactory = c0760b.httpRequestInitializer == null ? c0760b.transport.m6578a() : c0760b.transport.m6579a(c0760b.httpRequestInitializer);
        this.objectParser = c0760b.objectParser;
        this.suppressPatternChecks = c0760b.suppressPatternChecks;
        this.suppressRequiredParameterChecks = c0760b.suppressRequiredParameterChecks;
    }

    static String normalizeRootUrl(String str) {
        am.m6912a((Object) str, (Object) "root URL cannot be null.");
        return !str.endsWith("/") ? str + "/" : str;
    }

    static String normalizeServicePath(String str) {
        am.m6912a((Object) str, (Object) "service path cannot be null");
        if (str.length() == 1) {
            am.m6915a("/".equals(str), (Object) "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            return str.startsWith("/") ? str.substring(1) : str;
        }
    }

    public final C0740b batch() {
        return batch(null);
    }

    public final C0740b batch(C0659w c0659w) {
        C0740b c0740b = new C0740b(getRequestFactory().m6799a(), c0659w);
        c0740b.m6994a(new C0686k(getRootUrl() + "batch"));
        return c0740b;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getBaseUrl() {
        return this.rootUrl + this.servicePath;
    }

    public final C0764f getGoogleClientRequestInitializer() {
        return this.googleClientRequestInitializer;
    }

    public aj getObjectParser() {
        return this.objectParser;
    }

    public final C0694v getRequestFactory() {
        return this.requestFactory;
    }

    public final String getRootUrl() {
        return this.rootUrl;
    }

    public final String getServicePath() {
        return this.servicePath;
    }

    public final boolean getSuppressPatternChecks() {
        return this.suppressPatternChecks;
    }

    public final boolean getSuppressRequiredParameterChecks() {
        return this.suppressRequiredParameterChecks;
    }

    protected void initialize(C0762c<?> c0762c) {
        if (getGoogleClientRequestInitializer() != null) {
            getGoogleClientRequestInitializer().initialize(c0762c);
        }
    }
}
