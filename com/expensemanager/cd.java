package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class cd implements OnClickListener {
    final /* synthetic */ HashMap f4405a;
    final /* synthetic */ LinearLayout f4406b;
    final /* synthetic */ ChartNewSummary f4407c;

    cd(ChartNewSummary chartNewSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f4407c = chartNewSummary;
        this.f4405a = hashMap;
        this.f4406b = linearLayout;
    }

    public void onClick(View view) {
        ChartNewSummary.f2582r.clear();
        this.f4407c.m2511b(this.f4405a, ChartNewSummary.f2582r);
        ChartNewSummary.f2581o = ChartNewSummary.f2582r.size();
        this.f4407c.f2601p.m145c();
        this.f4407c.f2602q.m3495a();
        this.f4407c.f2602q.setCurrentItem(this.f4407c.m2495a(aba.m3763b(0), ChartNewSummary.f2582r));
        this.f4406b.setVisibility(8);
    }
}
