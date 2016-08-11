package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

/* renamed from: com.expensemanager.z */
class C0467z implements OnClickListener {
    final /* synthetic */ ArrayAdapter f5512a;
    final /* synthetic */ ChartNewCustom f5513b;

    C0467z(ChartNewCustom chartNewCustom, ArrayAdapter arrayAdapter) {
        this.f5513b = chartNewCustom;
        this.f5512a = arrayAdapter;
    }

    public void onClick(View view) {
        this.f5513b.f2441d.clear();
        this.f5512a.notifyDataSetChanged();
        this.f5513b.f2453p.setVisibility(8);
        this.f5513b.f2454q.setVisibility(8);
    }
}
