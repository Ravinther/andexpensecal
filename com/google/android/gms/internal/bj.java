package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@id
public final class bj implements SafeParcelable {
    public static final bq CREATOR;
    public final int f6270a;
    public final int f6271b;
    public final int f6272c;
    public final int f6273d;
    public final int f6274e;
    public final int f6275f;
    public final int f6276g;
    public final int f6277h;
    public final int f6278i;
    public final String f6279j;
    public final int f6280k;
    public final String f6281l;
    public final int f6282m;
    public final int f6283n;
    public final String f6284o;

    static {
        CREATOR = new bq();
    }

    bj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.f6270a = i;
        this.f6271b = i2;
        this.f6272c = i3;
        this.f6273d = i4;
        this.f6274e = i5;
        this.f6275f = i6;
        this.f6276g = i7;
        this.f6277h = i8;
        this.f6278i = i9;
        this.f6279j = str;
        this.f6280k = i10;
        this.f6281l = str2;
        this.f6282m = i11;
        this.f6283n = i12;
        this.f6284o = str3;
    }

    public bj(SearchAdRequest searchAdRequest) {
        this.f6270a = 1;
        this.f6271b = searchAdRequest.getAnchorTextColor();
        this.f6272c = searchAdRequest.getBackgroundColor();
        this.f6273d = searchAdRequest.getBackgroundGradientBottom();
        this.f6274e = searchAdRequest.getBackgroundGradientTop();
        this.f6275f = searchAdRequest.getBorderColor();
        this.f6276g = searchAdRequest.getBorderThickness();
        this.f6277h = searchAdRequest.getBorderType();
        this.f6278i = searchAdRequest.getCallButtonColor();
        this.f6279j = searchAdRequest.getCustomChannels();
        this.f6280k = searchAdRequest.getDescriptionTextColor();
        this.f6281l = searchAdRequest.getFontFace();
        this.f6282m = searchAdRequest.getHeaderTextColor();
        this.f6283n = searchAdRequest.getHeaderTextSize();
        this.f6284o = searchAdRequest.getQuery();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bq.m5210a(this, parcel, i);
    }
}
