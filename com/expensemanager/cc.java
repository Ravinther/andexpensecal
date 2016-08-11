package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.HashMap;

class cc implements OnClickListener {
    final /* synthetic */ HashMap f4402a;
    final /* synthetic */ TextView f4403b;
    final /* synthetic */ ChartNewSummary f4404c;

    cc(ChartNewSummary chartNewSummary, HashMap hashMap, TextView textView) {
        this.f4404c = chartNewSummary;
        this.f4402a = hashMap;
        this.f4403b = textView;
    }

    public void onClick(View view) {
        ChartNewSummary.f2582r.clear();
        if (!(this.f4402a.get("fromDate") == null || this.f4402a.get("toDate") == null)) {
            ChartNewSummary.f2582r.add(this.f4402a);
        }
        if (!(!this.f4403b.getText().toString().equals(this.f4404c.getResources().getString(2131099918)) || this.f4404c.getResources().getString(2131100132).equals(this.f4404c.f2595L.getText().toString()) || this.f4404c.getResources().getString(2131099912).equals(this.f4404c.f2594K.getText().toString()))) {
            ChartNewSummary.f2582r.clear();
            this.f4402a.put("fromDate", this.f4404c.f2594K.getText().toString());
            this.f4402a.put("toDate", this.f4404c.f2595L.getText().toString());
            if (!(this.f4402a.get("fromDate") == null || this.f4402a.get("toDate") == null)) {
                ChartNewSummary.f2582r.add(this.f4402a);
            }
        }
        ChartNewSummary.f2581o = ChartNewSummary.f2582r.size();
        this.f4404c.f2601p.m145c();
        this.f4404c.f2602q.m3495a();
    }
}
