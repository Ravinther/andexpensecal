package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class em implements OnClickListener {
    final /* synthetic */ DebtList f4589a;

    em(DebtList debtList) {
        this.f4589a = debtList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f4589a.f2678e.m4206d()) {
            this.f4589a.f2678e.m4193a();
        }
        String str = "DELETE from expense_report where account='$Debt' OR property3='$Debt'";
        if (this.f4589a.f2678e.m4202b("DELETE from expense_report where account='$Debt' OR property3='$Debt'")) {
            abd.m3805a(this.f4589a.f2679f, true);
            Toast.makeText(this.f4589a.f2679f, 2131099811, 1).show();
            this.f4589a.onCreate(null);
            return;
        }
        Toast.makeText(this.f4589a.f2679f, 2131099806, 1).show();
    }
}
