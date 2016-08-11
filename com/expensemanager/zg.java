package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zg implements OnClickListener {
    final /* synthetic */ int f5532a;
    final /* synthetic */ String f5533b;
    final /* synthetic */ ExpenseReminderList f5534c;

    zg(ExpenseReminderList expenseReminderList, int i, String str) {
        this.f5534c = expenseReminderList;
        this.f5532a = i;
        this.f5533b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5534c.f3388d.m4193a();
        boolean a = this.f5534c.f3388d.m4195a("expense_repeating", (long) this.f5532a);
        this.f5534c.f3388d.m4194a("DELETE from expense_report where " + ("property3='" + this.f5533b + "'"));
        this.f5534c.f3388d.m4201b();
        if (a) {
            abd.m3805a(this.f5534c.f3387c, a);
            this.f5534c.onCreate(null);
            return;
        }
        aib.m3849a(this.f5534c.f3387c, null, this.f5534c.getResources().getString(2131099702), 17301543, this.f5534c.getResources().getString(2131099707), this.f5534c.getResources().getString(2131099983), null, null, null).show();
    }
}
