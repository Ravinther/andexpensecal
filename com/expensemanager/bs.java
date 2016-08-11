package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class bs implements OnClickListener {
    final /* synthetic */ boolean[] f4262a;
    final /* synthetic */ String[] f4263b;
    final /* synthetic */ TextView f4264c;
    final /* synthetic */ ChartNewSummary f4265d;

    bs(ChartNewSummary chartNewSummary, boolean[] zArr, String[] strArr, TextView textView) {
        this.f4265d = chartNewSummary;
        this.f4262a = zArr;
        this.f4263b = strArr;
        this.f4264c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.f4262a.length) {
            if (this.f4262a[i2]) {
                str = "".equals(str) ? this.f4263b[i2] : str + "," + this.f4263b[i2];
            }
            i2++;
        }
        this.f4264c.setText(str);
        ChartNewSummary.f2580Q = str;
        if (str != null && str.split(",").length == this.f4263b.length) {
            ChartNewSummary.f2580Q = "All";
        }
        this.f4265d.f2601p.m145c();
    }
}
