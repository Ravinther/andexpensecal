package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.Arrays;

class yw implements OnClickListener {
    final /* synthetic */ String f5504a;
    final /* synthetic */ ExpensePaymentMethodList f5505b;

    yw(ExpensePaymentMethodList expensePaymentMethodList, String str) {
        this.f5505b = expensePaymentMethodList;
        this.f5504a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f5505b.f3379e.split(",")));
        arrayList.remove(this.f5504a);
        abd.m3811a(this.f5505b.f3377c, this.f5505b.f3380f, "expense_preference", "PAYMENT_METHOD_KEY", aib.m3857a(arrayList, ","));
        this.f5505b.onCreate(null);
    }
}
