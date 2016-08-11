package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ni implements OnClickListener {
    final /* synthetic */ boolean[] f5025a;
    final /* synthetic */ String[] f5026b;
    final /* synthetic */ TextView f5027c;
    final /* synthetic */ ExpenseChartCustom f5028d;

    ni(ExpenseChartCustom expenseChartCustom, boolean[] zArr, String[] strArr, TextView textView) {
        this.f5028d = expenseChartCustom;
        this.f5025a = zArr;
        this.f5026b = strArr;
        this.f5027c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5025a.length) {
            if (this.f5025a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5026b[i2] : charSequence + "," + this.f5026b[i2];
            }
            i2++;
        }
        this.f5027c.setText(charSequence);
    }
}
