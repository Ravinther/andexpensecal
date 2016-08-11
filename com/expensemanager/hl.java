package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class hl implements OnClickListener {
    final /* synthetic */ boolean[] f4744a;
    final /* synthetic */ String[] f4745b;
    final /* synthetic */ TextView f4746c;
    final /* synthetic */ ExpenseAccountSummary f4747d;

    hl(ExpenseAccountSummary expenseAccountSummary, boolean[] zArr, String[] strArr, TextView textView) {
        this.f4747d = expenseAccountSummary;
        this.f4744a = zArr;
        this.f4745b = strArr;
        this.f4746c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.f4744a.length) {
            if (this.f4744a[i2]) {
                str = "".equals(str) ? this.f4745b[i2] : str + "," + this.f4745b[i2];
            }
            i2++;
        }
        this.f4746c.setText(str);
        ExpenseAccountSummary.f2772H = str;
        if (str != null && str.split(",").length == this.f4745b.length) {
            ExpenseAccountSummary.f2772H = "All";
        }
        this.f4747d.f2788o.m145c();
    }
}
