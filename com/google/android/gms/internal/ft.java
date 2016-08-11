package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

public class ft implements Creator<C0631do> {
    static void m5520a(C0631do c0631do, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, c0631do.f6419a);
        C0623c.m4980a(parcel, 2, c0631do.f6420b, false);
        C0623c.m4980a(parcel, 3, c0631do.f6421c, false);
        C0623c.m4980a(parcel, 4, c0631do.f6422d, false);
        C0623c.m4980a(parcel, 5, c0631do.f6423e, false);
        C0623c.m4980a(parcel, 6, c0631do.f6424f, false);
        C0623c.m4980a(parcel, 7, c0631do.f6425g, false);
        C0623c.m4980a(parcel, 8, c0631do.f6426h, false);
        C0623c.m4974a(parcel, a);
    }

    public C0631do m5521a(Parcel parcel) {
        String str = null;
        int b = C0621a.m4962b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    str7 = C0621a.m4969f(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    str6 = C0621a.m4969f(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    str5 = C0621a.m4969f(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    str4 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    str3 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    str2 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0631do(i, str7, str6, str5, str4, str3, str2, str);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public C0631do[] m5522a(int i) {
        return new C0631do[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5521a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5522a(i);
    }
}
