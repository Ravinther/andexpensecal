package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class za implements OnClickListener {
    final /* synthetic */ int f5514a;
    final /* synthetic */ yz f5515b;

    za(yz yzVar, int i) {
        this.f5515b = yzVar;
        this.f5514a = i;
    }

    public void onClick(View view) {
        this.f5515b.f5509a.m3356a((String) this.f5515b.f5510b.get(this.f5514a), this.f5514a);
    }
}
