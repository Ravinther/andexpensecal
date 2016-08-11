package com.google.android.gms.internal;

import android.location.Location;
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

public class as implements Creator<av> {
    static void m5066a(av avVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, avVar.f6237a);
        C0623c.m4976a(parcel, 2, avVar.f6238b);
        C0623c.m4977a(parcel, 3, avVar.f6239c, false);
        C0623c.m4975a(parcel, 4, avVar.f6240d);
        C0623c.m4981a(parcel, 5, avVar.f6241e, false);
        C0623c.m4982a(parcel, 6, avVar.f6242f);
        C0623c.m4975a(parcel, 7, avVar.f6243g);
        C0623c.m4982a(parcel, 8, avVar.f6244h);
        C0623c.m4980a(parcel, 9, avVar.f6245i, false);
        C0623c.m4979a(parcel, 10, avVar.f6246j, i, false);
        C0623c.m4979a(parcel, 11, avVar.f6247k, i, false);
        C0623c.m4980a(parcel, 12, avVar.f6248l, false);
        C0623c.m4977a(parcel, 13, avVar.f6249m, false);
        C0623c.m4974a(parcel, a);
    }

    public av m5067a(Parcel parcel) {
        int b = C0621a.m4962b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        bj bjVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    j = C0621a.m4968e(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    bundle = C0621a.m4971h(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    list = C0621a.m4972i(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    z = C0621a.m4966c(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    z2 = C0621a.m4966c(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    bjVar = (bj) C0621a.m4960a(parcel, a, bj.CREATOR);
                    break;
                case adv.TitlePageIndicator_linePosition /*11*/:
                    location = (Location) C0621a.m4960a(parcel, a, Location.CREATOR);
                    break;
                case adv.TitlePageIndicator_selectedBold /*12*/:
                    str2 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_titlePadding /*13*/:
                    bundle2 = C0621a.m4971h(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new av(i, j, bundle, i2, list, z, i3, z2, str, bjVar, location, str2, bundle2);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public av[] m5068a(int i) {
        return new av[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5067a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5068a(i);
    }
}
