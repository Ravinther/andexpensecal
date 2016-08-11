package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class kt implements OnClickListener {
    final /* synthetic */ boolean[] f4902a;
    final /* synthetic */ String[] f4903b;
    final /* synthetic */ TextView f4904c;
    final /* synthetic */ String f4905d;
    final /* synthetic */ boolean f4906e;
    final /* synthetic */ ExpenseBudgetAdd f4907f;

    kt(ExpenseBudgetAdd expenseBudgetAdd, boolean[] zArr, String[] strArr, TextView textView, String str, boolean z) {
        this.f4907f = expenseBudgetAdd;
        this.f4902a = zArr;
        this.f4903b = strArr;
        this.f4904c = textView;
        this.f4905d = str;
        this.f4906e = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4902a.length) {
            if (this.f4902a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4903b[i2] : charSequence + "," + this.f4903b[i2];
            }
            i2++;
        }
        if (this.f4907f.f2894d.getId() == this.f4904c.getId() && "".equals(charSequence)) {
            charSequence = this.f4905d;
        }
        this.f4904c.setText(charSequence);
        if (this.f4906e) {
            this.f4907f.f2901k.setVisibility(8);
            this.f4907f.f2901k.setChecked(false);
        }
    }
}
