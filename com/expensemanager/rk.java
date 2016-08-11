package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rk implements OnClickListener {
    final /* synthetic */ String[] f5219a;
    final /* synthetic */ rh f5220b;

    rk(rh rhVar, String[] strArr) {
        this.f5220b = rhVar;
        this.f5219a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5220b.f5216a.f3170e = this.f5219a[i];
    }
}
