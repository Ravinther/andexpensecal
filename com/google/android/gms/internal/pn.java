package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

public class pn implements Creator<C0652y> {
    static void m6492a(C0652y c0652y, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, c0652y.f7350a);
        C0623c.m4982a(parcel, 2, c0652y.f7351b);
        C0623c.m4982a(parcel, 3, c0652y.f7352c);
        C0623c.m4974a(parcel, a);
    }

    public C0652y m6493a(Parcel parcel) {
        boolean z = false;
        int b = C0621a.m4962b(parcel);
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    z2 = C0621a.m4966c(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    z = C0621a.m4966c(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0652y(i, z2, z);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public C0652y[] m6494a(int i) {
        return new C0652y[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6493a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6494a(i);
    }
}
