package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class wq implements OnClickListener {
    final /* synthetic */ String f5411a;
    final /* synthetic */ ExpenseNewAccount f5412b;

    wq(ExpenseNewAccount expenseNewAccount, String str) {
        this.f5412b = expenseNewAccount;
        this.f5411a = str;
    }

    public void onClick(View view) {
        if (((CheckBox) view).isChecked()) {
            this.f5412b.f3308c.setText(this.f5411a);
        }
    }
}
