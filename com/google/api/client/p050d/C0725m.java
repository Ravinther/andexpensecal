package com.google.api.client.p050d;

import java.util.Comparator;

/* renamed from: com.google.api.client.d.m */
class C0725m implements Comparator<String> {
    final /* synthetic */ C0724l f7609a;

    C0725m(C0724l c0724l) {
        this.f7609a = c0724l;
    }

    public int m6958a(String str, String str2) {
        return str == str2 ? 0 : str == null ? -1 : str2 == null ? 1 : str.compareTo(str2);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m6958a((String) obj, (String) obj2);
    }
}
