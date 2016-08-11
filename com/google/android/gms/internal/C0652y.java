package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@id
/* renamed from: com.google.android.gms.internal.y */
public final class C0652y implements SafeParcelable {
    public static final pn CREATOR;
    public final int f7350a;
    public final boolean f7351b;
    public final boolean f7352c;

    static {
        CREATOR = new pn();
    }

    C0652y(int i, boolean z, boolean z2) {
        this.f7350a = i;
        this.f7351b = z;
        this.f7352c = z2;
    }

    public C0652y(boolean z, boolean z2) {
        this.f7350a = 1;
        this.f7351b = z;
        this.f7352c = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        pn.m6492a(this, parcel, i);
    }
}
