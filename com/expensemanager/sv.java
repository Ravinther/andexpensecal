package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

class sv implements OnClickListener {
    final /* synthetic */ String f5272a;
    final /* synthetic */ ExpenseExport f5273b;

    sv(ExpenseExport expenseExport, String str) {
        this.f5273b = expenseExport;
        this.f5272a = str;
    }

    public void onClick(View view) {
        if (ExpenseExport.m3164a(co.f4430d, this.f5272a, this.f5273b.m3160a())) {
            Toast.makeText(this.f5273b.f3212b, this.f5273b.getResources().getString(2131099901), 1).show();
        } else {
            Toast.makeText(this.f5273b.f3212b, this.f5273b.getResources().getString(2131099897), 1).show();
        }
    }
}
