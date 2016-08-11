package p007b.p010e.p017a;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import p007b.C0233d;
import p007b.p008a.ac;
import p007b.p008a.ay;
import p007b.p008a.bf;
import p007b.p011c.C0183d;

/* renamed from: b.e.a.bp */
public abstract class bp extends C0237n {
    private static DecimalFormat f1664c;
    private double f1665a;
    private NumberFormat f1666b;

    static {
        f1664c = new DecimalFormat("#.###");
    }

    protected bp(int i, int i2, double d) {
        super(ay.f819y, i, i2);
        this.f1665a = d;
    }

    protected bp(int i, int i2, double d, C0183d c0183d) {
        super(ay.f819y, i, i2, c0183d);
        this.f1665a = d;
    }

    public byte[] m1637a() {
        Object a = super.m1607a();
        Object obj = new byte[(a.length + 8)];
        System.arraycopy(a, 0, obj, 0, a.length);
        ac.m1085a(this.f1665a, obj, a.length);
        return obj;
    }

    public C0233d m1638c() {
        return C0233d.f1527c;
    }

    public String m1639d() {
        if (this.f1666b == null) {
            this.f1666b = ((bf) m1609e()).m1409c();
            if (this.f1666b == null) {
                this.f1666b = f1664c;
            }
        }
        return this.f1666b.format(this.f1665a);
    }

    public double m1640l() {
        return this.f1665a;
    }
}
