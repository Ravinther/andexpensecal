package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class oa {
    private final List<String> f7256a;
    private final Object f7257b;

    private oa(Object obj) {
        this.f7257b = ob.m6315a(obj);
        this.f7256a = new ArrayList();
    }

    public oa m6314a(String str, Object obj) {
        this.f7256a.add(((String) ob.m6315a((Object) str)) + "=" + String.valueOf(obj));
        return this;
    }

    public String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f7257b.getClass().getSimpleName()).append('{');
        int size = this.f7256a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.f7256a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
