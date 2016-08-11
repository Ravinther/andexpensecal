package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class ht implements OnClickListener {
    final /* synthetic */ HashMap f4763a;
    final /* synthetic */ LinearLayout f4764b;
    final /* synthetic */ ExpenseAccountSummary f4765c;

    ht(ExpenseAccountSummary expenseAccountSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f4765c = expenseAccountSummary;
        this.f4763a = hashMap;
        this.f4764b = linearLayout;
    }

    public void onClick(View view) {
        ExpenseAccountSummary.f2774q.clear();
        ExpenseAccountSummary.m2687b(this.f4763a, ExpenseAccountSummary.f2774q);
        ExpenseAccountSummary.f2773n = ExpenseAccountSummary.f2774q.size();
        this.f4765c.f2788o.m145c();
        this.f4765c.f2789p.m3495a();
        this.f4765c.f2789p.setCurrentItem(ExpenseAccountSummary.m2675a(aba.m3763b(0), ExpenseAccountSummary.f2774q));
        this.f4764b.setVisibility(8);
        ExpenseAccountSummary.f2777u = 0;
        ExpenseAccountSummary.f2779w = "Weekly Period: " + this.f4765c.f2786I;
    }
}
