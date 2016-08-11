package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@id
public final class km {
    private String f6925a;
    private String f6926b;
    private String f6927c;
    private List<String> f6928d;
    private String f6929e;
    private String f6930f;
    private List<String> f6931g;
    private long f6932h;
    private boolean f6933i;
    private final long f6934j;
    private List<String> f6935k;
    private long f6936l;
    private int f6937m;
    private boolean f6938n;
    private boolean f6939o;
    private boolean f6940p;
    private boolean f6941q;

    public km() {
        this.f6932h = -1;
        this.f6933i = false;
        this.f6934j = -1;
        this.f6936l = -1;
        this.f6937m = -1;
        this.f6938n = false;
        this.f6939o = false;
        this.f6940p = false;
        this.f6941q = true;
    }

    static String m5893a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    static long m5894b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                ly.m6074e("Could not parse float from " + str + " header: " + str2);
            }
        }
        return -1;
    }

    private void m5895b(Map<String, List<String>> map) {
        this.f6925a = m5893a(map, "X-Afma-Ad-Size");
    }

    static List<String> m5896c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private void m5897c(Map<String, List<String>> map) {
        List c = m5896c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f6928d = c;
        }
    }

    private void m5898d(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f6929e = (String) list.get(0);
        }
    }

    private boolean m5899d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    private void m5900e(Map<String, List<String>> map) {
        List c = m5896c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f6931g = c;
        }
    }

    private void m5901f(Map<String, List<String>> map) {
        long b = m5894b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f6932h = b;
        }
    }

    private void m5902g(Map<String, List<String>> map) {
        this.f6930f = m5893a(map, "X-Afma-ActiveView");
    }

    private void m5903h(Map<String, List<String>> map) {
        this.f6939o |= m5899d(map, "X-Afma-Native");
    }

    private void m5904i(Map<String, List<String>> map) {
        this.f6938n |= m5899d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void m5905j(Map<String, List<String>> map) {
        this.f6933i |= m5899d(map, "X-Afma-Mediation");
    }

    private void m5906k(Map<String, List<String>> map) {
        List c = m5896c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f6935k = c;
        }
    }

    private void m5907l(Map<String, List<String>> map) {
        long b = m5894b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f6936l = b;
        }
    }

    private void m5908m(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f6937m = li.m6024c();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f6937m = li.m6020b();
            }
        }
    }

    private void m5909n(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Use-HTTPS");
        if (list != null && !list.isEmpty()) {
            this.f6940p = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void m5910o(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.f6941q = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    public fj m5911a(long j) {
        return new fj(this.f6926b, this.f6927c, this.f6928d, this.f6931g, this.f6932h, this.f6933i, -1, this.f6935k, this.f6936l, this.f6937m, this.f6925a, j, this.f6929e, this.f6930f, this.f6938n, this.f6939o, this.f6940p, this.f6941q);
    }

    public void m5912a(String str, Map<String, List<String>> map, String str2) {
        this.f6926b = str;
        this.f6927c = str2;
        m5913a((Map) map);
    }

    public void m5913a(Map<String, List<String>> map) {
        m5895b(map);
        m5897c(map);
        m5898d(map);
        m5900e(map);
        m5901f(map);
        m5905j(map);
        m5906k(map);
        m5907l(map);
        m5908m(map);
        m5902g(map);
        m5909n(map);
        m5904i(map);
        m5903h(map);
        m5910o(map);
    }
}
