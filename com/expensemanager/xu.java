package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class xu implements OnClickListener {
    final /* synthetic */ TextView f5457a;
    final /* synthetic */ ExpenseNewTransaction f5458b;

    xu(ExpenseNewTransaction expenseNewTransaction, TextView textView) {
        this.f5458b = expenseNewTransaction;
        this.f5457a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5458b.f3357x = this.f5457a.getText().toString();
    }
}
