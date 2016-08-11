package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.p046a.C0585d;

@id
public final class dx implements eb {
    private final String f6472a;
    private final ee f6473b;
    private final long f6474c;
    private final dt f6475d;
    private final av f6476e;
    private final ay f6477f;
    private final Context f6478g;
    private final Object f6479h;
    private final gs f6480i;
    private eh f6481j;
    private int f6482k;

    public dx(Context context, String str, ee eeVar, du duVar, dt dtVar, av avVar, ay ayVar, gs gsVar) {
        this.f6479h = new Object();
        this.f6482k = -2;
        this.f6478g = context;
        this.f6473b = eeVar;
        this.f6475d = dtVar;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f6472a = m5401b();
        } else {
            this.f6472a = str;
        }
        this.f6474c = duVar.f6461b != -1 ? duVar.f6461b : 10000;
        this.f6476e = avVar;
        this.f6477f = ayVar;
        this.f6480i = gsVar;
    }

    private void m5397a(long j, long j2, long j3, long j4) {
        while (this.f6482k == -2) {
            m5402b(j, j2, j3, j4);
        }
    }

    private void m5398a(dw dwVar) {
        try {
            if (this.f6480i.f6670d < 4100000) {
                if (this.f6477f.f6257e) {
                    this.f6481j.m5427a(C0585d.m4878a(this.f6478g), this.f6476e, this.f6475d.f6459g, dwVar);
                } else {
                    this.f6481j.m5429a(C0585d.m4878a(this.f6478g), this.f6477f, this.f6476e, this.f6475d.f6459g, (ek) dwVar);
                }
            } else if (this.f6477f.f6257e) {
                this.f6481j.m5428a(C0585d.m4878a(this.f6478g), this.f6476e, this.f6475d.f6459g, this.f6475d.f6453a, (ek) dwVar);
            } else {
                this.f6481j.m5430a(C0585d.m4878a(this.f6478g), this.f6477f, this.f6476e, this.f6475d.f6459g, this.f6475d.f6453a, dwVar);
            }
        } catch (Throwable e) {
            ly.m6073d("Could not request ad from mediation adapter.", e);
            m5408a(5);
        }
    }

    private String m5401b() {
        try {
            if (!TextUtils.isEmpty(this.f6475d.f6457e)) {
                return this.f6473b.m5418b(this.f6475d.f6457e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            ly.m6074e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private void m5402b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        elapsedRealtime = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || elapsedRealtime <= 0) {
            ly.m6070c("Timed out waiting for adapter.");
            this.f6482k = 3;
            return;
        }
        try {
            this.f6479h.wait(Math.min(j5, elapsedRealtime));
        } catch (InterruptedException e) {
            this.f6482k = -1;
        }
    }

    private eh m5403c() {
        ly.m6070c("Instantiating mediation adapter: " + this.f6472a);
        try {
            return this.f6473b.m5417a(this.f6472a);
        } catch (Throwable e) {
            ly.m6066a("Could not instantiate mediation adapter: " + this.f6472a, e);
            return null;
        }
    }

    public dz m5406a(long j, long j2) {
        dz dzVar;
        synchronized (this.f6479h) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dw dwVar = new dw();
            lx.f7093a.post(new dy(this, dwVar));
            m5397a(elapsedRealtime, this.f6474c, j, j2);
            dzVar = new dz(this.f6475d, this.f6481j, this.f6472a, dwVar, this.f6482k);
        }
        return dzVar;
    }

    public void m5407a() {
        synchronized (this.f6479h) {
            try {
                if (this.f6481j != null) {
                    this.f6481j.m5432c();
                }
            } catch (Throwable e) {
                ly.m6073d("Could not destroy mediation adapter.", e);
            }
            this.f6482k = -1;
            this.f6479h.notify();
        }
    }

    public void m5408a(int i) {
        synchronized (this.f6479h) {
            this.f6482k = i;
            this.f6479h.notify();
        }
    }
}
