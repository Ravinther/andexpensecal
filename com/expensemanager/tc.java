package com.expensemanager;

import android.text.InputFilter;
import android.text.Spanned;

class tc implements InputFilter {
    final /* synthetic */ ExpenseGroupAddEdit f5286a;

    tc(ExpenseGroupAddEdit expenseGroupAddEdit) {
        this.f5286a = expenseGroupAddEdit;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (charSequence.charAt(i) == '\'' || charSequence.charAt(i) == ',') {
                return "";
            }
            i++;
        }
        return null;
    }
}
