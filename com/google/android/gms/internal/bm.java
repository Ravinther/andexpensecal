package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@id
public final class bm {
    public static final String f6286a;
    private final Date f6287b;
    private final String f6288c;
    private final int f6289d;
    private final Set<String> f6290e;
    private final Location f6291f;
    private final boolean f6292g;
    private final Bundle f6293h;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f6294i;
    private final String f6295j;
    private final SearchAdRequest f6296k;
    private final int f6297l;
    private final Set<String> f6298m;

    static {
        f6286a = lx.m6059a("emulator");
    }

    public bm(bn bnVar) {
        this(bnVar, null);
    }

    public bm(bn bnVar, SearchAdRequest searchAdRequest) {
        this.f6287b = bnVar.f6303e;
        this.f6288c = bnVar.f6304f;
        this.f6289d = bnVar.f6305g;
        this.f6290e = Collections.unmodifiableSet(bnVar.f6299a);
        this.f6291f = bnVar.f6306h;
        this.f6292g = bnVar.f6307i;
        this.f6293h = bnVar.f6300b;
        this.f6294i = Collections.unmodifiableMap(bnVar.f6301c);
        this.f6295j = bnVar.f6308j;
        this.f6296k = searchAdRequest;
        this.f6297l = bnVar.f6309k;
        this.f6298m = Collections.unmodifiableSet(bnVar.f6302d);
    }

    @Deprecated
    public <T extends NetworkExtras> T m5136a(Class<T> cls) {
        return (NetworkExtras) this.f6294i.get(cls);
    }

    public Date m5137a() {
        return this.f6287b;
    }

    public boolean m5138a(Context context) {
        return this.f6298m.contains(lx.m6058a(context));
    }

    public Bundle m5139b(Class<? extends MediationAdapter> cls) {
        return this.f6293h.getBundle(cls.getName());
    }

    public String m5140b() {
        return this.f6288c;
    }

    public int m5141c() {
        return this.f6289d;
    }

    public Bundle m5142c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f6293h.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle != null ? bundle.getBundle(cls.getClass().getName()) : null;
    }

    public Set<String> m5143d() {
        return this.f6290e;
    }

    public Location m5144e() {
        return this.f6291f;
    }

    public boolean m5145f() {
        return this.f6292g;
    }

    public String m5146g() {
        return this.f6295j;
    }

    public SearchAdRequest m5147h() {
        return this.f6296k;
    }

    public Map<Class<? extends NetworkExtras>, NetworkExtras> m5148i() {
        return this.f6294i;
    }

    public Bundle m5149j() {
        return this.f6293h;
    }

    public int m5150k() {
        return this.f6297l;
    }
}
