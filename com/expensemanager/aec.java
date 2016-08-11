package com.expensemanager;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class aec implements OnClickListener {
    final /* synthetic */ SMSAddEdit f3988a;

    aec(SMSAddEdit sMSAddEdit) {
        this.f3988a = sMSAddEdit;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener com_expensemanager_aed = new aed(this);
        aib.m3849a(this.f3988a.f3572l, null, this.f3988a.getResources().getString(2131099805), 17301543, this.f3988a.getResources().getString(2131099809), this.f3988a.getResources().getString(2131099983), new aee(this), this.f3988a.getResources().getString(2131099754), com_expensemanager_aed).show();
    }
}
