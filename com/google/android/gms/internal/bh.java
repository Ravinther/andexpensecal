package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p046a.C0582a;

class bh implements bf {
    private IBinder f6269a;

    bh(IBinder iBinder) {
        this.f6269a = iBinder;
    }

    public IBinder m5134a(C0582a c0582a, ay ayVar, String str, ee eeVar, int i) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            obtain.writeStrongBinder(c0582a != null ? c0582a.asBinder() : null);
            if (ayVar != null) {
                obtain.writeInt(1);
                ayVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (eeVar != null) {
                iBinder = eeVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i);
            this.f6269a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            iBinder = obtain2.readStrongBinder();
            return iBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6269a;
    }
}
