package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class kj implements OnClickListener {
    final /* synthetic */ String f4881a;
    final /* synthetic */ ExpenseAutoFillList f4882b;

    kj(ExpenseAutoFillList expenseAutoFillList, String str) {
        this.f4882b = expenseAutoFillList;
        this.f4881a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        if (this.f4881a == null || "".equals(this.f4881a)) {
            i2 = -1;
        } else {
            try {
                i2 = Integer.valueOf(this.f4881a).intValue();
            } catch (Exception e) {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            if (!this.f4882b.f2883e.m4206d()) {
                this.f4882b.f2883e.m4193a();
            }
            boolean a = this.f4882b.f2883e.m4195a("expense_payee_payer", (long) i2);
            if (a) {
                Toast.makeText(this.f4882b.f2882d, 2131099811, 1).show();
                abd.m3805a(this.f4882b.f2882d, a);
                this.f4882b.onCreate(null);
                return;
            }
            aib.m3849a(this.f4882b.f2882d, null, this.f4882b.getResources().getString(2131099702), 17301543, this.f4882b.getResources().getString(2131099707), this.f4882b.getResources().getString(2131099983), null, null, null).show();
        }
    }
}
