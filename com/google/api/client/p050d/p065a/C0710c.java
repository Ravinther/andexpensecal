package com.google.api.client.p050d.p065a;

/* renamed from: com.google.api.client.d.a.c */
public class C0710c extends C0709f {
    private static final char[] f7562a;
    private static final char[] f7563b;
    private final boolean f7564c;
    private final boolean[] f7565d;

    static {
        f7562a = new char[]{'+'};
        f7563b = "0123456789ABCDEF".toCharArray();
    }

    public C0710c(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        } else {
            this.f7564c = z;
            this.f7565d = C0710c.m6879b(str);
        }
    }

    private static boolean[] m6879b(String str) {
        int i;
        int i2 = 0;
        char[] toCharArray = str.toCharArray();
        int i3 = 122;
        for (char max : toCharArray) {
            i3 = Math.max(max, i3);
        }
        boolean[] zArr = new boolean[(i3 + 1)];
        for (i = 48; i <= 57; i++) {
            zArr[i] = true;
        }
        for (i = 65; i <= 90; i++) {
            zArr[i] = true;
        }
        for (i = 97; i <= 122; i++) {
            zArr[i] = true;
        }
        i = toCharArray.length;
        while (i2 < i) {
            zArr[toCharArray[i2]] = true;
            i2++;
        }
        return zArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int m6880a(java.lang.CharSequence r3, int r4, int r5) {
        /*
        r2 = this;
    L_0x0000:
        if (r4 >= r5) goto L_0x0011;
    L_0x0002:
        r0 = r3.charAt(r4);
        r1 = r2.f7565d;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0011;
    L_0x000b:
        r1 = r2.f7565d;
        r0 = r1[r0];
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        return r4;
    L_0x0012:
        r4 = r4 + 1;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.d.a.c.a(java.lang.CharSequence, int, int):int");
    }

    public String m6881a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= this.f7565d.length || !this.f7565d[charAt]) {
                return m6877a(str, i);
            }
        }
        return str;
    }

    protected char[] m6882a(int i) {
        if (i < this.f7565d.length && this.f7565d[i]) {
            return null;
        }
        if (i == 32 && this.f7564c) {
            return f7562a;
        }
        if (i <= 127) {
            return new char[]{'%', f7563b[i & 15], f7563b[i >>> 4]};
        } else if (i <= 2047) {
            r0 = new char[6];
            r0[0] = '%';
            r0[3] = '%';
            r0[5] = f7563b[i & 15];
            r1 = i >>> 4;
            r0[4] = f7563b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[2] = f7563b[r1 & 15];
            r0[1] = f7563b[(r1 >>> 4) | 12];
            return r0;
        } else if (i <= 65535) {
            r0 = new char[9];
            r1 = i >>> 4;
            r0[7] = f7563b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[5] = f7563b[r1 & 15];
            r1 >>>= 4;
            r0[4] = f7563b[(r1 & 3) | 8];
            r0[2] = f7563b[r1 >>> 2];
            return r0;
        } else if (i <= 1114111) {
            r0 = new char[12];
            r1 = i >>> 4;
            r0[10] = f7563b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[8] = f7563b[r1 & 15];
            r1 >>>= 4;
            r0[7] = f7563b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[5] = f7563b[r1 & 15];
            r1 >>>= 4;
            r0[4] = f7563b[(r1 & 3) | 8];
            r0[2] = f7563b[(r1 >>> 2) & 7];
            return r0;
        } else {
            throw new IllegalArgumentException("Invalid unicode character value " + i);
        }
    }
}
