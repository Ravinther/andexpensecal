package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

/* renamed from: com.google.android.gms.auth.b */
public class C0600b implements Creator<AccountChangeEventsRequest> {
    static void m4918a(AccountChangeEventsRequest accountChangeEventsRequest, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, accountChangeEventsRequest.f6120a);
        C0623c.m4975a(parcel, 2, accountChangeEventsRequest.f6121b);
        C0623c.m4980a(parcel, 3, accountChangeEventsRequest.f6122c, false);
        C0623c.m4974a(parcel, a);
    }

    public AccountChangeEventsRequest m4919a(Parcel parcel) {
        int i = 0;
        int b = C0621a.m4962b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i2 = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsRequest(i2, i, str);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public AccountChangeEventsRequest[] m4920a(int i) {
        return new AccountChangeEventsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4919a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4920a(i);
    }
}
