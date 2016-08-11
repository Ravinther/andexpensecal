package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@id
/* renamed from: com.google.android.gms.internal.a */
class C0627a implements C0626e {
    private ma f6182a;

    public C0627a(ma maVar) {
        this.f6182a = maVar;
    }

    public void m4996a(C0635h c0635h, boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        this.f6182a.m6088a("onAdVisibilityChanged", hashMap);
    }
}
