package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class wt implements OnClickListener {
    final /* synthetic */ ExpenseNewAccount f5420a;

    wt(ExpenseNewAccount expenseNewAccount) {
        this.f5420a = expenseNewAccount;
    }

    public void onClick(View view) {
        this.f5420a.setResult(0, new Intent());
        this.f5420a.finish();
    }
}
