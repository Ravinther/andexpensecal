package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class wg implements OnClickListener {
    final /* synthetic */ ExpenseMileageSearch f5395a;

    wg(ExpenseMileageSearch expenseMileageSearch) {
        this.f5395a = expenseMileageSearch;
    }

    public void onClick(View view) {
        this.f5395a.showDialog(1);
    }
}
