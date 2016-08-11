package com.expensemanager;

import java.util.ArrayList;
import java.util.Arrays;

class fp implements ahz {
    final /* synthetic */ ExpenseAccountEditList f4654a;

    fp(ExpenseAccountEditList expenseAccountEditList) {
        this.f4654a = expenseAccountEditList;
    }

    public void m4108a(int i, int i2) {
        String str = (String) this.f4654a.f2719a.getItem(i);
        this.f4654a.f2719a.remove(str);
        this.f4654a.f2719a.insert(str, i2);
        this.f4654a.f2723e = abd.m3786a(this.f4654a.f2721c, this.f4654a.f2725g, "MY_ACCOUNT_NAMES", "Personal Expense");
        this.f4654a.f2722d = new ArrayList(Arrays.asList(this.f4654a.f2723e.split(",")));
        str = (String) this.f4654a.f2722d.get(i);
        this.f4654a.f2722d.remove(i);
        this.f4654a.f2722d.add(i2, str);
        abd.m3811a(this.f4654a.f2721c, this.f4654a.f2725g, "expense_preference", "MY_ACCOUNT_NAMES", aib.m3857a(this.f4654a.f2722d, ","));
        if (this.f4654a.f2724f != null && !"".equals(this.f4654a.f2724f)) {
            int indexOf = this.f4654a.f2722d.indexOf(this.f4654a.f2724f);
            if (indexOf != -1) {
                abd.m3811a(this.f4654a.f2721c, this.f4654a.f2725g, "expense_preference", "Default_Account_Index", "" + indexOf);
            }
        }
    }
}
