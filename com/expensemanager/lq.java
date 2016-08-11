package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

class lq implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4937a;

    lq(ExpenseBudgetList expenseBudgetList) {
        this.f4937a = expenseBudgetList;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        instance.set(5, this.f4937a.f2943q);
        instance.set(2, this.f4937a.f2942p);
        instance.set(1, this.f4937a.f2941o);
        instance.add(5, -1);
        this.f4937a.f2941o = instance.get(1);
        this.f4937a.f2942p = instance.get(2);
        this.f4937a.f2943q = instance.get(5);
        this.f4937a.m2841b();
    }
}
