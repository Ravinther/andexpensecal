package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ob;

public final class Scope implements SafeParcelable {
    public static final Creator<Scope> CREATOR;
    final int f6134a;
    private final String f6135b;

    static {
        CREATOR = new C0613d();
    }

    Scope(int i, String str) {
        ob.m6317a(str, (Object) "scopeUri must not be null or empty");
        this.f6134a = i;
        this.f6135b = str;
    }

    public String m4934a() {
        return this.f6135b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.f6135b.equals(((Scope) obj).f6135b);
    }

    public int hashCode() {
        return this.f6135b.hashCode();
    }

    public String toString() {
        return this.f6135b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0613d.m4938a(this, parcel, i);
    }
}
