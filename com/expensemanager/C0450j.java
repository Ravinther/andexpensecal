package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: com.expensemanager.j */
class C0450j implements OnItemSelectedListener {
    final /* synthetic */ ChartNewBar f4826a;

    C0450j(ChartNewBar chartNewBar) {
        this.f4826a = chartNewBar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4826a.m2379b();
        ck.m4027a(this.f4826a.f2422d, this.f4826a.f2425g, this.f4826a.f2426h, this.f4826a.f2428j, this.f4826a.f2429k, null);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
