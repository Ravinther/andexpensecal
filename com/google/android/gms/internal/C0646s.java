package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Future;

@id
/* renamed from: com.google.android.gms.internal.s */
public class C0646s {
    protected C0645q m6504a(Context context, gs gsVar, ll<C0645q> llVar) {
        C0645q c0649v = new C0649v(context, gsVar);
        c0649v.m6497a(new C0648u(this, llVar, c0649v));
        return c0649v;
    }

    public Future<C0645q> m6505a(Context context, gs gsVar, String str) {
        Future llVar = new ll();
        lx.f7093a.post(new C0647t(this, context, gsVar, llVar, str));
        return llVar;
    }
}
