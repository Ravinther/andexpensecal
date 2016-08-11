package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class qz implements OnClickListener {
    final /* synthetic */ ExpenseDataBackup f5204a;

    qz(ExpenseDataBackup expenseDataBackup) {
        this.f5204a = expenseDataBackup;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener raVar = new ra(this);
        CharSequence[] a = this.f5204a.m3094a(co.f4430d);
        CharSequence string = this.f5204a.getResources().getString(2131099927);
        if (a == null || a.length == 0) {
            string = this.f5204a.getResources().getString(2131099928);
        } else {
            this.f5204a.f3169d = a[0];
        }
        Builder builder = new Builder(this.f5204a.f3168b);
        builder.setTitle(string);
        builder.setSingleChoiceItems(a, 0, new rb(this, a));
        builder.setPositiveButton("OK", raVar);
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
}
