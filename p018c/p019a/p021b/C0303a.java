package p018c.p019a.p021b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.b.a */
public class C0303a implements Serializable {
    private String f2107a;
    private List<String> f2108b;
    private List<Double> f2109c;

    public C0303a(String str) {
        this.f2108b = new ArrayList();
        this.f2109c = new ArrayList();
        this.f2107a = str;
    }

    public synchronized double m2018a(int i) {
        return ((Double) this.f2109c.get(i)).doubleValue();
    }

    public synchronized int m2019a() {
        return this.f2108b.size();
    }

    public synchronized void m2020a(double d) {
        m2021a(this.f2108b.size() + "", d);
    }

    public synchronized void m2021a(String str, double d) {
        this.f2108b.add(str);
        this.f2109c.add(Double.valueOf(d));
    }

    public C0307e m2022b() {
        C0307e c0307e = new C0307e(this.f2107a);
        int i = 0;
        for (Double doubleValue : this.f2109c) {
            int i2 = i + 1;
            c0307e.m2036a((double) i2, doubleValue.doubleValue());
            i = i2;
        }
        return c0307e;
    }

    public synchronized String m2023b(int i) {
        return (String) this.f2108b.get(i);
    }
}
