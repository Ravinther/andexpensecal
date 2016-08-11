package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

class bm implements Comparator<View> {
    bm() {
    }

    public int m832a(View view, View view2) {
        bf bfVar = (bf) view.getLayoutParams();
        bf bfVar2 = (bf) view2.getLayoutParams();
        return bfVar.f430a != bfVar2.f430a ? bfVar.f430a ? 1 : -1 : bfVar.f434e - bfVar2.f434e;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m832a((View) obj, (View) obj2);
    }
}
