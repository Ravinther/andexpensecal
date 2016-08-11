package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

public class ne implements Creator<jj> {
    static void m6176a(jj jjVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, jjVar.f6851a);
        C0623c.m4975a(parcel, 2, jjVar.f6852b);
        C0623c.m4975a(parcel, 3, jjVar.f6853c);
        C0623c.m4980a(parcel, 4, jjVar.f6854d, false);
        C0623c.m4978a(parcel, 5, jjVar.f6855e, false);
        C0623c.m4983a(parcel, 6, jjVar.f6856f, i, false);
        C0623c.m4977a(parcel, 7, jjVar.f6857g, false);
        C0623c.m4974a(parcel, a);
    }

    public jj m6177a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = C0621a.m4962b(parcel);
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    iBinder = C0621a.m4970g(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    scopeArr = (Scope[]) C0621a.m4964b(parcel, a, Scope.CREATOR);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    bundle = C0621a.m4971h(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new jj(i3, i2, i, str, iBinder, scopeArr, bundle);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public jj[] m6178a(int i) {
        return new jj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6177a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6178a(i);
    }
}
