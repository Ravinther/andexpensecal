package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.expensemanager.p */
class C0456p implements OnClickListener {
    final /* synthetic */ ChartNewCustom f5115a;

    C0456p(ChartNewCustom chartNewCustom) {
        this.f5115a = chartNewCustom;
    }

    public void onClick(View view) {
        this.f5115a.setResult(0, new Intent());
        this.f5115a.finish();
    }
}
