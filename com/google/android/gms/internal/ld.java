package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

@id
public final class ld {
    public static void m5991a(Context context, boolean z) {
        Editor edit = m5993b(context).edit();
        edit.putBoolean("use_https", z);
        edit.commit();
    }

    public static boolean m5992a(Context context) {
        return m5993b(context).getBoolean("use_https", true);
    }

    private static SharedPreferences m5993b(Context context) {
        return context.getSharedPreferences("admob", 0);
    }
}
