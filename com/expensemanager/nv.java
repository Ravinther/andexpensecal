package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class nv implements OnClickListener {
    final /* synthetic */ boolean[] f5050a;
    final /* synthetic */ String[] f5051b;
    final /* synthetic */ TextView f5052c;
    final /* synthetic */ ExpenseChartDate f5053d;

    nv(ExpenseChartDate expenseChartDate, boolean[] zArr, String[] strArr, TextView textView) {
        this.f5053d = expenseChartDate;
        this.f5050a = zArr;
        this.f5051b = strArr;
        this.f5052c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.f5050a.length) {
            if (this.f5050a[i2]) {
                str = "".equals(str) ? this.f5051b[i2] : str + "," + this.f5051b[i2];
            }
            i2++;
        }
        this.f5052c.setText(str);
        ExpenseChartDate.f3047J = str;
        if (str != null && str.split(",").length == this.f5051b.length) {
            ExpenseChartDate.f3047J = "All";
        }
        this.f5053d.f3064p.m145c();
    }
}
