package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

@id
public final class ko {
    public final int f6952a;
    public final boolean f6953b;
    public final boolean f6954c;
    public final String f6955d;
    public final String f6956e;
    public final boolean f6957f;
    public final boolean f6958g;
    public final boolean f6959h;
    public final String f6960i;
    public final String f6961j;
    public final int f6962k;
    public final int f6963l;
    public final int f6964m;
    public final int f6965n;
    public final int f6966o;
    public final int f6967p;
    public final float f6968q;
    public final int f6969r;
    public final int f6970s;
    public final double f6971t;
    public final boolean f6972u;
    public final boolean f6973v;
    public final int f6974w;

    public ko(Context context) {
        boolean z = true;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packageManager = context.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f6952a = audioManager.getMode();
        this.f6953b = m5925a(packageManager, "geo:0,0?q=donuts") != null;
        this.f6954c = m5925a(packageManager, "http://www.google.com") != null;
        this.f6955d = telephonyManager.getNetworkOperator();
        this.f6956e = locale.getCountry();
        this.f6957f = lx.m6063a();
        this.f6958g = audioManager.isMusicActive();
        this.f6959h = audioManager.isSpeakerphoneOn();
        this.f6960i = locale.getLanguage();
        this.f6961j = m5926a(packageManager);
        this.f6962k = audioManager.getStreamVolume(3);
        this.f6963l = m5924a(context, connectivityManager, packageManager);
        this.f6964m = telephonyManager.getNetworkType();
        this.f6965n = telephonyManager.getPhoneType();
        this.f6966o = audioManager.getRingerMode();
        this.f6967p = audioManager.getStreamVolume(2);
        this.f6968q = displayMetrics.density;
        this.f6969r = displayMetrics.widthPixels;
        this.f6970s = displayMetrics.heightPixels;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f6971t = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (!(intExtra == 2 || intExtra == 5)) {
                z = false;
            }
            this.f6972u = z;
        } else {
            this.f6971t = -1.0d;
            this.f6972u = false;
        }
        if (VERSION.SDK_INT >= 16) {
            this.f6973v = connectivityManager.isActiveNetworkMetered();
            if (connectivityManager.getActiveNetworkInfo() != null) {
                this.f6974w = connectivityManager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else {
                this.f6974w = -1;
                return;
            }
        }
        this.f6973v = false;
        this.f6974w = -1;
    }

    private static int m5924a(Context context, ConnectivityManager connectivityManager, PackageManager packageManager) {
        if (!li.m6017a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            return -2;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
    }

    private static ResolveInfo m5925a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String m5926a(PackageManager packageManager) {
        String str = null;
        ResolveInfo a = m5925a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a != null) {
            ActivityInfo activityInfo = a.activityInfo;
            if (activityInfo != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo != null) {
                        str = packageInfo.versionCode + "." + activityInfo.packageName;
                    }
                } catch (NameNotFoundException e) {
                }
            }
        }
        return str;
    }
}
