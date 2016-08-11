package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.util.Locale;

class dx implements OnClickListener {
    final /* synthetic */ dv f4569a;

    dx(dv dvVar) {
        this.f4569a = dvVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean a;
        Exception e;
        Long valueOf;
        Intent intent;
        Bundle bundle;
        this.f4569a.f4567a.f2672s.m4193a();
        try {
            long longExtra = this.f4569a.f4567a.getIntent().getLongExtra("rowId", 0);
            a = this.f4569a.f4567a.f2672s.m4195a("expense_report", longExtra);
            try {
                File file = new File(co.f4431e + this.f4569a.f4567a.getIntent().getStringExtra("property2"));
                if (file.exists()) {
                    file.delete();
                }
                if (a) {
                    DebtAddEdit.m2576a(this.f4569a.f4567a.f2672s, "DELETE from expense_report where expense_tag='" + longExtra + "'");
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                this.f4569a.f4567a.f2672s.m4201b();
                if (a) {
                    aib.m3849a(this.f4569a.f4567a.f2654a, null, this.f4569a.f4567a.getResources().getString(2131099702), 17301543, this.f4569a.f4567a.getResources().getString(2131099707), this.f4569a.f4567a.getResources().getString(2131099983), null, null, null).show();
                }
                abd.m3805a(this.f4569a.f4567a.f2654a, a);
                valueOf = Long.valueOf(aba.m3744a(this.f4569a.f4567a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
                intent = new Intent();
                bundle = new Bundle();
                bundle.putLong("date", valueOf.longValue());
                bundle.putString("account", this.f4569a.f4567a.f2671r);
                intent.putExtras(bundle);
                this.f4569a.f4567a.setResult(-1, intent);
                this.f4569a.f4567a.finish();
                return;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            a = false;
            e = exception;
            e.printStackTrace();
            this.f4569a.f4567a.f2672s.m4201b();
            if (a) {
                abd.m3805a(this.f4569a.f4567a.f2654a, a);
                valueOf = Long.valueOf(aba.m3744a(this.f4569a.f4567a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
                intent = new Intent();
                bundle = new Bundle();
                bundle.putLong("date", valueOf.longValue());
                bundle.putString("account", this.f4569a.f4567a.f2671r);
                intent.putExtras(bundle);
                this.f4569a.f4567a.setResult(-1, intent);
                this.f4569a.f4567a.finish();
                return;
            }
            aib.m3849a(this.f4569a.f4567a.f2654a, null, this.f4569a.f4567a.getResources().getString(2131099702), 17301543, this.f4569a.f4567a.getResources().getString(2131099707), this.f4569a.f4567a.getResources().getString(2131099983), null, null, null).show();
        }
        this.f4569a.f4567a.f2672s.m4201b();
        if (a) {
            abd.m3805a(this.f4569a.f4567a.f2654a, a);
            valueOf = Long.valueOf(aba.m3744a(this.f4569a.f4567a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
            intent = new Intent();
            bundle = new Bundle();
            bundle.putLong("date", valueOf.longValue());
            bundle.putString("account", this.f4569a.f4567a.f2671r);
            intent.putExtras(bundle);
            this.f4569a.f4567a.setResult(-1, intent);
            this.f4569a.f4567a.finish();
            return;
        }
        aib.m3849a(this.f4569a.f4567a.f2654a, null, this.f4569a.f4567a.getResources().getString(2131099702), 17301543, this.f4569a.f4567a.getResources().getString(2131099707), this.f4569a.f4567a.getResources().getString(2131099983), null, null, null).show();
    }
}
