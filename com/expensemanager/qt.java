package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class qt implements OnClickListener {
    final /* synthetic */ TextView f5193a;
    final /* synthetic */ ExpenseCustomActivities f5194b;

    qt(ExpenseCustomActivities expenseCustomActivities, TextView textView) {
        this.f5194b = expenseCustomActivities;
        this.f5193a = textView;
    }

    public void onClick(View view) {
        this.f5193a.setText(2131100004);
        this.f5194b.f3150k.setText(null);
        this.f5194b.f3151l.setText(null);
        this.f5194b.f3152m.setText(null);
        this.f5194b.f3151l.setTextColor(co.f4428b);
    }
}
