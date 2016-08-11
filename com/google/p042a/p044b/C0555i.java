package com.google.p042a.p044b;

import com.google.android.gms.ads.AdRequest;

/* renamed from: com.google.a.b.i */
final class C0555i {
    private final String[] f5966a;

    C0555i() {
        this.f5966a = new String[AdRequest.MAX_CONTENT_URL_LENGTH];
    }

    public String m4812a(char[] cArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        for (i3 = i; i3 < i + i2; i3++) {
            i5 = (i5 * 31) + cArr[i3];
        }
        i3 = ((i5 >>> 20) ^ (i5 >>> 12)) ^ i5;
        i5 = (this.f5966a.length - 1) & (i3 ^ ((i3 >>> 7) ^ (i3 >>> 4)));
        String str = this.f5966a[i5];
        if (str == null || str.length() != i2) {
            str = new String(cArr, i, i2);
            this.f5966a[i5] = str;
            return str;
        }
        while (i4 < i2) {
            if (str.charAt(i4) != cArr[i + i4]) {
                str = new String(cArr, i, i2);
                this.f5966a[i5] = str;
                return str;
            }
            i4++;
        }
        return str;
    }
}
