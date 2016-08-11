package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.util.Locale;

class agk implements OnClickListener {
    final /* synthetic */ agi f4089a;

    agk(agi com_expensemanager_agi) {
        this.f4089a = com_expensemanager_agi;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean a;
        Exception e;
        Long valueOf;
        Intent intent;
        Bundle bundle;
        this.f4089a.f4087a.f3598A.m4193a();
        try {
            a = this.f4089a.f4087a.f3598A.m4195a("expense_report", this.f4089a.f4087a.getIntent().getLongExtra("rowId", 0));
            try {
                File file = new File(co.f4431e + this.f4089a.f4087a.getIntent().getStringExtra("property2"));
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                this.f4089a.f4087a.f3598A.m4201b();
                if (a) {
                    abd.m3805a(this.f4089a.f4087a.f3605a, a);
                    valueOf = Long.valueOf(aba.m3744a(this.f4089a.f4087a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
                    intent = new Intent();
                    bundle = new Bundle();
                    bundle.putLong("date", valueOf.longValue());
                    bundle.putString("account", this.f4089a.f4087a.f3630z);
                    intent.putExtras(bundle);
                    this.f4089a.f4087a.setResult(-1, intent);
                    this.f4089a.f4087a.finish();
                    return;
                }
                aib.m3849a(this.f4089a.f4087a.f3605a, null, this.f4089a.f4087a.getResources().getString(2131099702), 17301543, this.f4089a.f4087a.getResources().getString(2131099707), this.f4089a.f4087a.getResources().getString(2131099983), null, null, null).show();
            }
        } catch (Exception e3) {
            Exception exception = e3;
            a = false;
            e = exception;
            e.printStackTrace();
            this.f4089a.f4087a.f3598A.m4201b();
            if (a) {
                aib.m3849a(this.f4089a.f4087a.f3605a, null, this.f4089a.f4087a.getResources().getString(2131099702), 17301543, this.f4089a.f4087a.getResources().getString(2131099707), this.f4089a.f4087a.getResources().getString(2131099983), null, null, null).show();
            }
            abd.m3805a(this.f4089a.f4087a.f3605a, a);
            valueOf = Long.valueOf(aba.m3744a(this.f4089a.f4087a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
            intent = new Intent();
            bundle = new Bundle();
            bundle.putLong("date", valueOf.longValue());
            bundle.putString("account", this.f4089a.f4087a.f3630z);
            intent.putExtras(bundle);
            this.f4089a.f4087a.setResult(-1, intent);
            this.f4089a.f4087a.finish();
            return;
        }
        this.f4089a.f4087a.f3598A.m4201b();
        if (a) {
            abd.m3805a(this.f4089a.f4087a.f3605a, a);
            valueOf = Long.valueOf(aba.m3744a(this.f4089a.f4087a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
            intent = new Intent();
            bundle = new Bundle();
            bundle.putLong("date", valueOf.longValue());
            bundle.putString("account", this.f4089a.f4087a.f3630z);
            intent.putExtras(bundle);
            this.f4089a.f4087a.setResult(-1, intent);
            this.f4089a.f4087a.finish();
            return;
        }
        aib.m3849a(this.f4089a.f4087a.f3605a, null, this.f4089a.f4087a.getResources().getString(2131099702), 17301543, this.f4089a.f4087a.getResources().getString(2131099707), this.f4089a.f4087a.getResources().getString(2131099983), null, null, null).show();
    }
}
