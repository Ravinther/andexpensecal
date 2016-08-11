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

public class go implements Creator<ea> {
    static void m5609a(ea eaVar, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, eaVar.f6490a);
        C0623c.m4978a(parcel, 3, eaVar.m5412b(), false);
        C0623c.m4978a(parcel, 4, eaVar.m5413c(), false);
        C0623c.m4978a(parcel, 5, eaVar.m5414d(), false);
        C0623c.m4978a(parcel, 6, eaVar.m5411a(), false);
        C0623c.m4974a(parcel, a);
    }

    public ea m5610a(Parcel parcel) {
        IBinder iBinder = null;
        int b = C0621a.m4962b(parcel);
        int i = 0;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    iBinder4 = C0621a.m4970g(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    iBinder3 = C0621a.m4970g(parcel, a);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    iBinder2 = C0621a.m4970g(parcel, a);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    iBinder = C0621a.m4970g(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ea(i, iBinder4, iBinder3, iBinder2, iBinder);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public ea[] m5611a(int i) {
        return new ea[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5610a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m5611a(i);
    }
}
