package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

/* renamed from: com.google.android.gms.auth.a */
public class C0599a implements Creator<AccountChangeEvent> {
    static void m4915a(AccountChangeEvent accountChangeEvent, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, accountChangeEvent.f6114a);
        C0623c.m4976a(parcel, 2, accountChangeEvent.f6115b);
        C0623c.m4980a(parcel, 3, accountChangeEvent.f6116c, false);
        C0623c.m4975a(parcel, 4, accountChangeEvent.f6117d);
        C0623c.m4975a(parcel, 5, accountChangeEvent.f6118e);
        C0623c.m4980a(parcel, 6, accountChangeEvent.f6119f, false);
        C0623c.m4974a(parcel, a);
    }

    public AccountChangeEvent m4916a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = C0621a.m4962b(parcel);
        long j = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i3 = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    j = C0621a.m4968e(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    str2 = C0621a.m4969f(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEvent(i3, j, str2, i2, i, str);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public AccountChangeEvent[] m4917a(int i) {
        return new AccountChangeEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4916a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4917a(i);
    }
}
