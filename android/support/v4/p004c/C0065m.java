package android.support.v4.p004c;

/* renamed from: android.support.v4.c.m */
public class C0065m<E> implements Cloneable {
    private static final Object f346a;
    private boolean f347b;
    private int[] f348c;
    private Object[] f349d;
    private int f350e;

    static {
        f346a = new Object();
    }

    public C0065m() {
        this(10);
    }

    public C0065m(int i) {
        this.f347b = false;
        if (i == 0) {
            this.f348c = C0057c.f329a;
            this.f349d = C0057c.f331c;
        } else {
            int a = C0057c.m480a(i);
            this.f348c = new int[a];
            this.f349d = new Object[a];
        }
        this.f350e = 0;
    }

    private void m488d() {
        int i = this.f350e;
        int[] iArr = this.f348c;
        Object[] objArr = this.f349d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f346a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f347b = false;
        this.f350e = i2;
    }

    public int m489a(int i) {
        if (this.f347b) {
            m488d();
        }
        return this.f348c[i];
    }

    public C0065m<E> m490a() {
        try {
            C0065m<E> c0065m = (C0065m) super.clone();
            try {
                c0065m.f348c = (int[]) this.f348c.clone();
                c0065m.f349d = (Object[]) this.f349d.clone();
                return c0065m;
            } catch (CloneNotSupportedException e) {
                return c0065m;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public int m491b() {
        if (this.f347b) {
            m488d();
        }
        return this.f350e;
    }

    public E m492b(int i) {
        if (this.f347b) {
            m488d();
        }
        return this.f349d[i];
    }

    public void m493c() {
        int i = this.f350e;
        Object[] objArr = this.f349d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f350e = 0;
        this.f347b = false;
    }

    public /* synthetic */ Object clone() {
        return m490a();
    }

    public String toString() {
        if (m491b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f350e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f350e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m489a(i));
            stringBuilder.append('=');
            C0065m b = m492b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
