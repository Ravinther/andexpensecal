package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class nh implements OnClickListener {
    final /* synthetic */ TextView f5023a;
    final /* synthetic */ ExpenseChartCustom f5024b;

    nh(ExpenseChartCustom expenseChartCustom, TextView textView) {
        this.f5024b = expenseChartCustom;
        this.f5023a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5023a.setText(null);
    }
}
