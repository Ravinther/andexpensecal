package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

public class bq implements Creator<bj> {
    static void m5210a(bj bjVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, bjVar.f6270a);
        C0623c.m4975a(parcel, 2, bjVar.f6271b);
        C0623c.m4975a(parcel, 3, bjVar.f6272c);
        C0623c.m4975a(parcel, 4, bjVar.f6273d);
        C0623c.m4975a(parcel, 5, bjVar.f6274e);
        C0623c.m4975a(parcel, 6, bjVar.f6275f);
        C0623c.m4975a(parcel, 7, bjVar.f6276g);
        C0623c.m4975a(parcel, 8, bjVar.f6277h);
        C0623c.m4975a(parcel, 9, bjVar.f6278i);
        C0623c.m4980a(parcel, 10, bjVar.f6279j, false);
        C0623c.m4975a(parcel, 11, bjVar.f6280k);
        C0623c.m4980a(parcel, 12, bjVar.f6281l, false);
        C0623c.m4975a(parcel, 13, bjVar.f6282m);
        C0623c.m4975a(parcel, 14, bjVar.f6283n);
        C0623c.m4980a(parcel, 15, bjVar.f6284o, false);
        C0623c.m4974a(parcel, a);
    }

    public bj m5211a(Parcel parcel) {
        int b = C0621a.m4962b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    i4 = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    i5 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    i6 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    i7 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    i8 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    i9 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_linePosition /*11*/:
                    i10 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_selectedBold /*12*/:
                    str2 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_titlePadding /*13*/:
                    i11 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_topPadding /*14*/:
                    i12 = C0621a.m4967d(parcel, a);
                    break;
                case 15:
                    str3 = C0621a.m4969f(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bj(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public bj[] m5212a(int i) {
        return new bj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5211a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5212a(i);
    }
}
