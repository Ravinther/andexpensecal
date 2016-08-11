package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class mc implements OnClickListener {
    final /* synthetic */ boolean f4958a;
    final /* synthetic */ TextView f4959b;
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4960c;

    mc(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd, boolean z, TextView textView) {
        this.f4960c = expenseBudgetOnetimeAdd;
        this.f4958a = z;
        this.f4959b = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4958a) {
            this.f4960c.f2963j.setVisibility(0);
            this.f4959b.setText(this.f4960c.getResources().getString(2131099720));
            return;
        }
        this.f4959b.setText(null);
    }
}
