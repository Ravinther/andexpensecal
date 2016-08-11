package com.expensemanager;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class vq implements OnClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5378a;

    vq(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5378a = expenseMileageNewEdit;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener vrVar = new vr(this);
        aib.m3849a(this.f5378a.f3268a, null, this.f5378a.getResources().getString(2131099805), 17301543, this.f5378a.getResources().getString(2131099809), this.f5378a.getResources().getString(2131099983), new vs(this), this.f5378a.getResources().getString(2131099754), vrVar).show();
    }
}
