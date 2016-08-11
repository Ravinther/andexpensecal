package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ks implements OnClickListener {
    final /* synthetic */ boolean f4898a;
    final /* synthetic */ TextView f4899b;
    final /* synthetic */ String f4900c;
    final /* synthetic */ ExpenseBudgetAdd f4901d;

    ks(ExpenseBudgetAdd expenseBudgetAdd, boolean z, TextView textView, String str) {
        this.f4901d = expenseBudgetAdd;
        this.f4898a = z;
        this.f4899b = textView;
        this.f4900c = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4898a) {
            this.f4901d.f2901k.setVisibility(0);
        }
        this.f4899b.setText(this.f4900c);
    }
}
