package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class be implements OnClickListener {
    final /* synthetic */ boolean[] f4241a;
    final /* synthetic */ String[] f4242b;
    final /* synthetic */ TextView f4243c;
    final /* synthetic */ ChartNewPeriod f4244d;

    be(ChartNewPeriod chartNewPeriod, boolean[] zArr, String[] strArr, TextView textView) {
        this.f4244d = chartNewPeriod;
        this.f4241a = zArr;
        this.f4242b = strArr;
        this.f4243c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4241a.length) {
            if (this.f4241a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4242b[i2] : charSequence + "," + this.f4242b[i2];
            }
            i2++;
        }
        this.f4243c.setText(charSequence);
    }
}
