package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class bl implements bi {
    private IBinder f6285a;

    bl(IBinder iBinder) {
        this.f6285a = iBinder;
    }

    public void m5135a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f6285a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6285a;
    }
}
