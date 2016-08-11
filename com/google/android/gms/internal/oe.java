package com.google.android.gms.internal;

import android.content.Context;
import java.util.regex.Pattern;

public final class oe {
    private static Pattern f7263a;

    static {
        f7263a = null;
    }

    public static int m6332a(int i) {
        return i / 1000;
    }

    public static boolean m6333a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int m6334b(int i) {
        return (i % 1000) / 100;
    }

    public static boolean m6335c(int i) {
        return m6334b(i) == 3;
    }
}
