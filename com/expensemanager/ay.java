package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class ay implements OnItemSelectedListener {
    final /* synthetic */ ChartNewMonthly f4229a;

    ay(ChartNewMonthly chartNewMonthly) {
        this.f4229a = chartNewMonthly;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f4229a.f2529m.getSelectedItemPosition() >= 4) {
            this.f4229a.m2458e();
        } else if (this.f4229a.f2529m.getSelectedItemPosition() == 0) {
            this.f4229a.m2456d();
        } else {
            this.f4229a.m2455c();
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
