package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class aar implements OnClickListener {
    final /* synthetic */ ExpenseReport f3818a;

    aar(ExpenseReport expenseReport) {
        this.f3818a = expenseReport;
    }

    public void onClick(View view) {
        this.f3818a.startActivityForResult(new Intent(this.f3818a.f3443d, Calculator.class), 0);
    }
}
