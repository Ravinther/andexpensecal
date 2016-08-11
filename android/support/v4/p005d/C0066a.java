package android.support.v4.p005d;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.d.a */
public class C0066a {
    private static final C0067d f351b;
    private Object f352a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f351b = new C0069c();
        } else {
            f351b = new C0068b();
        }
    }

    public C0066a(Context context) {
        this.f352a = f351b.m500a(context);
    }

    public void m494a(int i, int i2) {
        f351b.m501a(this.f352a, i, i2);
    }

    public boolean m495a() {
        return f351b.m502a(this.f352a);
    }

    public boolean m496a(float f) {
        return f351b.m503a(this.f352a, f);
    }

    public boolean m497a(Canvas canvas) {
        return f351b.m504a(this.f352a, canvas);
    }

    public void m498b() {
        f351b.m505b(this.f352a);
    }

    public boolean m499c() {
        return f351b.m506c(this.f352a);
    }
}
