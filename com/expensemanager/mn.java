package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

class mn implements OnClickListener {
    final /* synthetic */ mm f4978a;

    mn(mm mmVar) {
        this.f4978a = mmVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f4978a.f4977a.f2968p.m4206d()) {
            this.f4978a.f4977a.f2968p.m4193a();
        }
        boolean a = this.f4978a.f4977a.f2968p.m4195a("expense_budget", this.f4978a.f4977a.f2954a);
        this.f4978a.f4977a.f2968p.m4201b();
        if (a) {
            abd.m3805a(this.f4978a.f4977a.f2956c, a);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("tabId", 4);
            intent.putExtras(bundle);
            this.f4978a.f4977a.setResult(-1, intent);
            this.f4978a.f4977a.finish();
            return;
        }
        Toast.makeText(this.f4978a.f4977a.f2956c, this.f4978a.f4977a.getResources().getString(2131099707), 1).show();
    }
}
