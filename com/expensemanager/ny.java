package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class ny implements OnClickListener {
    final /* synthetic */ TextView f5057a;
    final /* synthetic */ ExpenseChartDate f5058b;

    ny(ExpenseChartDate expenseChartDate, TextView textView) {
        this.f5058b = expenseChartDate;
        this.f5057a = textView;
    }

    public void onClick(View view) {
        if (this.f5057a.getText().toString().equals(this.f5058b.getResources().getString(2131099918))) {
            this.f5057a.setText(this.f5058b.getResources().getString(2131100077));
            this.f5058b.f3057E.setVisibility(8);
            this.f5058b.f3058F.setVisibility(8);
            return;
        }
        this.f5057a.setText(this.f5058b.getResources().getString(2131099918));
        this.f5058b.f3057E.setVisibility(0);
        this.f5058b.f3058F.setVisibility(0);
    }
}
