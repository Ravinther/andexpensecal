package com.expensemanager;

import java.util.Comparator;

class to implements Comparator<String> {
    final /* synthetic */ ExpenseIncomeCategoryList f5301a;

    to(ExpenseIncomeCategoryList expenseIncomeCategoryList) {
        this.f5301a = expenseIncomeCategoryList;
    }

    public int m4213a(String str, String str2) {
        return str.compareTo(str2);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m4213a((String) obj, (String) obj2);
    }
}
