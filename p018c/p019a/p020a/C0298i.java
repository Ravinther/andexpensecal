package p018c.p019a.p020a;

import java.io.Serializable;

/* renamed from: c.a.a.i */
public class C0298i implements Serializable {
    private float f2093a;
    private float f2094b;
    private int f2095c;
    private float f2096d;

    public C0298i(int i, float f, float f2, float f3) {
        this.f2093a = f2;
        this.f2094b = f3 + f2;
        this.f2095c = i;
        this.f2096d = f;
    }

    protected int m2000a() {
        return this.f2095c;
    }

    public boolean m2001a(double d) {
        if (d >= ((double) this.f2093a) && d <= ((double) this.f2094b)) {
            return true;
        }
        double d2 = d % 360.0d;
        double d3 = (double) this.f2093a;
        double d4 = (double) this.f2094b;
        while (d4 > 360.0d) {
            d3 -= 360.0d;
            d4 -= 360.0d;
        }
        return d2 >= d3 && d2 <= d4;
    }

    protected float m2002b() {
        return this.f2096d;
    }

    public String toString() {
        return "mDataIndex=" + this.f2095c + ",mValue=" + this.f2096d + ",mStartAngle=" + this.f2093a + ",mEndAngle=" + this.f2094b;
    }
}
