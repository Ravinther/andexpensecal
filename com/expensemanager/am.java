package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.HashMap;

class am implements OnClickListener {
    final /* synthetic */ HashMap f4205a;
    final /* synthetic */ TextView f4206b;
    final /* synthetic */ ChartNewDate f4207c;

    am(ChartNewDate chartNewDate, HashMap hashMap, TextView textView) {
        this.f4207c = chartNewDate;
        this.f4205a = hashMap;
        this.f4206b = textView;
    }

    public void onClick(View view) {
        ChartNewDate.f2487s.clear();
        if (!(this.f4205a.get("fromDate") == null || this.f4205a.get("toDate") == null)) {
            ChartNewDate.f2487s.add(this.f4205a);
        }
        if (!(!this.f4206b.getText().toString().equals(this.f4207c.getResources().getString(2131099918)) || this.f4207c.getResources().getString(2131100132).equals(this.f4207c.f2494I.getText().toString()) || this.f4207c.getResources().getString(2131099912).equals(this.f4207c.f2493H.getText().toString()))) {
            ChartNewDate.f2487s.clear();
            this.f4205a.put("fromDate", this.f4207c.f2493H.getText().toString());
            this.f4205a.put("toDate", this.f4207c.f2494I.getText().toString());
            if (!(this.f4205a.get("fromDate") == null || this.f4205a.get("toDate") == null)) {
                ChartNewDate.f2487s.add(this.f4205a);
            }
        }
        ChartNewDate.f2485o = ChartNewDate.f2487s.size();
        this.f4207c.f2500p.m145c();
        this.f4207c.f2501q.m3495a();
    }
}
