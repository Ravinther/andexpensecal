package android.support.v4.p005d;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.d.e */
class C0070e {
    public static Object m521a(Context context) {
        return new EdgeEffect(context);
    }

    public static void m522a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    public static boolean m523a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public static boolean m524a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    public static boolean m525a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    public static void m526b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public static boolean m527c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
