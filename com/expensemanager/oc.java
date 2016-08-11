package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class oc implements OnClickListener {
    final /* synthetic */ HashMap f5067a;
    final /* synthetic */ LinearLayout f5068b;
    final /* synthetic */ ExpenseChartDate f5069c;

    oc(ExpenseChartDate expenseChartDate, HashMap hashMap, LinearLayout linearLayout) {
        this.f5069c = expenseChartDate;
        this.f5067a = hashMap;
        this.f5068b = linearLayout;
    }

    public void onClick(View view) {
        ExpenseChartDate.f3050r.clear();
        this.f5069c.m2974b(this.f5067a, ExpenseChartDate.f3050r);
        ExpenseChartDate.f3049o = ExpenseChartDate.f3050r.size();
        this.f5069c.f3064p.m145c();
        this.f5069c.f3065q.m3495a();
        this.f5069c.f3065q.setCurrentItem(ExpenseChartDate.m2958a(aba.m3763b(0), ExpenseChartDate.f3050r));
        this.f5068b.setVisibility(8);
    }
}
