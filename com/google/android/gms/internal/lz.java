package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

public class lz implements Creator<gs> {
    static void m6075a(gs gsVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, gsVar.f6667a);
        C0623c.m4980a(parcel, 2, gsVar.f6668b, false);
        C0623c.m4975a(parcel, 3, gsVar.f6669c);
        C0623c.m4975a(parcel, 4, gsVar.f6670d);
        C0623c.m4982a(parcel, 5, gsVar.f6671e);
        C0623c.m4974a(parcel, a);
    }

    public gs m6076a(Parcel parcel) {
        boolean z = false;
        int b = C0621a.m4962b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    z = C0621a.m4966c(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new gs(i3, str, i2, i, z);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public gs[] m6077a(int i) {
        return new gs[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6076a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6077a(i);
    }
}
