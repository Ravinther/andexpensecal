package com.google.android.gms.auth;

import android.os.Parcel;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ny;
import com.google.android.gms.internal.ob;

public class AccountChangeEvent implements SafeParcelable {
    public static final C0599a CREATOR;
    final int f6114a;
    final long f6115b;
    final String f6116c;
    final int f6117d;
    final int f6118e;
    final String f6119f;

    static {
        CREATOR = new C0599a();
    }

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f6114a = i;
        this.f6115b = j;
        this.f6116c = (String) ob.m6315a((Object) str);
        this.f6117d = i2;
        this.f6118e = i3;
        this.f6119f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f6114a == accountChangeEvent.f6114a && this.f6115b == accountChangeEvent.f6115b && ny.m6312a(this.f6116c, accountChangeEvent.f6116c) && this.f6117d == accountChangeEvent.f6117d && this.f6118e == accountChangeEvent.f6118e && ny.m6312a(this.f6119f, accountChangeEvent.f6119f);
    }

    public int hashCode() {
        return ny.m6310a(Integer.valueOf(this.f6114a), Long.valueOf(this.f6115b), this.f6116c, Integer.valueOf(this.f6117d), Integer.valueOf(this.f6118e), this.f6119f);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.f6117d) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                str = "ADDED";
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                str = "REMOVED";
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                str = "RENAMED_FROM";
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                str = "RENAMED_TO";
                break;
        }
        return "AccountChangeEvent {accountName = " + this.f6116c + ", changeType = " + str + ", changeData = " + this.f6119f + ", eventIndex = " + this.f6118e + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0599a.m4915a(this, parcel, i);
    }
}
