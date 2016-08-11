package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0583b;

public abstract class ei extends Binder implements eh {
    public ei() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static eh m5435a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof eh)) ? new ej(iBinder) : (eh) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        av avVar = null;
        C0582a a;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m5429a(C0583b.m4877a(parcel.readStrongBinder()), parcel.readInt() != 0 ? ay.CREATOR.m5072a(parcel) : null, parcel.readInt() != 0 ? av.CREATOR.m5067a(parcel) : null, parcel.readString(), el.m5385a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                IBinder asBinder;
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = m5426a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0583b.m4877a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    avVar = av.CREATOR.m5067a(parcel);
                }
                m5427a(a, avVar, parcel.readString(), el.m5385a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m5431b();
                parcel2.writeNoException();
                return true;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m5432c();
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m5430a(C0583b.m4877a(parcel.readStrongBinder()), parcel.readInt() != 0 ? ay.CREATOR.m5072a(parcel) : null, parcel.readInt() != 0 ? av.CREATOR.m5067a(parcel) : null, parcel.readString(), parcel.readString(), el.m5385a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m5428a(C0583b.m4877a(parcel.readStrongBinder()), parcel.readInt() != 0 ? av.CREATOR.m5067a(parcel) : null, parcel.readString(), parcel.readString(), el.m5385a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m5433d();
                parcel2.writeNoException();
                return true;
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m5434e();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
