package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

/* renamed from: com.expensemanager.x */
class C0465x implements OnClickListener {
    final /* synthetic */ Resources f5430a;
    final /* synthetic */ ArrayAdapter f5431b;
    final /* synthetic */ ChartNewCustom f5432c;

    C0465x(ChartNewCustom chartNewCustom, Resources resources, ArrayAdapter arrayAdapter) {
        this.f5432c = chartNewCustom;
        this.f5430a = resources;
        this.f5431b = arrayAdapter;
    }

    public void onClick(View view) {
        this.f5432c.f2441d.clear();
        this.f5432c.f2441d.add(this.f5430a.getString(2131099755));
        this.f5432c.f2441d.add(this.f5430a.getString(2131100106));
        this.f5432c.f2441d.add(this.f5430a.getString(2131100007));
        this.f5432c.f2441d.add(this.f5430a.getString(2131100011));
        this.f5432c.f2441d.add(this.f5430a.getString(2131100101));
        this.f5432c.f2441d.add(this.f5430a.getString(2131100110));
        this.f5431b.notifyDataSetChanged();
        if (this.f5432c.f2450m.getSelectedItemPosition() == 2 && this.f5432c.f2447j.isChecked()) {
            this.f5432c.f2453p.setVisibility(0);
            this.f5432c.f2454q.setVisibility(0);
        }
    }
}
