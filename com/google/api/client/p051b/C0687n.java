package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import com.google.api.client.p050d.ap;
import java.io.OutputStream;

/* renamed from: com.google.api.client.b.n */
public final class C0687n implements ap {
    private final ap f7454a;
    private final C0683m f7455b;

    public C0687n(ap apVar, C0683m c0683m) {
        this.f7454a = (ap) am.m6911a((Object) apVar);
        this.f7455b = (C0683m) am.m6911a((Object) c0683m);
    }

    public void m6712a(OutputStream outputStream) {
        this.f7455b.m6696a(this.f7454a, outputStream);
    }
}
