package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class dr implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4491a;

    dr(DebtAddEdit debtAddEdit) {
        this.f4491a = debtAddEdit;
    }

    public void onClick(View view) {
        this.f4491a.startActivityForResult(new Intent(this.f4491a.f2654a, Calculator.class), 10);
    }
}
