package android.support.v4.p003b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.b.b */
class C0049b<T> implements Creator<T> {
    final C0050c<T> f315a;

    public C0049b(C0050c<T> c0050c) {
        this.f315a = c0050c;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f315a.m437a(parcel, null);
    }

    public T[] newArray(int i) {
        return this.f315a.m438a(i);
    }
}
