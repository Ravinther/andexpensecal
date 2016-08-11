package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aeh implements OnClickListener {
    final /* synthetic */ String[] f3995a;
    final /* synthetic */ SMSAddEdit f3996b;

    aeh(SMSAddEdit sMSAddEdit, String[] strArr) {
        this.f3996b = sMSAddEdit;
        this.f3995a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3996b.f3571k = this.f3995a[i];
    }
}
