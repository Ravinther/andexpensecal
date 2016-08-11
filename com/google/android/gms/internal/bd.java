package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.p046a.C0582a;

public abstract class bd extends Binder implements bc {
    public bd() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static bc m5114a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof bc)) ? new be(iBinder) : (bc) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ay ayVar = null;
        int i3 = 0;
        boolean c;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                IBinder asBinder;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                C0582a a = m5097a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5105b();
                parcel2.writeNoException();
                return true;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                c = m5106c();
                parcel2.writeNoException();
                parcel2.writeInt(c ? 1 : 0);
                return true;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                av a2;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0) {
                    a2 = av.CREATOR.m5067a(parcel);
                }
                c = m5104a(a2);
                parcel2.writeNoException();
                if (c) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5107d();
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5108e();
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5099a(ba.m5056a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5100a(bk.m5075a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5109f();
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerPadding /*10*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5110g();
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_linePosition /*11*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5111h();
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_selectedBold /*12*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                ayVar = m5112i();
                parcel2.writeNoException();
                if (ayVar != null) {
                    parcel2.writeInt(1);
                    ayVar.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case adv.TitlePageIndicator_titlePadding /*13*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0) {
                    ayVar = ay.CREATOR.m5072a(parcel);
                }
                m5098a(ayVar);
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_topPadding /*14*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5102a(hi.m5718a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5103a(hu.m5733a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                String j = m5113j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m5101a(ca.m5245a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
