package android.support.v4.view.p006a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.n */
class C0088n implements C0087t {
    final /* synthetic */ C0083k f409a;
    final /* synthetic */ C0086m f410b;

    C0088n(C0086m c0086m, C0083k c0083k) {
        this.f410b = c0086m;
        this.f409a = c0083k;
    }

    public Object m705a(int i) {
        C0071a a = this.f409a.m694a(i);
        return a == null ? null : a.m568a();
    }

    public List<Object> m706a(String str, int i) {
        List a = this.f409a.m696a(str, i);
        List<Object> arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((C0071a) a.get(i2)).m568a());
        }
        return arrayList;
    }

    public boolean m707a(int i, int i2, Bundle bundle) {
        return this.f409a.m697a(i, i2, bundle);
    }
}
