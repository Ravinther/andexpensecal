package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

class nn implements OnClickListener {
    final /* synthetic */ Resources f5034a;
    final /* synthetic */ ArrayAdapter f5035b;
    final /* synthetic */ ExpenseChartCustom f5036c;

    nn(ExpenseChartCustom expenseChartCustom, Resources resources, ArrayAdapter arrayAdapter) {
        this.f5036c = expenseChartCustom;
        this.f5034a = resources;
        this.f5035b = arrayAdapter;
    }

    public void onClick(View view) {
        this.f5036c.f3019d.clear();
        this.f5036c.f3019d.add(this.f5034a.getString(2131099957));
        this.f5036c.f3019d.add(this.f5034a.getString(2131099755));
        this.f5036c.f3019d.add(this.f5034a.getString(2131100106));
        this.f5036c.f3019d.add(this.f5034a.getString(2131100007));
        this.f5036c.f3019d.add(this.f5034a.getString(2131100011));
        this.f5036c.f3019d.add(this.f5034a.getString(2131100101));
        this.f5035b.notifyDataSetChanged();
        if (this.f5036c.f3028m.getSelectedItemPosition() == 2 && this.f5036c.f3025j.isChecked()) {
            this.f5036c.f3031p.setVisibility(0);
            this.f5036c.f3032q.setVisibility(0);
        }
    }
}
