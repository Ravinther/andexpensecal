package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

@id
public final class jn extends jm {
    private final Context f6860a;

    public jn(Context context, fh fhVar, jl jlVar) {
        super(fhVar, jlVar);
        this.f6860a = context;
    }

    public void m5821c() {
    }

    public jt m5822d() {
        Bundle n = kw.m5958n();
        return ke.m5872a(this.f6860a, new bs(n.getString("gads:sdk_core_location"), n.getString("gads:sdk_core_experiment_id"), n.getString("gads:block_autoclicks_experiment_id"), n.getString("gads:spam_app_context:experiment_id")), new dp(), new kq());
    }
}
