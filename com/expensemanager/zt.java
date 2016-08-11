package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zt implements OnClickListener {
    final /* synthetic */ String f5554a;
    final /* synthetic */ zr f5555b;

    zt(zr zrVar, String str) {
        this.f5555b = zrVar;
        this.f5554a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if ("Account Transfer".equalsIgnoreCase(this.f5554a)) {
            this.f5555b.f5552b.m3397d(this.f5555b.f5551a);
        } else {
            this.f5555b.f5552b.m3384a(this.f5555b.f5551a);
        }
    }
}
