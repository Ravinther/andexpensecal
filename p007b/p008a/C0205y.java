package p007b.p008a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.C0287p;
import p007b.p008a.p012b.C0175t;
import p007b.p010e.p017a.al;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.y */
public class C0205y {
    private static C0208c f1289a;
    private C0206z f1290b;
    private ArrayList f1291c;
    private bb f1292d;
    private C0175t f1293e;
    private C0287p f1294f;
    private int f1295g;
    private boolean f1296h;

    static {
        f1289a = C0208c.m1493a(C0205y.class);
    }

    public C0205y(int i, C0175t c0175t, bb bbVar, C0287p c0287p) {
        this.f1292d = bbVar;
        this.f1293e = c0175t;
        this.f1294f = c0287p;
        this.f1291c = new ArrayList();
        this.f1295g = i;
        this.f1296h = false;
    }

    public void m1486a(int i, int i2) {
        Iterator it = this.f1291c.iterator();
        while (it.hasNext()) {
            aa aaVar = (aa) it.next();
            if (aaVar.m1077c() == i && aaVar.m1078d() == i && aaVar.m1079e() == i2 && aaVar.m1080f() == i2) {
                it.remove();
                this.f1290b.m1490c();
                return;
            }
        }
    }

    public void m1487a(aa aaVar) {
        this.f1291c.add(aaVar);
        aaVar.m1075a(this);
        if (this.f1296h) {
            C0210a.m1505a(this.f1290b != null);
            this.f1290b.m1491d();
        }
    }

    public void m1488a(al alVar) {
        boolean z = false;
        if (this.f1291c.size() > 65533) {
            f1289a.m1499b((Object) "Maximum number of data validations exceeded - truncating...");
            this.f1291c = new ArrayList(this.f1291c.subList(0, 65532));
            if (this.f1291c.size() <= 65533) {
                z = true;
            }
            C0210a.m1505a(z);
        }
        if (this.f1290b == null) {
            this.f1290b = new C0206z(new C0204x(this.f1295g, this.f1291c.size()));
        }
        if (this.f1290b.m1492e()) {
            alVar.m1568a(this.f1290b);
            Iterator it = this.f1291c.iterator();
            while (it.hasNext()) {
                alVar.m1568a((aa) it.next());
            }
        }
    }
}
