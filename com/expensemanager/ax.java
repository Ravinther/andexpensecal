package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class ax implements OnItemSelectedListener {
    final /* synthetic */ ChartNewMonthly f4228a;

    ax(ChartNewMonthly chartNewMonthly) {
        this.f4228a = chartNewMonthly;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            this.f4228a.f2525i = co.f4428b;
        }
        if (i == 1) {
            this.f4228a.f2525i = co.f4428b;
        }
        if (i == 2) {
            this.f4228a.f2525i = co.f4429c;
        }
        if (i == 3) {
            this.f4228a.f2525i = co.f4428b;
        }
        if (i < 4) {
            if (i == 0) {
                this.f4228a.m2456d();
            } else {
                this.f4228a.m2455c();
            }
            this.f4228a.f2523g = true;
            return;
        }
        this.f4228a.m2458e();
        this.f4228a.f2523g = false;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
