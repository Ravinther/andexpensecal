package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

class so implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5265a;

    so(ExpenseDetails expenseDetails) {
        this.f5265a = expenseDetails;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        instance.set(5, this.f5265a.f3174B);
        instance.set(2, this.f5265a.f3173A);
        instance.set(1, this.f5265a.f3210z);
        instance.add(5, -1);
        this.f5265a.f3210z = instance.get(1);
        this.f5265a.f3173A = instance.get(2);
        this.f5265a.f3174B = instance.get(5);
        this.f5265a.m3113b();
    }
}
