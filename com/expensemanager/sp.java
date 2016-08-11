package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

class sp implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5266a;

    sp(ExpenseDetails expenseDetails) {
        this.f5266a = expenseDetails;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        instance.set(5, this.f5266a.f3174B);
        instance.set(2, this.f5266a.f3173A);
        instance.set(1, this.f5266a.f3210z);
        instance.add(5, 1);
        this.f5266a.f3210z = instance.get(1);
        this.f5266a.f3173A = instance.get(2);
        this.f5266a.f3174B = instance.get(5);
        this.f5266a.m3113b();
    }
}
