package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.j */
final class C0031j implements Creator<BackStackState> {
    C0031j() {
    }

    public BackStackState m257a(Parcel parcel) {
        return new BackStackState(parcel);
    }

    public BackStackState[] m258a(int i) {
        return new BackStackState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m257a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m258a(i);
    }
}
