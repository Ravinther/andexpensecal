package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

class jz implements OnClickListener {
    final /* synthetic */ ExpenseAutoFillAddEdit f4865a;

    jz(ExpenseAutoFillAddEdit expenseAutoFillAddEdit) {
        this.f4865a = expenseAutoFillAddEdit;
    }

    public void onClick(View view) {
        new Builder(this.f4865a.f2863a).setTitle(2131099805).setMessage(this.f4865a.getResources().getText(2131099808).toString() + this.f4865a.f2877o + "?").setPositiveButton(2131099983, new kb(this)).setNegativeButton(2131099754, new ka(this)).show();
    }
}
