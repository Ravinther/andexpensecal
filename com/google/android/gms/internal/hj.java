package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class hj implements hh {
    private IBinder f6725a;

    hj(IBinder iBinder) {
        this.f6725a = iBinder;
    }

    public void m5719a(he heVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            obtain.writeStrongBinder(heVar != null ? heVar.asBinder() : null);
            this.f6725a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6725a;
    }
}
