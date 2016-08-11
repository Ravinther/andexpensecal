package android.support.v4.view;

class bc implements Runnable {
    final /* synthetic */ ViewPager f424a;

    bc(ViewPager viewPager) {
        this.f424a = viewPager;
    }

    public void run() {
        this.f424a.setScrollState(0);
        this.f424a.m563c();
    }
}
