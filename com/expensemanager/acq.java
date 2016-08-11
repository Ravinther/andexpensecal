package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class acq implements OnClickListener {
    final /* synthetic */ LoanCalculator f3930a;

    acq(LoanCalculator loanCalculator) {
        this.f3930a = loanCalculator;
    }

    public void onClick(View view) {
        this.f3930a.onCreate(null);
    }
}
