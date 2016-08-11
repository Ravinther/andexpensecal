package p007b.p010e.p017a;

import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.ai */
class ai extends bd {
    C0208c f1554a;
    private String f1555b;

    public ai(String str) {
        super(ay.aV);
        this.f1554a = C0208c.m1493a(ai.class);
        this.f1555b = str;
    }

    public byte[] m1559a() {
        byte[] bArr = new byte[((this.f1555b.length() * 2) + 12)];
        bArr[6] = (byte) this.f1555b.length();
        bArr[7] = (byte) 1;
        ax.m1166b(this.f1555b, bArr, 8);
        int length = (this.f1555b.length() * 2) + 8;
        bArr[length] = (byte) 2;
        bArr[length + 1] = (byte) 0;
        bArr[length + 2] = (byte) 28;
        bArr[length + 3] = (byte) 23;
        return bArr;
    }
}
