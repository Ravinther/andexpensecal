package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class jm implements OnClickListener {
    final /* synthetic */ TextView f4844a;
    final /* synthetic */ ExpenseActivitiesDefault f4845b;

    jm(ExpenseActivitiesDefault expenseActivitiesDefault, TextView textView) {
        this.f4845b = expenseActivitiesDefault;
        this.f4844a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4844a.setText(null);
    }
}
