package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class zv implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f5557a;

    zv(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f5557a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener zwVar = new zw(this);
        DialogInterface.OnClickListener zxVar = new zx(this);
        DialogInterface.OnClickListener zyVar = new zy(this);
        Builder builder = new Builder(this.f5557a.f3413f);
        builder.setTitle(this.f5557a.getResources().getString(2131099805)).setMessage(this.f5557a.getResources().getString(2131099810)).setCancelable(false).setPositiveButton(this.f5557a.getResources().getString(2131099802), zxVar).setNeutralButton(this.f5557a.getResources().getString(2131100105), zwVar).setNegativeButton(this.f5557a.getResources().getString(2131099754), zyVar);
        builder.show();
    }
}
