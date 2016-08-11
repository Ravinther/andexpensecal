package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class afk implements OnClickListener {
    final /* synthetic */ Settings f4048a;

    afk(Settings settings) {
        this.f4048a = settings;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f4048a.f3590a, ExpenseManager.class);
        intent.addFlags(67108864);
        this.f4048a.startActivity(intent);
    }
}
