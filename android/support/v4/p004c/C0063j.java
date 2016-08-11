package android.support.v4.p004c;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.support.v4.c.j */
final class C0063j implements Iterator<Entry<K, V>>, Entry<K, V> {
    int f341a;
    int f342b;
    boolean f343c;
    final /* synthetic */ C0055f f344d;

    C0063j(C0055f c0055f) {
        this.f344d = c0055f;
        this.f343c = false;
        this.f341a = c0055f.m457a() - 1;
        this.f342b = -1;
    }

    public Entry<K, V> m487a() {
        this.f342b++;
        this.f343c = true;
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (!this.f343c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (!(C0057c.m482a(entry.getKey(), this.f344d.m459a(this.f342b, 0)) && C0057c.m482a(entry.getValue(), this.f344d.m459a(this.f342b, 1)))) {
                z = false;
            }
            return z;
        }
    }

    public K getKey() {
        if (this.f343c) {
            return this.f344d.m459a(this.f342b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public V getValue() {
        if (this.f343c) {
            return this.f344d.m459a(this.f342b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return this.f342b < this.f341a;
    }

    public final int hashCode() {
        int i = 0;
        if (this.f343c) {
            Object a = this.f344d.m459a(this.f342b, 0);
            Object a2 = this.f344d.m459a(this.f342b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public /* synthetic */ Object next() {
        return m487a();
    }

    public void remove() {
        if (this.f343c) {
            this.f344d.m461a(this.f342b);
            this.f342b--;
            this.f341a--;
            this.f343c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public V setValue(V v) {
        if (this.f343c) {
            return this.f344d.m460a(this.f342b, (Object) v);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
