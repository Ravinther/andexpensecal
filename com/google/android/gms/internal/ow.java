package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

class ow implements ou {
    private IBinder f7284a;

    ow(IBinder iBinder) {
        this.f7284a = iBinder;
    }

    public Bundle m6401a(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7284a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public Bundle m6402a(String str, String str2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7284a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public AccountChangeEventsResponse m6403a(AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
            if (accountChangeEventsRequest != null) {
                obtain.writeInt(1);
                accountChangeEventsRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7284a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            AccountChangeEventsResponse a = obtain2.readInt() != 0 ? AccountChangeEventsResponse.CREATOR.m4922a(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7284a;
    }
}
