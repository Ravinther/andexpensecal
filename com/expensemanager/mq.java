package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class mq implements OnClickListener {
    final /* synthetic */ int f4981a;
    final /* synthetic */ ExpenseBudgetOnetimeList f4982b;

    mq(ExpenseBudgetOnetimeList expenseBudgetOnetimeList, int i) {
        this.f4982b = expenseBudgetOnetimeList;
        this.f4981a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f4982b.f2980c.m4206d()) {
            this.f4982b.f2980c.m4193a();
        }
        boolean a = this.f4982b.f2980c.m4195a("expense_budget", (long) this.f4981a);
        if (a) {
            abd.m3805a(this.f4982b.f2981d, a);
            Toast.makeText(this.f4982b.f2981d, this.f4982b.getResources().getString(2131099811), 1).show();
        } else {
            Toast.makeText(this.f4982b.f2981d, this.f4982b.getResources().getString(2131099707), 1).show();
        }
        this.f4982b.onCreate(null);
    }
}
