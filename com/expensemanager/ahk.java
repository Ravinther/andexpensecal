package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ahk implements OnClickListener {
    final /* synthetic */ int f4127a;
    final /* synthetic */ ahj f4128b;

    ahk(ahj com_expensemanager_ahj, int i) {
        this.f4128b = com_expensemanager_ahj;
        this.f4127a = i;
    }

    public void onClick(View view) {
        this.f4128b.f4124a.m3612a((String) this.f4128b.f4125b.get(this.f4127a), this.f4127a);
    }
}
