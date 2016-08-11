package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class cb implements bz {
    private IBinder f6363a;

    cb(IBinder iBinder) {
        this.f6363a = iBinder;
    }

    public void m5246a(bw bwVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
            obtain.writeStrongBinder(bwVar != null ? bwVar.asBinder() : null);
            this.f6363a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6363a;
    }
}
