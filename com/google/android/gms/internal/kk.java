package com.google.android.gms.internal;

import java.util.Map;

class kk implements cz {
    final /* synthetic */ kj f6923a;

    kk(kj kjVar) {
        this.f6923a = kjVar;
    }

    public void m5891a(ma maVar, Map<String, String> map) {
        synchronized (this.f6923a.f6920d) {
            if (this.f6923a.f6922f.isDone()) {
                return;
            }
            kn knVar = new kn(1, map);
            ly.m6074e("Invalid " + knVar.m5922e() + " request error: " + knVar.m5919b());
            this.f6923a.f6922f.m6035a(knVar);
        }
    }
}
