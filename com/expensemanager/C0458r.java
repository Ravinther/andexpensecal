package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

/* renamed from: com.expensemanager.r */
class C0458r implements OnClickListener {
    final /* synthetic */ TextView f5205a;
    final /* synthetic */ ChartNewCustom f5206b;

    C0458r(ChartNewCustom chartNewCustom, TextView textView) {
        this.f5206b = chartNewCustom;
        this.f5205a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5205a.setText(null);
    }
}
