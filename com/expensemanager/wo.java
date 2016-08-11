package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class wo implements OnClickListener {
    final /* synthetic */ ExpenseNewAccount f5409a;

    wo(ExpenseNewAccount expenseNewAccount) {
        this.f5409a = expenseNewAccount;
    }

    public void onClick(View view) {
        this.f5409a.startActivityForResult(new Intent(this.f5409a.f3307b, Calculator.class), 0);
    }
}
