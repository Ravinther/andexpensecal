package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class hv implements OnClickListener {
    final /* synthetic */ HashMap f4769a;
    final /* synthetic */ LinearLayout f4770b;
    final /* synthetic */ ExpenseAccountSummary f4771c;

    hv(ExpenseAccountSummary expenseAccountSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f4771c = expenseAccountSummary;
        this.f4769a = hashMap;
        this.f4770b = linearLayout;
    }

    public void onClick(View view) {
        ExpenseAccountSummary.f2774q.clear();
        ExpenseAccountSummary.m2683a(this.f4769a, ExpenseAccountSummary.f2774q);
        ExpenseAccountSummary.f2773n = ExpenseAccountSummary.f2774q.size();
        this.f4771c.f2788o.m145c();
        this.f4771c.f2789p.m3495a();
        this.f4771c.f2789p.setCurrentItem(ExpenseAccountSummary.m2675a(aba.m3779e(0), ExpenseAccountSummary.f2774q));
        this.f4770b.setVisibility(8);
        ExpenseAccountSummary.f2777u = 2;
        ExpenseAccountSummary.f2779w = "Yearly Period: " + this.f4771c.f2786I;
    }
}
