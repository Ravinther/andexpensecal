package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ml implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4976a;

    ml(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4976a = expenseBudgetOnetimeAdd;
    }

    public void onClick(View view) {
        this.f4976a.setResult(0, new Intent());
        this.f4976a.finish();
    }
}
