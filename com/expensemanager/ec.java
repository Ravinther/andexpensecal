package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class ec implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4576a;

    ec(DebtAddEdit debtAddEdit) {
        this.f4576a = debtAddEdit;
    }

    public void onClick(View view) {
        this.f4576a.startActivityForResult(new Intent(this.f4576a.f2654a, Calculator.class), 4);
    }
}
