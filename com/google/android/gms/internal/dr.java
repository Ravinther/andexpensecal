package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p046a.C0583b;
import com.google.android.gms.p046a.C0585d;

@id
public final class dr implements SafeParcelable {
    public static final fz CREATOR;
    public final int f6434a;
    public final C0631do f6435b;
    public final pa f6436c;
    public final ga f6437d;
    public final ma f6438e;
    public final co f6439f;
    public final String f6440g;
    public final boolean f6441h;
    public final String f6442i;
    public final gf f6443j;
    public final int f6444k;
    public final int f6445l;
    public final String f6446m;
    public final gs f6447n;
    public final da f6448o;
    public final String f6449p;
    public final C0652y f6450q;

    static {
        CREATOR = new fz();
    }

    dr(int i, C0631do c0631do, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, gs gsVar, IBinder iBinder6, String str4, C0652y c0652y) {
        this.f6434a = i;
        this.f6435b = c0631do;
        this.f6436c = (pa) C0585d.m4879a(C0583b.m4877a(iBinder));
        this.f6437d = (ga) C0585d.m4879a(C0583b.m4877a(iBinder2));
        this.f6438e = (ma) C0585d.m4879a(C0583b.m4877a(iBinder3));
        this.f6439f = (co) C0585d.m4879a(C0583b.m4877a(iBinder4));
        this.f6440g = str;
        this.f6441h = z;
        this.f6442i = str2;
        this.f6443j = (gf) C0585d.m4879a(C0583b.m4877a(iBinder5));
        this.f6444k = i2;
        this.f6445l = i3;
        this.f6446m = str3;
        this.f6447n = gsVar;
        this.f6448o = (da) C0585d.m4879a(C0583b.m4877a(iBinder6));
        this.f6449p = str4;
        this.f6450q = c0652y;
    }

    public dr(C0631do c0631do, pa paVar, ga gaVar, gf gfVar, gs gsVar) {
        this.f6434a = 4;
        this.f6435b = c0631do;
        this.f6436c = paVar;
        this.f6437d = gaVar;
        this.f6438e = null;
        this.f6439f = null;
        this.f6440g = null;
        this.f6441h = false;
        this.f6442i = null;
        this.f6443j = gfVar;
        this.f6444k = -1;
        this.f6445l = 4;
        this.f6446m = null;
        this.f6447n = gsVar;
        this.f6448o = null;
        this.f6449p = null;
        this.f6450q = null;
    }

    public dr(pa paVar, ga gaVar, co coVar, gf gfVar, ma maVar, boolean z, int i, String str, gs gsVar, da daVar) {
        this.f6434a = 4;
        this.f6435b = null;
        this.f6436c = paVar;
        this.f6437d = gaVar;
        this.f6438e = maVar;
        this.f6439f = coVar;
        this.f6440g = null;
        this.f6441h = z;
        this.f6442i = null;
        this.f6443j = gfVar;
        this.f6444k = i;
        this.f6445l = 3;
        this.f6446m = str;
        this.f6447n = gsVar;
        this.f6448o = daVar;
        this.f6449p = null;
        this.f6450q = null;
    }

    public dr(pa paVar, ga gaVar, co coVar, gf gfVar, ma maVar, boolean z, int i, String str, String str2, gs gsVar, da daVar) {
        this.f6434a = 4;
        this.f6435b = null;
        this.f6436c = paVar;
        this.f6437d = gaVar;
        this.f6438e = maVar;
        this.f6439f = coVar;
        this.f6440g = str2;
        this.f6441h = z;
        this.f6442i = str;
        this.f6443j = gfVar;
        this.f6444k = i;
        this.f6445l = 3;
        this.f6446m = null;
        this.f6447n = gsVar;
        this.f6448o = daVar;
        this.f6449p = null;
        this.f6450q = null;
    }

    public dr(pa paVar, ga gaVar, gf gfVar, ma maVar, int i, gs gsVar, String str, C0652y c0652y) {
        this.f6434a = 4;
        this.f6435b = null;
        this.f6436c = paVar;
        this.f6437d = gaVar;
        this.f6438e = maVar;
        this.f6439f = null;
        this.f6440g = null;
        this.f6441h = false;
        this.f6442i = null;
        this.f6443j = gfVar;
        this.f6444k = i;
        this.f6445l = 1;
        this.f6446m = null;
        this.f6447n = gsVar;
        this.f6448o = null;
        this.f6449p = str;
        this.f6450q = c0652y;
    }

    public dr(pa paVar, ga gaVar, gf gfVar, ma maVar, boolean z, int i, gs gsVar) {
        this.f6434a = 4;
        this.f6435b = null;
        this.f6436c = paVar;
        this.f6437d = gaVar;
        this.f6438e = maVar;
        this.f6439f = null;
        this.f6440g = null;
        this.f6441h = z;
        this.f6442i = null;
        this.f6443j = gfVar;
        this.f6444k = i;
        this.f6445l = 2;
        this.f6446m = null;
        this.f6447n = gsVar;
        this.f6448o = null;
        this.f6449p = null;
        this.f6450q = null;
    }

    public static dr m5365a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(dr.class.getClassLoader());
            return (dr) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void m5366a(Intent intent, dr drVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", drVar);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder m5367a() {
        return C0585d.m4878a(this.f6436c).asBinder();
    }

    IBinder m5368b() {
        return C0585d.m4878a(this.f6437d).asBinder();
    }

    IBinder m5369c() {
        return C0585d.m4878a(this.f6438e).asBinder();
    }

    IBinder m5370d() {
        return C0585d.m4878a(this.f6439f).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    IBinder m5371e() {
        return C0585d.m4878a(this.f6448o).asBinder();
    }

    IBinder m5372f() {
        return C0585d.m4878a(this.f6443j).asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        fz.m5560a(this, parcel, i);
    }
}
