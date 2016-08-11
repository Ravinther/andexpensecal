package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class kp implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4895a;

    kp(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4895a = expenseBudgetAdd;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.f4895a.f2909t.setText(null);
            this.f4895a.f2892b = -1;
            this.f4895a.f2907r.setChecked(false);
            this.f4895a.f2907r.setEnabled(false);
        }
    }
}
