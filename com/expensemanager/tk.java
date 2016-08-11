package com.expensemanager;

import java.util.ArrayList;
import java.util.Arrays;

class tk implements ahz {
    final /* synthetic */ ExpenseIncomeCategoryList f5296a;

    tk(ExpenseIncomeCategoryList expenseIncomeCategoryList) {
        this.f5296a = expenseIncomeCategoryList;
    }

    public void m4211a(int i, int i2) {
        String str = (String) this.f5296a.f3226a.getItem(i);
        this.f5296a.f3226a.remove(str);
        this.f5296a.f3226a.insert(str, i2);
        this.f5296a.f3230e = abd.m3786a(this.f5296a.f3228c, this.f5296a.f3231f, "INCOME_CATEGORY_LIST", this.f5296a.getResources().getString(2131099934));
        this.f5296a.f3229d = new ArrayList(Arrays.asList(this.f5296a.f3230e.split(",")));
        str = (String) this.f5296a.f3229d.get(i);
        this.f5296a.f3229d.remove(i);
        this.f5296a.f3229d.add(i2, str);
        abd.m3811a(this.f5296a.f3228c, this.f5296a.f3231f, "expense_preference", "INCOME_CATEGORY_LIST", aib.m3857a(this.f5296a.f3229d, ","));
    }
}
