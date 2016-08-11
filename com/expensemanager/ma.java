package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ma implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4956a;

    ma(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4956a = expenseBudgetOnetimeAdd;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.f4956a.f2969q.setText(null);
            this.f4956a.f2955b = -1;
        }
    }
}
