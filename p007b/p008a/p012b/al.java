package p007b.p008a.p012b;

import p007b.p008a.ar;
import p007b.p008a.as;
import p007b.p008a.bb;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.al */
class al extends ap {
    private static C0208c f836a;
    private bb f837b;
    private String f838c;
    private int f839d;

    static {
        f836a = C0208c.m1493a(al.class);
    }

    public al(bb bbVar) {
        this.f837b = bbVar;
        C0210a.m1505a(this.f837b != null);
    }

    public al(String str, bb bbVar) {
        this.f838c = str;
        this.f837b = bbVar;
        this.f839d = this.f837b.m1388a(this.f838c);
        if (this.f839d < 0) {
            throw new C0177v(C0177v.f1018g, this.f838c);
        }
        this.f839d++;
    }

    public int m1228a(byte[] bArr, int i) {
        try {
            this.f839d = ar.m1148a(bArr[i], bArr[i + 1]);
            this.f838c = this.f837b.m1389a(this.f839d - 1);
            return 4;
        } catch (as e) {
            throw new C0177v(C0177v.f1018g, "");
        }
    }

    public void m1229a(StringBuffer stringBuffer) {
        stringBuffer.append(this.f838c);
    }

    byte[] m1230c() {
        byte[] bArr = new byte[5];
        bArr[0] = bi.f909o.m1288d();
        if (m1177k() == as.f841b) {
            bArr[0] = bi.f909o.m1286b();
        }
        ar.m1150a(this.f839d, bArr, 1);
        return bArr;
    }
}
