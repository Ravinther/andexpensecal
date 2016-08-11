package com.google.android.p033a.p034a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.a.a.e */
class C0567e implements C0565c {
    private IBinder f5998a;

    C0567e(IBinder iBinder) {
        this.f5998a = iBinder;
    }

    public void m4833a(int i, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f5998a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f5998a;
    }
}
