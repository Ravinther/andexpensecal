package com.dropbox.client2;

import com.dropbox.client2.p031b.C0363a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p018c.p025b.p026a.C0336a;

/* renamed from: com.dropbox.client2.f */
public class C0383f {
    public static final C0363a<C0383f> f2383o;
    public long f2384a;
    public String f2385b;
    public String f2386c;
    public boolean f2387d;
    public String f2388e;
    public String f2389f;
    public String f2390g;
    public String f2391h;
    public String f2392i;
    public String f2393j;
    public String f2394k;
    public boolean f2395l;
    public boolean f2396m;
    public List<C0383f> f2397n;

    static {
        f2383o = new C0384g();
    }

    public C0383f(Map<String, Object> map) {
        this.f2384a = C0356a.m2282b((Map) map, "bytes");
        this.f2385b = (String) map.get("hash");
        this.f2386c = (String) map.get("icon");
        this.f2387d = C0356a.m2281a((Map) map, "is_dir");
        this.f2388e = (String) map.get("modified");
        this.f2389f = (String) map.get("client_mtime");
        this.f2390g = (String) map.get("path");
        this.f2391h = (String) map.get("root");
        this.f2392i = (String) map.get("size");
        this.f2393j = (String) map.get("mime_type");
        this.f2394k = (String) map.get("rev");
        this.f2395l = C0356a.m2281a((Map) map, "thumb_exists");
        this.f2396m = C0356a.m2281a((Map) map, "is_deleted");
        Object obj = map.get("contents");
        if (obj == null || !(obj instanceof C0336a)) {
            this.f2397n = null;
            return;
        }
        this.f2397n = new ArrayList();
        Iterator it = ((C0336a) obj).iterator();
        while (it.hasNext()) {
            obj = it.next();
            if (obj instanceof Map) {
                this.f2397n.add(new C0383f((Map) obj));
            }
        }
    }

    public String m2344a() {
        return this.f2390g.substring(this.f2390g.lastIndexOf(47) + 1, this.f2390g.length());
    }
}
