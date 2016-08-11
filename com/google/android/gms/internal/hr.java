package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

public abstract class hr extends Binder implements hq {
    public hr() {
        attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
    }

    public static hq m5659a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hq)) ? new hs(iBinder) : (hq) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                String b = m5655b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                Intent c = m5656c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                i3 = m5657d();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                boolean a = m5654a();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                m5658e();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
