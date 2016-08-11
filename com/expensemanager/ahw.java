package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;

class ahw implements OnClickListener {
    final /* synthetic */ TipCalculator f4140a;

    ahw(TipCalculator tipCalculator) {
        this.f4140a = tipCalculator;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f4140a.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        this.f4140a.f3661j = true;
        if (i == 1) {
            this.f4140a.f3661j = false;
        }
        edit.putBoolean("AFTER_TAX", this.f4140a.f3661j);
        edit.commit();
        this.f4140a.m3626b();
    }
}
