package p007b.p010e.p017a;

import java.util.Calendar;
import java.util.Date;
import p007b.C0233d;
import p007b.p008a.ac;
import p007b.p008a.ay;
import p007b.p010e.C0266c;
import p007b.p010e.C0277l;
import p007b.p011c.C0183d;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.y */
public abstract class C0262y extends C0237n {
    private static C0208c f1923a;
    static final C0277l f1924b;
    private double f1925c;
    private Date f1926d;
    private boolean f1927e;

    static {
        f1923a = C0208c.m1493a(C0262y.class);
        f1924b = new C0277l(C0266c.f1929b);
    }

    protected C0262y(int i, int i2, Date date) {
        this(i, i2, date, f1924b, false);
    }

    protected C0262y(int i, int i2, Date date, C0183d c0183d, boolean z) {
        super(ay.f819y, i, i2, c0183d);
        this.f1926d = date;
        this.f1927e = z;
        m1830a(false);
    }

    private void m1830a(boolean z) {
        long j;
        long j2 = 0;
        if (z) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(this.f1926d);
            j = (long) instance.get(15);
            j2 = (long) instance.get(16);
        } else {
            j = 0;
        }
        this.f1925c = (((double) (j2 + (j + this.f1926d.getTime()))) / 8.64E7d) + 25569.0d;
        if (!this.f1927e && this.f1925c < 61.0d) {
            this.f1925c -= 1.0d;
        }
        if (this.f1927e) {
            this.f1925c -= (double) ((int) this.f1925c);
        }
    }

    public byte[] m1831a() {
        Object a = super.m1607a();
        Object obj = new byte[(a.length + 8)];
        System.arraycopy(a, 0, obj, 0, a.length);
        ac.m1085a(this.f1925c, obj, a.length);
        return obj;
    }

    public C0233d m1832c() {
        return C0233d.f1535k;
    }

    public String m1833d() {
        return this.f1926d.toString();
    }
}
