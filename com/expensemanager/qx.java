package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

class qx implements OnClickListener {
    final /* synthetic */ ExpenseDataBackup f5202a;

    qx(ExpenseDataBackup expenseDataBackup) {
        this.f5202a = expenseDataBackup;
    }

    public void onClick(View view) {
        if (ExpenseExport.m3164a(co.f4430d, "expensemanager.csv", this.f5202a.m3091a())) {
            Toast.makeText(this.f5202a.f3168b, this.f5202a.getResources().getString(2131099901), 1).show();
        } else {
            Toast.makeText(this.f5202a.f3168b, this.f5202a.getResources().getString(2131099897), 1).show();
        }
    }
}
