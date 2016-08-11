package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;

class wm implements OnClickListener {
    final /* synthetic */ boolean[] f5403a;
    final /* synthetic */ String[] f5404b;
    final /* synthetic */ Button f5405c;
    final /* synthetic */ ExpenseMileageSearch f5406d;

    wm(ExpenseMileageSearch expenseMileageSearch, boolean[] zArr, String[] strArr, Button button) {
        this.f5406d = expenseMileageSearch;
        this.f5403a = zArr;
        this.f5404b = strArr;
        this.f5405c = button;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5403a.length) {
            if (this.f5403a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5404b[i2] : charSequence + "," + this.f5404b[i2];
            }
            i2++;
        }
        this.f5405c.setText(charSequence);
    }
}
