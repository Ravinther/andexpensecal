package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rb implements OnClickListener {
    final /* synthetic */ String[] f5208a;
    final /* synthetic */ qz f5209b;

    rb(qz qzVar, String[] strArr) {
        this.f5209b = qzVar;
        this.f5208a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5209b.f5204a.f3169d = this.f5208a[i];
    }
}
