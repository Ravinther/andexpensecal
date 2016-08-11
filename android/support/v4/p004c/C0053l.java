package android.support.v4.p004c;

import java.util.Map;

/* renamed from: android.support.v4.c.l */
public class C0053l<K, V> {
    static Object[] f317b;
    static int f318c;
    static Object[] f319d;
    static int f320e;
    int[] f321f;
    Object[] f322g;
    int f323h;

    public C0053l() {
        this.f321f = C0057c.f329a;
        this.f322g = C0057c.f331c;
        this.f323h = 0;
    }

    private static void m440a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0054a.class) {
                if (f320e < 10) {
                    objArr[0] = f319d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f319d = objArr;
                    f320e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0054a.class) {
                if (f318c < 10) {
                    objArr[0] = f317b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f317b = objArr;
                    f318c++;
                }
            }
        }
    }

    private void m441e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0054a.class) {
                if (f319d != null) {
                    objArr = f319d;
                    this.f322g = objArr;
                    f319d = (Object[]) objArr[0];
                    this.f321f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f320e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0054a.class) {
                if (f317b != null) {
                    objArr = f317b;
                    this.f322g = objArr;
                    f317b = (Object[]) objArr[0];
                    this.f321f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f318c--;
                    return;
                }
            }
        }
        this.f321f = new int[i];
        this.f322g = new Object[(i << 1)];
    }

    int m442a() {
        int i = this.f323h;
        if (i == 0) {
            return -1;
        }
        int a = C0057c.m481a(this.f321f, i, 0);
        if (a < 0 || this.f322g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f321f[i2] == 0) {
            if (this.f322g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f321f[a] == 0) {
            if (this.f322g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    public int m443a(Object obj) {
        return obj == null ? m442a() : m444a(obj, obj.hashCode());
    }

    int m444a(Object obj, int i) {
        int i2 = this.f323h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0057c.m481a(this.f321f, i2, i);
        if (a < 0 || obj.equals(this.f322g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f321f[i3] == i) {
            if (obj.equals(this.f322g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f321f[a] == i) {
            if (obj.equals(this.f322g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    public V m445a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f322g[i2];
        this.f322g[i2] = v;
        return v2;
    }

    public void m446a(int i) {
        if (this.f321f.length < i) {
            Object obj = this.f321f;
            Object obj2 = this.f322g;
            m441e(i);
            if (this.f323h > 0) {
                System.arraycopy(obj, 0, this.f321f, 0, this.f323h);
                System.arraycopy(obj2, 0, this.f322g, 0, this.f323h << 1);
            }
            C0053l.m440a(obj, obj2, this.f323h);
        }
    }

    int m447b(Object obj) {
        int i = 1;
        int i2 = this.f323h * 2;
        Object[] objArr = this.f322g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public K m448b(int i) {
        return this.f322g[i << 1];
    }

    public V m449c(int i) {
        return this.f322g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f323h != 0) {
            C0053l.m440a(this.f321f, this.f322g, this.f323h);
            this.f321f = C0057c.f329a;
            this.f322g = C0057c.f331c;
            this.f323h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return m443a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m447b(obj) >= 0;
    }

    public V m450d(int i) {
        int i2 = 8;
        V v = this.f322g[(i << 1) + 1];
        if (this.f323h <= 1) {
            C0053l.m440a(this.f321f, this.f322g, this.f323h);
            this.f321f = C0057c.f329a;
            this.f322g = C0057c.f331c;
            this.f323h = 0;
        } else if (this.f321f.length <= 8 || this.f323h >= this.f321f.length / 3) {
            this.f323h--;
            if (i < this.f323h) {
                System.arraycopy(this.f321f, i + 1, this.f321f, i, this.f323h - i);
                System.arraycopy(this.f322g, (i + 1) << 1, this.f322g, i << 1, (this.f323h - i) << 1);
            }
            this.f322g[this.f323h << 1] = null;
            this.f322g[(this.f323h << 1) + 1] = null;
        } else {
            if (this.f323h > 8) {
                i2 = this.f323h + (this.f323h >> 1);
            }
            Object obj = this.f321f;
            Object obj2 = this.f322g;
            m441e(i2);
            this.f323h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f321f, 0, i);
                System.arraycopy(obj2, 0, this.f322g, 0, i << 1);
            }
            if (i < this.f323h) {
                System.arraycopy(obj, i + 1, this.f321f, i, this.f323h - i);
                System.arraycopy(obj2, (i + 1) << 1, this.f322g, i << 1, (this.f323h - i) << 1);
            }
        }
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f323h) {
            try {
                Object b = m448b(i);
                Object c = m449c(i);
                Object obj2 = map.get(b);
                if (c == null) {
                    if (obj2 != null || !map.containsKey(b)) {
                        return false;
                    }
                } else if (!c.equals(obj2)) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public V get(Object obj) {
        int a = m443a(obj);
        return a >= 0 ? this.f322g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f321f;
        Object[] objArr = this.f322g;
        int i = this.f323h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f323h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        if (k == null) {
            a = m442a();
            i = 0;
        } else {
            i = k.hashCode();
            a = m444a((Object) k, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f322g[i3];
            this.f322g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (this.f323h >= this.f321f.length) {
            if (this.f323h >= 8) {
                i2 = this.f323h + (this.f323h >> 1);
            } else if (this.f323h < 4) {
                i2 = 4;
            }
            Object obj = this.f321f;
            Object obj2 = this.f322g;
            m441e(i2);
            if (this.f321f.length > 0) {
                System.arraycopy(obj, 0, this.f321f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f322g, 0, obj2.length);
            }
            C0053l.m440a(obj, obj2, this.f323h);
        }
        if (a < this.f323h) {
            System.arraycopy(this.f321f, a, this.f321f, a + 1, this.f323h - a);
            System.arraycopy(this.f322g, a << 1, this.f322g, (a + 1) << 1, (this.f323h - a) << 1);
        }
        this.f321f[a] = i;
        this.f322g[a << 1] = k;
        this.f322g[(a << 1) + 1] = v;
        this.f323h++;
        return null;
    }

    public V remove(Object obj) {
        int a = m443a(obj);
        return a >= 0 ? m450d(a) : null;
    }

    public int size() {
        return this.f323h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f323h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f323h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0053l b = m448b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m449c(i);
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
