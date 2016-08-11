package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class jv implements OnClickListener {
    final /* synthetic */ ExpenseAutoFillAddEdit f4861a;

    jv(ExpenseAutoFillAddEdit expenseAutoFillAddEdit) {
        this.f4861a = expenseAutoFillAddEdit;
    }

    public void onClick(View view) {
        this.f4861a.startActivityForResult(new Intent(this.f4861a.f2863a, Calculator.class), 4);
    }
}
