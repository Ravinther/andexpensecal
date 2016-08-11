package com.google.api.client.p051b;

import com.google.api.client.p050d.ap;
import java.io.OutputStream;

/* renamed from: com.google.api.client.b.u */
class C0693u implements C0670l {
    final /* synthetic */ ap f7509a;
    final /* synthetic */ String f7510b;
    final /* synthetic */ long f7511c;
    final /* synthetic */ String f7512d;
    final /* synthetic */ boolean f7513e;
    final /* synthetic */ C0692t f7514f;

    C0693u(C0692t c0692t, ap apVar, String str, long j, String str2, boolean z) {
        this.f7514f = c0692t;
        this.f7509a = apVar;
        this.f7510b = str;
        this.f7511c = j;
        this.f7512d = str2;
        this.f7513e = z;
    }

    @Deprecated
    public String m6794a() {
        return this.f7510b;
    }

    public void m6795a(OutputStream outputStream) {
        this.f7509a.m6588a(outputStream);
    }

    public long m6796b() {
        return this.f7511c;
    }

    public String m6797e() {
        return this.f7512d;
    }

    public boolean m6798g() {
        return this.f7513e;
    }
}
