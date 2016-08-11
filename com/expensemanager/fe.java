package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class fe implements OnItemClickListener {
    final /* synthetic */ Dialog f4630a;
    final /* synthetic */ String[] f4631b;
    final /* synthetic */ ExpenseAccountActivities f4632c;

    fe(ExpenseAccountActivities expenseAccountActivities, Dialog dialog, String[] strArr) {
        this.f4632c = expenseAccountActivities;
        this.f4630a = dialog;
        this.f4631b = strArr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4630a.dismiss();
        this.f4632c.f2711g = this.f4631b[i];
        this.f4632c.getIntent().putExtra("account", this.f4632c.f2711g);
        this.f4632c.onCreate(null);
    }
}
