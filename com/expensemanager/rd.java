package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Arrays;

class rd implements OnClickListener {
    final /* synthetic */ ExpenseDataBackup f5211a;

    rd(ExpenseDataBackup expenseDataBackup) {
        this.f5211a = expenseDataBackup;
    }

    public void onClick(View view) {
        CharSequence[] a = ExpenseExport.m3165a(co.f4432f, ".db");
        if (!(a == null || a.length == 0)) {
            Arrays.sort(a, new re(this));
        }
        CharSequence string = this.f5211a.getResources().getString(2131100026);
        if (a == null || a.length == 0) {
            string = this.f5211a.getResources().getString(2131099928);
        } else {
            this.f5211a.f3170e = a[0];
        }
        DialogInterface.OnClickListener rfVar = new rf(this);
        Builder builder = new Builder(this.f5211a.f3168b);
        builder.setTitle(string);
        builder.setSingleChoiceItems(a, 0, new rg(this, a));
        builder.setPositiveButton("OK", rfVar);
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
}
