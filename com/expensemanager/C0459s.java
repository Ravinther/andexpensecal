package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

/* renamed from: com.expensemanager.s */
class C0459s implements OnClickListener {
    final /* synthetic */ boolean[] f5241a;
    final /* synthetic */ String[] f5242b;
    final /* synthetic */ TextView f5243c;
    final /* synthetic */ ChartNewCustom f5244d;

    C0459s(ChartNewCustom chartNewCustom, boolean[] zArr, String[] strArr, TextView textView) {
        this.f5244d = chartNewCustom;
        this.f5241a = zArr;
        this.f5242b = strArr;
        this.f5243c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5241a.length) {
            if (this.f5241a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5242b[i2] : charSequence + "," + this.f5242b[i2];
            }
            i2++;
        }
        this.f5243c.setText(charSequence);
    }
}
