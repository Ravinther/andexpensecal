package com.expensemanager;

import java.util.Comparator;

class ri implements Comparator<String> {
    final /* synthetic */ rh f5217a;

    ri(rh rhVar) {
        this.f5217a = rhVar;
    }

    public int m4184a(String str, String str2) {
        return str2.compareTo(str);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m4184a((String) obj, (String) obj2);
    }
}
