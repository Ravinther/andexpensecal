package com.google.api.client.p055c.p056a.p057a.p058a.p059a;

/* renamed from: com.google.api.client.c.a.a.a.a.a */
public final class C0697a {
    public static C0699c m6824a(Object obj) {
        return new C0699c(null);
    }

    private static String m6825a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    public static boolean m6826a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
