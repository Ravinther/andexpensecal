package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

@id
public final class fs {
    public static boolean m5519a(Context context, C0631do c0631do, gf gfVar) {
        if (c0631do == null) {
            ly.m6074e("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(c0631do.f6421c)) {
            ly.m6074e("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(c0631do.f6422d)) {
            intent.setData(Uri.parse(c0631do.f6421c));
        } else {
            intent.setDataAndType(Uri.parse(c0631do.f6421c), c0631do.f6422d);
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(c0631do.f6423e)) {
            intent.setPackage(c0631do.f6423e);
        }
        if (!TextUtils.isEmpty(c0631do.f6424f)) {
            String[] split = c0631do.f6424f.split("/", 2);
            if (split.length < 2) {
                ly.m6074e("Could not parse component name from open GMSG: " + c0631do.f6424f);
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        try {
            ly.m6072d("Launching an intent: " + intent);
            context.startActivity(intent);
            gfVar.m5591r();
            return true;
        } catch (ActivityNotFoundException e) {
            ly.m6074e(e.getMessage());
            return false;
        }
    }
}
