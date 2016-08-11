package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Arrays;

class rh implements OnClickListener {
    final /* synthetic */ ExpenseDataBackup f5216a;

    rh(ExpenseDataBackup expenseDataBackup) {
        this.f5216a = expenseDataBackup;
    }

    public void onClick(View view) {
        CharSequence[] a = ExpenseExport.m3165a(co.f4433g, ".db");
        if (!(a == null || a.length == 0)) {
            Arrays.sort(a, new ri(this));
        }
        CharSequence string = this.f5216a.getResources().getString(2131100026);
        if (a == null || a.length == 0) {
            string = this.f5216a.getResources().getString(2131099928);
        } else {
            this.f5216a.f3170e = a[0];
        }
        DialogInterface.OnClickListener rjVar = new rj(this);
        Builder builder = new Builder(this.f5216a.f3168b);
        builder.setTitle(string);
        builder.setSingleChoiceItems(a, 0, new rk(this, a));
        builder.setPositiveButton("OK", rjVar);
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
}
