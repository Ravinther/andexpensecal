package p018c.p019a;

import android.graphics.RectF;
import android.view.MotionEvent;
import p018c.p019a.p020a.C0288a;
import p018c.p019a.p020a.C0289n;
import p018c.p019a.p020a.C0295k;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p023d.C0320c;

/* renamed from: c.a.f */
public class C0329f implements C0325d {
    private C0310b f2286a;
    private float f2287b;
    private float f2288c;
    private RectF f2289d;
    private C0320c f2290e;
    private C0308b f2291f;

    public C0329f(C0308b c0308b, C0288a c0288a) {
        this.f2289d = new RectF();
        this.f2291f = c0308b;
        this.f2289d = this.f2291f.getZoomRectangle();
        if (c0288a instanceof C0289n) {
            this.f2286a = ((C0289n) c0288a).m1962c();
        } else {
            this.f2286a = ((C0295k) c0288a).m1984a();
        }
        if (this.f2286a.m2060B()) {
            this.f2290e = new C0320c(c0288a);
        }
    }

    public boolean m2230a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f2286a == null || action != 2) {
            if (action == 0) {
                this.f2287b = motionEvent.getX();
                this.f2288c = motionEvent.getY();
                if (this.f2286a != null && this.f2286a.m2107x() && this.f2289d.contains(this.f2287b, this.f2288c)) {
                    if (this.f2287b < this.f2289d.left + (this.f2289d.width() / 3.0f)) {
                        this.f2291f.m2049a();
                        return true;
                    } else if (this.f2287b < this.f2289d.left + ((this.f2289d.width() * 2.0f) / 3.0f)) {
                        this.f2291f.m2050b();
                        return true;
                    } else {
                        this.f2291f.m2051c();
                        return true;
                    }
                }
            } else if (action == 1) {
                this.f2287b = 0.0f;
                this.f2288c = 0.0f;
            }
        } else if (this.f2287b >= 0.0f || this.f2288c >= 0.0f) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f2286a.m2060B()) {
                this.f2290e.m2212a(this.f2287b, this.f2288c, x, y);
            }
            this.f2287b = x;
            this.f2288c = y;
            this.f2291f.m2052d();
            return true;
        }
        return !this.f2286a.m2061C();
    }
}
