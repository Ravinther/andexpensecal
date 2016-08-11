package com.expensemanager;

import java.util.Comparator;

class yx implements Comparator<String> {
    final /* synthetic */ ExpensePaymentMethodList f5506a;

    yx(ExpensePaymentMethodList expensePaymentMethodList) {
        this.f5506a = expensePaymentMethodList;
    }

    public int m4251a(String str, String str2) {
        return str.compareTo(str2);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m4251a((String) obj, (String) obj2);
    }
}
