package p007b.p015d.p016a;

import java.util.ArrayList;
import p007b.p013b.C0208c;

/* renamed from: b.d.a.f */
public final class C0232f {
    private static final C0208c f1519a;
    private int f1520b;
    private int f1521c;
    private C0231e f1522d;
    private byte[] f1523e;
    private ArrayList f1524f;

    static {
        f1519a = C0208c.m1493a(C0232f.class);
    }

    public byte[] m1542a() {
        if (this.f1523e == null) {
            this.f1523e = this.f1522d.m1541a(this.f1521c, this.f1520b);
        }
        if (this.f1524f != null) {
            int i;
            byte[][] bArr = new byte[this.f1524f.size()][];
            int i2 = 0;
            for (i = 0; i < this.f1524f.size(); i++) {
                bArr[i] = ((C0232f) this.f1524f.get(i)).m1542a();
                i2 += bArr[i].length;
            }
            Object obj = new byte[(this.f1523e.length + i2)];
            System.arraycopy(this.f1523e, 0, obj, 0, this.f1523e.length);
            i = this.f1523e.length;
            for (Object obj2 : bArr) {
                System.arraycopy(obj2, 0, obj, i, obj2.length);
                i += obj2.length;
            }
            this.f1523e = obj;
        }
        return this.f1523e;
    }
}
