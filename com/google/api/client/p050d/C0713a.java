package com.google.api.client.p050d;

import java.util.AbstractMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.api.client.d.a */
public class C0713a<K, V> extends AbstractMap<K, V> implements Cloneable {
    int f7567a;
    private Object[] f7568b;

    public static <K, V> C0713a<K, V> m6885a() {
        return new C0713a();
    }

    private int m6886b(Object obj) {
        int i = this.f7567a << 1;
        Object[] objArr = this.f7568b;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else if (obj.equals(obj2)) {
                return i2;
            }
        }
        return -2;
    }

    private void m6887b(int i, K k, V v) {
        Object[] objArr = this.f7568b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private void m6888e(int i) {
        if (i == 0) {
            this.f7568b = null;
            return;
        }
        int i2 = this.f7567a;
        Object obj = this.f7568b;
        if (i2 == 0 || i != obj.length) {
            Object obj2 = new Object[i];
            this.f7568b = obj2;
            if (i2 != 0) {
                System.arraycopy(obj, 0, obj2, 0, i2 << 1);
            }
        }
    }

    private V m6889f(int i) {
        return i < 0 ? null : this.f7568b[i];
    }

    private V m6890g(int i) {
        int i2 = this.f7567a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V f = m6889f(i + 1);
        Object obj = this.f7568b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(obj, i + 2, obj, i, i3);
        }
        this.f7567a--;
        m6887b(i2 - 2, null, null);
        return f;
    }

    public final int m6891a(K k) {
        return m6886b((Object) k) >> 1;
    }

    public final K m6892a(int i) {
        return (i < 0 || i >= this.f7567a) ? null : this.f7568b[i << 1];
    }

    public final V m6893a(int i, V v) {
        int i2 = this.f7567a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        i2 = (i << 1) + 1;
        V f = m6889f(i2);
        this.f7568b[i2] = v;
        return f;
    }

    public final V m6894a(int i, K k, V v) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = i + 1;
        m6898d(i2);
        int i3 = i << 1;
        V f = m6889f(i3 + 1);
        m6887b(i3, k, v);
        if (i2 > this.f7567a) {
            this.f7567a = i2;
        }
        return f;
    }

    public C0713a<K, V> m6895b() {
        try {
            C0713a<K, V> c0713a = (C0713a) super.clone();
            Object obj = this.f7568b;
            if (obj == null) {
                return c0713a;
            }
            int length = obj.length;
            Object obj2 = new Object[length];
            c0713a.f7568b = obj2;
            System.arraycopy(obj, 0, obj2, 0, length);
            return c0713a;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final V m6896b(int i) {
        return (i < 0 || i >= this.f7567a) ? null : m6889f((i << 1) + 1);
    }

    public final V m6897c(int i) {
        return m6890g(i << 1);
    }

    public void clear() {
        this.f7567a = 0;
        this.f7568b = null;
    }

    public /* synthetic */ Object clone() {
        return m6895b();
    }

    public final boolean containsKey(Object obj) {
        return -2 != m6886b(obj);
    }

    public final boolean containsValue(Object obj) {
        int i = this.f7567a << 1;
        Object[] objArr = this.f7568b;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final void m6898d(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.f7568b;
        int i2 = i << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (i2 > length) {
            length = ((length / 2) * 3) + 1;
            if (length % 2 != 0) {
                length++;
            }
            if (length >= i2) {
                i2 = length;
            }
            m6888e(i2);
        }
    }

    public final Set<Entry<K, V>> entrySet() {
        return new C0716d(this);
    }

    public final V get(Object obj) {
        return m6889f(m6886b(obj) + 1);
    }

    public final V put(K k, V v) {
        int a = m6891a((Object) k);
        if (a == -1) {
            a = this.f7567a;
        }
        return m6894a(a, k, v);
    }

    public final V remove(Object obj) {
        return m6890g(m6886b(obj));
    }

    public final int size() {
        return this.f7567a;
    }
}
