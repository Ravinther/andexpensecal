package com.google.android.gms.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.n */
class C0643n implements cz {
    final /* synthetic */ C0635h f7212a;

    C0643n(C0635h c0635h) {
        this.f7212a = c0635h;
    }

    public void m6164a(ma maVar, Map<String, String> map) {
        if (this.f7212a.m5685a((Map) map)) {
            ly.m6065a("Received request to untrack: " + this.f7212a.f6707e.m5475d());
            this.f7212a.m5690c();
        }
    }
}
