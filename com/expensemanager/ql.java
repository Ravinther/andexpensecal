package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ql implements OnClickListener {
    final /* synthetic */ String[] f5179a;
    final /* synthetic */ TextView f5180b;
    final /* synthetic */ ExpenseCustomActivities f5181c;

    ql(ExpenseCustomActivities expenseCustomActivities, String[] strArr, TextView textView) {
        this.f5181c = expenseCustomActivities;
        this.f5179a = strArr;
        this.f5180b = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5179a.length > 0) {
            this.f5180b.setText(this.f5179a[0]);
        }
    }
}
