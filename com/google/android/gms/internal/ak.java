package com.google.android.gms.internal;

import java.util.Comparator;

class ak implements Comparator<String> {
    final /* synthetic */ aj f6229a;

    ak(aj ajVar) {
        this.f6229a = ajVar;
    }

    public int m5036a(String str, String str2) {
        return str2.length() - str.length();
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m5036a((String) obj, (String) obj2);
    }
}
