package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class au implements OnItemClickListener {
    final /* synthetic */ String[] f4224a;
    final /* synthetic */ ChartNewList f4225b;

    au(ChartNewList chartNewList, String[] strArr) {
        this.f4225b = chartNewList;
        this.f4224a = strArr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4225b.m2446a(i, this.f4224a[i]);
    }
}
