package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class wy implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5428a;

    wy(ExpenseNewTransaction expenseNewTransaction) {
        this.f5428a = expenseNewTransaction;
    }

    public void onClick(View view) {
        this.f5428a.startActivityForResult(new Intent(this.f5428a.f3334a, Calculator.class), 4);
    }
}
