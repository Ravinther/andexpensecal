package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class go implements OnClickListener {
    final /* synthetic */ ExpenseAccountGroupEditList f4700a;

    go(ExpenseAccountGroupEditList expenseAccountGroupEditList) {
        this.f4700a = expenseAccountGroupEditList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
