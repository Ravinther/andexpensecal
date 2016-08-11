package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

class ir implements OnClickListener {
    final /* synthetic */ int f4811a;
    final /* synthetic */ String f4812b;
    final /* synthetic */ String f4813c;
    final /* synthetic */ String f4814d;
    final /* synthetic */ ExpenseAccountTransfer f4815e;

    ir(ExpenseAccountTransfer expenseAccountTransfer, int i, String str, String str2, String str3) {
        this.f4815e = expenseAccountTransfer;
        this.f4811a = i;
        this.f4812b = str;
        this.f4813c = str2;
        this.f4814d = str3;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4815e.f2836v.m4193a();
        boolean a = this.f4815e.f2836v.m4195a("expense_repeating", (long) this.f4811a);
        this.f4815e.f2836v.m4194a("DELETE from expense_report where " + ("(account='" + this.f4812b + "' OR " + "account" + "='" + this.f4813c + "') and " + "description" + "='Transfer:" + this.f4814d + "'"));
        this.f4815e.f2836v.m4201b();
        if (a) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f4815e.f2835u);
            intent.putExtras(bundle);
            this.f4815e.setResult(-1, intent);
            this.f4815e.finish();
            return;
        }
        aib.m3849a(this.f4815e.f2819e, null, this.f4815e.getResources().getString(2131099702), 17301543, this.f4815e.getResources().getString(2131099707), this.f4815e.getResources().getString(2131099983), null, null, null).show();
    }
}
