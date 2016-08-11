package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class eb implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4575a;

    eb(DebtAddEdit debtAddEdit) {
        this.f4575a = debtAddEdit;
    }

    public void onClick(View view) {
        this.f4575a.startActivityForResult(new Intent(this.f4575a.f2654a, ExpensePaymentMethodList.class), 5);
    }
}
