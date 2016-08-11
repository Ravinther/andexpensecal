package com.expensemanager;

import java.util.Comparator;

class yn implements Comparator<String> {
    final /* synthetic */ ExpensePayList f5490a;

    yn(ExpensePayList expensePayList) {
        this.f5490a = expensePayList;
    }

    public int m4247a(String str, String str2) {
        return str.compareTo(str2);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m4247a((String) obj, (String) obj2);
    }
}
