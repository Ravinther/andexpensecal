package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

class zx implements OnClickListener {
    final /* synthetic */ zv f5559a;

    zx(zv zvVar) {
        this.f5559a = zvVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5559a.f5557a.f3403B.m4193a();
        boolean a = this.f5559a.f5557a.f3403B.m4195a("expense_repeating", this.f5559a.f5557a.f3411d);
        String str = "account='" + this.f5559a.f5557a.f3432y + "' and " + "description" + "='" + "Repeating:" + this.f5559a.f5557a.f3417j.getText().toString() + "'";
        if ("Account Transfer".equals(this.f5559a.f5557a.f3420m.getText().toString())) {
            str = "(account='" + this.f5559a.f5557a.f3426s.getText().toString() + "' OR " + "account" + "='" + this.f5559a.f5557a.f3423p.getText().toString() + "') and " + "description" + "='Repeating:" + this.f5559a.f5557a.f3417j.getText().toString() + "'";
        }
        if ("YES".equalsIgnoreCase(this.f5559a.f5557a.getIntent().getStringExtra("reminder"))) {
            str = "property3='" + this.f5559a.f5557a.f3412e + "'";
        }
        this.f5559a.f5557a.f3403B.m4194a("DELETE from expense_report where " + str);
        this.f5559a.f5557a.f3403B.m4201b();
        if (a) {
            Intent intent = new Intent(this.f5559a.f5557a.f3413f, ExpenseRepeatingList.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f5559a.f5557a.f3432y);
            intent.putExtras(bundle);
            this.f5559a.f5557a.setResult(-1, intent);
            this.f5559a.f5557a.finish();
            return;
        }
        aib.m3849a(this.f5559a.f5557a.f3413f, null, this.f5559a.f5557a.getResources().getString(2131099702), 17301543, this.f5559a.f5557a.getResources().getString(2131099707), this.f5559a.f5557a.getResources().getString(2131099983), null, null, null).show();
    }
}
