package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.C0619g;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

@id
public class kw implements di {
    public static final String f7020a;
    private static final kw f7021c;
    public final String f7022b;
    private final Object f7023d;
    private final kx f7024e;
    private of f7025f;
    private BigInteger f7026g;
    private final HashSet<kt> f7027h;
    private final HashMap<String, kz> f7028i;
    private boolean f7029j;
    private boolean f7030k;
    private boolean f7031l;
    private Context f7032m;
    private gs f7033n;
    private boolean f7034o;
    private ac f7035p;
    private ad f7036q;
    private ab f7037r;
    private LinkedList<Thread> f7038s;
    private boolean f7039t;
    private Bundle f7040u;
    private ic f7041v;
    private String f7042w;

    static {
        f7021c = new kw();
        f7020a = f7021c.f7022b;
    }

    private kw() {
        this.f7023d = new Object();
        this.f7026g = BigInteger.ONE;
        this.f7027h = new HashSet();
        this.f7028i = new HashMap();
        this.f7029j = false;
        this.f7030k = true;
        this.f7031l = false;
        this.f7034o = true;
        this.f7035p = null;
        this.f7036q = null;
        this.f7037r = null;
        this.f7038s = new LinkedList();
        this.f7039t = false;
        this.f7040u = bt.m5224a();
        this.f7041v = null;
        this.f7022b = li.m6030e();
        this.f7024e = new kx(this.f7022b);
    }

    public static Bundle m5946a(Context context, ky kyVar, String str) {
        return f7021c.m5965b(context, kyVar, str);
    }

    public static kw m5947a() {
        return f7021c;
    }

    public static String m5948a(int i, String str) {
        return f7021c.m5967b(i, str);
    }

    public static void m5949a(Context context, gs gsVar) {
        f7021c.m5968b(context, gsVar);
    }

    public static void m5950a(Context context, boolean z) {
        f7021c.m5969b(context, z);
    }

    public static void m5951a(Throwable th) {
        f7021c.m5970b(th);
    }

    public static void m5952a(HashSet<kt> hashSet) {
        f7021c.m5971b((HashSet) hashSet);
    }

    public static String m5953d() {
        return f7021c.m5973e();
    }

    public static kx m5954f() {
        return f7021c.m5974g();
    }

    public static boolean m5955h() {
        return f7021c.m5975i();
    }

    public static boolean m5956j() {
        return f7021c.m5976k();
    }

    public static String m5957l() {
        return f7021c.m5977m();
    }

    public static Bundle m5958n() {
        return f7021c.m5978o();
    }

    public ad m5959a(Context context) {
        ad adVar = null;
        if (m5958n().getBoolean(bt.f6347i.m6163a(), false) && oj.m6346b() && !m5972c()) {
            synchronized (this.f7023d) {
                if (this.f7035p == null) {
                    if (context instanceof Activity) {
                        this.f7035p = new ac((Application) context.getApplicationContext(), (Activity) context);
                    }
                }
                if (this.f7037r == null) {
                    this.f7037r = new ab();
                }
                if (this.f7036q == null) {
                    this.f7036q = new ad(this.f7035p, this.f7037r, this.f7040u, new ic(this.f7032m, this.f7033n, null, null));
                }
                this.f7036q.m5022a();
                adVar = this.f7036q;
            }
        }
        return adVar;
    }

    public void m5960a(Bundle bundle) {
        synchronized (this.f7023d) {
            this.f7039t = true;
            this.f7040u = bundle;
            while (!this.f7038s.isEmpty()) {
                ic.m5746a(this.f7032m, (Thread) this.f7038s.remove(0), this.f7033n);
            }
        }
    }

    public void m5961a(kt ktVar) {
        synchronized (this.f7023d) {
            this.f7027h.add(ktVar);
        }
    }

    public void m5962a(String str, kz kzVar) {
        synchronized (this.f7023d) {
            this.f7028i.put(str, kzVar);
        }
    }

    public void m5963a(Thread thread) {
        synchronized (this.f7023d) {
            if (this.f7039t) {
                ic.m5746a(this.f7032m, thread, this.f7033n);
            } else {
                this.f7038s.add(thread);
            }
        }
    }

    public void m5964a(boolean z) {
        synchronized (this.f7023d) {
            this.f7034o = z;
        }
    }

    public Bundle m5965b(Context context, ky kyVar, String str) {
        Bundle bundle;
        synchronized (this.f7023d) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f7024e.m5981a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f7028i.keySet()) {
                bundle2.putBundle(str2, ((kz) this.f7028i.get(str2)).m5986a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f7027h.iterator();
            while (it.hasNext()) {
                arrayList.add(((kt) it.next()).m5937d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            kyVar.m5985a(this.f7027h);
            this.f7027h.clear();
        }
        return bundle;
    }

    public of m5966b() {
        of ofVar;
        synchronized (this.f7023d) {
            ofVar = this.f7025f;
        }
        return ofVar;
    }

    public String m5967b(int i, String str) {
        Resources resources = this.f7033n.f6671e ? this.f7032m.getResources() : C0619g.m4953c(this.f7032m);
        return resources == null ? str : resources.getString(i);
    }

    public void m5968b(Context context, gs gsVar) {
        synchronized (this.f7023d) {
            if (!this.f7031l) {
                this.f7032m = context.getApplicationContext();
                this.f7033n = gsVar;
                this.f7030k = ld.m5992a(context);
                mu.m6162a(context);
                dg.m5314a(context, this);
                m5963a(Thread.currentThread());
                this.f7042w = li.m5997a(context, gsVar.f6668b);
                this.f7025f = new og();
                this.f7031l = true;
            }
        }
    }

    public void m5969b(Context context, boolean z) {
        synchronized (this.f7023d) {
            if (z != this.f7030k) {
                this.f7030k = z;
                ld.m5991a(context, z);
            }
        }
    }

    public void m5970b(Throwable th) {
        if (this.f7031l) {
            new ic(this.f7032m, this.f7033n, null, null).m5752b(th);
        }
    }

    public void m5971b(HashSet<kt> hashSet) {
        synchronized (this.f7023d) {
            this.f7027h.addAll(hashSet);
        }
    }

    public boolean m5972c() {
        boolean z;
        synchronized (this.f7023d) {
            z = this.f7034o;
        }
        return z;
    }

    public String m5973e() {
        String bigInteger;
        synchronized (this.f7023d) {
            bigInteger = this.f7026g.toString();
            this.f7026g = this.f7026g.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    public kx m5974g() {
        kx kxVar;
        synchronized (this.f7023d) {
            kxVar = this.f7024e;
        }
        return kxVar;
    }

    public boolean m5975i() {
        boolean z;
        synchronized (this.f7023d) {
            z = this.f7029j;
            this.f7029j = true;
        }
        return z;
    }

    public boolean m5976k() {
        boolean z;
        synchronized (this.f7023d) {
            z = this.f7030k;
        }
        return z;
    }

    public String m5977m() {
        String str;
        synchronized (this.f7023d) {
            str = this.f7042w;
        }
        return str;
    }

    public Bundle m5978o() {
        Bundle bundle;
        synchronized (this.f7023d) {
            bundle = this.f7040u;
        }
        return bundle;
    }
}
