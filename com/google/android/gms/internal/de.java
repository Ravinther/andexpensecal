package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@id
public final class de implements cz {
    private final da f6400a;
    private final pi f6401b;

    public de(da daVar, pi piVar) {
        this.f6400a = daVar;
        this.f6401b = piVar;
    }

    private static boolean m5309a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int m5310b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return li.m6024c();
            }
            if ("l".equalsIgnoreCase(str)) {
                return li.m6020b();
            }
        }
        return -1;
    }

    public void m5311a(ma maVar, Map<String, String> map) {
        String str = (String) map.get("a");
        if (str == null) {
            ly.m6074e("Action missing from an open GMSG.");
        } else if (this.f6401b == null || this.f6401b.m6480b()) {
            mc f = maVar.m6097f();
            if ("expand".equalsIgnoreCase(str)) {
                if (maVar.m6101j()) {
                    ly.m6074e("Cannot expand WebView that is already expanded.");
                } else {
                    f.m6115a(m5309a(map), m5310b(map));
                }
            } else if ("webapp".equalsIgnoreCase(str)) {
                str = (String) map.get("u");
                if (str != null) {
                    f.m6116a(m5309a(map), m5310b(map), str);
                } else {
                    f.m6117a(m5309a(map), m5310b(map), (String) map.get("html"), (String) map.get("baseurl"));
                }
            } else if ("in_app_purchase".equalsIgnoreCase(str)) {
                str = (String) map.get("product_id");
                String str2 = (String) map.get("report_urls");
                if (this.f6400a == null) {
                    return;
                }
                if (str2 == null || str2.isEmpty()) {
                    this.f6400a.m5305a(str, new ArrayList());
                    return;
                }
                this.f6400a.m5305a(str, new ArrayList(Arrays.asList(str2.split(" "))));
            } else {
                f.m6108a(new C0631do((String) map.get("i"), (String) map.get("u"), (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
            }
        } else {
            this.f6401b.m6479a((String) map.get("u"));
        }
    }
}
