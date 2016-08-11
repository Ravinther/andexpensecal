package com.google.api.client.p050d;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: com.google.api.client.d.l */
public final class C0724l {
    private static final Map<Class<?>, C0724l> f7603b;
    private static final Map<Class<?>, C0724l> f7604c;
    final List<String> f7605a;
    private final Class<?> f7606d;
    private final boolean f7607e;
    private final IdentityHashMap<String, C0734v> f7608f;

    static {
        f7603b = new WeakHashMap();
        f7604c = new WeakHashMap();
    }

    private C0724l(Class<?> cls, boolean z) {
        this.f7608f = new IdentityHashMap();
        this.f7606d = cls;
        this.f7607e = z;
        boolean z2 = (z && cls.isEnum()) ? false : true;
        am.m6915a(z2, "cannot ignore case on an enum: " + cls);
        Collection treeSet = new TreeSet(new C0725m(this));
        for (Field field : cls.getDeclaredFields()) {
            C0734v a = C0734v.m6981a(field);
            if (a != null) {
                Object intern;
                String b = a.m6987b();
                if (z) {
                    intern = b.toLowerCase().intern();
                } else {
                    String str = b;
                }
                C0734v c0734v = (C0734v) this.f7608f.get(intern);
                boolean z3 = c0734v == null;
                String str2 = "two fields have the same %sname <%s>: %s and %s";
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = intern;
                objArr[2] = field;
                objArr[3] = c0734v == null ? null : c0734v.m6985a();
                am.m6916a(z3, str2, objArr);
                this.f7608f.put(intern, a);
                treeSet.add(intern);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            C0724l a2 = C0724l.m6953a(superclass, z);
            treeSet.addAll(a2.f7605a);
            for (Entry entry : a2.f7608f.entrySet()) {
                str = (String) entry.getKey();
                if (!this.f7608f.containsKey(str)) {
                    this.f7608f.put(str, entry.getValue());
                }
            }
        }
        this.f7605a = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static C0724l m6952a(Class<?> cls) {
        return C0724l.m6953a(cls, false);
    }

    public static C0724l m6953a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        C0724l c0724l;
        Map map = z ? f7604c : f7603b;
        synchronized (map) {
            c0724l = (C0724l) map.get(cls);
            if (c0724l == null) {
                c0724l = new C0724l(cls, z);
                map.put(cls, c0724l);
            }
        }
        return c0724l;
    }

    public C0734v m6954a(String str) {
        Object intern;
        if (str != null) {
            if (this.f7607e) {
                str = str.toLowerCase();
            }
            intern = str.intern();
        }
        return (C0734v) this.f7608f.get(intern);
    }

    public final boolean m6955a() {
        return this.f7607e;
    }

    public Field m6956b(String str) {
        C0734v a = m6954a(str);
        return a == null ? null : a.m6985a();
    }

    public boolean m6957b() {
        return this.f7606d.isEnum();
    }
}
