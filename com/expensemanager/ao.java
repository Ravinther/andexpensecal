package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class ao implements OnClickListener {
    final /* synthetic */ HashMap f4211a;
    final /* synthetic */ LinearLayout f4212b;
    final /* synthetic */ ChartNewDate f4213c;

    ao(ChartNewDate chartNewDate, HashMap hashMap, LinearLayout linearLayout) {
        this.f4213c = chartNewDate;
        this.f4211a = hashMap;
        this.f4212b = linearLayout;
    }

    public void onClick(View view) {
        try {
            ChartNewDate.f2487s.clear();
            this.f4213c.m2433c(this.f4211a, ChartNewDate.f2487s);
            ChartNewDate.f2485o = ChartNewDate.f2487s.size();
            this.f4213c.f2500p.m145c();
            this.f4213c.f2501q.m3495a();
            this.f4213c.f2501q.setCurrentItem(ChartNewDate.m2413a(aba.m3776d(0), ChartNewDate.f2487s));
            this.f4212b.setVisibility(8);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
