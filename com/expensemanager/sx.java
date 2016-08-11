package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class sx implements OnClickListener {
    final /* synthetic */ ExpenseExport f5276a;

    sx(ExpenseExport expenseExport) {
        this.f5276a = expenseExport;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener syVar = new sy(this);
        CharSequence[] a = ExpenseExport.m3165a(co.f4430d, ".csv");
        CharSequence string = this.f5276a.getResources().getString(2131099927);
        if (a == null || a.length == 0) {
            string = this.f5276a.getResources().getString(2131099928);
        } else {
            this.f5276a.f3213c = a[0];
        }
        Builder builder = new Builder(this.f5276a.f3212b);
        builder.setTitle(string);
        builder.setSingleChoiceItems(a, 0, new sz(this, a));
        builder.setPositiveButton("OK", syVar);
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
}
