package com.expensemanager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class gv implements OnClickListener {
    final /* synthetic */ gt f4710a;

    gv(gt gtVar) {
        this.f4710a = gtVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        abd.m3811a(this.f4710a.f4708a.f2763i, this.f4710a.f4708a.f2766l, "expense_preference", "Default_Account_Index", "" + ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition());
        this.f4710a.f4708a.onCreate(null);
    }
}
