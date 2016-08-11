package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0607c;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;
import java.util.List;

/* renamed from: com.google.android.gms.auth.c */
public class C0601c implements Creator<AccountChangeEventsResponse> {
    static void m4921a(AccountChangeEventsResponse accountChangeEventsResponse, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, accountChangeEventsResponse.f6123a);
        C0623c.m4987b(parcel, 2, accountChangeEventsResponse.f6124b, false);
        C0623c.m4974a(parcel, a);
    }

    public AccountChangeEventsResponse m4922a(Parcel parcel) {
        int b = C0621a.m4962b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    list = C0621a.m4965c(parcel, a, AccountChangeEvent.CREATOR);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsResponse(i, list);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public AccountChangeEventsResponse[] m4923a(int i) {
        return new AccountChangeEventsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4922a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4923a(i);
    }
}
