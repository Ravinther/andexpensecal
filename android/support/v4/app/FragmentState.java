package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR;
    final String f97a;
    final int f98b;
    final boolean f99c;
    final int f100d;
    final int f101e;
    final String f102f;
    final boolean f103g;
    final boolean f104h;
    final Bundle f105i;
    Bundle f106j;
    C0032l f107k;

    static {
        CREATOR = new ac();
    }

    public FragmentState(Parcel parcel) {
        boolean z = true;
        this.f97a = parcel.readString();
        this.f98b = parcel.readInt();
        this.f99c = parcel.readInt() != 0;
        this.f100d = parcel.readInt();
        this.f101e = parcel.readInt();
        this.f102f = parcel.readString();
        this.f103g = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f104h = z;
        this.f105i = parcel.readBundle();
        this.f106j = parcel.readBundle();
    }

    public FragmentState(C0032l c0032l) {
        this.f97a = c0032l.getClass().getName();
        this.f98b = c0032l.f238p;
        this.f99c = c0032l.f247y;
        this.f100d = c0032l.f213G;
        this.f101e = c0032l.f214H;
        this.f102f = c0032l.f215I;
        this.f103g = c0032l.f218L;
        this.f104h = c0032l.f217K;
        this.f105i = c0032l.f240r;
    }

    public C0032l m123a(C0037o c0037o, C0032l c0032l) {
        if (this.f107k != null) {
            return this.f107k;
        }
        if (this.f105i != null) {
            this.f105i.setClassLoader(c0037o.getClassLoader());
        }
        this.f107k = C0032l.m260a((Context) c0037o, this.f97a, this.f105i);
        if (this.f106j != null) {
            this.f106j.setClassLoader(c0037o.getClassLoader());
            this.f107k.f236n = this.f106j;
        }
        this.f107k.m277a(this.f98b, c0032l);
        this.f107k.f247y = this.f99c;
        this.f107k.f207A = true;
        this.f107k.f213G = this.f100d;
        this.f107k.f214H = this.f101e;
        this.f107k.f215I = this.f102f;
        this.f107k.f218L = this.f103g;
        this.f107k.f217K = this.f104h;
        this.f107k.f209C = c0037o.f260b;
        if (C0043v.f282a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f107k);
        }
        return this.f107k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f97a);
        parcel.writeInt(this.f98b);
        parcel.writeInt(this.f99c ? 1 : 0);
        parcel.writeInt(this.f100d);
        parcel.writeInt(this.f101e);
        parcel.writeString(this.f102f);
        parcel.writeInt(this.f103g ? 1 : 0);
        if (!this.f104h) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f105i);
        parcel.writeBundle(this.f106j);
    }
}
