package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class bm implements OnClickListener {
    final /* synthetic */ ChartNewPeriod f4254a;

    bm(ChartNewPeriod chartNewPeriod) {
        this.f4254a = chartNewPeriod;
    }

    public void onClick(View view) {
        this.f4254a.setResult(0, new Intent());
        this.f4254a.finish();
    }
}
