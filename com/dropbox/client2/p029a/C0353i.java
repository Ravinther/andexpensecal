package com.dropbox.client2.p029a;

import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/* renamed from: com.dropbox.client2.a.i */
public class C0353i extends C0345a {
    public C0354j f2328a;
    public int f2329b;
    public String f2330c;
    public String f2331d;
    public String f2332e;
    public Map<String, Object> f2333f;

    public C0353i(HttpResponse httpResponse) {
        fillInStackTrace();
        StatusLine statusLine = httpResponse.getStatusLine();
        this.f2329b = statusLine.getStatusCode();
        this.f2330c = statusLine.getReasonPhrase();
        this.f2331d = C0353i.m2278a(httpResponse, "server");
        this.f2332e = C0353i.m2278a(httpResponse, "location");
    }

    public C0353i(HttpResponse httpResponse, Object obj) {
        this(httpResponse);
        if (obj != null && (obj instanceof Map)) {
            this.f2333f = (Map) obj;
            this.f2328a = new C0354j(this.f2333f);
        }
    }

    private static String m2278a(HttpResponse httpResponse, String str) {
        Header firstHeader = httpResponse.getFirstHeader(str);
        return firstHeader != null ? firstHeader.getValue() : null;
    }

    public static boolean m2279a(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 302) {
            String a = C0353i.m2278a(httpResponse, "location");
            if (a != null) {
                int indexOf = a.indexOf("://");
                if (indexOf > -1) {
                    a = a.substring(indexOf + 3);
                    indexOf = a.indexOf("/");
                    if (indexOf > -1 && a.substring(0, indexOf).toLowerCase().contains("dropbox.com")) {
                        return true;
                    }
                }
            }
        } else if (statusCode == 304) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "DropboxServerException (" + this.f2331d + "): " + this.f2329b + " " + this.f2330c + " (" + this.f2328a.f2334a + ")";
    }
}
