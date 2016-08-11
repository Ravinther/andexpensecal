package p007b.p008a.p009a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.ac */
public class ac extends bd {
    private static C0208c f461a;
    private byte[] f462b;
    private int f463c;
    private int f464d;
    private int f465e;

    static {
        f461a = C0208c.m1493a(ac.class);
    }

    public ac(int i, int i2, int i3) {
        super(ay.f805k);
        this.f463c = i2;
        this.f464d = i;
        this.f465e = i3;
    }

    public byte[] m941a() {
        if (this.f462b != null) {
            return this.f462b;
        }
        String str = "";
        this.f462b = new byte[((str.length() + 8) + 4)];
        ar.m1150a(this.f463c, this.f462b, 0);
        ar.m1150a(this.f464d, this.f462b, 2);
        ar.m1150a(this.f465e, this.f462b, 6);
        ar.m1150a(str.length(), this.f462b, 8);
        return this.f462b;
    }
}
