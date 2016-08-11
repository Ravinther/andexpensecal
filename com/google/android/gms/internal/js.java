package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;
import java.util.List;

public class js implements Creator<fj> {
    static void m5837a(fj fjVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, fjVar.f6555a);
        C0623c.m4980a(parcel, 2, fjVar.f6556b, false);
        C0623c.m4980a(parcel, 3, fjVar.f6557c, false);
        C0623c.m4981a(parcel, 4, fjVar.f6558d, false);
        C0623c.m4975a(parcel, 5, fjVar.f6559e);
        C0623c.m4981a(parcel, 6, fjVar.f6560f, false);
        C0623c.m4976a(parcel, 7, fjVar.f6561g);
        C0623c.m4982a(parcel, 8, fjVar.f6562h);
        C0623c.m4976a(parcel, 9, fjVar.f6563i);
        C0623c.m4981a(parcel, 10, fjVar.f6564j, false);
        C0623c.m4976a(parcel, 11, fjVar.f6565k);
        C0623c.m4975a(parcel, 12, fjVar.f6566l);
        C0623c.m4980a(parcel, 13, fjVar.f6567m, false);
        C0623c.m4976a(parcel, 14, fjVar.f6568n);
        C0623c.m4980a(parcel, 15, fjVar.f6569o, false);
        C0623c.m4980a(parcel, 19, fjVar.f6571q, false);
        C0623c.m4982a(parcel, 18, fjVar.f6570p);
        C0623c.m4980a(parcel, 21, fjVar.f6572r, false);
        C0623c.m4982a(parcel, 23, fjVar.f6574t);
        C0623c.m4982a(parcel, 22, fjVar.f6573s);
        C0623c.m4982a(parcel, 25, fjVar.f6576v);
        C0623c.m4982a(parcel, 24, fjVar.f6575u);
        C0623c.m4974a(parcel, a);
    }

    public fj m5838a(Parcel parcel) {
        int b = C0621a.m4962b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    str2 = C0621a.m4969f(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    list = C0621a.m4972i(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    list2 = C0621a.m4972i(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    j = C0621a.m4968e(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    z = C0621a.m4966c(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    j2 = C0621a.m4968e(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    list3 = C0621a.m4972i(parcel, a);
                    break;
                case adv.TitlePageIndicator_linePosition /*11*/:
                    j3 = C0621a.m4968e(parcel, a);
                    break;
                case adv.TitlePageIndicator_selectedBold /*12*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_titlePadding /*13*/:
                    str3 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_topPadding /*14*/:
                    j4 = C0621a.m4968e(parcel, a);
                    break;
                case 15:
                    str4 = C0621a.m4969f(parcel, a);
                    break;
                case 18:
                    z2 = C0621a.m4966c(parcel, a);
                    break;
                case 19:
                    str5 = C0621a.m4969f(parcel, a);
                    break;
                case 21:
                    str6 = C0621a.m4969f(parcel, a);
                    break;
                case 22:
                    z3 = C0621a.m4966c(parcel, a);
                    break;
                case 23:
                    z4 = C0621a.m4966c(parcel, a);
                    break;
                case 24:
                    z5 = C0621a.m4966c(parcel, a);
                    break;
                case 25:
                    z6 = C0621a.m4966c(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new fj(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public fj[] m5839a(int i) {
        return new fj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5838a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5839a(i);
    }
}
