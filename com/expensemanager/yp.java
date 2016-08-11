package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class yp implements OnClickListener {
    final /* synthetic */ int f5494a;
    final /* synthetic */ yo f5495b;

    yp(yo yoVar, int i) {
        this.f5495b = yoVar;
        this.f5494a = i;
    }

    public void onClick(View view) {
        this.f5495b.f5491a.m3340a((String) this.f5495b.f5492b.get(this.f5494a), this.f5494a);
    }
}
