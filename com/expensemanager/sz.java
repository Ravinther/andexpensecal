package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class sz implements OnClickListener {
    final /* synthetic */ String[] f5278a;
    final /* synthetic */ sx f5279b;

    sz(sx sxVar, String[] strArr) {
        this.f5279b = sxVar;
        this.f5278a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5279b.f5276a.f3213c = this.f5278a[i];
    }
}
