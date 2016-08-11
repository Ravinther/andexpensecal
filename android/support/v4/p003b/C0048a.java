package android.support.v4.p003b;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.b.a */
public class C0048a {
    public static <T> Creator<T> m436a(C0050c<T> c0050c) {
        if (VERSION.SDK_INT >= 13) {
            C0052e.m439a(c0050c);
        }
        return new C0049b(c0050c);
    }
}
