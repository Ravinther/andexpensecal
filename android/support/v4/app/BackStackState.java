package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR;
    final int[] f83a;
    final int f84b;
    final int f85c;
    final String f86d;
    final int f87e;
    final int f88f;
    final CharSequence f89g;
    final int f90h;
    final CharSequence f91i;
    final ArrayList<String> f92j;
    final ArrayList<String> f93k;

    static {
        CREATOR = new C0031j();
    }

    public BackStackState(Parcel parcel) {
        this.f83a = parcel.createIntArray();
        this.f84b = parcel.readInt();
        this.f85c = parcel.readInt();
        this.f86d = parcel.readString();
        this.f87e = parcel.readInt();
        this.f88f = parcel.readInt();
        this.f89g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f90h = parcel.readInt();
        this.f91i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f92j = parcel.createStringArrayList();
        this.f93k = parcel.createStringArrayList();
    }

    public BackStackState(C0043v c0043v, C0025d c0025d) {
        int i = 0;
        for (C0029h c0029h = c0025d.f156b; c0029h != null; c0029h = c0029h.f191a) {
            if (c0029h.f199i != null) {
                i += c0029h.f199i.size();
            }
        }
        this.f83a = new int[(i + (c0025d.f158d * 7))];
        if (c0025d.f165k) {
            i = 0;
            for (C0029h c0029h2 = c0025d.f156b; c0029h2 != null; c0029h2 = c0029h2.f191a) {
                int i2 = i + 1;
                this.f83a[i] = c0029h2.f193c;
                int i3 = i2 + 1;
                this.f83a[i2] = c0029h2.f194d != null ? c0029h2.f194d.f238p : -1;
                int i4 = i3 + 1;
                this.f83a[i3] = c0029h2.f195e;
                i2 = i4 + 1;
                this.f83a[i4] = c0029h2.f196f;
                i4 = i2 + 1;
                this.f83a[i2] = c0029h2.f197g;
                i2 = i4 + 1;
                this.f83a[i4] = c0029h2.f198h;
                if (c0029h2.f199i != null) {
                    int size = c0029h2.f199i.size();
                    i4 = i2 + 1;
                    this.f83a[i2] = size;
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i4 + 1;
                        this.f83a[i4] = ((C0032l) c0029h2.f199i.get(i2)).f238p;
                        i2++;
                        i4 = i3;
                    }
                    i = i4;
                } else {
                    i = i2 + 1;
                    this.f83a[i2] = 0;
                }
            }
            this.f84b = c0025d.f163i;
            this.f85c = c0025d.f164j;
            this.f86d = c0025d.f167m;
            this.f87e = c0025d.f169o;
            this.f88f = c0025d.f170p;
            this.f89g = c0025d.f171q;
            this.f90h = c0025d.f172r;
            this.f91i = c0025d.f173s;
            this.f92j = c0025d.f174t;
            this.f93k = c0025d.f175u;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0025d m122a(C0043v c0043v) {
        C0025d c0025d = new C0025d(c0043v);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f83a.length) {
            C0029h c0029h = new C0029h();
            int i3 = i2 + 1;
            c0029h.f193c = this.f83a[i2];
            if (C0043v.f282a) {
                Log.v("FragmentManager", "Instantiate " + c0025d + " op #" + i + " base fragment #" + this.f83a[i3]);
            }
            int i4 = i3 + 1;
            i2 = this.f83a[i3];
            if (i2 >= 0) {
                c0029h.f194d = (C0032l) c0043v.f288f.get(i2);
            } else {
                c0029h.f194d = null;
            }
            i3 = i4 + 1;
            c0029h.f195e = this.f83a[i4];
            i4 = i3 + 1;
            c0029h.f196f = this.f83a[i3];
            i3 = i4 + 1;
            c0029h.f197g = this.f83a[i4];
            int i5 = i3 + 1;
            c0029h.f198h = this.f83a[i3];
            i4 = i5 + 1;
            int i6 = this.f83a[i5];
            if (i6 > 0) {
                c0029h.f199i = new ArrayList(i6);
                i3 = 0;
                while (i3 < i6) {
                    if (C0043v.f282a) {
                        Log.v("FragmentManager", "Instantiate " + c0025d + " set remove fragment #" + this.f83a[i4]);
                    }
                    i5 = i4 + 1;
                    c0029h.f199i.add((C0032l) c0043v.f288f.get(this.f83a[i4]));
                    i3++;
                    i4 = i5;
                }
            }
            c0025d.m247a(c0029h);
            i++;
            i2 = i4;
        }
        c0025d.f163i = this.f84b;
        c0025d.f164j = this.f85c;
        c0025d.f167m = this.f86d;
        c0025d.f169o = this.f87e;
        c0025d.f165k = true;
        c0025d.f170p = this.f88f;
        c0025d.f171q = this.f89g;
        c0025d.f172r = this.f90h;
        c0025d.f173s = this.f91i;
        c0025d.f174t = this.f92j;
        c0025d.f175u = this.f93k;
        c0025d.m246a(1);
        return c0025d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f83a);
        parcel.writeInt(this.f84b);
        parcel.writeInt(this.f85c);
        parcel.writeString(this.f86d);
        parcel.writeInt(this.f87e);
        parcel.writeInt(this.f88f);
        TextUtils.writeToParcel(this.f89g, parcel, 0);
        parcel.writeInt(this.f90h);
        TextUtils.writeToParcel(this.f91i, parcel, 0);
        parcel.writeStringList(this.f92j);
        parcel.writeStringList(this.f93k);
    }
}
