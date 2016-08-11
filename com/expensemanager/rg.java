package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rg implements OnClickListener {
    final /* synthetic */ String[] f5214a;
    final /* synthetic */ rd f5215b;

    rg(rd rdVar, String[] strArr) {
        this.f5215b = rdVar;
        this.f5214a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5215b.f5211a.f3170e = this.f5214a[i];
    }
}
