package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class pm implements OnClickListener {
    final /* synthetic */ TextView f5135a;
    final /* synthetic */ ExpenseChartSummary f5136b;

    pm(ExpenseChartSummary expenseChartSummary, TextView textView) {
        this.f5136b = expenseChartSummary;
        this.f5135a = textView;
    }

    public void onClick(View view) {
        if (this.f5135a.getText().toString().equals(this.f5136b.getResources().getString(2131099918))) {
            this.f5135a.setText(this.f5136b.getResources().getString(2131100077));
            this.f5136b.f3126E.setVisibility(8);
            this.f5136b.f3127F.setVisibility(8);
            return;
        }
        this.f5135a.setText(this.f5136b.getResources().getString(2131099918));
        this.f5136b.f3126E.setVisibility(0);
        this.f5136b.f3127F.setVisibility(0);
    }
}
