package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

/* renamed from: com.expensemanager.y */
class C0466y implements OnClickListener {
    final /* synthetic */ Resources f5467a;
    final /* synthetic */ ArrayAdapter f5468b;
    final /* synthetic */ ChartNewCustom f5469c;

    C0466y(ChartNewCustom chartNewCustom, Resources resources, ArrayAdapter arrayAdapter) {
        this.f5469c = chartNewCustom;
        this.f5467a = resources;
        this.f5468b = arrayAdapter;
    }

    public void onClick(View view) {
        this.f5469c.f2441d.clear();
        this.f5469c.f2441d.add(this.f5467a.getString(2131099755));
        this.f5469c.f2441d.add(this.f5467a.getString(2131100106));
        this.f5469c.f2441d.add(this.f5467a.getString(2131100007));
        this.f5469c.f2441d.add(this.f5467a.getString(2131100011));
        this.f5469c.f2441d.add(this.f5467a.getString(2131100101));
        this.f5469c.f2441d.add(this.f5467a.getString(2131100110));
        this.f5468b.notifyDataSetChanged();
    }
}
