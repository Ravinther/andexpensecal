package com.expensemanager;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;

class mm implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4977a;

    mm(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4977a = expenseBudgetOnetimeAdd;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener mnVar = new mn(this);
        Resources resources = this.f4977a.f2956c.getResources();
        aib.m3849a(this.f4977a.f2956c, null, resources.getString(2131099805), 17301543, resources.getString(2131099809), resources.getString(2131099983), mnVar, resources.getString(2131099754), null).show();
    }
}
