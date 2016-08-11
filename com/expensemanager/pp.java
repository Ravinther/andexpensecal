package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.HashMap;

class pp implements OnClickListener {
    final /* synthetic */ HashMap f5139a;
    final /* synthetic */ TextView f5140b;
    final /* synthetic */ ExpenseChartSummary f5141c;

    pp(ExpenseChartSummary expenseChartSummary, HashMap hashMap, TextView textView) {
        this.f5141c = expenseChartSummary;
        this.f5139a = hashMap;
        this.f5140b = textView;
    }

    public void onClick(View view) {
        ExpenseChartSummary.f3117r.clear();
        if (!(this.f5139a.get("fromDate") == null || this.f5139a.get("toDate") == null)) {
            ExpenseChartSummary.f3117r.add(this.f5139a);
        }
        if (!(!this.f5140b.getText().toString().equals(this.f5141c.getResources().getString(2131099918)) || this.f5141c.getResources().getString(2131100132).equals(this.f5141c.f3127F.getText().toString()) || this.f5141c.getResources().getString(2131099912).equals(this.f5141c.f3126E.getText().toString()))) {
            ExpenseChartSummary.f3117r.clear();
            this.f5139a.put("fromDate", this.f5141c.f3126E.getText().toString());
            this.f5139a.put("toDate", this.f5141c.f3127F.getText().toString());
            if (!(this.f5139a.get("fromDate") == null || this.f5139a.get("toDate") == null)) {
                ExpenseChartSummary.f3117r.add(this.f5139a);
            }
        }
        ExpenseChartSummary.f3116o = ExpenseChartSummary.f3117r.size();
        this.f5141c.f3133p.m145c();
        this.f5141c.f3134q.m3495a();
    }
}
