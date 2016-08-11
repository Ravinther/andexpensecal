package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class ap implements OnClickListener {
    final /* synthetic */ HashMap f4214a;
    final /* synthetic */ LinearLayout f4215b;
    final /* synthetic */ ChartNewDate f4216c;

    ap(ChartNewDate chartNewDate, HashMap hashMap, LinearLayout linearLayout) {
        this.f4216c = chartNewDate;
        this.f4214a = hashMap;
        this.f4215b = linearLayout;
    }

    public void onClick(View view) {
        ChartNewDate.f2487s.clear();
        this.f4216c.m2422a(this.f4214a, ChartNewDate.f2487s);
        ChartNewDate.f2485o = ChartNewDate.f2487s.size();
        this.f4216c.f2500p.m145c();
        this.f4216c.f2501q.m3495a();
        this.f4216c.f2501q.setCurrentItem(ChartNewDate.m2413a(aba.m3779e(0), ChartNewDate.f2487s));
        this.f4215b.setVisibility(8);
    }
}
