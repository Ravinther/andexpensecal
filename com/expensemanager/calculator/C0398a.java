package com.expensemanager.calculator;

import android.text.Spanned;
import android.text.method.NumberKeyListener;

/* renamed from: com.expensemanager.calculator.a */
class C0398a extends NumberKeyListener {
    final /* synthetic */ CalculatorDisplay f4298a;

    C0398a(CalculatorDisplay calculatorDisplay) {
        this.f4298a = calculatorDisplay;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return null;
    }

    protected char[] getAcceptedChars() {
        return CalculatorDisplay.f4285e;
    }

    public int getInputType() {
        return 0;
    }
}
