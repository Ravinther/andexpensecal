package p007b.p008a.p009a;

import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.b */
class C0127b extends C0126u {
    private static C0208c f532a;
    private C0128c f533b;
    private byte[] f534c;
    private int f535d;
    private int f536e;
    private boolean f537f;

    static {
        f532a = C0208c.m1493a(C0127b.class);
    }

    public C0127b(C0142o c0142o) {
        super(C0148y.f690h);
        this.f533b = C0128c.f544g;
        m920c(2);
        m919b(this.f533b.m968a());
        Object l = c0142o.m1045l();
        this.f535d = l.length;
        this.f534c = new byte[(this.f535d + 61)];
        System.arraycopy(l, 0, this.f534c, 61, this.f535d);
        this.f536e = c0142o.m1043j();
        this.f537f = true;
    }

    public C0127b(C0147x c0147x) {
        super(c0147x);
        this.f533b = C0128c.m967a(m924j());
        this.f537f = false;
        byte[] l = m926l();
        this.f536e = ar.m1149a(l[24], l[25], l[26], l[27]);
    }

    public byte[] m965a() {
        if (this.f537f) {
            this.f534c[0] = (byte) this.f533b.m968a();
            this.f534c[1] = (byte) this.f533b.m968a();
            ar.m1153b((this.f535d + 8) + 17, this.f534c, 20);
            ar.m1153b(this.f536e, this.f534c, 24);
            ar.m1153b(0, this.f534c, 28);
            this.f534c[32] = (byte) 0;
            this.f534c[33] = (byte) 0;
            this.f534c[34] = (byte) 126;
            this.f534c[35] = (byte) 1;
            this.f534c[36] = (byte) 0;
            this.f534c[37] = (byte) 110;
            ar.m1150a(61470, this.f534c, 38);
            ar.m1153b(this.f535d + 17, this.f534c, 40);
        } else {
            this.f534c = m926l();
        }
        return m918a(this.f534c);
    }

    byte[] m966b() {
        Object l = m926l();
        Object obj = new byte[(l.length - 61)];
        System.arraycopy(l, 61, obj, 0, obj.length);
        return obj;
    }
}
