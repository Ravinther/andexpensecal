package p007b.p008a;

/* renamed from: b.a.ac */
public class ac {
    public static double m1084a(byte[] bArr, int i) {
        int a = ar.m1149a(bArr[i], bArr[i + 1], bArr[i + 2], bArr[i + 3]);
        int a2 = ar.m1149a(bArr[i + 4], bArr[i + 5], bArr[i + 6], bArr[i + 7]);
        Object obj = (Integer.MIN_VALUE & a2) != 0 ? 1 : null;
        double longBitsToDouble = Double.longBitsToDouble((a < 0 ? ((long) a) + 4294967296L : (long) a) + (((long) (Integer.MAX_VALUE & a2)) * 4294967296L));
        return obj != null ? -longBitsToDouble : longBitsToDouble;
    }

    public static void m1085a(double d, byte[] bArr, int i) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        bArr[i] = (byte) ((int) (255 & doubleToLongBits));
        bArr[i + 1] = (byte) ((int) ((65280 & doubleToLongBits) >> 8));
        bArr[i + 2] = (byte) ((int) ((16711680 & doubleToLongBits) >> 16));
        bArr[i + 3] = (byte) ((int) ((-16777216 & doubleToLongBits) >> 24));
        bArr[i + 4] = (byte) ((int) ((1095216660480L & doubleToLongBits) >> 32));
        bArr[i + 5] = (byte) ((int) ((280375465082880L & doubleToLongBits) >> 40));
        bArr[i + 6] = (byte) ((int) ((71776119061217280L & doubleToLongBits) >> 48));
        bArr[i + 7] = (byte) ((int) ((doubleToLongBits & -72057594037927936L) >> 56));
    }
}
