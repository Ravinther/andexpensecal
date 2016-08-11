package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

@id
public final class lx {
    public static final Handler f7093a;

    static {
        f7093a = new Handler(Looper.getMainLooper());
    }

    public static int m6056a(Context context, int i) {
        return m6057a(context.getResources().getDisplayMetrics(), i);
    }

    public static int m6057a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static String m6058a(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (string == null || m6063a()) {
            string = "emulator";
        }
        return m6059a(string);
    }

    public static String m6059a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest.getInstance("MD5").update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r1.digest())});
            } catch (NoSuchAlgorithmException e) {
                i++;
            }
        }
        return null;
    }

    public static void m6060a(ViewGroup viewGroup, ay ayVar, String str) {
        m6061a(viewGroup, ayVar, str, -16777216, -1);
    }

    private static void m6061a(ViewGroup viewGroup, ay ayVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m6056a(context, 3);
            frameLayout.addView(textView, new LayoutParams(ayVar.f6259g - a, ayVar.f6256d - a, 17));
            viewGroup.addView(frameLayout, ayVar.f6259g, ayVar.f6256d);
        }
    }

    public static void m6062a(ViewGroup viewGroup, ay ayVar, String str, String str2) {
        ly.m6074e(str2);
        m6061a(viewGroup, ayVar, str, -65536, -16777216);
    }

    public static boolean m6063a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean m6064b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
