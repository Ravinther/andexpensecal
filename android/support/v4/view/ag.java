package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import java.util.WeakHashMap;

class ag implements ao {
    WeakHashMap<View, Object> f421a;

    ag() {
        this.f421a = null;
    }

    public int m754a(View view) {
        return 2;
    }

    long m755a() {
        return 10;
    }

    public void m756a(View view, int i, Paint paint) {
    }

    public void m757a(View view, C0097a c0097a) {
    }

    public void m758a(View view, Runnable runnable) {
        view.postDelayed(runnable, m755a());
    }

    public boolean m759a(View view, int i) {
        return false;
    }

    public void m760b(View view) {
        view.invalidate();
    }

    public void m761b(View view, int i) {
    }

    public int m762c(View view) {
        return 0;
    }
}
