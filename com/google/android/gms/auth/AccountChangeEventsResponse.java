package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ob;
import java.util.List;

public class AccountChangeEventsResponse implements SafeParcelable {
    public static final C0601c CREATOR;
    final int f6123a;
    final List<AccountChangeEvent> f6124b;

    static {
        CREATOR = new C0601c();
    }

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f6123a = i;
        this.f6124b = (List) ob.m6315a((Object) list);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0601c.m4921a(this, parcel, i);
    }
}
