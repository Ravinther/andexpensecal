package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Toast;

class ra implements OnClickListener {
    final /* synthetic */ qz f5207a;

    ra(qz qzVar) {
        this.f5207a = qzVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (ExpenseExport.m3163a(this.f5207a.f5204a.f3168b, co.f4430d + "/" + this.f5207a.f5204a.f3169d, null)) {
            Toast.makeText(this.f5207a.f5204a.f3168b, this.f5207a.f5204a.getResources().getString(2131099929), 1).show();
            Intent intent = new Intent(this.f5207a.f5204a.f3168b, ExpenseManager.class);
            intent.addFlags(67108864);
            this.f5207a.f5204a.startActivity(intent);
            return;
        }
        Toast.makeText(this.f5207a.f5204a.f3168b, this.f5207a.f5204a.getResources().getString(2131099925), 1).show();
    }
}
