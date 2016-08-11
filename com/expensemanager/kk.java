package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;

class kk implements OnClickListener {
    final /* synthetic */ Editor f4883a;
    final /* synthetic */ ExpenseAutoFillList f4884b;

    kk(ExpenseAutoFillList expenseAutoFillList, Editor editor) {
        this.f4884b = expenseAutoFillList;
        this.f4883a = editor;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4883a.remove("PREFILL");
        this.f4883a.commit();
    }
}
