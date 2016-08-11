package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class vy implements OnClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5386a;

    vy(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5386a = expenseMileageNewEdit;
    }

    public void onClick(View view) {
        this.f5386a.startActivityForResult(new Intent(this.f5386a.f3268a, Calculator.class), 4);
    }
}
