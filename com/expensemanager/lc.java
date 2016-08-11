package com.expensemanager;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;

class lc implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4922a;

    lc(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4922a = expenseBudgetAdd;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener ldVar = new ld(this);
        Resources resources = this.f4922a.f2893c.getResources();
        aib.m3849a(this.f4922a.f2893c, null, resources.getString(2131099805), 17301543, resources.getString(2131099809), resources.getString(2131099983), ldVar, resources.getString(2131099754), null).show();
    }
}
