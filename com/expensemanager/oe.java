package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class oe implements OnClickListener {
    final /* synthetic */ HashMap f5073a;
    final /* synthetic */ LinearLayout f5074b;
    final /* synthetic */ ExpenseChartDate f5075c;

    oe(ExpenseChartDate expenseChartDate, HashMap hashMap, LinearLayout linearLayout) {
        this.f5075c = expenseChartDate;
        this.f5073a = hashMap;
        this.f5074b = linearLayout;
    }

    public void onClick(View view) {
        ExpenseChartDate.f3050r.clear();
        this.f5075c.m2968a(this.f5073a, ExpenseChartDate.f3050r);
        ExpenseChartDate.f3049o = ExpenseChartDate.f3050r.size();
        this.f5075c.f3064p.m145c();
        this.f5075c.f3065q.m3495a();
        this.f5075c.f3065q.setCurrentItem(ExpenseChartDate.m2958a(aba.m3779e(0), ExpenseChartDate.f3050r));
        this.f5074b.setVisibility(8);
    }
}
