package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class cf implements OnClickListener {
    final /* synthetic */ HashMap f4411a;
    final /* synthetic */ LinearLayout f4412b;
    final /* synthetic */ ChartNewSummary f4413c;

    cf(ChartNewSummary chartNewSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f4413c = chartNewSummary;
        this.f4411a = hashMap;
        this.f4412b = linearLayout;
    }

    public void onClick(View view) {
        ChartNewSummary.f2582r.clear();
        this.f4413c.m2505a(this.f4411a, ChartNewSummary.f2582r);
        ChartNewSummary.f2581o = ChartNewSummary.f2582r.size();
        this.f4413c.f2601p.m145c();
        this.f4413c.f2602q.m3495a();
        this.f4413c.f2602q.setCurrentItem(this.f4413c.m2495a(aba.m3779e(0), ChartNewSummary.f2582r));
        this.f4412b.setVisibility(8);
    }
}
