package com.expensemanager;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

class cy implements OnKeyListener {
    final /* synthetic */ EditText f4457a;
    final /* synthetic */ CreditCardPayOffCalculator f4458b;

    cy(CreditCardPayOffCalculator creditCardPayOffCalculator, EditText editText) {
        this.f4458b = creditCardPayOffCalculator;
        this.f4457a = editText;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            this.f4457a.setText("");
        }
        return false;
    }
}
