package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.p003b.C0050c;
import android.support.v4.view.ViewPager.SavedState;

final class bl implements C0050c<SavedState> {
    bl() {
    }

    public /* synthetic */ Object m828a(Parcel parcel, ClassLoader classLoader) {
        return m830b(parcel, classLoader);
    }

    public /* synthetic */ Object[] m829a(int i) {
        return m831b(i);
    }

    public SavedState m830b(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, classLoader);
    }

    public SavedState[] m831b(int i) {
        return new SavedState[i];
    }
}
