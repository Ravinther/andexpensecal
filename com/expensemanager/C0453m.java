package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.expensemanager.m */
class C0453m implements OnClickListener {
    final /* synthetic */ boolean[] f4954a;
    final /* synthetic */ C0451k f4955b;

    C0453m(C0451k c0451k, boolean[] zArr) {
        this.f4955b = c0451k;
        this.f4954a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4955b.f4866a.length) {
            if (this.f4954a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4955b.f4866a[i2] : charSequence + "," + this.f4955b.f4866a[i2];
            }
            i2++;
        }
        if ("".equals(charSequence)) {
            charSequence = this.f4955b.f4868c.f2463z;
        }
        this.f4955b.f4868c.f2446i.setText(charSequence);
    }
}
