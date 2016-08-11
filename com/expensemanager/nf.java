package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class nf implements OnClickListener {
    final /* synthetic */ ExpenseChartCustom f5021a;

    nf(ExpenseChartCustom expenseChartCustom) {
        this.f5021a = expenseChartCustom;
    }

    public void onClick(View view) {
        this.f5021a.setResult(0, new Intent());
        this.f5021a.finish();
    }
}
