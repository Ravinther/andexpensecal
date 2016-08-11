package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ju implements OnClickListener {
    final /* synthetic */ ExpenseAutoFillAddEdit f4860a;

    ju(ExpenseAutoFillAddEdit expenseAutoFillAddEdit) {
        this.f4860a = expenseAutoFillAddEdit;
    }

    public void onClick(View view) {
        this.f4860a.startActivityForResult(new Intent(this.f4860a.f2863a, ExpensePaymentMethodList.class), 5);
    }
}
