package com.google.android.gms.internal;

final class kh implements me {
    final /* synthetic */ String f6915a;

    kh(String str) {
        this.f6915a = str;
    }

    public void m5876a(ma maVar) {
        String format = String.format("javascript:%s(%s);", new Object[]{"AFMA_buildAdURL", this.f6915a});
        ly.m6072d("About to execute: " + format);
        maVar.loadUrl(format);
    }
}
