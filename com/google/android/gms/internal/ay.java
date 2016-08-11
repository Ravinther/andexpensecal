package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.C0590a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@id
public final class ay implements SafeParcelable {
    public static final au CREATOR;
    public final int f6253a;
    public final String f6254b;
    public final int f6255c;
    public final int f6256d;
    public final boolean f6257e;
    public final int f6258f;
    public final int f6259g;
    public final ay[] f6260h;

    static {
        CREATOR = new au();
    }

    public ay() {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    ay(int i, String str, int i2, int i3, boolean z, int i4, int i5, ay[] ayVarArr) {
        this.f6253a = i;
        this.f6254b = str;
        this.f6255c = i2;
        this.f6256d = i3;
        this.f6257e = z;
        this.f6258f = i4;
        this.f6259g = i5;
        this.f6260h = ayVarArr;
    }

    public ay(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public ay(Context context, AdSize[] adSizeArr) {
        int i;
        int i2;
        int i3 = 0;
        AdSize adSize = adSizeArr[0];
        this.f6253a = 2;
        this.f6257e = false;
        this.f6258f = adSize.getWidth();
        this.f6255c = adSize.getHeight();
        int i4 = this.f6258f == -1 ? 1 : 0;
        int i5 = this.f6255c == -2 ? 1 : 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i4 != 0) {
            this.f6259g = m5080a(displayMetrics);
            i = (int) (((float) this.f6259g) / displayMetrics.density);
        } else {
            i2 = this.f6258f;
            this.f6259g = lx.m6057a(displayMetrics, this.f6258f);
            i = i2;
        }
        i2 = i5 != 0 ? m5082c(displayMetrics) : this.f6255c;
        this.f6256d = lx.m6057a(displayMetrics, i2);
        if (i4 == 0 && i5 == 0) {
            this.f6254b = adSize.toString();
        } else {
            this.f6254b = i + "x" + i2 + "_as";
        }
        if (adSizeArr.length > 1) {
            this.f6260h = new ay[adSizeArr.length];
            while (i3 < adSizeArr.length) {
                this.f6260h[i3] = new ay(context, adSizeArr[i3]);
                i3++;
            }
            return;
        }
        this.f6260h = null;
    }

    public ay(ay ayVar, ay[] ayVarArr) {
        this(2, ayVar.f6254b, ayVar.f6255c, ayVar.f6256d, ayVar.f6257e, ayVar.f6258f, ayVar.f6259g, ayVarArr);
    }

    public static int m5080a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int m5081b(DisplayMetrics displayMetrics) {
        return (int) (((float) m5082c(displayMetrics)) * displayMetrics.density);
    }

    private static int m5082c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public AdSize m5083a() {
        return C0590a.m4885a(this.f6258f, this.f6255c, this.f6254b);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        au.m5071a(this, parcel, i);
    }
}
