package com.dropbox.client2.p030c;

import com.dropbox.client2.C0356a;
import com.dropbox.client2.C0392p;
import java.net.URLEncoder;
import java.util.Locale;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: com.dropbox.client2.c.a */
public abstract class C0358a implements C0357m {
    private final C0377n f2353a;
    private final C0376l f2354b;
    private C0375k f2355c;
    private String f2356d;
    private HttpClient f2357e;

    public C0358a(C0376l c0376l, C0377n c0377n) {
        this(c0376l, c0377n, null);
    }

    public C0358a(C0376l c0376l, C0377n c0377n, C0375k c0375k) {
        this.f2355c = null;
        this.f2356d = null;
        this.f2357e = null;
        if (c0376l == null) {
            throw new IllegalArgumentException("'appKeyPair' must be non-null");
        } else if (c0377n == null) {
            throw new IllegalArgumentException("'type' must be non-null");
        } else {
            this.f2354b = c0376l;
            this.f2353a = c0377n;
            this.f2355c = c0375k;
        }
    }

    private static String m2310a(C0376l c0376l, C0375k c0375k) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OAuth oauth_version=\"1.0\"");
        stringBuilder.append(", oauth_signature_method=\"PLAINTEXT\"");
        stringBuilder.append(", oauth_consumer_key=\"").append(C0358a.m2311b(c0376l.a)).append("\"");
        if (c0375k != null) {
            stringBuilder.append(", oauth_token=\"").append(C0358a.m2311b(c0375k.a)).append("\"");
            str = C0358a.m2311b(c0376l.b) + "&" + C0358a.m2311b(c0375k.b);
        } else {
            str = C0358a.m2311b(c0376l.b) + "&";
        }
        stringBuilder.append(", oauth_signature=\"").append(str).append("\"");
        return stringBuilder.toString();
    }

    private static String m2311b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable e) {
            AssertionError assertionError = new AssertionError("UTF-8 isn't available");
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public void m2312a(C0375k c0375k) {
        if (c0375k == null) {
            throw new IllegalArgumentException("'oauth1AccessToken' must be non-null");
        }
        this.f2355c = c0375k;
        this.f2356d = null;
    }

    public void m2313a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'oauth2AccessToken' must be non-null");
        }
        this.f2356d = str;
        this.f2355c = null;
    }

    public void m2314a(HttpRequest httpRequest) {
        httpRequest.addHeader("Authorization", this.f2356d != null ? "Bearer " + this.f2356d : C0358a.m2310a(this.f2354b, this.f2355c));
    }

    public void m2315a(HttpUriRequest httpUriRequest) {
        HttpParams params = httpUriRequest.getParams();
        HttpConnectionParams.setSoTimeout(params, 30000);
        HttpConnectionParams.setConnectionTimeout(params, 30000);
    }

    public void m2316c() {
        this.f2355c = null;
        this.f2356d = null;
    }

    public C0376l m2317d() {
        return this.f2354b;
    }

    public C0375k m2318e() {
        return this.f2355c;
    }

    public C0377n m2319f() {
        return this.f2353a;
    }

    public Locale m2320g() {
        return Locale.ENGLISH;
    }

    public boolean m2321h() {
        return (this.f2355c == null && this.f2356d == null) ? false : true;
    }

    public synchronized C0378o m2322i() {
        return null;
    }

    public synchronized HttpClient m2323j() {
        if (this.f2357e == null) {
            HttpParams basicHttpParams = new BasicHttpParams();
            ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new C0365b(this));
            ConnManagerParams.setMaxTotalConnections(basicHttpParams, 20);
            try {
                SocketFactory c0392p = new C0392p();
                SchemeRegistry schemeRegistry = new SchemeRegistry();
                schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                schemeRegistry.register(new Scheme("https", c0392p, 443));
                ClientConnectionManager c0369f = new C0369f(basicHttpParams, schemeRegistry);
                basicHttpParams = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
                HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
                HttpProtocolParams.setUserAgent(basicHttpParams, "OfficialDropboxJavaSDK/" + C0356a.f2337a);
                HttpClient c0366c = new C0366c(this, c0369f, basicHttpParams);
                c0366c.addRequestInterceptor(new C0367d(this));
                c0366c.addResponseInterceptor(new C0368e(this));
                this.f2357e = c0366c;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            } catch (Throwable e222) {
                throw new RuntimeException(e222);
            } catch (Throwable e2222) {
                throw new RuntimeException(e2222);
            } catch (Throwable e22222) {
                throw new RuntimeException(e22222);
            }
        }
        return this.f2357e;
    }

    public String m2324k() {
        return "api.dropbox.com";
    }

    public String m2325l() {
        return "api-content.dropbox.com";
    }
}
