package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class iq implements OnClickListener {
    final /* synthetic */ int f4808a;
    final /* synthetic */ String f4809b;
    final /* synthetic */ ExpenseAccountTransfer f4810c;

    iq(ExpenseAccountTransfer expenseAccountTransfer, int i, String str) {
        this.f4810c = expenseAccountTransfer;
        this.f4808a = i;
        this.f4809b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!r1.f2836v.m4206d()) {
            this.f4810c.f2836v.m4193a();
        }
        boolean a = this.f4810c.f2836v.m4195a("expense_repeating", (long) this.f4808a);
        this.f4810c.f2836v.m4198a("expense_report", "account='" + this.f4810c.f2835u + "' and " + "description" + "='" + "Transfer:" + this.f4809b + "'", "description", "Transfer:" + this.f4809b + " - Stopped");
        this.f4810c.f2836v.m4201b();
        if (a) {
            abd.m3805a(this.f4810c.f2819e, a);
            this.f4810c.onCreate(null);
            return;
        }
        aib.m3849a(this.f4810c.f2819e, null, this.f4810c.getResources().getString(2131099702), 17301543, this.f4810c.getResources().getString(2131099707), this.f4810c.getResources().getString(2131099983), null, null, null).show();
    }
}
