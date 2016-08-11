package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class qv implements OnClickListener {
    final /* synthetic */ TextView f5197a;
    final /* synthetic */ ExpenseCustomActivities f5198b;

    qv(ExpenseCustomActivities expenseCustomActivities, TextView textView) {
        this.f5198b = expenseCustomActivities;
        this.f5197a = textView;
    }

    public void onClick(View view) {
        this.f5197a.setText(2131100007);
        this.f5198b.f3150k.setText(null);
        this.f5198b.f3151l.setText(null);
        this.f5198b.f3152m.setText(null);
        this.f5198b.f3151l.setTextColor(co.f4428b);
    }
}
