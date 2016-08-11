package p007b.p010e.p017a;

import java.util.List;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p010e.C0273g;

/* renamed from: b.e.a.bl */
class bl extends bd {
    private int f1643a;
    private int f1644b;
    private int f1645c;
    private int[] f1646d;
    private int[] f1647e;

    public bl(List list) {
        int i = 0;
        super(ay.f809o);
        this.f1643a = ((C0273g) list.get(0)).e_();
        this.f1644b = ((C0273g) list.get(0)).m1608b();
        this.f1645c = (this.f1644b + list.size()) - 1;
        this.f1646d = new int[list.size()];
        this.f1647e = new int[list.size()];
        while (i < list.size()) {
            this.f1646d[i] = (int) ((C0273g) list.get(i)).m1640l();
            this.f1647e[i] = ((C0237n) list.get(i)).m1612i();
            i++;
        }
    }

    public byte[] m1631a() {
        int i = 4;
        int i2 = 0;
        byte[] bArr = new byte[((this.f1646d.length * 6) + 6)];
        ar.m1150a(this.f1643a, bArr, 0);
        ar.m1150a(this.f1644b, bArr, 2);
        byte[] bArr2 = new byte[4];
        while (i2 < this.f1646d.length) {
            ar.m1150a(this.f1647e[i2], bArr, i);
            ar.m1153b((this.f1646d[i2] << 2) | 2, bArr, i + 2);
            i += 6;
            i2++;
        }
        ar.m1150a(this.f1645c, bArr, i);
        return bArr;
    }
}
