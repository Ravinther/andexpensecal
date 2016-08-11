package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bx implements OnClickListener {
    final /* synthetic */ boolean[] f4272a;
    final /* synthetic */ String[] f4273b;
    final /* synthetic */ ChartNewSummary f4274c;

    bx(ChartNewSummary chartNewSummary, boolean[] zArr, String[] strArr) {
        this.f4274c = chartNewSummary;
        this.f4272a = zArr;
        this.f4273b = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.f4272a.length) {
            if (this.f4272a[i2]) {
                str = "".equals(str) ? this.f4273b[i2] : str + "," + this.f4273b[i2];
            }
            i2++;
        }
        ChartNewSummary.f2573A = str;
        this.f4274c.f2601p.m145c();
    }
}
