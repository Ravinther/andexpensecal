package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zs implements OnClickListener {
    final /* synthetic */ zr f5553a;

    zs(zr zrVar) {
        this.f5553a = zrVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.f5553a.f5552b.f3406E = false;
        } else {
            this.f5553a.f5552b.f3406E = true;
        }
    }
}
