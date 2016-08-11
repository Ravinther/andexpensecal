package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

class sy implements OnClickListener {
    final /* synthetic */ sx f5277a;

    sy(sx sxVar) {
        this.f5277a = sxVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (ExpenseExport.m3163a(this.f5277a.f5276a.f3212b, co.f4430d + "/" + this.f5277a.f5276a.f3213c, this.f5277a.f5276a.f3211a)) {
            Toast.makeText(this.f5277a.f5276a.f3212b, this.f5277a.f5276a.getResources().getString(2131099929), 1).show();
            Intent intent = new Intent(this.f5277a.f5276a.f3212b, ExpenseAccountActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f5277a.f5276a.f3211a);
            intent.putExtras(bundle);
            this.f5277a.f5276a.startActivity(intent);
            return;
        }
        Toast.makeText(this.f5277a.f5276a.f3212b, this.f5277a.f5276a.getResources().getString(2131099925), 1).show();
    }
}
