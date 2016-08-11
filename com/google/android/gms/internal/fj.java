package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@id
public final class fj implements SafeParcelable {
    public static final js CREATOR;
    public final int f6555a;
    public final String f6556b;
    public final String f6557c;
    public final List<String> f6558d;
    public final int f6559e;
    public final List<String> f6560f;
    public final long f6561g;
    public final boolean f6562h;
    public final long f6563i;
    public final List<String> f6564j;
    public final long f6565k;
    public final int f6566l;
    public final String f6567m;
    public final long f6568n;
    public final String f6569o;
    public final boolean f6570p;
    public final String f6571q;
    public final String f6572r;
    public final boolean f6573s;
    public final boolean f6574t;
    public final boolean f6575u;
    public final boolean f6576v;

    static {
        CREATOR = new js();
    }

    public fj(int i) {
        this(10, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, false);
    }

    public fj(int i, long j) {
        this(10, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, false);
    }

    fj(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f6555a = i;
        this.f6556b = str;
        this.f6557c = str2;
        this.f6558d = list != null ? Collections.unmodifiableList(list) : null;
        this.f6559e = i2;
        this.f6560f = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f6561g = j;
        this.f6562h = z;
        this.f6563i = j2;
        this.f6564j = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f6565k = j3;
        this.f6566l = i3;
        this.f6567m = str3;
        this.f6568n = j4;
        this.f6569o = str4;
        this.f6570p = z2;
        this.f6571q = str5;
        this.f6572r = str6;
        this.f6573s = z3;
        this.f6574t = z4;
        this.f6575u = z5;
        this.f6576v = z6;
    }

    public fj(String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(10, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5);
    }

    public fj(String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6) {
        this(10, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        js.m5837a(this, parcel, i);
    }
}
