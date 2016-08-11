package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ot implements OnClickListener {
    final /* synthetic */ boolean[] f5102a;
    final /* synthetic */ or f5103b;

    ot(or orVar, boolean[] zArr) {
        this.f5103b = orVar;
        this.f5102a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5103b.f5097a.length) {
            if (this.f5102a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5103b.f5097a[i2] : charSequence + "," + this.f5103b.f5097a[i2];
            }
            i2++;
        }
        if ("".equals(charSequence)) {
            charSequence = this.f5103b.f5099c.f3110y;
        }
        this.f5103b.f5099c.f3094i.setText(charSequence);
    }
}
