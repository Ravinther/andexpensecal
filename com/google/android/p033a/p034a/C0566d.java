package com.google.android.p033a.p034a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0607c;

/* renamed from: com.google.android.a.a.d */
public abstract class C0566d extends Binder implements C0565c {
    public C0566d() {
        attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
    }

    public static C0565c m4832a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0565c)) ? new C0567e(iBinder) : (C0565c) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                m4831a(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
