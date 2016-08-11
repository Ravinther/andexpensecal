package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

@id
public final class la {
    private static final Object f7056a;
    private static String f7057b;

    static {
        f7056a = new Object();
    }

    public static String m5988a() {
        String str;
        synchronized (f7056a) {
            str = f7057b;
        }
        return str;
    }

    public static String m5989a(Context context, String str, String str2) {
        String str3;
        synchronized (f7056a) {
            if (f7057b == null && !TextUtils.isEmpty(str)) {
                m5990b(context, str, str2);
            }
            str3 = f7057b;
        }
        return str3;
    }

    private static void m5990b(Context context, String str, String str2) {
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (li.m6018a(classLoader, cls, split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            f7057b = String.format(Locale.US, "%X", new Object[]{bigInteger2});
        } catch (Throwable th) {
            f7057b = "err";
        }
    }
}
