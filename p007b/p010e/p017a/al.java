package p007b.p010e.p017a;

import java.io.OutputStream;
import p007b.C0287p;
import p007b.p008a.C0125l;
import p007b.p013b.C0208c;
import p007b.p015d.p016a.C0230d;

/* renamed from: b.e.a.al */
public final class al {
    private static C0208c f1560b;
    C0230d f1561a;
    private ag f1562c;
    private OutputStream f1563d;
    private int f1564e;
    private int f1565f;
    private C0287p f1566g;

    static {
        f1560b = C0208c.m1493a(al.class);
    }

    al(OutputStream outputStream, C0287p c0287p, C0230d c0230d) {
        this.f1563d = outputStream;
        this.f1566g = c0287p;
        this.f1561a = c0230d;
        m1566b();
    }

    private void m1566b() {
        if (this.f1566g.m1916k()) {
            this.f1562c = new am(this.f1566g.m1917l());
            return;
        }
        this.f1564e = this.f1566g.m1907b();
        this.f1565f = this.f1566g.m1904a();
        this.f1562c = new bi(this.f1564e, this.f1565f);
    }

    int m1567a() {
        return this.f1562c.m1550a();
    }

    public void m1568a(C0125l c0125l) {
        this.f1562c.m1552a(c0125l.m934g());
    }

    void m1569a(boolean z) {
        new C0255r(this.f1562c, this.f1562c.m1550a(), this.f1563d, this.f1561a).m1823a();
        this.f1563d.flush();
        this.f1562c.m1554b();
        if (z) {
            this.f1563d.close();
        }
        this.f1562c = null;
        if (!this.f1566g.m1909d()) {
            System.gc();
        }
    }

    void m1570a(byte[] bArr, int i) {
        this.f1562c.m1553a(bArr, i);
    }
}
