package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class th implements OnClickListener {
    final /* synthetic */ LinearLayout f5291a;
    final /* synthetic */ ExpenseGroupAddEdit f5292b;

    th(ExpenseGroupAddEdit expenseGroupAddEdit, LinearLayout linearLayout) {
        this.f5292b = expenseGroupAddEdit;
        this.f5291a = linearLayout;
    }

    public void onClick(View view) {
        this.f5292b.f3222d.removeView(this.f5291a);
    }
}
