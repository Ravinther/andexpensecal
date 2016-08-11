package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;

class ae implements OnNavigationListener {
    final /* synthetic */ ChartNewDate f3985a;

    ae(ChartNewDate chartNewDate) {
        this.f3985a = chartNewDate;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        ChartNewDate.f2491x = i;
        if (i == 0) {
            ChartNewDate.f2482L = "Exclude account transfer";
        } else if (i == 1) {
            ChartNewDate.f2482L = "Include account transfer";
        }
        this.f3985a.f2500p.m145c();
        return true;
    }
}
