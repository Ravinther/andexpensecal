package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class fl implements OnClickListener {
    final /* synthetic */ String f4642a;
    final /* synthetic */ String[] f4643b;
    final /* synthetic */ ExpenseAccountActivities f4644c;

    fl(ExpenseAccountActivities expenseAccountActivities, String str, String[] strArr) {
        this.f4644c = expenseAccountActivities;
        this.f4642a = str;
        this.f4643b = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f4644c.f2710f.m4206d()) {
            this.f4644c.f2710f.m4193a();
        }
        boolean a = this.f4644c.f2710f.m4198a("expense_report", "_id=" + this.f4642a, "status", this.f4643b[i]);
        abd.m3805a(this.f4644c.f2712h, a);
        this.f4644c.m2606a();
        dialogInterface.dismiss();
        if (a) {
            Toast.makeText(this.f4644c.getApplicationContext(), 2131100066, 0).show();
        } else {
            Toast.makeText(this.f4644c.getApplicationContext(), 2131099715, 0).show();
        }
    }
}
