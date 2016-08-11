package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ag implements OnClickListener {
    final /* synthetic */ boolean[] f4074a;
    final /* synthetic */ String[] f4075b;
    final /* synthetic */ TextView f4076c;
    final /* synthetic */ ChartNewDate f4077d;

    ag(ChartNewDate chartNewDate, boolean[] zArr, String[] strArr, TextView textView) {
        this.f4077d = chartNewDate;
        this.f4074a = zArr;
        this.f4075b = strArr;
        this.f4076c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.f4074a.length) {
            if (this.f4074a[i2]) {
                str = "".equals(str) ? this.f4075b[i2] : str + "," + this.f4075b[i2];
            }
            i2++;
        }
        this.f4076c.setText(str);
        ChartNewDate.f2483M = str;
        if (str != null && str.split(",").length == this.f4075b.length) {
            ChartNewDate.f2483M = "All";
        }
        this.f4077d.f2500p.m145c();
    }
}
