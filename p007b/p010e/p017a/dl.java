package p007b.p010e.p017a;

import java.util.Comparator;
import p007b.p013b.C0210a;

/* renamed from: b.e.a.dl */
class dl implements Comparator {
    private dl() {
    }

    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        C0210a.m1505a(obj instanceof C0254q);
        C0210a.m1505a(obj2 instanceof C0254q);
        return ((C0254q) obj).m1804c() - ((C0254q) obj2).m1804c();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }
}
