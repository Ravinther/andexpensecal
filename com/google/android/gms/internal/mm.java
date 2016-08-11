package com.google.android.gms.internal;

import android.webkit.ConsoleMessage.MessageLevel;

/* synthetic */ class mm {
    static final /* synthetic */ int[] f7133a;

    static {
        f7133a = new int[MessageLevel.values().length];
        try {
            f7133a[MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f7133a[MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f7133a[MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f7133a[MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f7133a[MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
