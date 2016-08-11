package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class dj implements OnItemSelectedListener {
    final /* synthetic */ dh f4478a;

    dj(dh dhVar) {
        this.f4478a = dhVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4478a.f4476a.f2635i = this.f4478a.f4476a.f2630d.getText().toString();
        abd.m3811a(this.f4478a.f4476a.f2638l, this.f4478a.f4476a.f2639m, "expense_preference", "TO_CURRENCY", "" + this.f4478a.f4476a.f2628b.getSelectedItemPosition());
        this.f4478a.f4476a.onCreate(null);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
