package com.google.android.gms.internal;

@id
/* renamed from: com.google.android.gms.internal.b */
public class C0628b {
    private final C0630d f6261a;
    private final Runnable f6262b;
    private av f6263c;
    private boolean f6264d;
    private boolean f6265e;
    private long f6266f;

    public C0628b(pb pbVar) {
        this(pbVar, new C0630d(lx.f7093a));
    }

    C0628b(pb pbVar, C0630d c0630d) {
        this.f6264d = false;
        this.f6265e = false;
        this.f6266f = 0;
        this.f6261a = c0630d;
        this.f6262b = new C0629c(this, pbVar);
    }

    public void m5086a() {
        this.f6264d = false;
        this.f6261a.m5303a(this.f6262b);
    }

    public void m5087a(av avVar) {
        m5088a(avVar, 60000);
    }

    public void m5088a(av avVar, long j) {
        if (this.f6264d) {
            ly.m6074e("An ad refresh is already scheduled.");
            return;
        }
        this.f6263c = avVar;
        this.f6264d = true;
        this.f6266f = j;
        if (!this.f6265e) {
            ly.m6070c("Scheduling ad refresh " + j + " milliseconds from now.");
            this.f6261a.m5304a(this.f6262b, j);
        }
    }

    public void m5089b() {
        this.f6265e = true;
        if (this.f6264d) {
            this.f6261a.m5303a(this.f6262b);
        }
    }

    public void m5090c() {
        this.f6265e = false;
        if (this.f6264d) {
            this.f6264d = false;
            m5088a(this.f6263c, this.f6266f);
        }
    }

    public boolean m5091d() {
        return this.f6264d;
    }
}
