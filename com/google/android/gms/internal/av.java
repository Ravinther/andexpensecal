package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@id
public final class av implements SafeParcelable {
    public static final as CREATOR;
    public final int f6237a;
    public final long f6238b;
    public final Bundle f6239c;
    public final int f6240d;
    public final List<String> f6241e;
    public final boolean f6242f;
    public final int f6243g;
    public final boolean f6244h;
    public final String f6245i;
    public final bj f6246j;
    public final Location f6247k;
    public final String f6248l;
    public final Bundle f6249m;

    static {
        CREATOR = new as();
    }

    public av(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, bj bjVar, Location location, String str2, Bundle bundle2) {
        this.f6237a = i;
        this.f6238b = j;
        this.f6239c = bundle;
        this.f6240d = i2;
        this.f6241e = list;
        this.f6242f = z;
        this.f6243g = i3;
        this.f6244h = z2;
        this.f6245i = str;
        this.f6246j = bjVar;
        this.f6247k = location;
        this.f6248l = str2;
        this.f6249m = bundle2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        as.m5066a(this, parcel, i);
    }
}
