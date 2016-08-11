package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

/* renamed from: android.support.v4.view.n */
public class C0110n {
    static final C0111r f444a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f444a = new C0114q();
        } else {
            f444a = new C0112o();
        }
    }

    public static boolean m880a(KeyEvent keyEvent) {
        return f444a.m883b(keyEvent.getMetaState());
    }

    public static boolean m881a(KeyEvent keyEvent, int i) {
        return f444a.m882a(keyEvent.getMetaState(), i);
    }
}
