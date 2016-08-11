package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEventsRequest implements SafeParcelable {
    public static final C0600b CREATOR;
    final int f6120a;
    int f6121b;
    String f6122c;

    static {
        CREATOR = new C0600b();
    }

    public AccountChangeEventsRequest() {
        this.f6120a = 1;
    }

    AccountChangeEventsRequest(int i, int i2, String str) {
        this.f6120a = i;
        this.f6121b = i2;
        this.f6122c = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0600b.m4918a(this, parcel, i);
    }
}
