package com.google.android.gms.internal;

import android.webkit.ValueCallback;

class ag implements ValueCallback<String> {
    final /* synthetic */ af f6218a;

    ag(af afVar) {
        this.f6218a = afVar;
    }

    public void m5030a(String str) {
        this.f6218a.f6217d.m5023a(this.f6218a.f6215b, this.f6218a.f6216c, str);
    }

    public /* synthetic */ void onReceiveValue(Object obj) {
        m5030a((String) obj);
    }
}
