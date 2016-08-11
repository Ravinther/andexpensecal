package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

public class oc {
    private String f7258a;
    private String f7259b;
    private String f7260c;
    private String[] f7261d;
    private kv f7262e;

    public oc(kv kvVar) {
        this.f7258a = "googleads.g.doubleclick.net";
        this.f7259b = "/pagead/ads";
        this.f7260c = "ad.doubleclick.net";
        this.f7261d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.f7262e = kvVar;
    }

    private Uri m6324a(Uri uri, Context context, String str, boolean z) {
        try {
            boolean a = m6330a(uri);
            if (a) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new od("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new od("Query parameter already exists: ms");
            }
            String a2 = z ? this.f7262e.m5943a(context, str) : this.f7262e.m5942a(context);
            return a ? m6326b(uri, "dc_ms", a2) : m6325a(uri, "ms", a2);
        } catch (UnsupportedOperationException e) {
            throw new od("Provided Uri is not in a valid state");
        }
    }

    private Uri m6325a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private Uri m6326b(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf(";adurl");
        if (indexOf != -1) {
            return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append(";").append(uri2.substring(indexOf + 1)).toString());
        }
        String encodedPath = uri.getEncodedPath();
        int indexOf2 = uri2.indexOf(encodedPath);
        return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str).append("=").append(str2).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
    }

    public Uri m6327a(Uri uri, Context context) {
        try {
            return m6324a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new od("Provided Uri is not in a valid state");
        }
    }

    public kv m6328a() {
        return this.f7262e;
    }

    public void m6329a(MotionEvent motionEvent) {
        this.f7262e.m5945a(motionEvent);
    }

    public boolean m6330a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f7260c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean m6331b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f7261d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
