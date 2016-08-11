package android.support.v4.p004c;

import java.util.Iterator;

/* renamed from: android.support.v4.c.g */
final class C0060g<T> implements Iterator<T> {
    final int f334a;
    int f335b;
    int f336c;
    boolean f337d;
    final /* synthetic */ C0055f f338e;

    C0060g(C0055f c0055f, int i) {
        this.f338e = c0055f;
        this.f337d = false;
        this.f334a = i;
        this.f335b = c0055f.m457a();
    }

    public boolean hasNext() {
        return this.f336c < this.f335b;
    }

    public T next() {
        T a = this.f338e.m459a(this.f336c, this.f334a);
        this.f336c++;
        this.f337d = true;
        return a;
    }

    public void remove() {
        if (this.f337d) {
            this.f336c--;
            this.f335b--;
            this.f337d = false;
            this.f338e.m461a(this.f336c);
            return;
        }
        throw new IllegalStateException();
    }
}
