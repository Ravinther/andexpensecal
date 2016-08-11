package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@id
/* renamed from: com.google.android.gms.internal.g */
public final class C0634g implements C0633p {
    private final Object f6636a;
    private final WeakHashMap<kr, C0635h> f6637b;
    private final ArrayList<C0635h> f6638c;

    public C0634g() {
        this.f6636a = new Object();
        this.f6637b = new WeakHashMap();
        this.f6638c = new ArrayList();
    }

    public C0635h m5564a(Context context, ay ayVar, kr krVar, View view, gs gsVar) {
        C0635h c0635h;
        synchronized (this.f6636a) {
            if (m5568a(krVar)) {
                c0635h = (C0635h) this.f6637b.get(krVar);
            } else {
                c0635h = new C0635h(context, ayVar, krVar, view, gsVar);
                c0635h.m5681a((C0633p) this);
                this.f6637b.put(krVar, c0635h);
                this.f6638c.add(c0635h);
            }
        }
        return c0635h;
    }

    public C0635h m5565a(ay ayVar, kr krVar) {
        return m5564a(krVar.f6976b.getContext(), ayVar, krVar, krVar.f6976b, krVar.f6976b.m6100i());
    }

    public void m5566a() {
        synchronized (this.f6636a) {
            Iterator it = this.f6638c.iterator();
            while (it.hasNext()) {
                ((C0635h) it.next()).m5699k();
            }
        }
    }

    public void m5567a(C0635h c0635h) {
        synchronized (this.f6636a) {
            if (!c0635h.m5694f()) {
                this.f6638c.remove(c0635h);
            }
        }
    }

    public boolean m5568a(kr krVar) {
        boolean z;
        synchronized (this.f6636a) {
            C0635h c0635h = (C0635h) this.f6637b.get(krVar);
            z = c0635h != null && c0635h.m5694f();
        }
        return z;
    }

    public void m5569b() {
        synchronized (this.f6636a) {
            Iterator it = this.f6638c.iterator();
            while (it.hasNext()) {
                ((C0635h) it.next()).m5700l();
            }
        }
    }

    public void m5570b(kr krVar) {
        synchronized (this.f6636a) {
            C0635h c0635h = (C0635h) this.f6637b.get(krVar);
            if (c0635h != null) {
                c0635h.m5692d();
            }
        }
    }

    public void m5571c() {
        synchronized (this.f6636a) {
            Iterator it = this.f6638c.iterator();
            while (it.hasNext()) {
                ((C0635h) it.next()).m5701m();
            }
        }
    }
}
