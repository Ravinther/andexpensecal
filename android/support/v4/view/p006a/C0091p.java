package android.support.v4.view.p006a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.p */
class C0091p implements C0090w {
    final /* synthetic */ C0083k f411a;
    final /* synthetic */ C0089o f412b;

    C0091p(C0089o c0089o, C0083k c0083k) {
        this.f412b = c0089o;
        this.f411a = c0083k;
    }

    public Object m713a(int i) {
        C0071a a = this.f411a.m694a(i);
        return a == null ? null : a.m568a();
    }

    public List<Object> m714a(String str, int i) {
        List a = this.f411a.m696a(str, i);
        List<Object> arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((C0071a) a.get(i2)).m568a());
        }
        return arrayList;
    }

    public boolean m715a(int i, int i2, Bundle bundle) {
        return this.f411a.m697a(i, i2, bundle);
    }

    public Object m716b(int i) {
        C0071a b = this.f411a.m698b(i);
        return b == null ? null : b.m568a();
    }
}
