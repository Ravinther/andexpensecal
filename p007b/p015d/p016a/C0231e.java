package p007b.p015d.p016a;

import p007b.p013b.C0208c;

/* renamed from: b.d.a.e */
public class C0231e {
    private static C0208c f1517a;
    private byte[] f1518b;

    static {
        f1517a = C0208c.m1493a(C0231e.class);
    }

    public byte[] m1541a(int i, int i2) {
        Object obj = new byte[i2];
        try {
            System.arraycopy(this.f1518b, i, obj, 0, i2);
            return obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            f1517a.m1495a("Array index out of bounds at position " + i + " record length " + i2);
            throw e;
        }
    }
}
