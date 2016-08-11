package com.google.android.gms.internal;

import android.content.Context;

public abstract class mu<T> {
    private static final Object f7206c;
    private static my f7207d;
    protected final String f7208a;
    protected final T f7209b;
    private T f7210e;

    static {
        f7206c = new Object();
        f7207d = null;
    }

    protected mu(String str, T t) {
        this.f7210e = null;
        this.f7208a = str;
        this.f7209b = t;
    }

    public static mu<Integer> m6159a(String str, Integer num) {
        return new mw(str, num);
    }

    public static mu<String> m6160a(String str, String str2) {
        return new mx(str, str2);
    }

    public static mu<Boolean> m6161a(String str, boolean z) {
        return new mv(str, Boolean.valueOf(z));
    }

    public static void m6162a(Context context) {
        synchronized (f7206c) {
            if (f7207d == null) {
                f7207d = new mz(context.getContentResolver());
            }
        }
    }

    public String m6163a() {
        return this.f7208a;
    }
}
