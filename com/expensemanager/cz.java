package com.expensemanager;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

class cz implements OnKeyListener {
    final /* synthetic */ EditText f4459a;
    final /* synthetic */ CreditCardPayOffCalculator f4460b;

    cz(CreditCardPayOffCalculator creditCardPayOffCalculator, EditText editText) {
        this.f4460b = creditCardPayOffCalculator;
        this.f4459a = editText;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            this.f4459a.setText("");
        }
        return false;
    }
}
