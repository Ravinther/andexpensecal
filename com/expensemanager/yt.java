package com.expensemanager;

import java.util.ArrayList;
import java.util.Arrays;

class yt implements ahz {
    final /* synthetic */ ExpensePaymentMethodList f5501a;

    yt(ExpensePaymentMethodList expensePaymentMethodList) {
        this.f5501a = expensePaymentMethodList;
    }

    public void m4249a(int i, int i2) {
        String str = (String) this.f5501a.f3375a.getItem(i);
        this.f5501a.f3375a.remove(str);
        this.f5501a.f3375a.insert(str, i2);
        this.f5501a.f3379e = abd.m3786a(this.f5501a.f3377c, this.f5501a.f3380f, "PAYMENT_METHOD_KEY", aib.m3868b(this.f5501a.getResources().getString(2131100012).split(","), ","));
        this.f5501a.f3378d = new ArrayList(Arrays.asList(this.f5501a.f3379e.split(",")));
        str = (String) this.f5501a.f3378d.get(i);
        this.f5501a.f3378d.remove(i);
        this.f5501a.f3378d.add(i2, str);
        abd.m3811a(this.f5501a.f3377c, this.f5501a.f3380f, "expense_preference", "PAYMENT_METHOD_KEY", aib.m3857a(this.f5501a.f3378d, ","));
    }
}
