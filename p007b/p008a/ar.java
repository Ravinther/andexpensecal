package p007b.p008a;

/* renamed from: b.a.ar */
public final class ar {
    public static int m1148a(byte b, byte b2) {
        return (b & 255) | ((b2 & 255) << 8);
    }

    public static int m1149a(byte b, byte b2, byte b3, byte b4) {
        return ar.m1148a(b, b2) | (ar.m1148a(b3, b4) << 16);
    }

    public static void m1150a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((65280 & i) >> 8);
    }

    public static byte[] m1151a(int i) {
        byte[] bArr = new byte[4];
        int i2 = (-65536 & i) >> 16;
        ar.m1150a(65535 & i, bArr, 0);
        ar.m1150a(i2, bArr, 2);
        return bArr;
    }

    public static short m1152b(byte b, byte b2) {
        return (short) (((short) (b & 255)) | (((short) (b2 & 255)) << 8));
    }

    public static void m1153b(int i, byte[] bArr, int i2) {
        byte[] a = ar.m1151a(i);
        bArr[i2] = a[0];
        bArr[i2 + 1] = a[1];
        bArr[i2 + 2] = a[2];
        bArr[i2 + 3] = a[3];
    }
}
