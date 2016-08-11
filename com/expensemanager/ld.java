package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

class ld implements OnClickListener {
    final /* synthetic */ lc f4923a;

    ld(lc lcVar) {
        this.f4923a = lcVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f4923a.f4922a.f2906q.m4206d()) {
            this.f4923a.f4922a.f2906q.m4193a();
        }
        boolean a = this.f4923a.f4922a.f2906q.m4195a("expense_budget", this.f4923a.f4922a.f2891a);
        this.f4923a.f4922a.f2906q.m4201b();
        if (a) {
            abd.m3805a(this.f4923a.f4922a.f2893c, a);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("tabId", this.f4923a.f4922a.f2899i.getSelectedItemPosition());
            intent.putExtras(bundle);
            this.f4923a.f4922a.setResult(-1, intent);
            this.f4923a.f4922a.finish();
            return;
        }
        Toast.makeText(this.f4923a.f4922a.f2893c, this.f4923a.f4922a.getResources().getString(2131099707), 1).show();
    }
}
