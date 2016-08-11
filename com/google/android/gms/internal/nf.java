package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C0611d;
import com.google.android.gms.common.C0619g;
import com.google.android.gms.common.api.C0610b;
import com.google.android.gms.common.api.C0612c;
import com.google.android.gms.internal.nf$com.google.android.gms.internal.nj;
import java.util.ArrayList;

public abstract class nf<T extends IInterface> implements nn {
    public static final String[] f6405d;
    private final Context f6406a;
    final Handler f6407b;
    boolean f6408c;
    private final Looper f6409e;
    private final Object f6410f;
    private T f6411g;
    private final ArrayList<com/google/android/gms/internal/nh<?>> f6412h;
    private nj f6413i;
    private int f6414j;
    private final String[] f6415k;
    private final nl f6416l;

    static {
        f6405d = new String[]{"service_esmobile", "service_googleme"};
    }

    protected nf(Context context, Looper looper, C0610b c0610b, C0612c c0612c, String... strArr) {
        this.f6410f = new Object();
        this.f6412h = new ArrayList();
        this.f6414j = 1;
        this.f6408c = false;
        this.f6406a = (Context) ob.m6315a((Object) context);
        this.f6409e = (Looper) ob.m6316a((Object) looper, (Object) "Looper must not be null");
        this.f6416l = new nl(context, looper, this);
        this.f6407b = new ng(this, looper);
        m5337a(strArr);
        this.f6415k = strArr;
        m5334a((C0610b) ob.m6315a((Object) c0610b));
        m5335a((C0612c) ob.m6315a((Object) c0612c));
    }

    private void m5324a(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        ob.m6323b(z);
        synchronized (this.f6410f) {
            this.f6414j = i;
            this.f6411g = t;
        }
    }

    private boolean m5326a(int i, int i2, T t) {
        boolean z;
        synchronized (this.f6410f) {
            if (this.f6414j != i) {
                z = false;
            } else {
                m5324a(i2, (IInterface) t);
                z = true;
            }
        }
        return z;
    }

    protected abstract String m5331a();

    public void m5332a(int i) {
        this.f6407b.sendMessage(this.f6407b.obtainMessage(4, Integer.valueOf(i)));
    }

    protected void m5333a(int i, IBinder iBinder, Bundle bundle) {
        this.f6407b.sendMessage(this.f6407b.obtainMessage(1, new nk(this, i, iBinder, bundle)));
    }

    public void m5334a(C0610b c0610b) {
        this.f6416l.m6195a(c0610b);
    }

    public void m5335a(C0612c c0612c) {
        this.f6416l.m6197a((C0611d) c0612c);
    }

    protected abstract void m5336a(nv nvVar, ni niVar);

    protected void m5337a(String... strArr) {
    }

    protected abstract T m5338b(IBinder iBinder);

    protected abstract String m5339b();

    protected final void m5340c(IBinder iBinder) {
        try {
            m5336a(nw.m6266a(iBinder), new ni(this));
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            m5332a(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    public void m5341d() {
        this.f6408c = true;
        m5324a(2, null);
        int a = C0619g.m4944a(this.f6406a);
        if (a != 0) {
            m5324a(1, null);
            this.f6407b.sendMessage(this.f6407b.obtainMessage(3, Integer.valueOf(a)));
            return;
        }
        if (this.f6413i != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + m5331a());
            no.m6198a(this.f6406a).m6202b(m5331a(), this.f6413i);
        }
        this.f6413i = new nj(this);
        if (!no.m6198a(this.f6406a).m6201a(m5331a(), this.f6413i)) {
            Log.e("GmsClient", "unable to connect to service: " + m5331a());
            this.f6407b.sendMessage(this.f6407b.obtainMessage(3, Integer.valueOf(9)));
        }
    }

    public boolean m5342e() {
        boolean z;
        synchronized (this.f6410f) {
            z = this.f6414j == 3;
        }
        return z;
    }

    public boolean m5343f() {
        boolean z;
        synchronized (this.f6410f) {
            z = this.f6414j == 2;
        }
        return z;
    }

    public void m5344g() {
        this.f6408c = false;
        synchronized (this.f6412h) {
            int size = this.f6412h.size();
            for (int i = 0; i < size; i++) {
                ((nh) this.f6412h.get(i)).m6183d();
            }
            this.f6412h.clear();
        }
        m5324a(1, null);
        if (this.f6413i != null) {
            no.m6198a(this.f6406a).m6202b(m5331a(), this.f6413i);
            this.f6413i = null;
        }
    }

    public final Context m5345h() {
        return this.f6406a;
    }

    protected final void m5346i() {
        if (!m5342e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Bundle m5347j() {
        return null;
    }

    public final T m5348k() {
        T t;
        synchronized (this.f6410f) {
            if (this.f6414j == 4) {
                throw new DeadObjectException();
            }
            m5346i();
            ob.m6320a(this.f6411g != null, (Object) "Client is connected but service is null");
            t = this.f6411g;
        }
        return t;
    }

    public boolean m5349l() {
        return this.f6408c;
    }
}
