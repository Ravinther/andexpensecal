package com.google.api.client.p051b;

import com.google.api.client.p050d.ap;

/* renamed from: com.google.api.client.b.af */
public abstract class af {
    private long f7372a;
    private String f7373b;
    private String f7374c;
    private ap f7375d;

    public af() {
        this.f7372a = -1;
    }

    public abstract ag m6542a();

    public void m6543a(int i, int i2) {
    }

    public final void m6544a(long j) {
        this.f7372a = j;
    }

    @Deprecated
    public void m6545a(C0670l c0670l) {
    }

    public final void m6546a(ap apVar) {
        this.f7375d = apVar;
    }

    public final void m6547a(String str) {
        this.f7373b = str;
    }

    public abstract void m6548a(String str, String str2);

    public final long m6549b() {
        return this.f7372a;
    }

    public final void m6550b(String str) {
        this.f7374c = str;
    }

    public final String m6551c() {
        return this.f7373b;
    }

    public final String m6552d() {
        return this.f7374c;
    }

    public final ap m6553e() {
        return this.f7375d;
    }
}
