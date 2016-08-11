package com.expensemanager;

/* renamed from: com.expensemanager.f */
public class C0445f {
    private static final String f4618a;
    private static final char[] f4619b;
    private static final byte[] f4620c;

    static {
        int i;
        int i2 = 0;
        f4618a = System.getProperty("line.separator");
        f4619b = new char[64];
        char c = 'A';
        int i3 = 0;
        while (c <= 'Z') {
            i = i3 + 1;
            f4619b[i3] = c;
            c = (char) (c + 1);
            i3 = i;
        }
        c = 'a';
        while (c <= 'z') {
            i = i3 + 1;
            f4619b[i3] = c;
            c = (char) (c + 1);
            i3 = i;
        }
        c = '0';
        while (c <= '9') {
            i = i3 + 1;
            f4619b[i3] = c;
            c = (char) (c + 1);
            i3 = i;
        }
        i = i3 + 1;
        f4619b[i3] = '+';
        i3 = i + 1;
        f4619b[i] = '/';
        f4620c = new byte[128];
        for (int i4 = 0; i4 < f4620c.length; i4++) {
            f4620c[i4] = (byte) -1;
        }
        while (i2 < 64) {
            f4620c[f4619b[i2]] = (byte) i2;
            i2++;
        }
    }

    public static String m4101a(String str) {
        return new String(C0445f.m4104a(str.getBytes()));
    }

    public static byte[] m4102a(char[] cArr) {
        return C0445f.m4103a(cArr, 0, cArr.length);
    }

    public static byte[] m4103a(char[] cArr, int i, int i2) {
        if (i2 % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
            i2--;
        }
        int i3 = (i2 * 3) / 4;
        byte[] bArr = new byte[i3];
        int i4 = i + i2;
        int i5 = 0;
        while (i < i4) {
            int i6;
            int i7;
            int i8 = i + 1;
            char c = cArr[i];
            int i9 = i8 + 1;
            char c2 = cArr[i8];
            if (i9 < i4) {
                i8 = i9 + 1;
                i6 = cArr[i9];
                i9 = i8;
            } else {
                i6 = 65;
            }
            if (i9 < i4) {
                i8 = i9 + 1;
                i9 = cArr[i9];
                i7 = i8;
            } else {
                i7 = i9;
                i9 = 65;
            }
            if (c > '\u007f' || c2 > '\u007f' || i6 > 127 || i9 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte b = f4620c[c];
            byte b2 = f4620c[c2];
            byte b3 = f4620c[i6];
            byte b4 = f4620c[i9];
            if (b < null || b2 < null || b3 < null || b4 < null) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            i8 = (b << 2) | (b2 >>> 4);
            int i10 = ((b2 & 15) << 4) | (b3 >>> 2);
            i6 = ((b3 & 3) << 6) | b4;
            i9 = i5 + 1;
            bArr[i5] = (byte) i8;
            if (i9 < i3) {
                i8 = i9 + 1;
                bArr[i9] = (byte) i10;
            } else {
                i8 = i9;
            }
            if (i8 < i3) {
                i9 = i8 + 1;
                bArr[i8] = (byte) i6;
            } else {
                i9 = i8;
            }
            i5 = i9;
            i = i7;
        }
        return bArr;
    }

    public static char[] m4104a(byte[] bArr) {
        return C0445f.m4105a(bArr, 0, bArr.length);
    }

    public static char[] m4105a(byte[] bArr, int i, int i2) {
        int i3 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[(((i2 + 2) / 3) * 4)];
        int i4 = i + i2;
        int i5 = 0;
        while (i < i4) {
            int i6;
            int i7;
            int i8 = i + 1;
            int i9 = bArr[i] & 255;
            if (i8 < i4) {
                i6 = bArr[i8] & 255;
                i8++;
            } else {
                i6 = 0;
            }
            if (i8 < i4) {
                i7 = i8 + 1;
                i8 = bArr[i8] & 255;
            } else {
                i7 = i8;
                i8 = 0;
            }
            int i10 = i9 >>> 2;
            i9 = ((i9 & 3) << 4) | (i6 >>> 4);
            i6 = ((i6 & 15) << 2) | (i8 >>> 6);
            int i11 = i8 & 63;
            i8 = i5 + 1;
            cArr[i5] = f4619b[i10];
            i5 = i8 + 1;
            cArr[i8] = f4619b[i9];
            cArr[i5] = i5 < i3 ? f4619b[i6] : '=';
            i6 = i5 + 1;
            cArr[i6] = i6 < i3 ? f4619b[i11] : '=';
            i5 = i6 + 1;
            i = i7;
        }
        return cArr;
    }

    public static String m4106b(String str) {
        return new String(C0445f.m4107c(str));
    }

    public static byte[] m4107c(String str) {
        return C0445f.m4102a(str.toCharArray());
    }
}
