package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class vo implements OnClickListener {
    final /* synthetic */ String f5375a;
    final /* synthetic */ ExpenseMileageNewEdit f5376b;

    vo(ExpenseMileageNewEdit expenseMileageNewEdit, String str) {
        this.f5376b = expenseMileageNewEdit;
        this.f5375a = str;
    }

    public void onClick(View view) {
        this.f5376b.m3235a(this.f5375a);
    }
}
