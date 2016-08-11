package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class mz implements OnClickListener {
    final /* synthetic */ ExpenseChartBuilder f5008a;

    mz(ExpenseChartBuilder expenseChartBuilder) {
        this.f5008a = expenseChartBuilder;
    }

    public void onClick(View view) {
        if ("PIE".equals(this.f5008a.f3000b)) {
            this.f5008a.f3000b = "BAR";
            this.f5008a.f3011m = 2131100025;
        } else {
            this.f5008a.f3000b = "PIE";
            this.f5008a.f3011m = 2131099739;
        }
        this.f5008a.f3012n = null;
        this.f5008a.onCreate(null);
        this.f5008a.onResume();
    }
}
