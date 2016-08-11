package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bc implements OnClickListener {
    final /* synthetic */ az f4238a;

    bc(az azVar) {
        this.f4238a = azVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
