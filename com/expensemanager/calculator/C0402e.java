package com.expensemanager.calculator;

import android.text.Editable;
import android.text.Editable.Factory;

/* renamed from: com.expensemanager.calculator.e */
public class C0402e extends Factory {
    private C0405h f4307a;

    public C0402e(C0405h c0405h) {
        this.f4307a = c0405h;
    }

    public Editable newEditable(CharSequence charSequence) {
        return new C0400c(charSequence, this.f4307a, null);
    }
}
