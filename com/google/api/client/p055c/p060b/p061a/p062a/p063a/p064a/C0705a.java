package com.google.api.client.p055c.p060b.p061a.p062a.p063a.p064a;

import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

/* renamed from: com.google.api.client.c.b.a.a.a.a.a */
public class C0705a extends C0704b {
    static final byte[] f7549a;
    private static final byte[] f7550i;
    private static final byte[] f7551j;
    private static final byte[] f7552k;
    private final byte[] f7553l;
    private final byte[] f7554m;
    private final byte[] f7555n;
    private final int f7556o;
    private final int f7557p;
    private int f7558q;

    static {
        f7549a = new byte[]{(byte) 13, (byte) 10};
        f7550i = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        f7551j = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        f7552k = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 62, (byte) -1, (byte) 62, (byte) -1, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 63, (byte) -1, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51};
    }

    public C0705a() {
        this(0);
    }

    public C0705a(int i) {
        this(i, f7549a);
    }

    public C0705a(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public C0705a(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.f7554m = f7552k;
        if (bArr == null) {
            this.f7557p = 4;
            this.f7555n = null;
        } else if (m6855d(bArr)) {
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + C0706c.m6865a(bArr) + "]");
        } else if (i > 0) {
            this.f7557p = bArr.length + 4;
            this.f7555n = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f7555n, 0, bArr.length);
        } else {
            this.f7557p = 4;
            this.f7555n = null;
        }
        this.f7556o = this.f7557p - 1;
        this.f7553l = z ? f7551j : f7550i;
    }

    public C0705a(boolean z) {
        this(76, f7549a, z);
    }

    public static String m6857a(byte[] bArr) {
        return C0706c.m6865a(C0705a.m6859a(bArr, false, true));
    }

    public static byte[] m6858a(String str) {
        return new C0705a().m6851b(str);
    }

    public static byte[] m6859a(byte[] bArr, boolean z, boolean z2) {
        return C0705a.m6860a(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] m6860a(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C0705a c0705a = z ? new C0705a(z2) : new C0705a(0, f7549a, z2);
        long e = c0705a.m6856e(bArr);
        if (e <= ((long) i)) {
            return c0705a.m6854c(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + e + ") than the specified maximum size of " + i);
    }

    void m6861a(byte[] bArr, int i, int i2) {
        if (!this.f) {
            int i3;
            int i4;
            if (i2 < 0) {
                this.f = true;
                if (this.h != 0 || this.c != 0) {
                    m6846a(this.f7557p);
                    i3 = this.e;
                    byte[] bArr2;
                    switch (this.h) {
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            bArr2 = this.d;
                            i4 = this.e;
                            this.e = i4 + 1;
                            bArr2[i4] = this.f7553l[(this.f7558q >> 2) & 63];
                            bArr2 = this.d;
                            i4 = this.e;
                            this.e = i4 + 1;
                            bArr2[i4] = this.f7553l[(this.f7558q << 4) & 63];
                            if (this.f7553l == f7550i) {
                                bArr2 = this.d;
                                i4 = this.e;
                                this.e = i4 + 1;
                                bArr2[i4] = (byte) 61;
                                bArr2 = this.d;
                                i4 = this.e;
                                this.e = i4 + 1;
                                bArr2[i4] = (byte) 61;
                                break;
                            }
                            break;
                        case C0607c.LoadingImageView_circleCrop /*2*/:
                            bArr2 = this.d;
                            i4 = this.e;
                            this.e = i4 + 1;
                            bArr2[i4] = this.f7553l[(this.f7558q >> 10) & 63];
                            bArr2 = this.d;
                            i4 = this.e;
                            this.e = i4 + 1;
                            bArr2[i4] = this.f7553l[(this.f7558q >> 4) & 63];
                            bArr2 = this.d;
                            i4 = this.e;
                            this.e = i4 + 1;
                            bArr2[i4] = this.f7553l[(this.f7558q << 2) & 63];
                            if (this.f7553l == f7550i) {
                                bArr2 = this.d;
                                i4 = this.e;
                                this.e = i4 + 1;
                                bArr2[i4] = (byte) 61;
                                break;
                            }
                            break;
                    }
                    this.g = (this.e - i3) + this.g;
                    if (this.c > 0 && this.g > 0) {
                        System.arraycopy(this.f7555n, 0, this.d, this.e, this.f7555n.length);
                        this.e += this.f7555n.length;
                        return;
                    }
                    return;
                }
                return;
            }
            int i5 = 0;
            while (i5 < i2) {
                m6846a(this.f7557p);
                this.h = (this.h + 1) % 3;
                i4 = i + 1;
                i3 = bArr[i];
                if (i3 < 0) {
                    i3 += 256;
                }
                this.f7558q = i3 + (this.f7558q << 8);
                if (this.h == 0) {
                    byte[] bArr3 = this.d;
                    int i6 = this.e;
                    this.e = i6 + 1;
                    bArr3[i6] = this.f7553l[(this.f7558q >> 18) & 63];
                    bArr3 = this.d;
                    i6 = this.e;
                    this.e = i6 + 1;
                    bArr3[i6] = this.f7553l[(this.f7558q >> 12) & 63];
                    bArr3 = this.d;
                    i6 = this.e;
                    this.e = i6 + 1;
                    bArr3[i6] = this.f7553l[(this.f7558q >> 6) & 63];
                    bArr3 = this.d;
                    i6 = this.e;
                    this.e = i6 + 1;
                    bArr3[i6] = this.f7553l[this.f7558q & 63];
                    this.g += 4;
                    if (this.c > 0 && this.c <= this.g) {
                        System.arraycopy(this.f7555n, 0, this.d, this.e, this.f7555n.length);
                        this.e += this.f7555n.length;
                        this.g = 0;
                    }
                }
                i5++;
                i = i4;
            }
        }
    }

    protected boolean m6862a(byte b) {
        return b >= null && b < this.f7554m.length && this.f7554m[b] != -1;
    }

    void m6863b(byte[] bArr, int i, int i2) {
        if (!this.f) {
            int i3;
            if (i2 < 0) {
                this.f = true;
            }
            int i4 = 0;
            while (i4 < i2) {
                m6846a(this.f7556o);
                i3 = i + 1;
                byte b = bArr[i];
                if (b == 61) {
                    this.f = true;
                    break;
                }
                if (b >= null && b < f7552k.length) {
                    b = f7552k[b];
                    if (b >= null) {
                        this.h = (this.h + 1) % 4;
                        this.f7558q = b + (this.f7558q << 6);
                        if (this.h == 0) {
                            byte[] bArr2 = this.d;
                            int i5 = this.e;
                            this.e = i5 + 1;
                            bArr2[i5] = (byte) ((this.f7558q >> 16) & 255);
                            bArr2 = this.d;
                            i5 = this.e;
                            this.e = i5 + 1;
                            bArr2[i5] = (byte) ((this.f7558q >> 8) & 255);
                            bArr2 = this.d;
                            i5 = this.e;
                            this.e = i5 + 1;
                            bArr2[i5] = (byte) (this.f7558q & 255);
                        }
                    }
                }
                i4++;
                i = i3;
            }
            if (this.f && this.h != 0) {
                m6846a(this.f7556o);
                byte[] bArr3;
                switch (this.h) {
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        this.f7558q >>= 4;
                        bArr3 = this.d;
                        i3 = this.e;
                        this.e = i3 + 1;
                        bArr3[i3] = (byte) (this.f7558q & 255);
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        this.f7558q >>= 2;
                        bArr3 = this.d;
                        i3 = this.e;
                        this.e = i3 + 1;
                        bArr3[i3] = (byte) ((this.f7558q >> 8) & 255);
                        bArr3 = this.d;
                        i3 = this.e;
                        this.e = i3 + 1;
                        bArr3[i3] = (byte) (this.f7558q & 255);
                    default:
                }
            }
        }
    }
}
