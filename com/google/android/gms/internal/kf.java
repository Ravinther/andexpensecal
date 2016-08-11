package com.google.android.gms.internal;

import android.content.Context;

final class kf implements Runnable {
    final /* synthetic */ Context f6909a;
    final /* synthetic */ fh f6910b;
    final /* synthetic */ kj f6911c;
    final /* synthetic */ me f6912d;
    final /* synthetic */ String f6913e;

    kf(Context context, fh fhVar, kj kjVar, me meVar, String str) {
        this.f6909a = context;
        this.f6910b = fhVar;
        this.f6911c = kjVar;
        this.f6912d = meVar;
        this.f6913e = str;
    }

    public void run() {
        ma a = ma.m6079a(this.f6909a, new ay(), false, false, null, this.f6910b.f6548k);
        a.setWillNotDraw(true);
        this.f6911c.m5889a(a);
        mc f = a.m6097f();
        f.m6113a("/invalidRequest", this.f6911c.f6918b);
        f.m6113a("/loadAdURL", this.f6911c.f6919c);
        f.m6113a("/log", cp.f6394h);
        f.m6110a(this.f6912d);
        ly.m6065a("Loading the JS library.");
        a.loadUrl(this.f6913e);
    }
}
