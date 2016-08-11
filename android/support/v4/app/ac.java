package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ac implements Creator<FragmentState> {
    ac() {
    }

    public FragmentState m158a(Parcel parcel) {
        return new FragmentState(parcel);
    }

    public FragmentState[] m159a(int i) {
        return new FragmentState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m158a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m159a(i);
    }
}
