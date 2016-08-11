package com.google.android.gms.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.o */
class C0644o implements cz {
    final /* synthetic */ C0635h f7255a;

    C0644o(C0635h c0635h) {
        this.f7255a = c0635h;
    }

    public void m6313a(ma maVar, Map<String, String> map) {
        if (this.f7255a.m5685a((Map) map) && map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            this.f7255a.m5684a(Boolean.valueOf(z).booleanValue());
        }
    }
}
