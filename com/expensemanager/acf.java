package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;

class acf implements OnClickListener {
    final /* synthetic */ LinearLayout f3895a;
    final /* synthetic */ TextView f3896b;
    final /* synthetic */ TextView f3897c;
    final /* synthetic */ TextView f3898d;
    final /* synthetic */ InterestCalculator f3899e;

    acf(InterestCalculator interestCalculator, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f3899e = interestCalculator;
        this.f3895a = linearLayout;
        this.f3896b = textView;
        this.f3897c = textView2;
        this.f3898d = textView3;
    }

    public void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3899e.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(this.f3899e.f3500d.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f3899e.f3501e.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f3899e.f3502f.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f3899e.f3503g.getApplicationWindowToken(), 0);
        this.f3895a.setVisibility(0);
        String str = this.f3899e.f3499c[this.f3899e.f3498b.getSelectedItemPosition()];
        try {
            double i = aib.m3877i(this.f3899e.f3500d.getText().toString());
            double i2 = aib.m3877i(this.f3899e.f3501e.getText().toString());
            double i3 = aib.m3877i(this.f3899e.f3502f.getText().toString());
            double i4 = aib.m3877i(this.f3899e.f3503g.getText().toString());
            double d = (i4 / 12.0d) / 100.0d;
            d = (((Math.pow(1.0d + d, i3) - 1.0d) * i2) / d) + (Math.pow(1.0d + d, i3) * i);
            if ("Daily".equalsIgnoreCase(str)) {
                d = (i4 / 365.0d) / 100.0d;
                d = ((((12.0d * i2) / 365.0d) * (Math.pow(1.0d + d, (i3 / 12.0d) * 365.0d) - 1.0d)) / d) + (Math.pow(1.0d + d, (i3 / 12.0d) * 365.0d) * i);
            }
            if ("Quarterly".equalsIgnoreCase(str)) {
                d = (i4 / 4.0d) / 100.0d;
                d = (((3.0d * i2) * (Math.pow(1.0d + d, i3 / 3.0d) - 1.0d)) / d) + (Math.pow(1.0d + d, i3 / 3.0d) * i);
            }
            if ("Semiannually".equalsIgnoreCase(str)) {
                d = (i4 / 2.0d) / 100.0d;
                d = (((6.0d * i2) * (Math.pow(1.0d + d, i3 / 6.0d) - 1.0d)) / d) + (Math.pow(1.0d + d, i3 / 6.0d) * i);
            }
            if ("Annually".equalsIgnoreCase(str)) {
                d = i4 / 100.0d;
                d = (((12.0d * i2) * (Math.pow(1.0d + d, i3 / 12.0d) - 1.0d)) / d) + (Math.pow(1.0d + d, i3 / 12.0d) * i);
            }
            if ("No Compound".equalsIgnoreCase(str)) {
                d = ((1.0d + (((i3 / 12.0d) * i4) / 100.0d)) * i) + (i2 * i3);
            }
            d = aib.m3864b(d);
            double b = aib.m3864b((d - i) - (i2 * i3));
            this.f3896b.setText(aib.m3850a(d - b));
            this.f3897c.setText(aib.m3850a(b));
            this.f3898d.setText(aib.m3850a(d));
        } catch (Exception e) {
        }
    }
}
