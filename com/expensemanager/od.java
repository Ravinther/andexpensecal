package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class od implements OnClickListener {
    final /* synthetic */ HashMap f5070a;
    final /* synthetic */ LinearLayout f5071b;
    final /* synthetic */ ExpenseChartDate f5072c;

    od(ExpenseChartDate expenseChartDate, HashMap hashMap, LinearLayout linearLayout) {
        this.f5072c = expenseChartDate;
        this.f5070a = hashMap;
        this.f5071b = linearLayout;
    }

    public void onClick(View view) {
        try {
            ExpenseChartDate.f3050r.clear();
            this.f5072c.m2979c(this.f5070a, ExpenseChartDate.f3050r);
            ExpenseChartDate.f3049o = ExpenseChartDate.f3050r.size();
            this.f5072c.f3064p.m145c();
            this.f5072c.f3065q.m3495a();
            this.f5072c.f3065q.setCurrentItem(ExpenseChartDate.m2958a(aba.m3776d(0), ExpenseChartDate.f3050r));
            this.f5071b.setVisibility(8);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
