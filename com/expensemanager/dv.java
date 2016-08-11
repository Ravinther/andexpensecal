package com.expensemanager;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class dv implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4567a;

    dv(DebtAddEdit debtAddEdit) {
        this.f4567a = debtAddEdit;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener dwVar = new dw(this);
        aib.m3849a(this.f4567a.f2654a, null, this.f4567a.getResources().getString(2131099805), 17301543, this.f4567a.getResources().getString(2131099809), this.f4567a.getResources().getString(2131099983), new dx(this), this.f4567a.getResources().getString(2131099754), dwVar).show();
    }
}
