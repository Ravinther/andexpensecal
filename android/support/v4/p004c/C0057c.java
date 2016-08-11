package android.support.v4.p004c;

/* renamed from: android.support.v4.c.c */
class C0057c {
    static final int[] f329a;
    static final long[] f330b;
    static final Object[] f331c;

    static {
        f329a = new int[0];
        f330b = new long[0];
        f331c = new Object[0];
    }

    public static int m480a(int i) {
        return C0057c.m483b(i * 4) / 4;
    }

    static int m481a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return i3 ^ -1;
    }

    public static boolean m482a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int m483b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }
}
