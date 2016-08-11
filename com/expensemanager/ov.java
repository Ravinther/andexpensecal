package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ov implements OnClickListener {
    final /* synthetic */ TextView f5105a;
    final /* synthetic */ ExpenseChartPeriod f5106b;

    ov(ExpenseChartPeriod expenseChartPeriod, TextView textView) {
        this.f5106b = expenseChartPeriod;
        this.f5105a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5105a.setText(null);
    }
}
