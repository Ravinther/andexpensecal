package com.dropbox.client2;

import com.dropbox.client2.p029a.C0355k;
import com.dropbox.client2.p030c.C0357m;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;

/* renamed from: com.dropbox.client2.a */
public class C0356a<SESS_T extends C0357m> {
    public static final String f2337a;
    protected final SESS_T f2338b;

    static {
        f2337a = C0391o.m2359a();
    }

    public C0356a(SESS_T sess_t) {
        if (sess_t == null) {
            throw new IllegalArgumentException("Session must not be null.");
        }
        this.f2338b = sess_t;
    }

    private C0379i m2280a(String str, InputStream inputStream, long j, boolean z, String str2, C0386j c0386j) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("path is null or empty.");
        }
        m2290b();
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        String str3 = "/files_put/" + this.f2338b.m2303f() + str;
        if (str2 == null) {
            str2 = "";
        }
        HttpRequest httpPut = new HttpPut(C0389m.m2351a(this.f2338b.m2309l(), 1, str3, new String[]{"overwrite", String.valueOf(z), "parent_rev", str2, "locale", this.f2338b.m2304g().toString()}));
        this.f2338b.m2301a(httpPut);
        HttpEntity inputStreamEntity = new InputStreamEntity(inputStream, j);
        inputStreamEntity.setContentEncoding("application/octet-stream");
        inputStreamEntity.setChunked(false);
        httpPut.setEntity(c0386j != null ? new C0387k(inputStreamEntity, c0386j) : inputStreamEntity);
        return new C0380c(httpPut, this.f2338b);
    }

    protected static boolean m2281a(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        return (obj == null || !(obj instanceof Boolean)) ? false : ((Boolean) obj).booleanValue();
    }

    protected static long m2282b(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (obj instanceof String) {
                return Long.parseLong((String) obj, 16);
            }
        }
        return 0;
    }

    public SESS_T m2283a() {
        return this.f2338b;
    }

    public C0381d m2284a(String str, String str2, OutputStream outputStream, C0386j c0386j) {
        C0382e a = m2285a(str, str2);
        a.m2343a(outputStream, c0386j);
        return a.m2342a();
    }

    public C0382e m2285a(String str, String str2) {
        m2290b();
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        HttpUriRequest httpGet = new HttpGet(C0389m.m2351a(this.f2338b.m2309l(), 1, "/files/" + this.f2338b.m2303f() + str, new String[]{"rev", str2, "locale", this.f2338b.m2304g().toString()}));
        this.f2338b.m2301a((HttpRequest) httpGet);
        return new C0382e(httpGet, C0389m.m2353a(this.f2338b, httpGet));
    }

    public C0383f m2286a(String str, int i, String str2, boolean z, String str3) {
        m2290b();
        if (i <= 0) {
            i = 25000;
        }
        String[] strArr = new String[]{"file_limit", String.valueOf(i), "hash", str2, "list", String.valueOf(z), "rev", str3, "locale", this.f2338b.m2304g().toString()};
        return new C0383f((Map) C0389m.m2349a(C0390n.GET, this.f2338b.m2308k(), "/metadata/" + this.f2338b.m2303f() + str, 1, strArr, this.f2338b));
    }

    public C0379i m2287a(String str, InputStream inputStream, long j, C0386j c0386j) {
        return m2280a(str, inputStream, j, true, null, c0386j);
    }

    public void m2288a(String str) {
        m2290b();
        C0389m.m2349a(C0390n.POST, this.f2338b.m2308k(), "/fileops/delete", 1, new String[]{"root", this.f2338b.m2303f().toString(), "path", str, "locale", this.f2338b.m2304g().toString()}, this.f2338b);
    }

    public C0383f m2289b(String str, String str2) {
        m2290b();
        return new C0383f((Map) C0389m.m2349a(C0390n.POST, this.f2338b.m2308k(), "/fileops/copy", 1, new String[]{"root", this.f2338b.m2303f().toString(), "from_path", str, "to_path", str2, "locale", this.f2338b.m2304g().toString()}, this.f2338b));
    }

    protected void m2290b() {
        if (!this.f2338b.m2305h()) {
            throw new C0355k();
        }
    }
}
