package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class mw implements OnClickListener {
    final /* synthetic */ ExpenseCategoryExpandableList f4999a;

    mw(ExpenseCategoryExpandableList expenseCategoryExpandableList) {
        this.f4999a = expenseCategoryExpandableList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "DELETE from expense_category";
        if (!this.f4999a.f2997i.m4206d()) {
            this.f4999a.f2997i.m4193a();
        }
        if (this.f4999a.f2997i.m4202b("DELETE from expense_category")) {
            abd.m3805a(this.f4999a.f2995g, true);
            Toast.makeText(this.f4999a.f2995g, 2131099811, 1).show();
        } else {
            Toast.makeText(this.f4999a.f2995g, 2131099806, 1).show();
        }
        this.f4999a.m2913b();
    }
}
