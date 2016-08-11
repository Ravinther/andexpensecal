package com.expensemanager;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.util.Locale;

class xm implements OnClickListener {
    final /* synthetic */ xk f5449a;

    xm(xk xkVar) {
        this.f5449a = xkVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean a;
        Exception e;
        Long valueOf;
        Intent intent;
        Bundle bundle;
        this.f5449a.f5447a.f3358y.m4193a();
        try {
            a = this.f5449a.f5447a.f3358y.m4195a("expense_report", this.f5449a.f5447a.getIntent().getLongExtra("rowId", 0));
            try {
                File file = new File(co.f4431e + this.f5449a.f5447a.getIntent().getStringExtra("property2"));
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                this.f5449a.f5447a.f3358y.m4201b();
                if (a) {
                    abd.m3805a(this.f5449a.f5447a.f3334a, a);
                    new yf(this.f5449a.f5447a).execute(new Context[]{this.f5449a.f5447a.f3334a});
                    valueOf = Long.valueOf(aba.m3744a(this.f5449a.f5447a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
                    intent = new Intent();
                    bundle = new Bundle();
                    bundle.putLong("date", valueOf.longValue());
                    bundle.putString("account", this.f5449a.f5447a.f3357x);
                    bundle.putInt("position", this.f5449a.f5447a.getIntent().getIntExtra("position", 0));
                    intent.putExtras(bundle);
                    this.f5449a.f5447a.setResult(-1, intent);
                    this.f5449a.f5447a.finish();
                    return;
                }
                aib.m3849a(this.f5449a.f5447a.f3334a, null, this.f5449a.f5447a.getResources().getString(2131099702), 17301543, this.f5449a.f5447a.getResources().getString(2131099707), this.f5449a.f5447a.getResources().getString(2131099983), null, null, null).show();
            }
        } catch (Exception e3) {
            e = e3;
            a = false;
            e.printStackTrace();
            this.f5449a.f5447a.f3358y.m4201b();
            if (a) {
                aib.m3849a(this.f5449a.f5447a.f3334a, null, this.f5449a.f5447a.getResources().getString(2131099702), 17301543, this.f5449a.f5447a.getResources().getString(2131099707), this.f5449a.f5447a.getResources().getString(2131099983), null, null, null).show();
            }
            abd.m3805a(this.f5449a.f5447a.f3334a, a);
            new yf(this.f5449a.f5447a).execute(new Context[]{this.f5449a.f5447a.f3334a});
            valueOf = Long.valueOf(aba.m3744a(this.f5449a.f5447a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
            intent = new Intent();
            bundle = new Bundle();
            bundle.putLong("date", valueOf.longValue());
            bundle.putString("account", this.f5449a.f5447a.f3357x);
            bundle.putInt("position", this.f5449a.f5447a.getIntent().getIntExtra("position", 0));
            intent.putExtras(bundle);
            this.f5449a.f5447a.setResult(-1, intent);
            this.f5449a.f5447a.finish();
            return;
        }
        this.f5449a.f5447a.f3358y.m4201b();
        if (a) {
            abd.m3805a(this.f5449a.f5447a.f3334a, a);
            new yf(this.f5449a.f5447a).execute(new Context[]{this.f5449a.f5447a.f3334a});
            valueOf = Long.valueOf(aba.m3744a(this.f5449a.f5447a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
            intent = new Intent();
            bundle = new Bundle();
            bundle.putLong("date", valueOf.longValue());
            bundle.putString("account", this.f5449a.f5447a.f3357x);
            bundle.putInt("position", this.f5449a.f5447a.getIntent().getIntExtra("position", 0));
            intent.putExtras(bundle);
            this.f5449a.f5447a.setResult(-1, intent);
            this.f5449a.f5447a.finish();
            return;
        }
        aib.m3849a(this.f5449a.f5447a.f3334a, null, this.f5449a.f5447a.getResources().getString(2131099702), 17301543, this.f5449a.f5447a.getResources().getString(2131099707), this.f5449a.f5447a.getResources().getString(2131099983), null, null, null).show();
    }
}
