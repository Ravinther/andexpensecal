package com.google.android.gms.internal;

import android.util.Log;
import com.google.ads.AdRequest;

@id
public final class ly {
    public static void m6065a(String str) {
        if (m6067a(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    public static void m6066a(String str, Throwable th) {
        if (m6067a(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean m6067a(int i) {
        return (i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i)) && i != 2;
    }

    public static void m6068b(String str) {
        if (m6067a(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    public static void m6069b(String str, Throwable th) {
        if (m6067a(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void m6070c(String str) {
        if (m6067a(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    public static void m6071c(String str, Throwable th) {
        if (m6067a(4)) {
            Log.i(AdRequest.LOGTAG, str, th);
        }
    }

    public static void m6072d(String str) {
        if (m6067a(2)) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    public static void m6073d(String str, Throwable th) {
        if (m6067a(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    public static void m6074e(String str) {
        if (m6067a(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }
}
