package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class di implements OnItemSelectedListener {
    final /* synthetic */ dh f4477a;

    di(dh dhVar) {
        this.f4477a = dhVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4477a.f4476a.f2635i = this.f4477a.f4476a.f2630d.getText().toString();
        abd.m3811a(this.f4477a.f4476a.f2638l, this.f4477a.f4476a.f2639m, "expense_preference", "FROM_CURRENCY", "" + this.f4477a.f4476a.f2627a.getSelectedItemPosition());
        this.f4477a.f4476a.onCreate(null);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
