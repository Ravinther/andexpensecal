package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;

class kl implements OnClickListener {
    final /* synthetic */ Editor f4885a;
    final /* synthetic */ ExpenseAutoFillList f4886b;

    kl(ExpenseAutoFillList expenseAutoFillList, Editor editor) {
        this.f4886b = expenseAutoFillList;
        this.f4885a = editor;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4885a.commit();
    }
}
