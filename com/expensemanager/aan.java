package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aan implements OnClickListener {
    final /* synthetic */ int f3808a;
    final /* synthetic */ String f3809b;
    final /* synthetic */ ExpenseRepeatingTransferList f3810c;

    aan(ExpenseRepeatingTransferList expenseRepeatingTransferList, int i, String str) {
        this.f3810c = expenseRepeatingTransferList;
        this.f3808a = i;
        this.f3809b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f3810c.f3438e.m4206d()) {
            this.f3810c.f3438e.m4193a();
        }
        boolean a = this.f3810c.f3438e.m4195a("expense_repeating", (long) this.f3808a);
        this.f3810c.f3438e.m4198a("expense_report", "account='" + this.f3810c.f3436c + "' and " + "description" + "='" + "Transfer:" + this.f3809b + "'", "description", "Transfer:" + this.f3809b + " - Stopped");
        this.f3810c.f3438e.m4201b();
        if (a) {
            abd.m3805a(this.f3810c.f3437d, a);
            this.f3810c.onCreate(null);
            return;
        }
        aib.m3849a(this.f3810c.f3437d, null, this.f3810c.getResources().getString(2131099702), 17301543, this.f3810c.getResources().getString(2131099707), this.f3810c.getResources().getString(2131099983), null, null, null).show();
    }
}
