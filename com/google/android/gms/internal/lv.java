package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

@id
public final class lv {
    public static String m6052a(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }

    public static void m6053a(Context context, WebSettings webSettings) {
        lq.m6041a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
