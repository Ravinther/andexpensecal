package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bb implements OnClickListener {
    final /* synthetic */ boolean[] f4236a;
    final /* synthetic */ az f4237b;

    bb(az azVar, boolean[] zArr) {
        this.f4237b = azVar;
        this.f4236a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4237b.f4230a.length) {
            if (this.f4236a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4237b.f4230a[i2] : charSequence + "," + this.f4237b.f4230a[i2];
            }
            i2++;
        }
        if ("".equals(charSequence)) {
            charSequence = this.f4237b.f4232c.f2558y;
        }
        this.f4237b.f4232c.f2542i.setText(charSequence);
    }
}
