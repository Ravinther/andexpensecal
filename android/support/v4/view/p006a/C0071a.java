package android.support.v4.view.p006a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import com.expensemanager.adv;
import com.google.ads.AdSize;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.AdRequest;

/* renamed from: android.support.v4.view.a.a */
public class C0071a {
    private static final C0074d f405a;
    private final Object f406b;

    static {
        if (VERSION.SDK_INT >= 21) {
            f405a = new C0080b();
        } else if (VERSION.SDK_INT >= 19) {
            f405a = new C0079g();
        } else if (VERSION.SDK_INT >= 18) {
            f405a = new C0078f();
        } else if (VERSION.SDK_INT >= 16) {
            f405a = new C0077e();
        } else if (VERSION.SDK_INT >= 14) {
            f405a = new C0076c();
        } else {
            f405a = new C0075h();
        }
    }

    public C0071a(Object obj) {
        this.f406b = obj;
    }

    private static String m567b(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return "ACTION_FOCUS";
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return "ACTION_CLEAR_FOCUS";
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                return "ACTION_SELECT";
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public Object m568a() {
        return this.f406b;
    }

    public void m569a(int i) {
        f405a.m611a(this.f406b, i);
    }

    public void m570a(Rect rect) {
        f405a.m612a(this.f406b, rect);
    }

    public void m571a(CharSequence charSequence) {
        f405a.m613a(this.f406b, charSequence);
    }

    public void m572a(boolean z) {
        f405a.m614a(this.f406b, z);
    }

    public int m573b() {
        return f405a.m610a(this.f406b);
    }

    public void m574b(Rect rect) {
        f405a.m616b(this.f406b, rect);
    }

    public boolean m575c() {
        return f405a.m620f(this.f406b);
    }

    public boolean m576d() {
        return f405a.m621g(this.f406b);
    }

    public boolean m577e() {
        return f405a.m624j(this.f406b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0071a c0071a = (C0071a) obj;
        return this.f406b == null ? c0071a.f406b == null : this.f406b.equals(c0071a.f406b);
    }

    public boolean m578f() {
        return f405a.m625k(this.f406b);
    }

    public boolean m579g() {
        return f405a.m629o(this.f406b);
    }

    public boolean m580h() {
        return f405a.m622h(this.f406b);
    }

    public int hashCode() {
        return this.f406b == null ? 0 : this.f406b.hashCode();
    }

    public boolean m581i() {
        return f405a.m626l(this.f406b);
    }

    public boolean m582j() {
        return f405a.m623i(this.f406b);
    }

    public boolean m583k() {
        return f405a.m627m(this.f406b);
    }

    public boolean m584l() {
        return f405a.m628n(this.f406b);
    }

    public CharSequence m585m() {
        return f405a.m618d(this.f406b);
    }

    public CharSequence m586n() {
        return f405a.m615b(this.f406b);
    }

    public CharSequence m587o() {
        return f405a.m619e(this.f406b);
    }

    public CharSequence m588p() {
        return f405a.m617c(this.f406b);
    }

    public String m589q() {
        return f405a.m630p(this.f406b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m570a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m574b(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(m585m());
        stringBuilder.append("; className: ").append(m586n());
        stringBuilder.append("; text: ").append(m587o());
        stringBuilder.append("; contentDescription: ").append(m588p());
        stringBuilder.append("; viewId: ").append(m589q());
        stringBuilder.append("; checkable: ").append(m575c());
        stringBuilder.append("; checked: ").append(m576d());
        stringBuilder.append("; focusable: ").append(m577e());
        stringBuilder.append("; focused: ").append(m578f());
        stringBuilder.append("; selected: ").append(m579g());
        stringBuilder.append("; clickable: ").append(m580h());
        stringBuilder.append("; longClickable: ").append(m581i());
        stringBuilder.append("; enabled: ").append(m582j());
        stringBuilder.append("; password: ").append(m583k());
        stringBuilder.append("; scrollable: " + m584l());
        stringBuilder.append("; [");
        int b = m573b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(C0071a.m567b(numberOfTrailingZeros));
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
