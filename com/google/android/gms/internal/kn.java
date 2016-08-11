package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@id
class kn {
    private final List<String> f6942a;
    private final List<String> f6943b;
    private final String f6944c;
    private final String f6945d;
    private final String f6946e;
    private final String f6947f;
    private final boolean f6948g;
    private final int f6949h;
    private String f6950i;
    private int f6951j;

    public kn(int i, Map<String, String> map) {
        this.f6950i = (String) map.get("url");
        this.f6945d = (String) map.get("base_uri");
        this.f6946e = (String) map.get("post_parameters");
        this.f6948g = m5914b((String) map.get("drt_include"));
        this.f6944c = (String) map.get("activation_overlay_url");
        this.f6943b = m5915c((String) map.get("check_packages"));
        this.f6949h = m5916d((String) map.get("request_id"));
        this.f6947f = (String) map.get("type");
        this.f6942a = m5915c((String) map.get("errors"));
        this.f6951j = i;
    }

    private static boolean m5914b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private List<String> m5915c(String str) {
        return str == null ? null : Arrays.asList(str.split(","));
    }

    private int m5916d(String str) {
        return str == null ? 0 : Integer.parseInt(str);
    }

    public int m5917a() {
        return this.f6951j;
    }

    public void m5918a(String str) {
        this.f6950i = str;
    }

    public List<String> m5919b() {
        return this.f6942a;
    }

    public String m5920c() {
        return this.f6946e;
    }

    public String m5921d() {
        return this.f6950i;
    }

    public String m5922e() {
        return this.f6947f;
    }

    public boolean m5923f() {
        return this.f6948g;
    }
}
