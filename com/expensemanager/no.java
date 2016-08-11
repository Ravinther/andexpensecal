package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

class no implements OnClickListener {
    final /* synthetic */ Resources f5037a;
    final /* synthetic */ ArrayAdapter f5038b;
    final /* synthetic */ ExpenseChartCustom f5039c;

    no(ExpenseChartCustom expenseChartCustom, Resources resources, ArrayAdapter arrayAdapter) {
        this.f5039c = expenseChartCustom;
        this.f5037a = resources;
        this.f5038b = arrayAdapter;
    }

    public void onClick(View view) {
        this.f5039c.f3019d.clear();
        this.f5039c.f3019d.add(this.f5037a.getString(2131099957));
        this.f5039c.f3019d.add(this.f5037a.getString(2131099755));
        this.f5039c.f3019d.add(this.f5037a.getString(2131100106));
        this.f5039c.f3019d.add(this.f5037a.getString(2131100007));
        this.f5039c.f3019d.add(this.f5037a.getString(2131100011));
        this.f5039c.f3019d.add(this.f5037a.getString(2131100101));
        this.f5038b.notifyDataSetChanged();
    }
}
