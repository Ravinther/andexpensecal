package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class bi implements OnItemSelectedListener {
    final /* synthetic */ Resources f4249a;
    final /* synthetic */ ChartNewPeriod f4250b;

    bi(ChartNewPeriod chartNewPeriod, Resources resources) {
        this.f4250b = chartNewPeriod;
        this.f4249a = resources;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            this.f4250b.f2551r.setText(this.f4249a.getString(2131099755));
            this.f4250b.f2549p.setText(null);
        }
        if (i == 1) {
            this.f4250b.f2548o.setVisibility(0);
            this.f4250b.f2551r.setText(this.f4249a.getString(2131099755));
            this.f4250b.f2549p.setText(null);
        } else {
            this.f4250b.f2548o.setVisibility(8);
        }
        if (i == 2) {
            this.f4250b.f2551r.setText(this.f4249a.getString(2131100007));
            this.f4250b.f2549p.setText(null);
        }
        if (i == 3) {
            this.f4250b.f2551r.setText(this.f4249a.getString(2131100011));
            this.f4250b.f2549p.setText(null);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
