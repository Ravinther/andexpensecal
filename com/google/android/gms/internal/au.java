package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

public class au implements Creator<ay> {
    static void m5071a(ay ayVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, ayVar.f6253a);
        C0623c.m4980a(parcel, 2, ayVar.f6254b, false);
        C0623c.m4975a(parcel, 3, ayVar.f6255c);
        C0623c.m4975a(parcel, 4, ayVar.f6256d);
        C0623c.m4982a(parcel, 5, ayVar.f6257e);
        C0623c.m4975a(parcel, 6, ayVar.f6258f);
        C0623c.m4975a(parcel, 7, ayVar.f6259g);
        C0623c.m4983a(parcel, 8, ayVar.f6260h, i, false);
        C0623c.m4974a(parcel, a);
    }

    public ay m5072a(Parcel parcel) {
        ay[] ayVarArr = null;
        int i = 0;
        int b = C0621a.m4962b(parcel);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i5 = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    i4 = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    z = C0621a.m4966c(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    ayVarArr = (ay[]) C0621a.m4964b(parcel, a, ay.CREATOR);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ay(i5, str, i4, i3, z, i2, i, ayVarArr);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public ay[] m5073a(int i) {
        return new ay[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5072a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5073a(i);
    }
}
