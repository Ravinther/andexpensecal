package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

class lr implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4938a;

    lr(ExpenseBudgetList expenseBudgetList) {
        this.f4938a = expenseBudgetList;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        instance.set(5, this.f4938a.f2943q);
        instance.set(2, this.f4938a.f2942p);
        instance.set(1, this.f4938a.f2941o);
        instance.add(5, 1);
        this.f4938a.f2941o = instance.get(1);
        this.f4938a.f2942p = instance.get(2);
        this.f4938a.f2943q = instance.get(5);
        this.f4938a.m2841b();
    }
}
