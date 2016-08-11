package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class adw implements OnClickListener {
    final /* synthetic */ String[] f3980a;
    final /* synthetic */ SMSAddEdit f3981b;

    adw(SMSAddEdit sMSAddEdit, String[] strArr) {
        this.f3981b = sMSAddEdit;
        this.f3980a = strArr;
    }

    public void onClick(View view) {
        this.f3981b.m3527a(this.f3980a, this.f3981b.f3562b);
    }
}
