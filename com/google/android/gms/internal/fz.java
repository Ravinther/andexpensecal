package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

public class fz implements Creator<dr> {
    static void m5560a(dr drVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, drVar.f6434a);
        C0623c.m4979a(parcel, 2, drVar.f6435b, i, false);
        C0623c.m4978a(parcel, 3, drVar.m5367a(), false);
        C0623c.m4978a(parcel, 4, drVar.m5368b(), false);
        C0623c.m4978a(parcel, 5, drVar.m5369c(), false);
        C0623c.m4978a(parcel, 6, drVar.m5370d(), false);
        C0623c.m4980a(parcel, 7, drVar.f6440g, false);
        C0623c.m4982a(parcel, 8, drVar.f6441h);
        C0623c.m4980a(parcel, 9, drVar.f6442i, false);
        C0623c.m4978a(parcel, 10, drVar.m5372f(), false);
        C0623c.m4975a(parcel, 11, drVar.f6444k);
        C0623c.m4975a(parcel, 12, drVar.f6445l);
        C0623c.m4980a(parcel, 13, drVar.f6446m, false);
        C0623c.m4979a(parcel, 14, drVar.f6447n, i, false);
        C0623c.m4978a(parcel, 15, drVar.m5371e(), false);
        C0623c.m4979a(parcel, 17, drVar.f6450q, i, false);
        C0623c.m4980a(parcel, 16, drVar.f6449p, false);
        C0623c.m4974a(parcel, a);
    }

    public dr m5561a(Parcel parcel) {
        int b = C0621a.m4962b(parcel);
        int i = 0;
        C0631do c0631do = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        gs gsVar = null;
        IBinder iBinder6 = null;
        String str4 = null;
        C0652y c0652y = null;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    c0631do = (C0631do) C0621a.m4960a(parcel, a, C0631do.CREATOR);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    iBinder = C0621a.m4970g(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    iBinder2 = C0621a.m4970g(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    iBinder3 = C0621a.m4970g(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    iBinder4 = C0621a.m4970g(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    z = C0621a.m4966c(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    str2 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    iBinder5 = C0621a.m4970g(parcel, a);
                    break;
                case adv.TitlePageIndicator_linePosition /*11*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_selectedBold /*12*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_titlePadding /*13*/:
                    str3 = C0621a.m4969f(parcel, a);
                    break;
                case adv.TitlePageIndicator_topPadding /*14*/:
                    gsVar = (gs) C0621a.m4960a(parcel, a, gs.CREATOR);
                    break;
                case 15:
                    iBinder6 = C0621a.m4970g(parcel, a);
                    break;
                case 16:
                    str4 = C0621a.m4969f(parcel, a);
                    break;
                case 17:
                    c0652y = (C0652y) C0621a.m4960a(parcel, a, C0652y.CREATOR);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new dr(i, c0631do, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, gsVar, iBinder6, str4, c0652y);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public dr[] m5562a(int i) {
        return new dr[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5561a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5562a(i);
    }
}
