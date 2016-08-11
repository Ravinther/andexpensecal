package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aao implements OnClickListener {
    final /* synthetic */ int f3811a;
    final /* synthetic */ String f3812b;
    final /* synthetic */ String f3813c;
    final /* synthetic */ String f3814d;
    final /* synthetic */ ExpenseRepeatingTransferList f3815e;

    aao(ExpenseRepeatingTransferList expenseRepeatingTransferList, int i, String str, String str2, String str3) {
        this.f3815e = expenseRepeatingTransferList;
        this.f3811a = i;
        this.f3812b = str;
        this.f3813c = str2;
        this.f3814d = str3;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3815e.f3438e.m4193a();
        boolean a = this.f3815e.f3438e.m4195a("expense_repeating", (long) this.f3811a);
        this.f3815e.f3438e.m4194a("DELETE from expense_report where " + ("(account='" + this.f3812b + "' OR " + "account" + "='" + this.f3813c + "') and " + "description" + "='Transfer:" + this.f3814d + "'"));
        this.f3815e.f3438e.m4201b();
        if (a) {
            this.f3815e.onCreate(null);
            return;
        }
        aib.m3849a(this.f3815e.f3437d, null, this.f3815e.getResources().getString(2131099702), 17301543, this.f3815e.getResources().getString(2131099707), this.f3815e.getResources().getString(2131099983), null, null, null).show();
    }
}
