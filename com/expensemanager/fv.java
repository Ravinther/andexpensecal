package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class fv implements OnClickListener {
    final /* synthetic */ String f4667a;
    final /* synthetic */ fu f4668b;

    fv(fu fuVar, String str) {
        this.f4668b = fuVar;
        this.f4667a = str;
    }

    public void onClick(View view) {
        if (!this.f4667a.equals("All")) {
            this.f4668b.m4118b(this.f4668b.f4661a);
        }
    }
}
