package android.support.v4.p004c;

import java.util.Map;

/* renamed from: android.support.v4.c.b */
class C0056b extends C0055f<K, V> {
    final /* synthetic */ C0054a f328a;

    C0056b(C0054a c0054a) {
        this.f328a = c0054a;
    }

    protected int m471a() {
        return this.f328a.h;
    }

    protected int m472a(Object obj) {
        return this.f328a.m443a(obj);
    }

    protected Object m473a(int i, int i2) {
        return this.f328a.g[(i << 1) + i2];
    }

    protected V m474a(int i, V v) {
        return this.f328a.m445a(i, (Object) v);
    }

    protected void m475a(int i) {
        this.f328a.m450d(i);
    }

    protected void m476a(K k, V v) {
        this.f328a.put(k, v);
    }

    protected int m477b(Object obj) {
        return this.f328a.m447b(obj);
    }

    protected Map<K, V> m478b() {
        return this.f328a;
    }

    protected void m479c() {
        this.f328a.clear();
    }
}
