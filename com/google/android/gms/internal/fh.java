package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@id
public final class fh implements SafeParcelable {
    public static final jr CREATOR;
    public final int f6538a;
    public final Bundle f6539b;
    public final av f6540c;
    public final ay f6541d;
    public final String f6542e;
    public final ApplicationInfo f6543f;
    public final PackageInfo f6544g;
    public final String f6545h;
    public final String f6546i;
    public final String f6547j;
    public final gs f6548k;
    public final Bundle f6549l;
    public final int f6550m;
    public final List<String> f6551n;
    public final Bundle f6552o;
    public final boolean f6553p;

    static {
        CREATOR = new jr();
    }

    fh(int i, Bundle bundle, av avVar, ay ayVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, gs gsVar, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z) {
        this.f6538a = i;
        this.f6539b = bundle;
        this.f6540c = avVar;
        this.f6541d = ayVar;
        this.f6542e = str;
        this.f6543f = applicationInfo;
        this.f6544g = packageInfo;
        this.f6545h = str2;
        this.f6546i = str3;
        this.f6547j = str4;
        this.f6548k = gsVar;
        this.f6549l = bundle2;
        this.f6550m = i2;
        this.f6551n = list;
        this.f6552o = bundle3;
        this.f6553p = z;
    }

    public fh(Bundle bundle, av avVar, ay ayVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, gs gsVar, Bundle bundle2, int i, List<String> list, Bundle bundle3, boolean z) {
        this(4, bundle, avVar, ayVar, str, applicationInfo, packageInfo, str2, str3, str4, gsVar, bundle2, i, list, bundle3, z);
    }

    public fh(jq jqVar, String str) {
        String str2 = str;
        this(jqVar.f6865a, jqVar.f6866b, jqVar.f6867c, jqVar.f6868d, jqVar.f6869e, jqVar.f6870f, str2, jqVar.f6871g, jqVar.f6872h, jqVar.f6874j, jqVar.f6873i, jqVar.f6875k, jqVar.f6876l, jqVar.f6877m, jqVar.f6878n);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        jr.m5834a(this, parcel, i);
    }
}
