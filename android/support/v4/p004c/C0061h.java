package android.support.v4.p004c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.c.h */
final class C0061h implements Set<Entry<K, V>> {
    final /* synthetic */ C0055f f339a;

    C0061h(C0055f c0055f) {
        this.f339a = c0055f;
    }

    public boolean m486a(Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ boolean add(Object obj) {
        return m486a((Entry) obj);
    }

    public boolean addAll(Collection<? extends Entry<K, V>> collection) {
        int a = this.f339a.m457a();
        for (Entry entry : collection) {
            this.f339a.m462a(entry.getKey(), entry.getValue());
        }
        return a != this.f339a.m457a();
    }

    public void clear() {
        this.f339a.m467c();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f339a.m458a(entry.getKey());
        return a >= 0 ? C0057c.m482a(this.f339a.m459a(a, 1), entry.getValue()) : false;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        return C0055f.m454a((Set) this, obj);
    }

    public int hashCode() {
        int a = this.f339a.m457a() - 1;
        int i = 0;
        while (a >= 0) {
            Object a2 = this.f339a.m459a(a, 0);
            Object a3 = this.f339a.m459a(a, 1);
            a--;
            i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f339a.m457a() == 0;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C0063j(this.f339a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f339a.m457a();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public <T> T[] toArray(T[] tArr) {
        throw new UnsupportedOperationException();
    }
}
