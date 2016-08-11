package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.HashMap;

class ce implements OnClickListener {
    final /* synthetic */ HashMap f4408a;
    final /* synthetic */ LinearLayout f4409b;
    final /* synthetic */ ChartNewSummary f4410c;

    ce(ChartNewSummary chartNewSummary, HashMap hashMap, LinearLayout linearLayout) {
        this.f4410c = chartNewSummary;
        this.f4408a = hashMap;
        this.f4409b = linearLayout;
    }

    public void onClick(View view) {
        try {
            ChartNewSummary.f2582r.clear();
            this.f4410c.m2515c(this.f4408a, ChartNewSummary.f2582r);
            ChartNewSummary.f2581o = ChartNewSummary.f2582r.size();
            this.f4410c.f2601p.m145c();
            this.f4410c.f2602q.m3495a();
            this.f4410c.f2602q.setCurrentItem(this.f4410c.m2495a(aba.m3776d(0), ChartNewSummary.f2582r));
            this.f4409b.setVisibility(8);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
