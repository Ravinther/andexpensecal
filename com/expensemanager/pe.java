package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class pe implements OnClickListener {
    final /* synthetic */ ExpenseChartPeriod f5121a;

    pe(ExpenseChartPeriod expenseChartPeriod) {
        this.f5121a = expenseChartPeriod;
    }

    public void onClick(View view) {
        this.f5121a.setResult(0, new Intent());
        this.f5121a.finish();
    }
}
