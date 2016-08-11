package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class pr implements OnClickListener {
    final /* synthetic */ HashMap f5145a;
    final /* synthetic */ LinearLayout f5146b;
    final /* synthetic */ ExpenseChartSummary f5147c;

    pr(ExpenseChartSummary expenseChartSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f5147c = expenseChartSummary;
        this.f5145a = hashMap;
        this.f5146b = linearLayout;
    }

    public void onClick(View view) {
        try {
            ExpenseChartSummary.f3117r.clear();
            this.f5147c.m3049c(this.f5145a, ExpenseChartSummary.f3117r);
            ExpenseChartSummary.f3116o = ExpenseChartSummary.f3117r.size();
            this.f5147c.f3133p.m145c();
            this.f5147c.f3134q.m3495a();
            this.f5147c.f3134q.setCurrentItem(this.f5147c.m3031a(aba.m3776d(0), ExpenseChartSummary.f3117r));
            this.f5146b.setVisibility(8);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
