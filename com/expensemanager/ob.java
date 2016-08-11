package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.HashMap;

class ob implements OnClickListener {
    final /* synthetic */ HashMap f5064a;
    final /* synthetic */ TextView f5065b;
    final /* synthetic */ ExpenseChartDate f5066c;

    ob(ExpenseChartDate expenseChartDate, HashMap hashMap, TextView textView) {
        this.f5066c = expenseChartDate;
        this.f5064a = hashMap;
        this.f5065b = textView;
    }

    public void onClick(View view) {
        ExpenseChartDate.f3050r.clear();
        if (!(this.f5064a.get("fromDate") == null || this.f5064a.get("toDate") == null)) {
            ExpenseChartDate.f3050r.add(this.f5064a);
        }
        if (!(!this.f5065b.getText().toString().equals(this.f5066c.getResources().getString(2131099918)) || this.f5066c.getResources().getString(2131100132).equals(this.f5066c.f3058F.getText().toString()) || this.f5066c.getResources().getString(2131099912).equals(this.f5066c.f3057E.getText().toString()))) {
            ExpenseChartDate.f3050r.clear();
            this.f5064a.put("fromDate", this.f5066c.f3057E.getText().toString());
            this.f5064a.put("toDate", this.f5066c.f3058F.getText().toString());
            if (!(this.f5064a.get("fromDate") == null || this.f5064a.get("toDate") == null)) {
                ExpenseChartDate.f3050r.add(this.f5064a);
            }
        }
        ExpenseChartDate.f3049o = ExpenseChartDate.f3050r.size();
        this.f5066c.f3064p.m145c();
        this.f5066c.f3065q.m3495a();
    }
}
