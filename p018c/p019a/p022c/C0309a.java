package p018c.p019a.p022c;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import java.io.Serializable;

/* renamed from: c.a.c.a */
public class C0309a implements Serializable {
    public static final C0309a f2144a;
    public static final C0309a f2145b;
    public static final C0309a f2146c;
    private Cap f2147d;
    private Join f2148e;
    private float f2149f;
    private float[] f2150g;
    private float f2151h;

    static {
        f2144a = new C0309a(Cap.BUTT, Join.MITER, 4.0f, null, 0.0f);
        f2145b = new C0309a(Cap.ROUND, Join.BEVEL, 10.0f, new float[]{10.0f, 10.0f}, 1.0f);
        f2146c = new C0309a(Cap.ROUND, Join.BEVEL, 5.0f, new float[]{2.0f, 10.0f}, 1.0f);
    }

    public C0309a(Cap cap, Join join, float f, float[] fArr, float f2) {
        this.f2147d = cap;
        this.f2148e = join;
        this.f2149f = f;
        this.f2150g = fArr;
    }

    public Cap m2054a() {
        return this.f2147d;
    }

    public Join m2055b() {
        return this.f2148e;
    }

    public float m2056c() {
        return this.f2149f;
    }

    public float[] m2057d() {
        return this.f2150g;
    }

    public float m2058e() {
        return this.f2151h;
    }
}
