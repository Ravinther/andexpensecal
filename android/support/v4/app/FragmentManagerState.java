package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR;
    FragmentState[] f94a;
    int[] f95b;
    BackStackState[] f96c;

    static {
        CREATOR = new aa();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f94a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f95b = parcel.createIntArray();
        this.f96c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f94a, i);
        parcel.writeIntArray(this.f95b);
        parcel.writeTypedArray(this.f96c, i);
    }
}
