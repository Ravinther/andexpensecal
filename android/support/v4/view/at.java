package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public class at {
    static final ay f423a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f423a = new ax();
        } else if (VERSION.SDK_INT >= 11) {
            f423a = new aw();
        } else if (VERSION.SDK_INT >= 8) {
            f423a = new av();
        } else {
            f423a = new au();
        }
    }

    public static int m782a(ViewConfiguration viewConfiguration) {
        return f423a.m783a(viewConfiguration);
    }
}
