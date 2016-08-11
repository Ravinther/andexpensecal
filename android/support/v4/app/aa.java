package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class aa implements Creator<FragmentManagerState> {
    aa() {
    }

    public FragmentManagerState m125a(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public FragmentManagerState[] m126a(int i) {
        return new FragmentManagerState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m125a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m126a(i);
    }
}
