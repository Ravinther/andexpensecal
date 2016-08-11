package com.google.android.gms.internal;

import android.content.Context;

@id
public final class dq {
    private final fh f6427a;
    private final ee f6428b;
    private final Context f6429c;
    private final Object f6430d;
    private final du f6431e;
    private boolean f6432f;
    private dx f6433g;

    public dq(Context context, fh fhVar, ee eeVar, du duVar) {
        this.f6430d = new Object();
        this.f6432f = false;
        this.f6429c = context;
        this.f6427a = fhVar;
        this.f6428b = eeVar;
        this.f6431e = duVar;
    }

    public dz m5363a(long j, long j2) {
        ly.m6065a("Starting mediation.");
        for (dt dtVar : this.f6431e.f6460a) {
            ly.m6070c("Trying mediation network: " + dtVar.f6454b);
            for (String str : dtVar.f6455c) {
                synchronized (this.f6430d) {
                    if (this.f6432f) {
                        dz dzVar = new dz(-1);
                        return dzVar;
                    }
                    this.f6433g = new dx(this.f6429c, str, this.f6428b, this.f6431e, dtVar, this.f6427a.f6540c, this.f6427a.f6541d, this.f6427a.f6548k);
                    dzVar = this.f6433g.m5406a(j, j2);
                    if (dzVar.f6485a == 0) {
                        ly.m6065a("Adapter succeeded.");
                        return dzVar;
                    } else if (dzVar.f6487c != null) {
                        lx.f7093a.post(new ds(this, dzVar));
                    }
                }
            }
        }
        return new dz(1);
    }

    public void m5364a() {
        synchronized (this.f6430d) {
            this.f6432f = true;
            if (this.f6433g != null) {
                this.f6433g.m5407a();
            }
        }
    }
}
