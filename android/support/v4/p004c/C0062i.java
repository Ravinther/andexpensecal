package android.support.v4.p004c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: android.support.v4.c.i */
final class C0062i implements Set<K> {
    final /* synthetic */ C0055f f340a;

    C0062i(C0055f c0055f) {
        this.f340a = c0055f;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f340a.m467c();
    }

    public boolean contains(Object obj) {
        return this.f340a.m458a(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        return C0055f.m453a(this.f340a.m465b(), (Collection) collection);
    }

    public boolean equals(Object obj) {
        return C0055f.m454a((Set) this, obj);
    }

    public int hashCode() {
        int i = 0;
        for (int a = this.f340a.m457a() - 1; a >= 0; a--) {
            Object a2 = this.f340a.m459a(a, 0);
            i += a2 == null ? 0 : a2.hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f340a.m457a() == 0;
    }

    public Iterator<K> iterator() {
        return new C0060g(this.f340a, 0);
    }

    public boolean remove(Object obj) {
        int a = this.f340a.m458a(obj);
        if (a < 0) {
            return false;
        }
        this.f340a.m461a(a);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        return C0055f.m455b(this.f340a.m465b(), collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return C0055f.m456c(this.f340a.m465b(), collection);
    }

    public int size() {
        return this.f340a.m457a();
    }

    public Object[] toArray() {
        return this.f340a.m466b(0);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f340a.m463a((Object[]) tArr, 0);
    }
}
