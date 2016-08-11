package com.google.api.client.p050d;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.d.av */
class av implements Iterator<T> {
    final int f7584a;
    int f7585b;
    final /* synthetic */ au f7586c;

    av(au auVar) {
        this.f7586c = auVar;
        this.f7584a = Array.getLength(this.f7586c.f7583a);
        this.f7585b = 0;
    }

    public boolean hasNext() {
        return this.f7585b < this.f7584a;
    }

    public T next() {
        if (hasNext()) {
            Object obj = this.f7586c.f7583a;
            int i = this.f7585b;
            this.f7585b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
