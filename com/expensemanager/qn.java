package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class qn implements OnClickListener {
    final /* synthetic */ boolean[] f5183a;
    final /* synthetic */ String[] f5184b;
    final /* synthetic */ TextView f5185c;
    final /* synthetic */ ExpenseCustomActivities f5186d;

    qn(ExpenseCustomActivities expenseCustomActivities, boolean[] zArr, String[] strArr, TextView textView) {
        this.f5186d = expenseCustomActivities;
        this.f5183a = zArr;
        this.f5184b = strArr;
        this.f5185c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5183a.length) {
            if (this.f5183a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5184b[i2] : charSequence + "," + this.f5184b[i2];
            }
            i2++;
        }
        this.f5185c.setText(charSequence);
    }
}
