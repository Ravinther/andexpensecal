package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class qk implements OnClickListener {
    final /* synthetic */ String[] f5176a;
    final /* synthetic */ TextView f5177b;
    final /* synthetic */ ExpenseCustomActivities f5178c;

    qk(ExpenseCustomActivities expenseCustomActivities, String[] strArr, TextView textView) {
        this.f5178c = expenseCustomActivities;
        this.f5176a = strArr;
        this.f5177b = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5176a.length > 0) {
            this.f5177b.setText(aib.m3868b(this.f5176a, ","));
        }
    }
}
