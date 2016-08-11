package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class nc implements OnClickListener {
    final /* synthetic */ boolean[] f5015a;
    final /* synthetic */ na f5016b;

    nc(na naVar, boolean[] zArr) {
        this.f5016b = naVar;
        this.f5015a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5016b.f5010a.length) {
            if (this.f5015a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5016b.f5010a[i2] : charSequence + "," + this.f5016b.f5010a[i2];
            }
            i2++;
        }
        if ("".equals(charSequence)) {
            charSequence = this.f5016b.f5012c.f3041z;
        }
        this.f5016b.f5012c.f3024i.setText(charSequence);
    }
}
