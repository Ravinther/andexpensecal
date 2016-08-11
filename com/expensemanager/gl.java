package com.expensemanager;

import java.util.ArrayList;
import java.util.Arrays;

class gl implements ahz {
    final /* synthetic */ ExpenseAccountGroupEditList f4696a;

    gl(ExpenseAccountGroupEditList expenseAccountGroupEditList) {
        this.f4696a = expenseAccountGroupEditList;
    }

    public void m4130a(int i, int i2) {
        String str = (String) this.f4696a.f2743a.getItem(i);
        this.f4696a.f2743a.remove(str);
        this.f4696a.f2743a.insert(str, i2);
        this.f4696a.f2747e = abd.m3786a(this.f4696a.f2745c, this.f4696a.f2750h, "ACCOUNT_GROUP_NAME", "");
        this.f4696a.f2746d = new ArrayList(Arrays.asList(this.f4696a.f2747e.split(",")));
        str = (String) this.f4696a.f2746d.get(i);
        this.f4696a.f2746d.remove(i);
        this.f4696a.f2746d.add(i2, str);
        abd.m3811a(this.f4696a.f2745c, this.f4696a.f2750h, "expense_preference", "ACCOUNT_GROUP_NAME", aib.m3857a(this.f4696a.f2746d, ","));
    }
}
