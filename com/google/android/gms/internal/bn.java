package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class bn {
    private final HashSet<String> f6299a;
    private final Bundle f6300b;
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f6301c;
    private final HashSet<String> f6302d;
    private Date f6303e;
    private String f6304f;
    private int f6305g;
    private Location f6306h;
    private boolean f6307i;
    private String f6308j;
    private int f6309k;

    public bn() {
        this.f6299a = new HashSet();
        this.f6300b = new Bundle();
        this.f6301c = new HashMap();
        this.f6302d = new HashSet();
        this.f6305g = -1;
        this.f6307i = false;
        this.f6309k = -1;
    }

    public void m5162a(int i) {
        this.f6305g = i;
    }

    public void m5163a(Location location) {
        this.f6306h = location;
    }

    @Deprecated
    public void m5164a(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            m5165a(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f6301c.put(networkExtras.getClass(), networkExtras);
        }
    }

    public void m5165a(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.f6300b.putBundle(cls.getName(), bundle);
    }

    public void m5166a(String str) {
        this.f6299a.add(str);
    }

    public void m5167a(Date date) {
        this.f6303e = date;
    }

    public void m5168a(boolean z) {
        this.f6307i = z;
    }

    public void m5169b(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f6300b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f6300b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f6300b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public void m5170b(String str) {
        this.f6302d.add(str);
    }

    public void m5171b(boolean z) {
        this.f6309k = z ? 1 : 0;
    }

    public void m5172c(String str) {
        this.f6304f = str;
    }

    public void m5173d(String str) {
        this.f6308j = str;
    }
}
