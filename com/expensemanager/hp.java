package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class hp implements OnClickListener {
    final /* synthetic */ TextView f4754a;
    final /* synthetic */ TextView f4755b;
    final /* synthetic */ ExpenseAccountSummary f4756c;

    hp(ExpenseAccountSummary expenseAccountSummary, TextView textView, TextView textView2) {
        this.f4756c = expenseAccountSummary;
        this.f4754a = textView;
        this.f4755b = textView2;
    }

    public void onClick(View view) {
        if (this.f4754a.getText().toString().equals(this.f4756c.getResources().getString(2131099918))) {
            this.f4754a.setText(this.f4756c.getResources().getString(2131100077));
            this.f4756c.f2784E.setVisibility(8);
            this.f4756c.f2785F.setVisibility(8);
            this.f4755b.setVisibility(8);
            return;
        }
        this.f4754a.setText(this.f4756c.getResources().getString(2131099918));
        this.f4756c.f2784E.setVisibility(0);
        this.f4756c.f2785F.setVisibility(0);
        this.f4755b.setVisibility(0);
        this.f4756c.m2695j();
    }
}
