package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.y */
public abstract class C0022y {
    private DataSetObservable f108a;

    public C0022y() {
        this.f108a = new DataSetObservable();
    }

    public int m127a(Object obj) {
        return -1;
    }

    public Parcelable m128a() {
        return null;
    }

    public Object m129a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object m130a(ViewGroup viewGroup, int i) {
        return m129a((View) viewGroup, i);
    }

    public void m131a(DataSetObserver dataSetObserver) {
        this.f108a.registerObserver(dataSetObserver);
    }

    public void m132a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void m133a(View view) {
    }

    public void m134a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void m135a(ViewGroup viewGroup) {
        m133a((View) viewGroup);
    }

    public void m136a(ViewGroup viewGroup, int i, Object obj) {
        m134a((View) viewGroup, i, obj);
    }

    public abstract boolean m137a(View view, Object obj);

    public abstract int m138b();

    public void m139b(DataSetObserver dataSetObserver) {
        this.f108a.unregisterObserver(dataSetObserver);
    }

    public void m140b(View view) {
    }

    public void m141b(View view, int i, Object obj) {
    }

    public void m142b(ViewGroup viewGroup) {
        m140b((View) viewGroup);
    }

    public void m143b(ViewGroup viewGroup, int i, Object obj) {
        m141b((View) viewGroup, i, obj);
    }

    public CharSequence m144c(int i) {
        return null;
    }

    public void m145c() {
        this.f108a.notifyChanged();
    }

    public float m146d(int i) {
        return 1.0f;
    }
}
