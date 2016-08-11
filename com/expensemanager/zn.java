package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zn implements OnClickListener {
    final /* synthetic */ int f5544a;
    final /* synthetic */ String f5545b;
    final /* synthetic */ ExpenseRepeatingList f5546c;

    zn(ExpenseRepeatingList expenseRepeatingList, int i, String str) {
        this.f5546c = expenseRepeatingList;
        this.f5544a = i;
        this.f5545b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5546c.f3400e.m4193a();
        boolean a = this.f5546c.f3400e.m4195a("expense_repeating", (long) this.f5544a);
        this.f5546c.f3400e.m4194a("DELETE from expense_report where " + ("account='" + this.f5546c.f3398c + "' and " + "description" + "='" + "Repeating:" + this.f5545b + "'"));
        this.f5546c.f3400e.m4201b();
        if (a) {
            abd.m3805a(this.f5546c.f3399d, a);
            this.f5546c.onCreate(null);
            return;
        }
        aib.m3849a(this.f5546c.f3399d, null, this.f5546c.getResources().getString(2131099702), 17301543, this.f5546c.getResources().getString(2131099707), this.f5546c.getResources().getString(2131099983), null, null, null).show();
    }
}
