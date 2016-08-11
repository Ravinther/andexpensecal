package com.google.android.gms.internal;

import android.os.Build.VERSION;

public final class oj {
    public static boolean m6344a() {
        return m6345a(11);
    }

    private static boolean m6345a(int i) {
        return VERSION.SDK_INT >= i;
    }

    public static boolean m6346b() {
        return m6345a(14);
    }

    public static boolean m6347c() {
        return m6345a(19);
    }

    @Deprecated
    public static boolean m6348d() {
        return m6349e();
    }

    public static boolean m6349e() {
        return m6345a(21);
    }
}
