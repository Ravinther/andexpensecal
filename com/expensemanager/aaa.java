package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aaa implements OnClickListener {
    final /* synthetic */ String f3794a;
    final /* synthetic */ ExpenseRepeatingTransaction f3795b;

    aaa(ExpenseRepeatingTransaction expenseRepeatingTransaction, String str) {
        this.f3795b = expenseRepeatingTransaction;
        this.f3794a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            CharSequence charSequence;
            Double d = new Double(this.f3795b.f3404C.getText().toString());
            String charSequence2 = this.f3795b.f3414g.getText().toString();
            if (charSequence2 == null || "".equals(charSequence2)) {
                charSequence = "|" + this.f3795b.f3405D + "=" + this.f3795b.f3404C.getText().toString();
            } else {
                if (charSequence2.indexOf("|") != -1) {
                    charSequence2 = charSequence2.substring(0, charSequence2.indexOf("|"));
                }
                charSequence = charSequence2 + "|" + this.f3795b.f3405D + "=" + this.f3795b.f3404C.getText().toString();
            }
            this.f3795b.f3414g.setText(charSequence);
            this.f3795b.m3384a(this.f3794a);
        } catch (Exception e) {
            aib.m3849a(this.f3795b.f3413f, null, this.f3795b.getResources().getString(2131099702), 17301543, this.f3795b.getResources().getString(2131099718), this.f3795b.getResources().getString(2131099983), null, null, null).show();
        }
    }
}
