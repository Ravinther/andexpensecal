package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: com.expensemanager.w */
class C0464w implements OnItemSelectedListener {
    final /* synthetic */ ChartNewCustom f5388a;

    C0464w(ChartNewCustom chartNewCustom) {
        this.f5388a = chartNewCustom;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 1 && this.f5388a.f2447j.isChecked()) {
            this.f5388a.f2453p.setVisibility(0);
            this.f5388a.f2454q.setVisibility(0);
            return;
        }
        this.f5388a.f2453p.setVisibility(8);
        this.f5388a.f2454q.setVisibility(8);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
