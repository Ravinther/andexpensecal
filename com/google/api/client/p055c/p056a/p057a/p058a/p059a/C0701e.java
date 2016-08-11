package com.google.api.client.p055c.p056a.p057a.p058a.p059a;

/* renamed from: com.google.api.client.c.a.a.a.a.e */
public final class C0701e {
    public static <T> T m6830a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T m6831a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T m6832a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C0701e.m6833a(str, objArr));
    }

    static String m6833a(String str, Object... objArr) {
        int i = 0;
        String valueOf = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf.substring(i2, indexOf));
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(valueOf.substring(i2));
        if (i < objArr.length) {
            stringBuilder.append(" [");
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            i = i2;
            while (i < objArr.length) {
                stringBuilder.append(", ");
                i2 = i + 1;
                stringBuilder.append(objArr[i]);
                i = i2;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public static void m6834a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m6835a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void m6836a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C0701e.m6833a(str, objArr));
        }
    }

    public static void m6837b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m6838b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(C0701e.m6833a(str, objArr));
        }
    }
}
