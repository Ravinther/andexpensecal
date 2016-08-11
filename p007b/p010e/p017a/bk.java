package p007b.p010e.p017a;

import java.util.ArrayList;
import p007b.C0150a;
import p007b.C0155l;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bk */
public class bk extends bd {
    private ArrayList f1642a;

    protected bk(ArrayList arrayList) {
        super(ay.aG);
        this.f1642a = arrayList;
    }

    public byte[] m1630a() {
        byte[] bArr = new byte[((this.f1642a.size() * 8) + 2)];
        ar.m1150a(this.f1642a.size(), bArr, 0);
        int i = 2;
        for (int i2 = 0; i2 < this.f1642a.size(); i2++) {
            C0155l c0155l = (C0155l) this.f1642a.get(i2);
            C0150a a = c0155l.m1155a();
            C0150a b = c0155l.m1156b();
            ar.m1150a(a.e_(), bArr, i);
            ar.m1150a(b.e_(), bArr, i + 2);
            ar.m1150a(a.m1086b(), bArr, i + 4);
            ar.m1150a(b.m1086b(), bArr, i + 6);
            i += 8;
        }
        return bArr;
    }
}
