package android.support.v4.p003b;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: android.support.v4.b.d */
class C0051d<T> implements ClassLoaderCreator<T> {
    private final C0050c<T> f316a;

    public C0051d(C0050c<T> c0050c) {
        this.f316a = c0050c;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f316a.m437a(parcel, null);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f316a.m437a(parcel, classLoader);
    }

    public T[] newArray(int i) {
        return this.f316a.m438a(i);
    }
}
