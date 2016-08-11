package com.expensemanager;

import java.util.Comparator;

class re implements Comparator<String> {
    final /* synthetic */ rd f5212a;

    re(rd rdVar) {
        this.f5212a = rdVar;
    }

    public int m4183a(String str, String str2) {
        return str2.compareTo(str);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m4183a((String) obj, (String) obj2);
    }
}
