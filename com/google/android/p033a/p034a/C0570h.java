package com.google.android.p033a.p034a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.a.a.h */
class C0570h implements C0568f {
    private IBinder f5999a;

    C0570h(IBinder iBinder) {
        this.f5999a = iBinder;
    }

    public void m4836a(long j, String str, C0565c c0565c) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
            obtain.writeLong(j);
            obtain.writeString(str);
            if (c0565c != null) {
                iBinder = c0565c.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f5999a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f5999a;
    }
}
