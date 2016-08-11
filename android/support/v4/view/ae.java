package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;

public class ae {
    static final ao f420a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f420a = new af();
        } else if (i >= 19) {
            f420a = new an();
        } else if (i >= 17) {
            f420a = new am();
        } else if (i >= 16) {
            f420a = new al();
        } else if (i >= 14) {
            f420a = new ak();
        } else if (i >= 11) {
            f420a = new aj();
        } else if (i >= 9) {
            f420a = new ai();
        } else if (i >= 7) {
            f420a = new ah();
        } else {
            f420a = new ag();
        }
    }

    public static int m738a(View view) {
        return f420a.m746a(view);
    }

    public static void m739a(View view, int i, Paint paint) {
        f420a.m747a(view, i, paint);
    }

    public static void m740a(View view, C0097a c0097a) {
        f420a.m748a(view, c0097a);
    }

    public static void m741a(View view, Runnable runnable) {
        f420a.m749a(view, runnable);
    }

    public static boolean m742a(View view, int i) {
        return f420a.m750a(view, i);
    }

    public static void m743b(View view) {
        f420a.m751b(view);
    }

    public static void m744b(View view, int i) {
        f420a.m752b(view, i);
    }

    public static int m745c(View view) {
        return f420a.m753c(view);
    }
}
