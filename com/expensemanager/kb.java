package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

class kb implements OnClickListener {
    final /* synthetic */ jz f4870a;

    kb(jz jzVar) {
        this.f4870a = jzVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        String str = (String) this.f4870a.f4865a.f2876n.get("rowId");
        if (str == null || "".equals(str)) {
            i2 = -1;
        } else {
            try {
                i2 = new Integer(str).intValue();
            } catch (Exception e) {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            if (!this.f4870a.f4865a.f2874l.m4206d()) {
                this.f4870a.f4865a.f2874l.m4193a();
            }
            boolean a = this.f4870a.f4865a.f2874l.m4195a("expense_payee_payer", (long) i2);
            if (a) {
                Toast.makeText(this.f4870a.f4865a.f2863a, 2131099811, 1).show();
                abd.m3805a(this.f4870a.f4865a.f2863a, a);
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("account", this.f4870a.f4865a.f2873k);
                intent.putExtras(bundle);
                this.f4870a.f4865a.setResult(-1, intent);
                this.f4870a.f4865a.finish();
                return;
            }
            aib.m3849a(this.f4870a.f4865a.f2863a, null, this.f4870a.f4865a.getResources().getString(2131099702), 17301543, this.f4870a.f4865a.getResources().getString(2131099707), this.f4870a.f4865a.getResources().getString(2131099983), null, null, null).show();
        }
    }
}
