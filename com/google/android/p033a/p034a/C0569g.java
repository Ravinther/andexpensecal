package com.google.android.p033a.p034a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0607c;

/* renamed from: com.google.android.a.a.g */
public abstract class C0569g extends Binder implements C0568f {
    public static C0568f m4835a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0568f)) ? new C0570h(iBinder) : (C0568f) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                m4834a(parcel.readLong(), parcel.readString(), C0566d.m4832a(parcel.readStrongBinder()));
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.licensing.ILicensingService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
