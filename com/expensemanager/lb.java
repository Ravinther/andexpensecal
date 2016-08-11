package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class lb implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4921a;

    lb(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4921a = expenseBudgetAdd;
    }

    public void onClick(View view) {
        this.f4921a.setResult(0, new Intent());
        this.f4921a.finish();
    }
}
