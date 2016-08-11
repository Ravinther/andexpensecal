package com.github.mikephil.charting.p040d;

import com.github.mikephil.charting.p037c.C0486m;
import com.github.mikephil.charting.p039h.C0536k;
import com.github.mikephil.charting.p039h.C0538d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.d.f */
public abstract class C0499f<T extends C0502g<? extends C0505h>> {
    protected float f5764a;
    protected float f5765b;
    protected float f5766c;
    protected float f5767d;
    protected float f5768e;
    protected float f5769f;
    protected List<String> f5770g;
    protected List<T> f5771h;
    private float f5772i;
    private int f5773j;
    private float f5774k;

    public C0499f() {
        this.f5764a = 0.0f;
        this.f5765b = 0.0f;
        this.f5766c = 0.0f;
        this.f5767d = 0.0f;
        this.f5768e = 0.0f;
        this.f5769f = 0.0f;
        this.f5772i = 0.0f;
        this.f5773j = 0;
        this.f5774k = 0.0f;
        this.f5770g = new ArrayList();
        this.f5771h = new ArrayList();
    }

    public C0499f(List<String> list, List<T> list2) {
        this.f5764a = 0.0f;
        this.f5765b = 0.0f;
        this.f5766c = 0.0f;
        this.f5767d = 0.0f;
        this.f5768e = 0.0f;
        this.f5769f = 0.0f;
        this.f5772i = 0.0f;
        this.f5773j = 0;
        this.f5774k = 0.0f;
        this.f5770g = list;
        this.f5771h = list2;
        m4467a(this.f5771h);
    }

    private void m4458a() {
        if (this.f5770g.size() <= 0) {
            this.f5774k = 1.0f;
            return;
        }
        float f = 1.0f;
        for (int i = 0; i < this.f5770g.size(); i++) {
            f += (float) ((String) this.f5770g.get(i)).length();
        }
        this.f5774k = f / ((float) this.f5770g.size());
    }

    private void m4459a(T t, T t2) {
        if (t == null) {
            this.f5766c = this.f5768e;
            this.f5767d = this.f5769f;
        } else if (t2 == null) {
            this.f5768e = this.f5766c;
            this.f5769f = this.f5767d;
        }
    }

    private void m4460e(List<? extends C0502g<?>> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((C0502g) list.get(i)).m4500j().size() > this.f5770g.size()) {
                    throw new IllegalArgumentException("One or more of the DataSet Entry arrays are longer than the x-values array of this ChartData object.");
                }
            }
        }
    }

    public float m4461a(C0486m c0486m) {
        return c0486m == C0486m.LEFT ? this.f5767d : this.f5769f;
    }

    public int m4462a(T t) {
        for (int i = 0; i < this.f5771h.size(); i++) {
            if (this.f5771h.get(i) == t) {
                return i;
            }
        }
        return -1;
    }

    public T m4463a(int i) {
        return (this.f5771h == null || i < 0 || i >= this.f5771h.size()) ? null : (C0502g) this.f5771h.get(i);
    }

    public C0505h m4464a(C0538d c0538d) {
        return ((C0502g) this.f5771h.get(c0538d.m4685a())).m4493b(c0538d.m4687b());
    }

    public void m4465a(float f) {
        for (C0502g b : this.f5771h) {
            b.m4494b(f);
        }
    }

    public void m4466a(C0536k c0536k) {
        if (c0536k != null) {
            for (C0502g a : this.f5771h) {
                a.m4490a(c0536k);
            }
        }
    }

    protected void m4467a(List<? extends C0502g<?>> list) {
        m4460e(list);
        m4470b((List) list);
        m4472c(list);
        m4474d(list);
        m4458a();
    }

    public float m4468b(C0486m c0486m) {
        return c0486m == C0486m.LEFT ? this.f5766c : this.f5768e;
    }

    public void m4469b(int i) {
        for (C0502g e : this.f5771h) {
            e.m4497e(i);
        }
    }

    protected void m4470b(List<? extends C0502g<?>> list) {
        int i = 0;
        if (list == null || list.size() < 1) {
            this.f5764a = 0.0f;
            this.f5765b = 0.0f;
            return;
        }
        this.f5765b = ((C0502g) list.get(0)).m4502l();
        this.f5764a = ((C0502g) list.get(0)).m4503m();
        while (i < list.size()) {
            if (((C0502g) list.get(i)).m4502l() < this.f5765b) {
                this.f5765b = ((C0502g) list.get(i)).m4502l();
            }
            if (((C0502g) list.get(i)).m4503m() > this.f5764a) {
                this.f5764a = ((C0502g) list.get(i)).m4503m();
            }
            i++;
        }
        C0502g l = m4482l();
        if (l != null) {
            this.f5766c = l.m4503m();
            this.f5767d = l.m4502l();
            for (C0502g c0502g : list) {
                if (c0502g.m4508r() == C0486m.LEFT) {
                    if (c0502g.m4502l() < this.f5767d) {
                        this.f5767d = c0502g.m4502l();
                    }
                    if (c0502g.m4503m() > this.f5766c) {
                        this.f5766c = c0502g.m4503m();
                    }
                }
            }
        }
        C0502g m = m4483m();
        if (m != null) {
            this.f5768e = m.m4503m();
            this.f5769f = m.m4502l();
            for (C0502g c0502g2 : list) {
                if (c0502g2.m4508r() == C0486m.RIGHT) {
                    if (c0502g2.m4502l() < this.f5769f) {
                        this.f5769f = c0502g2.m4502l();
                    }
                    if (c0502g2.m4503m() > this.f5768e) {
                        this.f5768e = c0502g2.m4503m();
                    }
                }
            }
        }
        m4459a(l, m);
    }

    public int m4471c() {
        return this.f5771h == null ? 0 : this.f5771h.size();
    }

    protected void m4472c(List<? extends C0502g<?>> list) {
        this.f5772i = 0.0f;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                this.f5772i = Math.abs(((C0502g) list.get(i)).m4501k()) + this.f5772i;
            }
        }
    }

    public float m4473d() {
        return this.f5765b;
    }

    protected void m4474d(List<? extends C0502g<?>> list) {
        this.f5773j = 0;
        if (list != null) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                i += ((C0502g) list.get(i2)).m4499i();
            }
            this.f5773j = i;
        }
    }

    public float m4475e() {
        return this.f5764a;
    }

    public float m4476f() {
        return this.f5774k;
    }

    public float m4477g() {
        return this.f5772i;
    }

    public int m4478h() {
        return this.f5773j;
    }

    public List<String> m4479i() {
        return this.f5770g;
    }

    public List<T> m4480j() {
        return this.f5771h;
    }

    public int m4481k() {
        return this.f5770g.size();
    }

    public T m4482l() {
        for (C0502g c0502g : this.f5771h) {
            if (c0502g.m4508r() == C0486m.LEFT) {
                return c0502g;
            }
        }
        return null;
    }

    public T m4483m() {
        for (C0502g c0502g : this.f5771h) {
            if (c0502g.m4508r() == C0486m.RIGHT) {
                return c0502g;
            }
        }
        return null;
    }
}
