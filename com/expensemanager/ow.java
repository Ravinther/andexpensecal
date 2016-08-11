package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ow implements OnClickListener {
    final /* synthetic */ boolean[] f5107a;
    final /* synthetic */ String[] f5108b;
    final /* synthetic */ TextView f5109c;
    final /* synthetic */ ExpenseChartPeriod f5110d;

    ow(ExpenseChartPeriod expenseChartPeriod, boolean[] zArr, String[] strArr, TextView textView) {
        this.f5110d = expenseChartPeriod;
        this.f5107a = zArr;
        this.f5108b = strArr;
        this.f5109c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5107a.length) {
            if (this.f5107a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5108b[i2] : charSequence + "," + this.f5108b[i2];
            }
            i2++;
        }
        this.f5109c.setText(charSequence);
    }
}
