package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public class nr {
    private static final Uri f7251a;
    private static final Uri f7252b;

    static {
        f7251a = Uri.parse("http://plus.google.com/");
        f7252b = f7251a.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent m6218a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent m6219a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent m6220b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m6221c(str));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    private static Uri m6221c(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }
}
