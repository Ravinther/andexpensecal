package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class tr implements OnClickListener {
    final /* synthetic */ int f5307a;
    final /* synthetic */ tq f5308b;

    tr(tq tqVar, int i) {
        this.f5308b = tqVar;
        this.f5307a = i;
    }

    public void onClick(View view) {
        this.f5308b.f5304a.m3185a((String) this.f5308b.f5305b.get(this.f5307a), this.f5307a);
    }
}
