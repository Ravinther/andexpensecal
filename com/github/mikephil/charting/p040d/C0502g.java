package com.github.mikephil.charting.p040d;

import android.graphics.Color;
import android.graphics.Typeface;
import com.github.mikephil.charting.p037c.C0486m;
import com.github.mikephil.charting.p039h.C0535a;
import com.github.mikephil.charting.p039h.C0536k;
import com.github.mikephil.charting.p039h.C0537b;
import com.github.mikephil.charting.p039h.C0544j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.d.g */
public abstract class C0502g<T extends C0505h> {
    private float f5776a;
    protected List<Integer> f5777b;
    protected List<T> f5778c;
    protected float f5779d;
    protected float f5780e;
    protected boolean f5781f;
    protected C0536k f5782g;
    protected C0486m f5783h;
    private String f5784i;
    private boolean f5785j;
    private int f5786k;
    private float f5787l;
    private Typeface f5788m;

    public C0502g(List<T> list, String str) {
        this.f5777b = null;
        this.f5778c = null;
        this.f5779d = 0.0f;
        this.f5780e = 0.0f;
        this.f5776a = 0.0f;
        this.f5784i = "DataSet";
        this.f5785j = true;
        this.f5781f = true;
        this.f5786k = -16777216;
        this.f5787l = 17.0f;
        this.f5783h = C0486m.LEFT;
        this.f5784i = str;
        this.f5778c = list;
        if (this.f5778c == null) {
            this.f5778c = new ArrayList();
        }
        this.f5777b = new ArrayList();
        this.f5777b.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        m4498h();
        m4486a();
    }

    private void m4486a() {
        this.f5776a = 0.0f;
        for (int i = 0; i < this.f5778c.size(); i++) {
            C0505h c0505h = (C0505h) this.f5778c.get(i);
            if (c0505h != null) {
                this.f5776a = Math.abs(c0505h.m4530c()) + this.f5776a;
            }
        }
    }

    public float m4487A() {
        return this.f5787l;
    }

    public float m4488a(int i) {
        C0505h b = m4493b(i);
        return b != null ? b.m4530c() : Float.NaN;
    }

    public int m4489a(C0505h c0505h) {
        for (int i = 0; i < this.f5778c.size(); i++) {
            if (c0505h.m4528a((C0505h) this.f5778c.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public void m4490a(C0536k c0536k) {
        if (c0536k != null) {
            this.f5782g = c0536k;
        }
    }

    public void m4491a(List<Integer> list) {
        this.f5777b = list;
    }

    public void m4492a(int[] iArr) {
        this.f5777b = C0535a.m4682a(iArr);
    }

    public T m4493b(int i) {
        int i2 = 0;
        int size = this.f5778c.size() - 1;
        T t = null;
        while (i2 <= size) {
            int i3 = (size + i2) / 2;
            if (i == ((C0505h) this.f5778c.get(i3)).m4529b()) {
                size = i3;
                while (size > 0 && ((C0505h) this.f5778c.get(size - 1)).m4529b() == i) {
                    size--;
                }
                return (C0505h) this.f5778c.get(size);
            }
            if (i > ((C0505h) this.f5778c.get(i3)).m4529b()) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
            C0505h c0505h = (C0505h) this.f5778c.get(i3);
        }
        return t;
    }

    public void m4494b(float f) {
        this.f5787l = C0544j.m4703a(f);
    }

    public void m4495c(int i) {
        m4512v();
        this.f5777b.add(Integer.valueOf(i));
    }

    public int m4496d(int i) {
        return ((Integer) this.f5777b.get(i % this.f5777b.size())).intValue();
    }

    public void m4497e(int i) {
        this.f5786k = i;
    }

    protected void m4498h() {
        int i = 0;
        if (this.f5778c.size() != 0) {
            this.f5780e = ((C0505h) this.f5778c.get(0)).m4530c();
            this.f5779d = ((C0505h) this.f5778c.get(0)).m4530c();
            while (i < this.f5778c.size()) {
                C0505h c0505h = (C0505h) this.f5778c.get(i);
                if (c0505h != null) {
                    if (c0505h.m4530c() < this.f5780e) {
                        this.f5780e = c0505h.m4530c();
                    }
                    if (c0505h.m4530c() > this.f5779d) {
                        this.f5779d = c0505h.m4530c();
                    }
                }
                i++;
            }
        }
    }

    public int m4499i() {
        return this.f5778c.size();
    }

    public List<T> m4500j() {
        return this.f5778c;
    }

    public float m4501k() {
        return this.f5776a;
    }

    public float m4502l() {
        return this.f5780e;
    }

    public float m4503m() {
        return this.f5779d;
    }

    public int m4504n() {
        return this.f5778c.size();
    }

    public String m4505o() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DataSet, label: " + this.f5784i + ", entries: " + this.f5778c.size() + "\n");
        return stringBuffer.toString();
    }

    public String m4506p() {
        return this.f5784i;
    }

    public boolean m4507q() {
        return this.f5785j;
    }

    public C0486m m4508r() {
        return this.f5783h;
    }

    public boolean m4509s() {
        return this.f5781f;
    }

    public List<Integer> m4510t() {
        return this.f5777b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m4505o());
        for (int i = 0; i < this.f5778c.size(); i++) {
            stringBuffer.append(new StringBuilder(String.valueOf(((C0505h) this.f5778c.get(i)).toString())).append(" ").toString());
        }
        return stringBuffer.toString();
    }

    public int m4511u() {
        return ((Integer) this.f5777b.get(0)).intValue();
    }

    public void m4512v() {
        this.f5777b = new ArrayList();
    }

    public C0536k m4513w() {
        return this.f5782g == null ? new C0537b(1) : this.f5782g;
    }

    public boolean m4514x() {
        return this.f5782g == null || (this.f5782g instanceof C0537b);
    }

    public int m4515y() {
        return this.f5786k;
    }

    public Typeface m4516z() {
        return this.f5788m;
    }
}
