package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class gp implements OnClickListener {
    final /* synthetic */ int f4701a;
    final /* synthetic */ ExpenseAccountGroupEditList f4702b;

    gp(ExpenseAccountGroupEditList expenseAccountGroupEditList, int i) {
        this.f4702b = expenseAccountGroupEditList;
        this.f4701a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        abd.m3810a(this.f4702b.f2745c, this.f4702b.f2750h, "ACCOUNT_GROUP_NAME_" + ((String) this.f4702b.f2746d.get(this.f4701a)));
        this.f4702b.f2746d.remove(this.f4701a);
        abd.m3811a(this.f4702b.f2745c, this.f4702b.f2750h, "expense_preference", "ACCOUNT_GROUP_NAME", aib.m3857a(this.f4702b.f2746d, ","));
        this.f4702b.onCreate(null);
    }
}
