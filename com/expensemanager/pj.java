package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class pj implements OnClickListener {
    final /* synthetic */ boolean[] f5128a;
    final /* synthetic */ String[] f5129b;
    final /* synthetic */ TextView f5130c;
    final /* synthetic */ ExpenseChartSummary f5131d;

    pj(ExpenseChartSummary expenseChartSummary, boolean[] zArr, String[] strArr, TextView textView) {
        this.f5131d = expenseChartSummary;
        this.f5128a = zArr;
        this.f5129b = strArr;
        this.f5130c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.f5128a.length) {
            if (this.f5128a[i2]) {
                str = "".equals(str) ? this.f5129b[i2] : str + "," + this.f5129b[i2];
            }
            i2++;
        }
        this.f5130c.setText(str);
        ExpenseChartSummary.f3114J = str;
        if (str != null && str.split(",").length == this.f5129b.length) {
            ExpenseChartSummary.f3114J = "All";
        }
        this.f5131d.f3133p.m145c();
    }
}
