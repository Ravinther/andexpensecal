package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class dt implements OnClickListener {
    final /* synthetic */ String f4564a;
    final /* synthetic */ DebtAddEdit f4565b;

    dt(DebtAddEdit debtAddEdit, String str) {
        this.f4565b = debtAddEdit;
        this.f4564a = str;
    }

    public void onClick(View view) {
        this.f4565b.m2575a(this.f4564a);
    }
}
