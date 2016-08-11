package com.expensemanager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class hb implements OnClickListener {
    final /* synthetic */ ExpenseAccountList f4723a;

    hb(ExpenseAccountList expenseAccountList) {
        this.f4723a = expenseAccountList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        abd.m3811a(this.f4723a.f2763i, this.f4723a.f2766l, "expense_preference", "Default_Account_Index", "" + ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition());
        this.f4723a.onCreate(null);
    }
}
