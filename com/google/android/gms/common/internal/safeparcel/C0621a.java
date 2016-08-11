package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C0621a {
    public static int m4957a(int i) {
        return 65535 & i;
    }

    public static int m4958a(Parcel parcel) {
        return parcel.readInt();
    }

    public static int m4959a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static <T extends Parcelable> T m4960a(Parcel parcel, int i, Creator<T> creator) {
        int a = C0621a.m4959a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    private static void m4961a(Parcel parcel, int i, int i2) {
        int a = C0621a.m4959a(parcel, i);
        if (a != i2) {
            throw new C0622b("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    public static int m4962b(Parcel parcel) {
        int a = C0621a.m4958a(parcel);
        int a2 = C0621a.m4959a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (C0621a.m4957a(a) != 20293) {
            throw new C0622b("Expected object header. Got 0x" + Integer.toHexString(a), parcel);
        }
        a = dataPosition + a2;
        if (a >= dataPosition && a <= parcel.dataSize()) {
            return a;
        }
        throw new C0622b("Size read is invalid start=" + dataPosition + " end=" + a, parcel);
    }

    public static void m4963b(Parcel parcel, int i) {
        parcel.setDataPosition(C0621a.m4959a(parcel, i) + parcel.dataPosition());
    }

    public static <T> T[] m4964b(Parcel parcel, int i, Creator<T> creator) {
        int a = C0621a.m4959a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static <T> ArrayList<T> m4965c(Parcel parcel, int i, Creator<T> creator) {
        int a = C0621a.m4959a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static boolean m4966c(Parcel parcel, int i) {
        C0621a.m4961a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int m4967d(Parcel parcel, int i) {
        C0621a.m4961a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m4968e(Parcel parcel, int i) {
        C0621a.m4961a(parcel, i, 8);
        return parcel.readLong();
    }

    public static String m4969f(Parcel parcel, int i) {
        int a = C0621a.m4959a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m4970g(Parcel parcel, int i) {
        int a = C0621a.m4959a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle m4971h(Parcel parcel, int i) {
        int a = C0621a.m4959a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static ArrayList<String> m4972i(Parcel parcel, int i) {
        int a = C0621a.m4959a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }
}
