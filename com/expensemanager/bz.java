package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class bz implements OnClickListener {
    final /* synthetic */ TextView f4277a;
    final /* synthetic */ ChartNewSummary f4278b;

    bz(ChartNewSummary chartNewSummary, TextView textView) {
        this.f4278b = chartNewSummary;
        this.f4277a = textView;
    }

    public void onClick(View view) {
        if (this.f4277a.getText().toString().equals(this.f4278b.getResources().getString(2131099918))) {
            this.f4277a.setText(this.f4278b.getResources().getString(2131100077));
            this.f4278b.f2594K.setVisibility(8);
            this.f4278b.f2595L.setVisibility(8);
            return;
        }
        this.f4277a.setText(this.f4278b.getResources().getString(2131099918));
        this.f4278b.f2594K.setVisibility(0);
        this.f4278b.f2595L.setVisibility(0);
    }
}
