package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class lz implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4953a;

    lz(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4953a = expenseBudgetOnetimeAdd;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.f4953a.f2970r.setText(null);
            this.f4953a.f2955b = -1;
        }
    }
}
