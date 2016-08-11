package android.support.v4.view;

import android.database.DataSetObserver;

class bk extends DataSetObserver {
    final /* synthetic */ ViewPager f437a;

    private bk(ViewPager viewPager) {
        this.f437a = viewPager;
    }

    public void onChanged() {
        this.f437a.m562b();
    }

    public void onInvalidated() {
        this.f437a.m562b();
    }
}
