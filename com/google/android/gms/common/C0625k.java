package com.google.android.gms.common;

import java.util.Comparator;

/* renamed from: com.google.android.gms.common.k */
final class C0625k implements Comparator<byte[]> {
    C0625k() {
    }

    public int m4994a(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 != i3) {
                return i2 - i3;
            }
        }
        return bArr.length - bArr2.length;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m4994a((byte[]) obj, (byte[]) obj2);
    }
}
