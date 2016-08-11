package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class aq implements OnItemSelectedListener {
    final /* synthetic */ ChartNewDate f4217a;

    aq(ChartNewDate chartNewDate) {
        this.f4217a = chartNewDate;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (ChartNewDate.f2481G.getSelectedItemPosition() == 0) {
            ChartNewDate.f2482L = "Exclude account transfer";
        } else if (ChartNewDate.f2481G.getSelectedItemPosition() == 1) {
            ChartNewDate.f2482L = "Include account transfer";
        }
        this.f4217a.f2500p.m145c();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
