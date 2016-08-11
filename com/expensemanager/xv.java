package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class xv implements OnClickListener {
    final /* synthetic */ TextView f5459a;
    final /* synthetic */ ExpenseNewTransaction f5460b;

    xv(ExpenseNewTransaction expenseNewTransaction, TextView textView) {
        this.f5460b = expenseNewTransaction;
        this.f5459a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5459a.setText(this.f5460b.f3357x);
    }
}
