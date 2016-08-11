package com.google.android.gms.internal;

import java.security.MessageDigest;

public class an extends ai {
    private MessageDigest f6231b;

    byte m5042a(int i) {
        return (byte) ((((i & 255) ^ ((65280 & i) >> 8)) ^ ((16711680 & i) >> 16)) ^ ((-16777216 & i) >> 24));
    }

    public byte[] m5043a(String str) {
        byte[] a = m5044a(str.split(" "));
        this.f6231b = m5031a();
        synchronized (this.a) {
            if (this.f6231b == null) {
                a = new byte[0];
            } else {
                this.f6231b.reset();
                this.f6231b.update(a);
                Object digest = this.f6231b.digest();
                int i = 4;
                if (digest.length <= 4) {
                    i = digest.length;
                }
                a = new byte[i];
                System.arraycopy(digest, 0, a, 0, a.length);
            }
        }
        return a;
    }

    byte[] m5044a(String[] strArr) {
        byte[] bArr = new byte[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            bArr[i] = m5042a(am.m5038a(strArr[i]));
        }
        return bArr;
    }
}
