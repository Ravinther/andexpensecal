package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

@id
public class kx {
    private final Object f7043a;
    private final String f7044b;
    private int f7045c;
    private long f7046d;
    private long f7047e;
    private int f7048f;
    private int f7049g;

    public kx(String str) {
        this.f7043a = new Object();
        this.f7045c = 0;
        this.f7046d = -1;
        this.f7047e = -1;
        this.f7048f = 0;
        this.f7049g = -1;
        this.f7044b = str;
    }

    public static boolean m5979a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            ly.m6070c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            ly.m6070c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException e) {
            ly.m6074e("Fail to fetch AdActivity theme");
            ly.m6070c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public long m5980a() {
        return this.f7047e;
    }

    public Bundle m5981a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f7043a) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f7044b);
            bundle.putLong("basets", this.f7047e);
            bundle.putLong("currts", this.f7046d);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f7049g);
            bundle.putInt("pclick", this.f7045c);
            bundle.putInt("pimp", this.f7048f);
            bundle.putBoolean("support_transparent_background", m5979a(context));
        }
        return bundle;
    }

    public void m5982a(av avVar, long j) {
        synchronized (this.f7043a) {
            if (this.f7047e == -1) {
                this.f7047e = j;
                this.f7046d = this.f7047e;
            } else {
                this.f7046d = j;
            }
            if (avVar.f6239c == null || avVar.f6239c.getInt("gw", 2) != 1) {
                this.f7049g++;
                return;
            }
        }
    }

    public void m5983b() {
        synchronized (this.f7043a) {
            this.f7045c++;
        }
    }

    public void m5984c() {
        synchronized (this.f7043a) {
            this.f7048f++;
        }
    }
}
