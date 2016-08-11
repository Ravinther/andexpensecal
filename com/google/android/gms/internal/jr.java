package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;
import java.util.List;

public class jr implements Creator<fh> {
    static void m5834a(fh fhVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, fhVar.f6538a);
        C0623c.m4977a(parcel, 2, fhVar.f6539b, false);
        C0623c.m4979a(parcel, 3, fhVar.f6540c, i, false);
        C0623c.m4979a(parcel, 4, fhVar.f6541d, i, false);
        C0623c.m4980a(parcel, 5, fhVar.f6542e, false);
        C0623c.m4979a(parcel, 6, fhVar.f6543f, i, false);
        C0623c.m4979a(parcel, 7, fhVar.f6544g, i, false);
        C0623c.m4980a(parcel, 8, fhVar.f6545h, false);
        C0623c.m4980a(parcel, 9, fhVar.f6546i, false);
        C0623c.m4980a(parcel, 10, fhVar.f6547j, false);
        C0623c.m4979a(parcel, 11, fhVar.f6548k, i, false);
        C0623c.m4977a(parcel, 12, fhVar.f6549l, false);
        C0623c.m4975a(parcel, 13, fhVar.f6550m);
        C0623c.m4981a(parcel, 14, fhVar.f6551n, false);
        C0623c.m4977a(parcel, 15, fhVar.f6552o, false);
        C0623c.m4982a(parcel, 16, fhVar.f6553p);
        C0623c.m4974a(parcel, a);
    }

    public fh m5835a(Parcel parcel) {
        int b = C0621a.m4962b(parcel);
        int i = 0;
        Bundle bundle = null;
        av avVar = null;
        ay ayVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        gs gsVar = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    bundle = C0621a.m4971h(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    avVar = (av) C0621a.m4960a(parcel, a, av.CREATOR);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    ayVar = (ay) C0621a.m4960a(parcel, a, ay.CREATOR);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    applicationInfo = (ApplicationInfo) C0621a.m4960a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    packageInfo = (PackageInfo) C0621a.m4960a(parcel, a, PackageInfo.CREATOR);
                    break;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    str2 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    str3 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    str4 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_linePosition /*11*/:
                    gsVar = (gs) C0621a.m4960a(parcel, a, gs.CREATOR);
                    break;
                case adv.TitlePageIndicator_selectedBold /*12*/:
                    bundle2 = C0621a.m4971h(parcel, a);
                    break;
                case adv.TitlePageIndicator_titlePadding /*13*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_topPadding /*14*/:
                    list = C0621a.m4972i(parcel, a);
                    break;
                case 15:
                    bundle3 = C0621a.m4971h(parcel, a);
                    break;
                case 16:
                    z = C0621a.m4966c(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new fh(i, bundle, avVar, ayVar, str, applicationInfo, packageInfo, str2, str3, str4, gsVar, bundle2, i2, list, bundle3, z);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public fh[] m5836a(int i) {
        return new fh[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5835a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5836a(i);
    }
}
