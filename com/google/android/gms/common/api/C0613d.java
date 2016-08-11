package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0607c;
import com.google.android.gms.common.internal.safeparcel.C0621a;
import com.google.android.gms.common.internal.safeparcel.C0622b;
import com.google.android.gms.common.internal.safeparcel.C0623c;

/* renamed from: com.google.android.gms.common.api.d */
public class C0613d implements Creator<Scope> {
    static void m4938a(Scope scope, Parcel parcel, int i) {
        int a = C0623c.m4973a(parcel);
        C0623c.m4975a(parcel, 1, scope.f6134a);
        C0623c.m4980a(parcel, 2, scope.m4934a(), false);
        C0623c.m4974a(parcel, a);
    }

    public Scope m4939a(Parcel parcel) {
        int b = C0621a.m4962b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C0621a.m4958a(parcel);
            switch (C0621a.m4957a(a)) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    i = C0621a.m4967d(parcel, a);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    str = C0621a.m4969f(parcel, a);
                    break;
                default:
                    C0621a.m4963b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Scope(i, str);
        }
        throw new C0622b("Overread allowed size end=" + b, parcel);
    }

    public Scope[] m4940a(int i) {
        return new Scope[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4939a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4940a(i);
    }
}
