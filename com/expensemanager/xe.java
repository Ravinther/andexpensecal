package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class xe implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5437a;

    xe(ExpenseNewTransaction expenseNewTransaction) {
        this.f5437a = expenseNewTransaction;
    }

    public void onClick(View view) {
        this.f5437a.startActivityForResult(new Intent(this.f5437a.f3334a, Calculator.class), 10);
    }
}
