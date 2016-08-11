package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class pa implements OnItemSelectedListener {
    final /* synthetic */ Resources f5116a;
    final /* synthetic */ ExpenseChartPeriod f5117b;

    pa(ExpenseChartPeriod expenseChartPeriod, Resources resources) {
        this.f5117b = expenseChartPeriod;
        this.f5116a = resources;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            this.f5117b.f3103r.setText(this.f5116a.getString(2131099755));
            this.f5117b.f3101p.setText(null);
        }
        if (i == 1) {
            this.f5117b.f3100o.setVisibility(0);
            this.f5117b.f3103r.setText(this.f5116a.getString(2131099755));
            this.f5117b.f3101p.setText(null);
        } else {
            this.f5117b.f3100o.setVisibility(8);
        }
        if (i == 2) {
            this.f5117b.f3103r.setText(this.f5116a.getString(2131100007));
            this.f5117b.f3101p.setText(null);
        }
        if (i == 3) {
            this.f5117b.f3103r.setText(this.f5116a.getString(2131100011));
            this.f5117b.f3101p.setText(null);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
