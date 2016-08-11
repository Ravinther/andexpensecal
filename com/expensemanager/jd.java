package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class jd implements OnClickListener {
    final /* synthetic */ boolean[] f4830a;
    final /* synthetic */ String[] f4831b;
    final /* synthetic */ TextView f4832c;
    final /* synthetic */ ExpenseActivitiesDefault f4833d;

    jd(ExpenseActivitiesDefault expenseActivitiesDefault, boolean[] zArr, String[] strArr, TextView textView) {
        this.f4833d = expenseActivitiesDefault;
        this.f4830a = zArr;
        this.f4831b = strArr;
        this.f4832c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4830a.length) {
            if (this.f4830a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4831b[i2] : charSequence + "," + this.f4831b[i2];
            }
            i2++;
        }
        this.f4832c.setText(charSequence);
    }
}
