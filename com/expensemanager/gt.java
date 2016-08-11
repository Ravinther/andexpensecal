package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

class gt implements OnClickListener {
    final /* synthetic */ ExpenseAccountList f4708a;

    gt(ExpenseAccountList expenseAccountList) {
        this.f4708a = expenseAccountList;
    }

    public void onClick(View view) {
        Builder builder = new Builder(this.f4708a.f2763i);
        builder.setTitle(2131100023);
        builder.setSingleChoiceItems(this.f4708a.f2761g, this.f4708a.f2764j, new gu(this));
        builder.setPositiveButton(2131099983, new gv(this));
        builder.create();
        builder.show();
    }
}
