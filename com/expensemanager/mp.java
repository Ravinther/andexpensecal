package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class mp implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeList f4980a;

    mp(ExpenseBudgetOnetimeList expenseBudgetOnetimeList) {
        this.f4980a = expenseBudgetOnetimeList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "DELETE from expense_budget";
        if (!this.f4980a.f2980c.m4206d()) {
            this.f4980a.f2980c.m4193a();
        }
        if (this.f4980a.f2980c.m4202b("DELETE from expense_budget")) {
            abd.m3805a(this.f4980a.f2981d, true);
            Toast.makeText(this.f4980a.f2981d, 2131099811, 1).show();
        } else {
            Toast.makeText(this.f4980a.f2981d, 2131099806, 1).show();
        }
        this.f4980a.onCreate(null);
    }
}
