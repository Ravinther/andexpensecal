package com.google.api.client.googleapis.p068b.p069a.p071b.p072a;

import com.google.android.gms.auth.C0602d;
import com.google.api.client.p050d.am;
import java.io.IOException;

/* renamed from: com.google.api.client.googleapis.b.a.b.a.c */
public class C0747c extends IOException {
    C0747c(C0602d c0602d) {
        initCause((Throwable) am.m6911a((Object) c0602d));
    }

    public C0602d m7012a() {
        return (C0602d) super.getCause();
    }

    public /* synthetic */ Throwable getCause() {
        return m7012a();
    }
}
