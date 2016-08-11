package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ts implements OnClickListener {
    final /* synthetic */ int f5309a;
    final /* synthetic */ tq f5310b;

    ts(tq tqVar, int i) {
        this.f5310b = tqVar;
        this.f5309a = i;
    }

    public void onClick(View view) {
        this.f5310b.f5304a.m3185a((String) this.f5310b.f5305b.get(this.f5309a), this.f5309a);
    }
}
