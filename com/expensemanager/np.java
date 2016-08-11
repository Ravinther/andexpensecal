package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

class np implements OnClickListener {
    final /* synthetic */ Resources f5040a;
    final /* synthetic */ ArrayAdapter f5041b;
    final /* synthetic */ ExpenseChartCustom f5042c;

    np(ExpenseChartCustom expenseChartCustom, Resources resources, ArrayAdapter arrayAdapter) {
        this.f5042c = expenseChartCustom;
        this.f5040a = resources;
        this.f5041b = arrayAdapter;
    }

    public void onClick(View view) {
        this.f5042c.f3019d.clear();
        this.f5042c.f3019d.add(this.f5040a.getString(2131099957));
        this.f5041b.notifyDataSetChanged();
        this.f5042c.f3031p.setVisibility(8);
        this.f5042c.f3032q.setVisibility(8);
    }
}
