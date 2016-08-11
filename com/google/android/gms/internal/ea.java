package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p046a.C0583b;
import com.google.android.gms.p046a.C0585d;

@id
public final class ea implements SafeParcelable {
    public static final go CREATOR;
    public final int f6490a;
    public final hc f6491b;
    public final he f6492c;
    public final Context f6493d;
    public final hb f6494e;

    static {
        CREATOR = new go();
    }

    ea(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.f6490a = i;
        this.f6491b = (hc) C0585d.m4879a(C0583b.m4877a(iBinder));
        this.f6492c = (he) C0585d.m4879a(C0583b.m4877a(iBinder2));
        this.f6493d = (Context) C0585d.m4879a(C0583b.m4877a(iBinder3));
        this.f6494e = (hb) C0585d.m4879a(C0583b.m4877a(iBinder4));
    }

    public ea(Context context, hc hcVar, he heVar, hb hbVar) {
        this.f6490a = 2;
        this.f6493d = context;
        this.f6491b = hcVar;
        this.f6492c = heVar;
        this.f6494e = hbVar;
    }

    public static ea m5409a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(ea.class.getClassLoader());
            return (ea) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void m5410a(Intent intent, ea eaVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", eaVar);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    IBinder m5411a() {
        return C0585d.m4878a(this.f6494e).asBinder();
    }

    IBinder m5412b() {
        return C0585d.m4878a(this.f6491b).asBinder();
    }

    IBinder m5413c() {
        return C0585d.m4878a(this.f6492c).asBinder();
    }

    IBinder m5414d() {
        return C0585d.m4878a(this.f6493d).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        go.m5609a(this, parcel, i);
    }
}
