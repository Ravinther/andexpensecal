package com.google.android.gms.internal;

import android.os.Bundle;

@id
public final class bt {
    public static mu<String> f6339a;
    public static mu<String> f6340b;
    public static mu<Boolean> f6341c;
    public static mu<Boolean> f6342d;
    public static mu<Boolean> f6343e;
    public static mu<String> f6344f;
    public static mu<Boolean> f6345g;
    public static mu<String> f6346h;
    public static mu<Boolean> f6347i;
    public static mu<Integer> f6348j;
    public static mu<Integer> f6349k;
    public static mu<Integer> f6350l;
    public static mu<Integer> f6351m;
    public static mu<Integer> f6352n;
    private static final Bundle f6353o;
    private static boolean f6354p;

    static {
        f6353o = new Bundle();
        f6354p = false;
        f6339a = m5226a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
        f6340b = m5226a("gads:sdk_core_experiment_id", (String) null);
        f6341c = m5227a("gads:sdk_crash_report_enabled", false);
        f6342d = m5227a("gads:sdk_crash_report_full_stacktrace", false);
        f6343e = m5227a("gads:block_autoclicks", false);
        f6344f = m5226a("gads:block_autoclicks_experiment_id", (String) null);
        f6354p = true;
        f6347i = m5227a("gads:enable_content_fetching", false);
        f6348j = m5225a("gads:content_length_weight", 1);
        f6349k = m5225a("gads:content_age_weight", 1);
        f6350l = m5225a("gads:min_content_len", 11);
        f6351m = m5225a("gads:fingerprint_number", 10);
        f6352n = m5225a("gads:sleep_sec", 10);
        f6345g = m5227a("gads:spam_app_context:enabled", false);
        f6346h = m5226a("gads:spam_app_context:experiment_id", (String) null);
    }

    public static Bundle m5224a() {
        return f6353o;
    }

    private static mu<Integer> m5225a(String str, int i) {
        f6353o.putInt(str, i);
        return mu.m6159a(str, Integer.valueOf(i));
    }

    private static mu<String> m5226a(String str, String str2) {
        f6353o.putString(str, str2);
        return mu.m6160a(str, str2);
    }

    private static mu<Boolean> m5227a(String str, boolean z) {
        f6353o.putBoolean(str, z);
        return mu.m6161a(str, z);
    }
}
