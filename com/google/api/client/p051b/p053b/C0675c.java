package com.google.api.client.p051b.p053b;

import com.google.api.client.p050d.am;
import com.google.api.client.p051b.ac;
import com.google.api.client.p051b.af;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.api.client.b.b.c */
public final class C0675c extends ac {
    private static final String[] f7422b;
    private final Proxy f7423c;
    private final SSLSocketFactory f7424d;
    private final HostnameVerifier f7425e;

    static {
        f7422b = new String[]{"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        Arrays.sort(f7422b);
    }

    public C0675c() {
        this(null, null, null);
    }

    C0675c(Proxy proxy, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.f7423c = proxy;
        this.f7424d = sSLSocketFactory;
        this.f7425e = hostnameVerifier;
    }

    protected /* synthetic */ af m6662a(String str, String str2) {
        return m6664b(str, str2);
    }

    public boolean m6663a(String str) {
        return Arrays.binarySearch(f7422b, str) >= 0;
    }

    protected C0673a m6664b(String str, String str2) {
        am.m6916a(m6663a(str), "HTTP method %s not supported", str);
        URL url = new URL(str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) (this.f7423c == null ? url.openConnection() : url.openConnection(this.f7423c));
        httpURLConnection.setRequestMethod(str);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (this.f7425e != null) {
                httpsURLConnection.setHostnameVerifier(this.f7425e);
            }
            if (this.f7424d != null) {
                httpsURLConnection.setSSLSocketFactory(this.f7424d);
            }
        }
        return new C0673a(httpURLConnection);
    }
}
