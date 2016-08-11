package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class an implements OnClickListener {
    final /* synthetic */ HashMap f4208a;
    final /* synthetic */ LinearLayout f4209b;
    final /* synthetic */ ChartNewDate f4210c;

    an(ChartNewDate chartNewDate, HashMap hashMap, LinearLayout linearLayout) {
        this.f4210c = chartNewDate;
        this.f4208a = hashMap;
        this.f4209b = linearLayout;
    }

    public void onClick(View view) {
        ChartNewDate.f2487s.clear();
        this.f4210c.m2428b(this.f4208a, ChartNewDate.f2487s);
        ChartNewDate.f2485o = ChartNewDate.f2487s.size();
        this.f4210c.f2500p.m145c();
        this.f4210c.f2501q.m3495a();
        this.f4210c.f2501q.setCurrentItem(ChartNewDate.m2413a(aba.m3763b(0), ChartNewDate.f2487s));
        this.f4209b.setVisibility(8);
    }
}
