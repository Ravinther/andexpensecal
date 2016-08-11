package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@id
/* renamed from: com.google.android.gms.internal.do */
public final class C0631do implements SafeParcelable {
    public static final ft CREATOR;
    public final int f6419a;
    public final String f6420b;
    public final String f6421c;
    public final String f6422d;
    public final String f6423e;
    public final String f6424f;
    public final String f6425g;
    public final String f6426h;

    static {
        CREATOR = new ft();
    }

    public C0631do(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f6419a = i;
        this.f6420b = str;
        this.f6421c = str2;
        this.f6422d = str3;
        this.f6423e = str4;
        this.f6424f = str5;
        this.f6425g = str6;
        this.f6426h = str7;
    }

    public C0631do(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(1, str, str2, str3, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ft.m5520a(this, parcel, i);
    }
}
