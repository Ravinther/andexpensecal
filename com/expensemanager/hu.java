package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class hu implements OnClickListener {
    final /* synthetic */ HashMap f4766a;
    final /* synthetic */ LinearLayout f4767b;
    final /* synthetic */ ExpenseAccountSummary f4768c;

    hu(ExpenseAccountSummary expenseAccountSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f4768c = expenseAccountSummary;
        this.f4766a = hashMap;
        this.f4767b = linearLayout;
    }

    public void onClick(View view) {
        try {
            ExpenseAccountSummary.f2774q.clear();
            ExpenseAccountSummary.m2690c(this.f4766a, ExpenseAccountSummary.f2774q);
            ExpenseAccountSummary.f2773n = ExpenseAccountSummary.f2774q.size();
            this.f4768c.f2788o.m145c();
            this.f4768c.f2789p.m3495a();
            this.f4768c.f2789p.setCurrentItem(ExpenseAccountSummary.m2675a(aba.m3776d(0), ExpenseAccountSummary.f2774q));
            this.f4767b.setVisibility(8);
            ExpenseAccountSummary.f2777u = 1;
            ExpenseAccountSummary.f2779w = "Monthly Period: " + this.f4768c.f2786I;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
