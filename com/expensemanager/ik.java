package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ik implements OnClickListener {
    final /* synthetic */ boolean[] f4798a;
    final /* synthetic */ String[] f4799b;
    final /* synthetic */ TextView f4800c;
    final /* synthetic */ ExpenseAccountSummaryTime f4801d;

    ik(ExpenseAccountSummaryTime expenseAccountSummaryTime, boolean[] zArr, String[] strArr, TextView textView) {
        this.f4801d = expenseAccountSummaryTime;
        this.f4798a = zArr;
        this.f4799b = strArr;
        this.f4800c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4798a.length) {
            if (this.f4798a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4799b[i2] : charSequence + "," + this.f4799b[i2];
            }
            i2++;
        }
        this.f4800c.setText(charSequence);
        this.f4801d.m2697a();
    }
}
