package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class xs implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5455a;

    xs(ExpenseNewTransaction expenseNewTransaction) {
        this.f5455a = expenseNewTransaction;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f5455a.f3359z.getText().toString();
        if (obj != null) {
            obj = obj.trim();
        }
        String obj2 = this.f5455a.f3327A.getText().toString();
        this.f5455a.f3340g.setText(aib.m3854a(obj, obj2));
        this.f5455a.f3342i.setText(obj);
        CharSequence charSequence = "Mileage: " + obj2 + " per mile";
        String obj3 = this.f5455a.f3328B.getText().toString();
        if (!(obj3 == null || "".equals(obj3))) {
            charSequence = charSequence + " from " + obj3;
        }
        obj3 = this.f5455a.f3329C.getText().toString();
        if (!(obj3 == null || "".equals(obj3))) {
            charSequence = charSequence + " to " + obj3;
        }
        this.f5455a.f3341h.setText(charSequence);
        abd.m3811a(this.f5455a.f3334a, this.f5455a.f3358y, "expense_preference", "MILEAGE_CONVERSION", obj2);
    }
}
