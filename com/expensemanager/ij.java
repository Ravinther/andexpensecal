package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ij implements OnClickListener {
    final /* synthetic */ TextView f4796a;
    final /* synthetic */ ExpenseAccountSummaryTime f4797b;

    ij(ExpenseAccountSummaryTime expenseAccountSummaryTime, TextView textView) {
        this.f4797b = expenseAccountSummaryTime;
        this.f4796a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4796a.setText(null);
        this.f4797b.m2697a();
    }
}
