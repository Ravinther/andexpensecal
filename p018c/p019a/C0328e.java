package p018c.p019a;

import android.graphics.RectF;
import android.view.MotionEvent;
import p018c.p019a.p020a.C0288a;
import p018c.p019a.p020a.C0289n;
import p018c.p019a.p020a.C0295k;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p023d.C0320c;
import p018c.p019a.p023d.C0322e;

/* renamed from: c.a.e */
public class C0328e implements C0325d {
    private C0310b f2277a;
    private float f2278b;
    private float f2279c;
    private float f2280d;
    private float f2281e;
    private RectF f2282f;
    private C0320c f2283g;
    private C0322e f2284h;
    private C0308b f2285i;

    public C0328e(C0308b c0308b, C0288a c0288a) {
        this.f2282f = new RectF();
        this.f2285i = c0308b;
        this.f2282f = this.f2285i.getZoomRectangle();
        if (c0288a instanceof C0289n) {
            this.f2277a = ((C0289n) c0288a).m1962c();
        } else {
            this.f2277a = ((C0295k) c0288a).m1984a();
        }
        if (this.f2277a.m2060B()) {
            this.f2283g = new C0320c(c0288a);
        }
        if (this.f2277a.m2107x()) {
            this.f2284h = new C0322e(c0288a, true, 1.0f);
        }
    }

    private void m2228a(float f, int i) {
        float min = Math.min(Math.max(f, 0.9f), 1.1f);
        if (((double) min) > 0.9d && ((double) min) < 1.1d) {
            this.f2284h.m2216a(min);
            this.f2284h.m2217b(i);
        }
    }

    public boolean m2229a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f2277a == null || action != 2) {
            if (action == 0) {
                this.f2278b = motionEvent.getX(0);
                this.f2279c = motionEvent.getY(0);
                if (this.f2277a != null && this.f2277a.m2107x() && this.f2282f.contains(this.f2278b, this.f2279c)) {
                    if (this.f2278b < this.f2282f.left + (this.f2282f.width() / 3.0f)) {
                        this.f2285i.m2049a();
                    } else if (this.f2278b < this.f2282f.left + ((this.f2282f.width() * 2.0f) / 3.0f)) {
                        this.f2285i.m2050b();
                    } else {
                        this.f2285i.m2051c();
                    }
                    return true;
                }
            } else if (action == 1 || action == 6) {
                this.f2278b = 0.0f;
                this.f2279c = 0.0f;
                this.f2280d = 0.0f;
                this.f2281e = 0.0f;
                if (action == 6) {
                    this.f2278b = -1.0f;
                    this.f2279c = -1.0f;
                }
            }
        } else if (this.f2278b >= 0.0f || this.f2279c >= 0.0f) {
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            if (motionEvent.getPointerCount() > 1 && ((this.f2280d >= 0.0f || this.f2281e >= 0.0f) && this.f2277a.m2107x())) {
                float x2 = motionEvent.getX(1);
                float y2 = motionEvent.getY(1);
                float abs = Math.abs(x - x2);
                float abs2 = Math.abs(y - y2);
                float abs3 = Math.abs(this.f2278b - this.f2280d);
                float abs4 = Math.abs(this.f2279c - this.f2281e);
                float abs5 = Math.abs(y - this.f2279c) / Math.abs(x - this.f2278b);
                float abs6 = Math.abs(y2 - this.f2281e) / Math.abs(x2 - this.f2280d);
                if (((double) abs5) <= 0.25d && ((double) abs6) <= 0.25d) {
                    m2228a(abs / abs3, 1);
                } else if (((double) abs5) < 3.73d || ((double) abs6) < 3.73d) {
                    m2228a(Math.abs(x - this.f2278b) >= Math.abs(y - this.f2279c) ? abs / abs3 : abs2 / abs4, 0);
                } else {
                    m2228a(abs2 / abs4, 2);
                }
                this.f2280d = x2;
                this.f2281e = y2;
            } else if (this.f2277a.m2060B()) {
                this.f2283g.m2212a(this.f2278b, this.f2279c, x, y);
                this.f2280d = 0.0f;
                this.f2281e = 0.0f;
            }
            this.f2278b = x;
            this.f2279c = y;
            this.f2285i.m2052d();
            return true;
        }
        return !this.f2277a.m2061C();
    }
}
