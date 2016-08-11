package android.support.v4.view.p006a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.view.a.k */
public class C0083k {
    private static final C0084l f407a;
    private final Object f408b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f407a = new C0089o();
        } else if (VERSION.SDK_INT >= 16) {
            f407a = new C0086m();
        } else {
            f407a = new C0085q();
        }
    }

    public C0083k() {
        this.f408b = f407a.m699a(this);
    }

    public C0083k(Object obj) {
        this.f408b = obj;
    }

    public C0071a m694a(int i) {
        return null;
    }

    public Object m695a() {
        return this.f408b;
    }

    public List<C0071a> m696a(String str, int i) {
        return null;
    }

    public boolean m697a(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0071a m698b(int i) {
        return null;
    }
}
