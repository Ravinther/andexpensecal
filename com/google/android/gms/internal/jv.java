package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class jv implements jt {
    private IBinder f6879a;

    jv(IBinder iBinder) {
        this.f6879a = iBinder;
    }

    public fj m5842a(fh fhVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (fhVar != null) {
                obtain.writeInt(1);
                fhVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6879a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            fj a = obtain2.readInt() != 0 ? fj.CREATOR.m5838a(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6879a;
    }
}
