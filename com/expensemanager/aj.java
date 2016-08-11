package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class aj implements OnClickListener {
    final /* synthetic */ TextView f4186a;
    final /* synthetic */ ChartNewDate f4187b;

    aj(ChartNewDate chartNewDate, TextView textView) {
        this.f4187b = chartNewDate;
        this.f4186a = textView;
    }

    public void onClick(View view) {
        if (this.f4186a.getText().toString().equals(this.f4187b.getResources().getString(2131099918))) {
            this.f4186a.setText(this.f4187b.getResources().getString(2131100077));
            this.f4187b.f2493H.setVisibility(8);
            this.f4187b.f2494I.setVisibility(8);
            return;
        }
        this.f4186a.setText(this.f4187b.getResources().getString(2131099918));
        this.f4187b.f2493H.setVisibility(0);
        this.f4187b.f2494I.setVisibility(0);
    }
}
