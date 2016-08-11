package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class xp implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5452a;

    xp(ExpenseNewTransaction expenseNewTransaction) {
        this.f5452a = expenseNewTransaction;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.f5452a.getSystemService("input_method")).hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        this.f5452a.m3301a("OKNEW");
        this.f5452a.f3340g.setHint(this.f5452a.f3340g.getText().toString());
        this.f5452a.f3340g.setText(null);
        this.f5452a.f3341h.setText(null);
    }
}
