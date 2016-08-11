package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class aac implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f3797a;

    aac(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f3797a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        this.f3797a.startActivityForResult(new Intent(this.f3797a.f3413f, Calculator.class), 8);
    }
}
