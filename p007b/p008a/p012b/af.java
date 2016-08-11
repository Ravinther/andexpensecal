package p007b.p008a.p012b;

import p007b.p008a.ar;

/* renamed from: b.a.b.af */
class af extends bg {
    public int m1210a(byte[] bArr, int i) {
        m1206a(ar.m1148a(bArr[i + 4], bArr[i + 5]));
        return 6;
    }

    public void m1211a(StringBuffer stringBuffer) {
        at[] b = m1208b();
        if (b.length == 1) {
            b[0].m1170a(stringBuffer);
        } else if (b.length == 2) {
            b[1].m1170a(stringBuffer);
            stringBuffer.append(':');
            b[0].m1170a(stringBuffer);
        }
    }
}
