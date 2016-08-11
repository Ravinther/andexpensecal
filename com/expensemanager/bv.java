package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.Arrays;

class bv implements OnClickListener {
    final /* synthetic */ String[] f4269a;
    final /* synthetic */ ChartNewSummary f4270b;

    bv(ChartNewSummary chartNewSummary, String[] strArr) {
        this.f4270b = chartNewSummary;
        this.f4269a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4269a.length > 0) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f4269a));
            arrayList.remove("Account Transfer");
            ChartNewSummary.f2573A = aib.m3857a(arrayList, ",");
        }
        this.f4270b.f2601p.m145c();
    }
}
