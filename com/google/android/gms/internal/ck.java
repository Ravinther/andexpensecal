package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.p046a.C0582a;

public abstract class ck extends Binder implements cj {
    public ck() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        String a;
        C0582a b;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                m5271a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                m5277g();
                parcel2.writeNoException();
                return true;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m5270a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                b = m5272b();
                parcel2.writeNoException();
                if (b != null) {
                    iBinder = b.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m5273c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                b = m5274d();
                parcel2.writeNoException();
                if (b != null) {
                    iBinder = b.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m5275e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m5276f();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
