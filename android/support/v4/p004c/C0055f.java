package android.support.v4.p004c;

import android.support.v4.c.f$android.support.v4.c.h;
import android.support.v4.c.f$android.support.v4.c.i;
import android.support.v4.c.f$android.support.v4.c.k;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.c.f */
abstract class C0055f<K, V> {
    h f325b;
    i f326c;
    k f327d;

    C0055f() {
    }

    public static <K, V> boolean m453a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean m454a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (!(set.size() == set2.size() && set.containsAll(set2))) {
                z = false;
            }
            return z;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public static <K, V> boolean m455b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean m456c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract int m457a();

    protected abstract int m458a(Object obj);

    protected abstract Object m459a(int i, int i2);

    protected abstract V m460a(int i, V v);

    protected abstract void m461a(int i);

    protected abstract void m462a(K k, V v);

    public <T> T[] m463a(T[] tArr, int i) {
        int a = m457a();
        T[] tArr2 = tArr.length < a ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a) : tArr;
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = m459a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    protected abstract int m464b(Object obj);

    protected abstract Map<K, V> m465b();

    public Object[] m466b(int i) {
        int a = m457a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = m459a(i2, i);
        }
        return objArr;
    }

    protected abstract void m467c();

    public Set<Entry<K, V>> m468d() {
        if (this.f325b == null) {
            this.f325b = new C0061h(this);
        }
        return this.f325b;
    }

    public Set<K> m469e() {
        if (this.f326c == null) {
            this.f326c = new C0062i(this);
        }
        return this.f326c;
    }

    public Collection<V> m470f() {
        if (this.f327d == null) {
            this.f327d = new C0064k(this);
        }
        return this.f327d;
    }
}
