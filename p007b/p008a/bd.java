package p007b.p008a;

import p007b.p013b.C0208c;

/* renamed from: b.a.bd */
public abstract class bd extends av implements C0125l {
    private static C0208c f456a;

    static {
        f456a = C0208c.m1493a(bd.class);
    }

    protected bd(ay ayVar) {
        super(ayVar);
    }

    private byte[] m935a(byte[] bArr) {
        int i = 0;
        int length = ((bArr.length - 8224) / 8224) + 1;
        Object obj = new byte[(bArr.length + (length * 4))];
        System.arraycopy(bArr, 0, obj, 0, 8224);
        int i2 = 8224;
        int i3 = 8224;
        while (i < length) {
            int min = Math.min(bArr.length - i3, 8224);
            ar.m1150a(ay.f815u.f821a, obj, i2);
            ar.m1150a(min, obj, i2 + 2);
            System.arraycopy(bArr, i3, obj, i2 + 4, min);
            i3 += min;
            i2 += min + 4;
            i++;
        }
        return obj;
    }

    protected abstract byte[] m936a();

    public final byte[] m937g() {
        Object a;
        int i = 8224;
        Object a2 = m936a();
        int length = a2.length;
        if (a2.length > 8224) {
            a = m935a(a2);
        } else {
            i = length;
            a = a2;
        }
        a2 = new byte[(a.length + 4)];
        System.arraycopy(a, 0, a2, 4, a.length);
        ar.m1150a(m933o(), a2, 0);
        ar.m1150a(i, a2, 2);
        return a2;
    }
}
