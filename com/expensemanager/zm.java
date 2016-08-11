package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zm implements OnClickListener {
    final /* synthetic */ int f5541a;
    final /* synthetic */ String f5542b;
    final /* synthetic */ ExpenseRepeatingList f5543c;

    zm(ExpenseRepeatingList expenseRepeatingList, int i, String str) {
        this.f5543c = expenseRepeatingList;
        this.f5541a = i;
        this.f5542b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f5543c.f3400e.m4206d()) {
            this.f5543c.f3400e.m4193a();
        }
        boolean a = this.f5543c.f3400e.m4195a("expense_repeating", (long) this.f5541a);
        this.f5543c.f3400e.m4198a("expense_report", "account='" + this.f5543c.f3398c + "' and " + "description" + "='" + "Repeating:" + this.f5542b + "'", "description", "Repeating:" + this.f5542b + " - Stopped");
        this.f5543c.f3400e.m4201b();
        if (a) {
            abd.m3805a(this.f5543c.f3399d, a);
            this.f5543c.onCreate(null);
            return;
        }
        aib.m3849a(this.f5543c.f3399d, null, this.f5543c.getResources().getString(2131099702), 17301543, this.f5543c.getResources().getString(2131099707), this.f5543c.getResources().getString(2131099983), null, null, null).show();
    }
}
