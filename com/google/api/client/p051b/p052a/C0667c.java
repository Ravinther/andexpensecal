package com.google.api.client.p051b.p052a;

import com.google.api.client.p051b.ac;
import com.google.api.client.p051b.af;
import java.net.ProxySelector;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: com.google.api.client.b.a.c */
public final class C0667c extends ac {
    private final HttpClient f7383b;

    public C0667c() {
        this(C0667c.m6583c());
    }

    public C0667c(HttpClient httpClient) {
        this.f7383b = httpClient;
        HttpParams params = httpClient.getParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter("http.protocol.handle-redirects", false);
    }

    static DefaultHttpClient m6582a(SSLSocketFactory sSLSocketFactory, HttpParams httpParams, ProxySelector proxySelector) {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", sSLSocketFactory, 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(httpParams, schemeRegistry), httpParams);
        defaultHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        if (proxySelector != null) {
            defaultHttpClient.setRoutePlanner(new ProxySelectorRoutePlanner(schemeRegistry, proxySelector));
        }
        return defaultHttpClient;
    }

    public static DefaultHttpClient m6583c() {
        return C0667c.m6582a(SSLSocketFactory.getSocketFactory(), C0667c.m6584d(), ProxySelector.getDefault());
    }

    static HttpParams m6584d() {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 200);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(20));
        return basicHttpParams;
    }

    protected /* synthetic */ af m6585a(String str, String str2) {
        return m6587b(str, str2);
    }

    public boolean m6586a(String str) {
        return true;
    }

    protected C0665a m6587b(String str, String str2) {
        HttpRequestBase httpDelete = str.equals("DELETE") ? new HttpDelete(str2) : str.equals("GET") ? new HttpGet(str2) : str.equals("HEAD") ? new HttpHead(str2) : str.equals("POST") ? new HttpPost(str2) : str.equals("PUT") ? new HttpPut(str2) : str.equals("TRACE") ? new HttpTrace(str2) : str.equals("OPTIONS") ? new HttpOptions(str2) : new C0669e(str, str2);
        return new C0665a(this.f7383b, httpDelete);
    }
}
