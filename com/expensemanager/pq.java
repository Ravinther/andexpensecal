package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class pq implements OnClickListener {
    final /* synthetic */ HashMap f5142a;
    final /* synthetic */ LinearLayout f5143b;
    final /* synthetic */ ExpenseChartSummary f5144c;

    pq(ExpenseChartSummary expenseChartSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f5144c = expenseChartSummary;
        this.f5142a = hashMap;
        this.f5143b = linearLayout;
    }

    public void onClick(View view) {
        ExpenseChartSummary.f3117r.clear();
        this.f5144c.m3045b(this.f5142a, ExpenseChartSummary.f3117r);
        ExpenseChartSummary.f3116o = ExpenseChartSummary.f3117r.size();
        this.f5144c.f3133p.m145c();
        this.f5144c.f3134q.m3495a();
        this.f5144c.f3134q.setCurrentItem(this.f5144c.m3031a(aba.m3763b(0), ExpenseChartSummary.f3117r));
        this.f5143b.setVisibility(8);
    }
}
