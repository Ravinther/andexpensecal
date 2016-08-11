package com.google.android.gms.internal;

@id
public final class dw extends el {
    private final Object f6469a;
    private eb f6470b;
    private dv f6471c;

    public dw() {
        this.f6469a = new Object();
    }

    public void m5386a() {
        synchronized (this.f6469a) {
            if (this.f6471c != null) {
                this.f6471c.m5374k();
            }
        }
    }

    public void m5387a(int i) {
        synchronized (this.f6469a) {
            if (this.f6470b != null) {
                this.f6470b.m5394a(i == 3 ? 1 : 2);
                this.f6470b = null;
            }
        }
    }

    public void m5388a(dv dvVar) {
        synchronized (this.f6469a) {
            this.f6471c = dvVar;
        }
    }

    public void m5389a(eb ebVar) {
        synchronized (this.f6469a) {
            this.f6470b = ebVar;
        }
    }

    public void m5390b() {
        synchronized (this.f6469a) {
            if (this.f6471c != null) {
                this.f6471c.m5375l();
            }
        }
    }

    public void m5391c() {
        synchronized (this.f6469a) {
            if (this.f6471c != null) {
                this.f6471c.m5376m();
            }
        }
    }

    public void m5392d() {
        synchronized (this.f6469a) {
            if (this.f6471c != null) {
                this.f6471c.m5377n();
            }
        }
    }

    public void m5393e() {
        synchronized (this.f6469a) {
            if (this.f6470b != null) {
                this.f6470b.m5394a(0);
                this.f6470b = null;
                return;
            }
            if (this.f6471c != null) {
                this.f6471c.m5378o();
            }
        }
    }
}
