package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@id
public final class gs implements SafeParcelable {
    public static final lz CREATOR;
    public final int f6667a;
    public String f6668b;
    public int f6669c;
    public int f6670d;
    public boolean f6671e;

    static {
        CREATOR = new lz();
    }

    public gs(int i, int i2, boolean z) {
        this(1, "afma-sdk-a-v" + i + "." + i2 + "." + (z ? "0" : "1"), i, i2, z);
    }

    gs(int i, String str, int i2, int i3, boolean z) {
        this.f6667a = i;
        this.f6668b = str;
        this.f6669c = i2;
        this.f6670d = i3;
        this.f6671e = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        lz.m6075a(this, parcel, i);
    }
}
