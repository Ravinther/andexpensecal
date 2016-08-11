package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@id
public class jw extends lb {
    private final jc f6880a;
    private final fj f6881b;
    private final ks f6882c;
    private final jy f6883d;
    private final Object f6884e;
    private Future<kr> f6885f;

    public jw(Context context, pb pbVar, C0646s c0646s, ks ksVar, jc jcVar) {
        this(ksVar, jcVar, new jy(context, pbVar, c0646s, new lr(), ksVar));
    }

    jw(ks ksVar, jc jcVar, jy jyVar) {
        this.f6884e = new Object();
        this.f6882c = ksVar;
        this.f6881b = ksVar.f6999b;
        this.f6880a = jcVar;
        this.f6883d = jyVar;
    }

    private kr m5844a(int i) {
        return new kr(this.f6882c.f6998a.f6540c, null, null, i, null, null, this.f6881b.f6566l, this.f6881b.f6565k, this.f6882c.f6998a.f6546i, false, null, null, null, null, null, this.f6881b.f6563i, this.f6882c.f7001d, this.f6881b.f6561g, this.f6882c.f7003f, this.f6881b.f6568n, this.f6881b.f6569o, this.f6882c.f7005h, null);
    }

    public void m5845a() {
        kr krVar;
        int i;
        try {
            synchronized (this.f6884e) {
                this.f6885f = le.m5995a(this.f6883d);
            }
            krVar = (kr) this.f6885f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException e) {
            ly.m6074e("Timed out waiting for native ad.");
            i = 2;
            krVar = null;
        } catch (ExecutionException e2) {
            i = 0;
            krVar = null;
        } catch (InterruptedException e3) {
            krVar = null;
            i = -1;
        } catch (CancellationException e4) {
            krVar = null;
            i = -1;
        }
        if (krVar == null) {
            krVar = m5844a(i);
        }
        lx.f7093a.post(new jx(this, krVar));
    }

    public void m5846b() {
        synchronized (this.f6884e) {
            if (this.f6885f != null) {
                this.f6885f.cancel(true);
            }
        }
    }
}
