package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;

class hs implements OnClickListener {
    final /* synthetic */ HashMap f4759a;
    final /* synthetic */ TextView f4760b;
    final /* synthetic */ LinearLayout f4761c;
    final /* synthetic */ ExpenseAccountSummary f4762d;

    hs(ExpenseAccountSummary expenseAccountSummary, HashMap hashMap, TextView textView, LinearLayout linearLayout) {
        this.f4762d = expenseAccountSummary;
        this.f4759a = hashMap;
        this.f4760b = textView;
        this.f4761c = linearLayout;
    }

    public void onClick(View view) {
        ExpenseAccountSummary.f2774q.clear();
        if (!(this.f4759a.get("fromDate") == null || this.f4759a.get("toDate") == null)) {
            ExpenseAccountSummary.f2774q.add(this.f4759a);
        }
        if (!(!this.f4760b.getText().toString().equals(this.f4762d.getResources().getString(2131099918)) || this.f4762d.getResources().getString(2131100132).equals(this.f4762d.f2785F.getText().toString()) || this.f4762d.getResources().getString(2131099912).equals(this.f4762d.f2784E.getText().toString()))) {
            ExpenseAccountSummary.f2774q.clear();
            this.f4759a.put("fromDate", this.f4762d.f2784E.getText().toString());
            this.f4759a.put("toDate", this.f4762d.f2785F.getText().toString());
            if (!(this.f4759a.get("fromDate") == null || this.f4759a.get("toDate") == null)) {
                ExpenseAccountSummary.f2774q.add(this.f4759a);
            }
        }
        ExpenseAccountSummary.f2773n = ExpenseAccountSummary.f2774q.size();
        this.f4762d.f2788o.m145c();
        this.f4762d.f2789p.m3495a();
        this.f4761c.setVisibility(0);
        ExpenseAccountSummary.f2777u = 1;
        ExpenseAccountSummary.f2779w = "Date Period: " + this.f4762d.f2786I;
    }
}
