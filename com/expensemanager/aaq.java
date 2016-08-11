package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class aaq implements OnClickListener {
    final /* synthetic */ ExpenseReport f3817a;

    aaq(ExpenseReport expenseReport) {
        this.f3817a = expenseReport;
    }

    public void onClick(View view) {
        this.f3817a.showDialog(0);
    }
}
