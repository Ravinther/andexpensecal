package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class bd implements OnClickListener {
    final /* synthetic */ TextView f4239a;
    final /* synthetic */ ChartNewPeriod f4240b;

    bd(ChartNewPeriod chartNewPeriod, TextView textView) {
        this.f4240b = chartNewPeriod;
        this.f4239a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4239a.setText(null);
    }
}
