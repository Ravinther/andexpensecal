package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ga implements OnClickListener {
    final /* synthetic */ fu f4686a;

    ga(fu fuVar) {
        this.f4686a = fuVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
