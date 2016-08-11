package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0583b;

class ej implements eh {
    private IBinder f6497a;

    ej(IBinder iBinder) {
        this.f6497a = iBinder;
    }

    public C0582a m5436a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f6497a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0582a a = C0583b.m4877a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m5437a(C0582a c0582a, av avVar, String str, ek ekVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0582a != null ? c0582a.asBinder() : null);
            if (avVar != null) {
                obtain.writeInt(1);
                avVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (ekVar != null) {
                iBinder = ekVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f6497a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m5438a(C0582a c0582a, av avVar, String str, String str2, ek ekVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0582a != null ? c0582a.asBinder() : null);
            if (avVar != null) {
                obtain.writeInt(1);
                avVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeString(str2);
            if (ekVar != null) {
                iBinder = ekVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f6497a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m5439a(C0582a c0582a, ay ayVar, av avVar, String str, ek ekVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0582a != null ? c0582a.asBinder() : null);
            if (ayVar != null) {
                obtain.writeInt(1);
                ayVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (avVar != null) {
                obtain.writeInt(1);
                avVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (ekVar != null) {
                iBinder = ekVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f6497a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m5440a(C0582a c0582a, ay ayVar, av avVar, String str, String str2, ek ekVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0582a != null ? c0582a.asBinder() : null);
            if (ayVar != null) {
                obtain.writeInt(1);
                ayVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (avVar != null) {
                obtain.writeInt(1);
                avVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeString(str2);
            if (ekVar != null) {
                iBinder = ekVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f6497a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6497a;
    }

    public void m5441b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f6497a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m5442c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f6497a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m5443d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f6497a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m5444e() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f6497a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
