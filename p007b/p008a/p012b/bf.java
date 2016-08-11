package p007b.p008a.p012b;

import p007b.C0287p;
import p007b.p008a.ax;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.bf */
class bf extends ap {
    private static final C0208c f878a;
    private String f879b;
    private C0287p f880c;

    static {
        f878a = C0208c.m1493a(bf.class);
    }

    public bf(C0287p c0287p) {
        this.f880c = c0287p;
    }

    public bf(String str) {
        this.f879b = str;
    }

    public int m1279a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        if ((bArr[i + 1] & 1) == 0) {
            this.f879b = ax.m1162a(bArr, i2, i + 2, this.f880c);
            return i2 + 2;
        }
        this.f879b = ax.m1161a(bArr, i2, i + 2);
        return (i2 * 2) + 2;
    }

    public void m1280a(StringBuffer stringBuffer) {
        stringBuffer.append("\"");
        stringBuffer.append(this.f879b);
        stringBuffer.append("\"");
    }

    byte[] m1281c() {
        byte[] bArr = new byte[((this.f879b.length() * 2) + 3)];
        bArr[0] = bi.f899e.m1285a();
        bArr[1] = (byte) this.f879b.length();
        bArr[2] = (byte) 1;
        ax.m1166b(this.f879b, bArr, 3);
        return bArr;
    }
}
