package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.util.Locale;

class vs implements OnClickListener {
    final /* synthetic */ vq f5380a;

    vs(vq vqVar) {
        this.f5380a = vqVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean a;
        Exception e;
        Long valueOf;
        Intent intent;
        Bundle bundle;
        this.f5380a.f5378a.f3288u.m4193a();
        try {
            a = this.f5380a.f5378a.f3288u.m4195a("expense_report", this.f5380a.f5378a.getIntent().getLongExtra("rowId", 0));
            try {
                File file = new File(co.f4431e + this.f5380a.f5378a.getIntent().getStringExtra("property2"));
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                this.f5380a.f5378a.f3288u.m4201b();
                if (a) {
                    abd.m3805a(this.f5380a.f5378a.f3268a, a);
                    valueOf = Long.valueOf(aba.m3744a(this.f5380a.f5378a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
                    intent = new Intent();
                    bundle = new Bundle();
                    bundle.putLong("date", valueOf.longValue());
                    bundle.putString("account", this.f5380a.f5378a.f3287t);
                    intent.putExtras(bundle);
                    this.f5380a.f5378a.setResult(-1, intent);
                    this.f5380a.f5378a.finish();
                    return;
                }
                aib.m3849a(this.f5380a.f5378a.f3268a, null, this.f5380a.f5378a.getResources().getString(2131099702), 17301543, this.f5380a.f5378a.getResources().getString(2131099707), this.f5380a.f5378a.getResources().getString(2131099983), null, null, null).show();
            }
        } catch (Exception e3) {
            Exception exception = e3;
            a = false;
            e = exception;
            e.printStackTrace();
            this.f5380a.f5378a.f3288u.m4201b();
            if (a) {
                aib.m3849a(this.f5380a.f5378a.f3268a, null, this.f5380a.f5378a.getResources().getString(2131099702), 17301543, this.f5380a.f5378a.getResources().getString(2131099707), this.f5380a.f5378a.getResources().getString(2131099983), null, null, null).show();
            }
            abd.m3805a(this.f5380a.f5378a.f3268a, a);
            valueOf = Long.valueOf(aba.m3744a(this.f5380a.f5378a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
            intent = new Intent();
            bundle = new Bundle();
            bundle.putLong("date", valueOf.longValue());
            bundle.putString("account", this.f5380a.f5378a.f3287t);
            intent.putExtras(bundle);
            this.f5380a.f5378a.setResult(-1, intent);
            this.f5380a.f5378a.finish();
            return;
        }
        this.f5380a.f5378a.f3288u.m4201b();
        if (a) {
            abd.m3805a(this.f5380a.f5378a.f3268a, a);
            valueOf = Long.valueOf(aba.m3744a(this.f5380a.f5378a.getIntent().getStringExtra("date"), ExpenseManager.f3244t, Locale.US));
            intent = new Intent();
            bundle = new Bundle();
            bundle.putLong("date", valueOf.longValue());
            bundle.putString("account", this.f5380a.f5378a.f3287t);
            intent.putExtras(bundle);
            this.f5380a.f5378a.setResult(-1, intent);
            this.f5380a.f5378a.finish();
            return;
        }
        aib.m3849a(this.f5380a.f5378a.f3268a, null, this.f5380a.f5378a.getResources().getString(2131099702), 17301543, this.f5380a.f5378a.getResources().getString(2131099707), this.f5380a.f5378a.getResources().getString(2131099983), null, null, null).show();
    }
}
