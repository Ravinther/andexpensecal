package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ic implements OnClickListener {
    final /* synthetic */ boolean[] f4787a;
    final /* synthetic */ ia f4788b;

    ic(ia iaVar, boolean[] zArr) {
        this.f4788b = iaVar;
        this.f4787a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4788b.f4782a.length) {
            if (this.f4787a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4788b.f4782a[i2] : charSequence + "," + this.f4788b.f4782a[i2];
            }
            i2++;
        }
        if ("".equals(charSequence)) {
            charSequence = this.f4788b.f4784c.f2814v;
        }
        this.f4788b.f4784c.f2804l.setText(charSequence);
        this.f4788b.f4784c.m2697a();
    }
}
