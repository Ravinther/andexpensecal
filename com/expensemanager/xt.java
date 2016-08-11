package com.expensemanager;

import android.text.InputFilter;
import android.text.Spanned;

class xt implements InputFilter {
    final /* synthetic */ ExpenseNewTransaction f5456a;

    xt(ExpenseNewTransaction expenseNewTransaction) {
        this.f5456a = expenseNewTransaction;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!Character.isDigit(charSequence.charAt(i)) && charSequence.charAt(i) != '.') {
                return "";
            }
            i++;
        }
        return null;
    }
}
