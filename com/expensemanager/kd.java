package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;

class kd implements OnClickListener {
    final /* synthetic */ Editor f4873a;
    final /* synthetic */ String[] f4874b;
    final /* synthetic */ ExpenseAutoFillList f4875c;

    kd(ExpenseAutoFillList expenseAutoFillList, Editor editor, String[] strArr) {
        this.f4875c = expenseAutoFillList;
        this.f4873a = editor;
        this.f4874b = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4873a.putString("PREFILL", this.f4874b[i]);
    }
}
