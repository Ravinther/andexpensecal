package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class ub implements OnClickListener {
    final /* synthetic */ ExpenseManager f5320a;

    ub(ExpenseManager expenseManager) {
        this.f5320a = expenseManager;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5320a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/details?id=" + this.f5320a.getPackageName())));
        this.f5320a.finish();
    }
}
