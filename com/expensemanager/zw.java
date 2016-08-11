package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

class zw implements OnClickListener {
    final /* synthetic */ zv f5558a;

    zw(zv zvVar) {
        this.f5558a = zvVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5558a.f5557a.f3403B.m4193a();
        boolean a = this.f5558a.f5557a.f3403B.m4195a("expense_repeating", this.f5558a.f5557a.f3411d);
        String str = "Repeating:";
        if ("Account Transfer".equals(this.f5558a.f5557a.f3420m.getText().toString())) {
            str = "Transfer:";
        }
        this.f5558a.f5557a.f3403B.m4198a("expense_report", "account='" + this.f5558a.f5557a.f3432y + "' and " + "description" + "='" + str + this.f5558a.f5557a.f3417j.getText().toString() + "'", "description", str + this.f5558a.f5557a.f3417j.getText().toString() + " - Stopped");
        this.f5559a.f5557a.f3403B.m4201b();
        if (a) {
            abd.m3805a(r1.f3413f, a);
            Intent intent = new Intent(this.f5558a.f5557a.f3413f, ExpenseRepeatingList.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f5558a.f5557a.f3432y);
            intent.putExtras(bundle);
            this.f5558a.f5557a.setResult(-1, intent);
            this.f5558a.f5557a.finish();
            return;
        }
        aib.m3849a(this.f5558a.f5557a.f3413f, null, this.f5558a.f5557a.getResources().getString(2131099702), 17301543, this.f5558a.f5557a.getResources().getString(2131099707), this.f5558a.f5557a.getResources().getString(2131099983), null, null, null).show();
    }
}
