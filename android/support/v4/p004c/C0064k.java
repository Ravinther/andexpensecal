package android.support.v4.p004c;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: android.support.v4.c.k */
final class C0064k implements Collection<V> {
    final /* synthetic */ C0055f f345a;

    C0064k(C0055f c0055f) {
        this.f345a = c0055f;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f345a.m467c();
    }

    public boolean contains(Object obj) {
        return this.f345a.m464b(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f345a.m457a() == 0;
    }

    public Iterator<V> iterator() {
        return new C0060g(this.f345a, 1);
    }

    public boolean remove(Object obj) {
        int b = this.f345a.m464b(obj);
        if (b < 0) {
            return false;
        }
        this.f345a.m461a(b);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        int i = 0;
        int a = this.f345a.m457a();
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f345a.m459a(i, 1))) {
                this.f345a.m461a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        int i = 0;
        int a = this.f345a.m457a();
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f345a.m459a(i, 1))) {
                this.f345a.m461a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public int size() {
        return this.f345a.m457a();
    }

    public Object[] toArray() {
        return this.f345a.m466b(1);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f345a.m463a((Object[]) tArr, 1);
    }
}
