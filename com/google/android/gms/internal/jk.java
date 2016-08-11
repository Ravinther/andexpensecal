package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.C0619g;

@id
public final class jk {
    public static lb m5813a(Context context, fh fhVar, jl jlVar) {
        return fhVar.f6548k.f6671e ? m5814b(context, fhVar, jlVar) : m5815c(context, fhVar, jlVar);
    }

    private static lb m5814b(Context context, fh fhVar, jl jlVar) {
        ly.m6065a("Fetching ad response from local ad request service.");
        lb jnVar = new jn(context, fhVar, jlVar);
        jnVar.m5624e();
        return jnVar;
    }

    private static lb m5815c(Context context, fh fhVar, jl jlVar) {
        ly.m6065a("Fetching ad response from remote ad request service.");
        if (C0619g.m4944a(context) == 0) {
            return new jo(context, fhVar, jlVar);
        }
        ly.m6074e("Failed to connect to remote ad request service.");
        return null;
    }
}
