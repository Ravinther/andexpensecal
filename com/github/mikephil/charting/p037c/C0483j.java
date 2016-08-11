package com.github.mikephil.charting.p037c;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.c.j */
public class C0483j extends C0475a {
    protected List<String> f5637l;
    public int f5638m;
    public int f5639n;
    public int f5640o;
    public int f5641p;
    private int f5642q;
    private boolean f5643r;
    private boolean f5644s;
    private C0484k f5645t;

    public C0483j() {
        this.f5637l = new ArrayList();
        this.f5638m = 1;
        this.f5639n = 1;
        this.f5642q = 4;
        this.f5640o = 1;
        this.f5643r = false;
        this.f5641p = 1;
        this.f5644s = false;
        this.f5645t = C0484k.TOP;
    }

    public void m4336a(C0484k c0484k) {
        this.f5645t = c0484k;
    }

    public void m4337a(List<String> list) {
        this.f5637l = list;
    }

    public void m4338b(int i) {
        this.f5642q = i;
    }

    public C0484k m4339r() {
        return this.f5645t;
    }

    public boolean m4340s() {
        return this.f5643r;
    }

    public int m4341t() {
        return this.f5642q;
    }

    public boolean m4342u() {
        return this.f5644s;
    }

    public List<String> m4343v() {
        return this.f5637l;
    }

    public String m4344w() {
        String str = "";
        int i = 0;
        while (i < this.f5637l.size()) {
            String str2 = (String) this.f5637l.get(i);
            if (str.length() >= str2.length()) {
                str2 = str;
            }
            i++;
            str = str2;
        }
        return str;
    }
}
