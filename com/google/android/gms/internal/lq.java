package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;

@id
public final class lq {
    public static void m6041a(Context context, WebSettings webSettings) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            webSettings.setAppCachePath(cacheDir.getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
    }

    public static void m6042a(View view) {
        view.setLayerType(1, null);
    }

    public static void m6043a(Window window) {
        window.setFlags(16777216, 16777216);
    }

    public static void m6044a(WebView webView) {
        webView.onPause();
    }

    public static void m6045b(View view) {
        view.setLayerType(0, null);
    }

    public static void m6046b(WebView webView) {
        webView.onResume();
    }
}
