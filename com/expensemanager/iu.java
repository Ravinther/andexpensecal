package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class iu implements OnClickListener {
    final /* synthetic */ ExpenseAccountTransfer f4818a;

    iu(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4818a = expenseAccountTransfer;
    }

    public void onClick(View view) {
        this.f4818a.startActivityForResult(new Intent(this.f4818a.f2819e, Calculator.class), 3);
    }
}
