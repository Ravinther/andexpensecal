package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p006a.C0071a;
import android.support.v4.view.p006a.C0096x;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class bg extends C0097a {
    final /* synthetic */ ViewPager f436b;

    bg(ViewPager viewPager) {
        this.f436b = viewPager;
    }

    private boolean m819b() {
        return this.f436b.f386h != null && this.f436b.f386h.m138b() > 1;
    }

    public void m820a(View view, C0071a c0071a) {
        super.m727a(view, c0071a);
        c0071a.m571a(ViewPager.class.getName());
        c0071a.m572a(m819b());
        if (this.f436b.canScrollHorizontally(1)) {
            c0071a.m569a(4096);
        }
        if (this.f436b.canScrollHorizontally(-1)) {
            c0071a.m569a(8192);
        }
    }

    public boolean m821a(View view, int i, Bundle bundle) {
        if (super.m729a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.f436b.canScrollHorizontally(1)) {
                    return false;
                }
                this.f436b.setCurrentItem(this.f436b.f387i + 1);
                return true;
            case 8192:
                if (!this.f436b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f436b.setCurrentItem(this.f436b.f387i - 1);
                return true;
            default:
                return false;
        }
    }

    public void m822d(View view, AccessibilityEvent accessibilityEvent) {
        super.m733d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        C0096x a = C0096x.m719a();
        a.m721a(m819b());
        if (accessibilityEvent.getEventType() == 4096 && this.f436b.f386h != null) {
            a.m720a(this.f436b.f386h.m138b());
            a.m722b(this.f436b.f387i);
            a.m723c(this.f436b.f387i);
        }
    }
}
