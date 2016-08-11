package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class jj implements SafeParcelable {
    public static final Creator<jj> CREATOR;
    final int f6851a;
    final int f6852b;
    int f6853c;
    String f6854d;
    IBinder f6855e;
    Scope[] f6856f;
    Bundle f6857g;

    static {
        CREATOR = new ne();
    }

    jj(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle) {
        this.f6851a = i;
        this.f6852b = i2;
        this.f6853c = i3;
        this.f6854d = str;
        this.f6855e = iBinder;
        this.f6856f = scopeArr;
        this.f6857g = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ne.m6176a(this, parcel, i);
    }
}
