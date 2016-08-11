package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@id
public final class en implements MediationAdRequest {
    private final Date f6499a;
    private final int f6500b;
    private final Set<String> f6501c;
    private final boolean f6502d;
    private final Location f6503e;
    private final int f6504f;

    public en(Date date, int i, Set<String> set, Location location, boolean z, int i2) {
        this.f6499a = date;
        this.f6500b = i;
        this.f6501c = set;
        this.f6503e = location;
        this.f6502d = z;
        this.f6504f = i2;
    }

    public Date getBirthday() {
        return this.f6499a;
    }

    public int getGender() {
        return this.f6500b;
    }

    public Set<String> getKeywords() {
        return this.f6501c;
    }

    public Location getLocation() {
        return this.f6503e;
    }

    public boolean isTesting() {
        return this.f6502d;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f6504f;
    }
}
