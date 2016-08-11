package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zf implements OnClickListener {
    final /* synthetic */ int f5529a;
    final /* synthetic */ String f5530b;
    final /* synthetic */ ExpenseReminderList f5531c;

    zf(ExpenseReminderList expenseReminderList, int i, String str) {
        this.f5531c = expenseReminderList;
        this.f5529a = i;
        this.f5530b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f5531c.f3388d.m4206d()) {
            this.f5531c.f3388d.m4193a();
        }
        boolean a = this.f5531c.f3388d.m4195a("expense_repeating", (long) this.f5529a);
        this.f5531c.f3388d.m4198a("expense_report", "account='" + this.f5531c.f3386b + "' and " + "description" + "='" + "Repeating:" + this.f5530b + "'", "description", "Repeating:" + this.f5530b + " - Stopped");
        this.f5531c.f3388d.m4201b();
        if (a) {
            abd.m3805a(this.f5531c.f3387c, a);
            this.f5531c.onCreate(null);
            return;
        }
        aib.m3849a(this.f5531c.f3387c, null, this.f5531c.getResources().getString(2131099702), 17301543, this.f5531c.getResources().getString(2131099707), this.f5531c.getResources().getString(2131099983), null, null, null).show();
    }
}
