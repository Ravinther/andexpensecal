package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class aab implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f3796a;

    aab(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f3796a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        this.f3796a.startActivityForResult(new Intent(this.f3796a.f3413f, Calculator.class), 4);
    }
}
