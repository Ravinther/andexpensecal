package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class rx implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5238a;

    rx(ExpenseDetails expenseDetails) {
        this.f5238a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5238a.f3178F = this.f5238a.f3178F - 1;
        this.f5238a.m3133f();
    }
}
