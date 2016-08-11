package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class qu implements OnClickListener {
    final /* synthetic */ TextView f5195a;
    final /* synthetic */ ExpenseCustomActivities f5196b;

    qu(ExpenseCustomActivities expenseCustomActivities, TextView textView) {
        this.f5196b = expenseCustomActivities;
        this.f5195a = textView;
    }

    public void onClick(View view) {
        this.f5195a.setText(2131100009);
        this.f5196b.f3150k.setText(null);
        this.f5196b.f3151l.setText(null);
        this.f5196b.f3152m.setText(null);
        this.f5196b.f3151l.setText("Income");
        this.f5196b.f3151l.setTextColor(co.f4429c);
    }
}
