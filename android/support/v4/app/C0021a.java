package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.p002a.C0018a;

/* renamed from: android.support.v4.app.a */
public class C0021a extends C0018a {
    public static void m124a(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            C0023b.m211a(activity);
        } else {
            activity.finish();
        }
    }
}
