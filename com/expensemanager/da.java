package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

class da implements OnClickListener {
    final /* synthetic */ EditText f4461a;
    final /* synthetic */ EditText f4462b;
    final /* synthetic */ EditText f4463c;
    final /* synthetic */ EditText f4464d;
    final /* synthetic */ LinearLayout f4465e;
    final /* synthetic */ TextView f4466f;
    final /* synthetic */ CreditCardPayOffCalculator f4467g;

    da(CreditCardPayOffCalculator creditCardPayOffCalculator, EditText editText, EditText editText2, EditText editText3, EditText editText4, LinearLayout linearLayout, TextView textView) {
        this.f4467g = creditCardPayOffCalculator;
        this.f4461a = editText;
        this.f4462b = editText2;
        this.f4463c = editText3;
        this.f4464d = editText4;
        this.f4465e = linearLayout;
        this.f4466f = textView;
    }

    public void onClick(View view) {
        if (!"".equals(this.f4461a.getText().toString()) && !"".equals(this.f4462b.getText().toString())) {
            if (!"".equals(this.f4463c.getText().toString()) || !"".equals(this.f4464d.getText().toString())) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f4467g.getSystemService("input_method");
                inputMethodManager.hideSoftInputFromWindow(this.f4461a.getApplicationWindowToken(), 0);
                inputMethodManager.hideSoftInputFromWindow(this.f4462b.getApplicationWindowToken(), 0);
                inputMethodManager.hideSoftInputFromWindow(this.f4463c.getApplicationWindowToken(), 0);
                inputMethodManager.hideSoftInputFromWindow(this.f4464d.getApplicationWindowToken(), 0);
                this.f4465e.setVisibility(0);
                try {
                    CharSequence replace;
                    double i = aib.m3877i(this.f4461a.getText().toString());
                    double i2 = aib.m3877i(this.f4462b.getText().toString());
                    String str = "";
                    if (this.f4463c.getText().toString() == null || "".equals(this.f4463c.getText().toString())) {
                        i2 = CreditCardPayOffCalculator.m2538a(i, i2, Integer.parseInt(this.f4464d.getText().toString()));
                        replace = this.f4467g.getResources().getString(2131100017).replace("xx", aib.m3850a(i2));
                        this.f4467g.f2625b = aib.m3850a(i2);
                    } else {
                        i2 = CreditCardPayOffCalculator.m2537a(i, i2, aib.m3877i(this.f4463c.getText().toString()));
                        int ceil = (int) Math.ceil(Math.floor(i2 * 100.0d) / 100.0d);
                        replace = this.f4467g.getResources().getString(2131100016).replace("xx", "" + aib.m3850a(i2));
                        this.f4467g.f2624a = ceil;
                        if (Double.isInfinite(i2)) {
                            replace = this.f4467g.getResources().getString(2131100015);
                        }
                    }
                    this.f4466f.setText(replace);
                } catch (Exception e) {
                }
            }
        }
    }
}
