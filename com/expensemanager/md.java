package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class md implements OnClickListener {
    final /* synthetic */ boolean[] f4961a;
    final /* synthetic */ String[] f4962b;
    final /* synthetic */ TextView f4963c;
    final /* synthetic */ boolean f4964d;
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4965e;

    md(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd, boolean[] zArr, String[] strArr, TextView textView, boolean z) {
        this.f4965e = expenseBudgetOnetimeAdd;
        this.f4961a = zArr;
        this.f4962b = strArr;
        this.f4963c = textView;
        this.f4964d = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4961a.length) {
            if (this.f4961a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4962b[i2] : charSequence + "," + this.f4962b[i2];
            }
            i2++;
        }
        this.f4963c.setText(charSequence);
        if (this.f4964d) {
            this.f4965e.f2963j.setVisibility(8);
            this.f4965e.f2963j.setChecked(false);
        }
    }
}
