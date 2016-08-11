package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract class ov extends Binder implements ou {
    public static ou m6400a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ou)) ? new ow(iBinder) : (ou) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AccountChangeEventsRequest accountChangeEventsRequest = null;
        String readString;
        Bundle bundle;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                bundle = m6398a(readString, readString2, bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                bundle = m6397a(readString, bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                if (parcel.readInt() != 0) {
                    accountChangeEventsRequest = AccountChangeEventsRequest.CREATOR.m4919a(parcel);
                }
                AccountChangeEventsResponse a = m6399a(accountChangeEventsRequest);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.auth.IAuthManagerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
