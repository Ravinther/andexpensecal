package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class ps implements OnClickListener {
    final /* synthetic */ HashMap f5148a;
    final /* synthetic */ LinearLayout f5149b;
    final /* synthetic */ ExpenseChartSummary f5150c;

    ps(ExpenseChartSummary expenseChartSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f5150c = expenseChartSummary;
        this.f5148a = hashMap;
        this.f5149b = linearLayout;
    }

    public void onClick(View view) {
        ExpenseChartSummary.f3117r.clear();
        this.f5150c.m3040a(this.f5148a, ExpenseChartSummary.f3117r);
        ExpenseChartSummary.f3116o = ExpenseChartSummary.f3117r.size();
        this.f5150c.f3133p.m145c();
        this.f5150c.f3134q.m3495a();
        this.f5150c.f3134q.setCurrentItem(this.f5150c.m3031a(aba.m3779e(0), ExpenseChartSummary.f3117r));
        this.f5149b.setVisibility(8);
    }
}
