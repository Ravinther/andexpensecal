package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p003b.C0048a;
import android.support.v4.p005d.C0066a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
    private static final int[] f356a;
    private static final bm ag;
    private static final Comparator<be> f357c;
    private static final Interpolator f358d;
    private boolean f359A;
    private boolean f360B;
    private int f361C;
    private int f362D;
    private int f363E;
    private float f364F;
    private float f365G;
    private float f366H;
    private float f367I;
    private int f368J;
    private VelocityTracker f369K;
    private int f370L;
    private int f371M;
    private int f372N;
    private int f373O;
    private boolean f374P;
    private C0066a f375Q;
    private C0066a f376R;
    private boolean f377S;
    private boolean f378T;
    private boolean f379U;
    private int f380V;
    private bi f381W;
    private bi aa;
    private bh ab;
    private bj ac;
    private Method ad;
    private int ae;
    private ArrayList<View> af;
    private final Runnable ah;
    private int ai;
    private int f382b;
    private final ArrayList<be> f383e;
    private final be f384f;
    private final Rect f385g;
    private C0022y f386h;
    private int f387i;
    private int f388j;
    private Parcelable f389k;
    private ClassLoader f390l;
    private Scroller f391m;
    private bk f392n;
    private int f393o;
    private Drawable f394p;
    private int f395q;
    private int f396r;
    private float f397s;
    private float f398t;
    private int f399u;
    private int f400v;
    private boolean f401w;
    private boolean f402x;
    private boolean f403y;
    private int f404z;

    public class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR;
        int f353a;
        Parcelable f354b;
        ClassLoader f355c;

        static {
            CREATOR = C0048a.m436a(new bl());
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f353a = parcel.readInt();
            this.f354b = parcel.readParcelable(classLoader);
            this.f355c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f353a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f353a);
            parcel.writeParcelable(this.f354b, i);
        }
    }

    static {
        f356a = new int[]{16842931};
        f357c = new ba();
        f358d = new bb();
        ag = new bm();
    }

    public ViewPager(Context context) {
        super(context);
        this.f383e = new ArrayList();
        this.f384f = new be();
        this.f385g = new Rect();
        this.f388j = -1;
        this.f389k = null;
        this.f390l = null;
        this.f397s = -3.4028235E38f;
        this.f398t = Float.MAX_VALUE;
        this.f404z = 1;
        this.f368J = -1;
        this.f377S = true;
        this.f378T = false;
        this.ah = new bc(this);
        this.ai = 0;
        m551a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f383e = new ArrayList();
        this.f384f = new be();
        this.f385g = new Rect();
        this.f388j = -1;
        this.f389k = null;
        this.f390l = null;
        this.f397s = -3.4028235E38f;
        this.f398t = Float.MAX_VALUE;
        this.f404z = 1;
        this.f368J = -1;
        this.f377S = true;
        this.f378T = false;
        this.ah = new bc(this);
        this.ai = 0;
        m551a();
    }

    private int m528a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f372N || Math.abs(i2) <= this.f370L) {
            i = (int) ((i >= this.f387i ? 0.4f : 0.6f) + (((float) i) + f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f383e.size() <= 0) {
            return i;
        }
        return Math.max(((be) this.f383e.get(0)).f426b, Math.min(i, ((be) this.f383e.get(this.f383e.size() - 1)).f426b));
    }

    private Rect m529a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void m531a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f383e.isEmpty()) {
            be b = m560b(this.f387i);
            int min = (int) ((b != null ? Math.min(b.f429e, this.f398t) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m536a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.f391m.isFinished()) {
            this.f391m.startScroll(paddingLeft, 0, (int) (m560b(this.f387i).f429e * ((float) i)), 0, this.f391m.getDuration() - this.f391m.timePassed());
        }
    }

    private void m532a(int i, boolean z, int i2, boolean z2) {
        int max;
        be b = m560b(i);
        if (b != null) {
            max = (int) (Math.max(this.f397s, Math.min(b.f429e, this.f398t)) * ((float) getClientWidth()));
        } else {
            max = 0;
        }
        if (z) {
            m554a(max, 0, i2);
            if (z2 && this.f381W != null) {
                this.f381W.m824a(i);
            }
            if (z2 && this.aa != null) {
                this.aa.m824a(i);
                return;
            }
            return;
        }
        if (z2 && this.f381W != null) {
            this.f381W.m824a(i);
        }
        if (z2 && this.aa != null) {
            this.aa.m824a(i);
        }
        m536a(false);
        scrollTo(max, 0);
        m542d(max);
    }

    private void m534a(be beVar, int i, be beVar2) {
        float f;
        int i2;
        be beVar3;
        int i3;
        int b = this.f386h.m138b();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.f393o) / ((float) clientWidth) : 0.0f;
        if (beVar2 != null) {
            clientWidth = beVar2.f426b;
            int i4;
            if (clientWidth < beVar.f426b) {
                f = (beVar2.f429e + beVar2.f428d) + f2;
                i4 = clientWidth + 1;
                i2 = 0;
                while (i4 <= beVar.f426b && i2 < this.f383e.size()) {
                    beVar3 = (be) this.f383e.get(i2);
                    while (i4 > beVar3.f426b && i2 < this.f383e.size() - 1) {
                        i2++;
                        beVar3 = (be) this.f383e.get(i2);
                    }
                    while (i4 < beVar3.f426b) {
                        f += this.f386h.m146d(i4) + f2;
                        i4++;
                    }
                    beVar3.f429e = f;
                    f += beVar3.f428d + f2;
                    i4++;
                }
            } else if (clientWidth > beVar.f426b) {
                i2 = this.f383e.size() - 1;
                f = beVar2.f429e;
                i4 = clientWidth - 1;
                while (i4 >= beVar.f426b && i2 >= 0) {
                    beVar3 = (be) this.f383e.get(i2);
                    while (i4 < beVar3.f426b && i2 > 0) {
                        i2--;
                        beVar3 = (be) this.f383e.get(i2);
                    }
                    while (i4 > beVar3.f426b) {
                        f -= this.f386h.m146d(i4) + f2;
                        i4--;
                    }
                    f -= beVar3.f428d + f2;
                    beVar3.f429e = f;
                    i4--;
                }
            }
        }
        int size = this.f383e.size();
        float f3 = beVar.f429e;
        i2 = beVar.f426b - 1;
        this.f397s = beVar.f426b == 0 ? beVar.f429e : -3.4028235E38f;
        this.f398t = beVar.f426b == b + -1 ? (beVar.f429e + beVar.f428d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            beVar3 = (be) this.f383e.get(i3);
            f = f3;
            while (i2 > beVar3.f426b) {
                f -= this.f386h.m146d(i2) + f2;
                i2--;
            }
            f3 = f - (beVar3.f428d + f2);
            beVar3.f429e = f3;
            if (beVar3.f426b == 0) {
                this.f397s = f3;
            }
            i2--;
        }
        f3 = (beVar.f429e + beVar.f428d) + f2;
        i2 = beVar.f426b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            beVar3 = (be) this.f383e.get(i3);
            f = f3;
            while (i2 < beVar3.f426b) {
                f = (this.f386h.m146d(i2) + f2) + f;
                i2++;
            }
            if (beVar3.f426b == b - 1) {
                this.f398t = (beVar3.f428d + f) - 1.0f;
            }
            beVar3.f429e = f;
            f3 = f + (beVar3.f428d + f2);
            i2++;
        }
        this.f378T = false;
    }

    private void m535a(MotionEvent motionEvent) {
        int a = C0116t.m894a(motionEvent);
        if (C0116t.m896b(motionEvent, a) == this.f368J) {
            a = a == 0 ? 1 : 0;
            this.f364F = C0116t.m897c(motionEvent, a);
            this.f368J = C0116t.m896b(motionEvent, a);
            if (this.f369K != null) {
                this.f369K.clear();
            }
        }
    }

    private void m536a(boolean z) {
        int scrollX;
        boolean z2 = this.ai == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f391m.abortAnimation();
            scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f391m.getCurrX();
            int currY = this.f391m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f403y = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.f383e.size(); scrollX++) {
            be beVar = (be) this.f383e.get(scrollX);
            if (beVar.f427c) {
                beVar.f427c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            ae.m741a((View) this, this.ah);
        } else {
            this.ah.run();
        }
    }

    private boolean m537a(float f, float f2) {
        return (f < ((float) this.f362D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f362D)) && f2 < 0.0f);
    }

    private void m539b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ae.m739a(getChildAt(i), z ? 2 : 0, null);
        }
    }

    private boolean m540b(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.f364F - f;
        this.f364F = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.f397s;
        float f5 = ((float) clientWidth) * this.f398t;
        be beVar = (be) this.f383e.get(0);
        be beVar2 = (be) this.f383e.get(this.f383e.size() - 1);
        if (beVar.f426b != 0) {
            f4 = beVar.f429e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (beVar2.f426b != this.f386h.m138b() - 1) {
            f2 = beVar2.f429e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.f375Q.m496a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.f376R.m496a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.f364F += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        m542d((int) f4);
        return z3;
    }

    private void m541c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean m542d(int i) {
        if (this.f383e.size() == 0) {
            this.f379U = false;
            m553a(0, 0.0f, 0);
            if (this.f379U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        be i2 = m546i();
        int clientWidth = getClientWidth();
        int i3 = this.f393o + clientWidth;
        float f = ((float) this.f393o) / ((float) clientWidth);
        int i4 = i2.f426b;
        float f2 = ((((float) i) / ((float) clientWidth)) - i2.f429e) / (i2.f428d + f);
        clientWidth = (int) (((float) i3) * f2);
        this.f379U = false;
        m553a(i4, f2, clientWidth);
        if (this.f379U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void m544g() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((bf) getChildAt(i).getLayoutParams()).f430a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void m545h() {
        if (this.ae != 0) {
            if (this.af == null) {
                this.af = new ArrayList();
            } else {
                this.af.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.af.add(getChildAt(i));
            }
            Collections.sort(this.af, ag);
        }
    }

    private be m546i() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f393o) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        be beVar = null;
        while (i2 < this.f383e.size()) {
            int i3;
            be beVar2;
            be beVar3 = (be) this.f383e.get(i2);
            be beVar4;
            if (obj != null || beVar3.f426b == i + 1) {
                beVar4 = beVar3;
                i3 = i2;
                beVar2 = beVar4;
            } else {
                beVar3 = this.f384f;
                beVar3.f429e = (f2 + f3) + f;
                beVar3.f426b = i + 1;
                beVar3.f428d = this.f386h.m146d(beVar3.f426b);
                beVar4 = beVar3;
                i3 = i2 - 1;
                beVar2 = beVar4;
            }
            f2 = beVar2.f429e;
            f3 = (beVar2.f428d + f2) + f;
            if (obj == null && scrollX < f2) {
                return beVar;
            }
            if (scrollX < f3 || i3 == this.f383e.size() - 1) {
                return beVar2;
            }
            f3 = f2;
            i = beVar2.f426b;
            obj = null;
            f2 = beVar2.f428d;
            beVar = beVar2;
            i2 = i3 + 1;
        }
        return beVar;
    }

    private void m547j() {
        this.f359A = false;
        this.f360B = false;
        if (this.f369K != null) {
            this.f369K.recycle();
            this.f369K = null;
        }
    }

    private void setScrollState(int i) {
        if (this.ai != i) {
            this.ai = i;
            if (this.ac != null) {
                m539b(i != 0);
            }
            if (this.f381W != null) {
                this.f381W.m826b(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f402x != z) {
            this.f402x = z;
        }
    }

    float m548a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    be m549a(int i, int i2) {
        be beVar = new be();
        beVar.f426b = i;
        beVar.f425a = this.f386h.m130a((ViewGroup) this, i);
        beVar.f428d = this.f386h.m146d(i);
        if (i2 < 0 || i2 >= this.f383e.size()) {
            this.f383e.add(beVar);
        } else {
            this.f383e.add(i2, beVar);
        }
        return beVar;
    }

    be m550a(View view) {
        for (int i = 0; i < this.f383e.size(); i++) {
            be beVar = (be) this.f383e.get(i);
            if (this.f386h.m137a(view, beVar.f425a)) {
                return beVar;
            }
        }
        return null;
    }

    void m551a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f391m = new Scroller(context, f358d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f363E = at.m782a(viewConfiguration);
        this.f370L = (int) (400.0f * f);
        this.f371M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f375Q = new C0066a(context);
        this.f376R = new C0066a(context);
        this.f372N = (int) (25.0f * f);
        this.f373O = (int) (2.0f * f);
        this.f361C = (int) (16.0f * f);
        ae.m740a((View) this, new bg(this));
        if (ae.m745c(this) == 0) {
            ae.m744b(this, 1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m552a(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.f387i;
        r0 = r19;
        if (r4 == r0) goto L_0x033f;
    L_0x000a:
        r0 = r18;
        r2 = r0.f387i;
        r0 = r19;
        if (r2 >= r0) goto L_0x0030;
    L_0x0012:
        r2 = 66;
    L_0x0014:
        r0 = r18;
        r3 = r0.f387i;
        r0 = r18;
        r3 = r0.m560b(r3);
        r0 = r19;
        r1 = r18;
        r1.f387i = r0;
        r4 = r3;
        r3 = r2;
    L_0x0026:
        r0 = r18;
        r2 = r0.f386h;
        if (r2 != 0) goto L_0x0033;
    L_0x002c:
        r18.m545h();
    L_0x002f:
        return;
    L_0x0030:
        r2 = 17;
        goto L_0x0014;
    L_0x0033:
        r0 = r18;
        r2 = r0.f403y;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r18.m545h();
        goto L_0x002f;
    L_0x003d:
        r2 = r18.getWindowToken();
        if (r2 == 0) goto L_0x002f;
    L_0x0043:
        r0 = r18;
        r2 = r0.f386h;
        r0 = r18;
        r2.m135a(r0);
        r0 = r18;
        r2 = r0.f404z;
        r5 = 0;
        r0 = r18;
        r6 = r0.f387i;
        r6 = r6 - r2;
        r11 = java.lang.Math.max(r5, r6);
        r0 = r18;
        r5 = r0.f386h;
        r12 = r5.m138b();
        r5 = r12 + -1;
        r0 = r18;
        r6 = r0.f387i;
        r2 = r2 + r6;
        r13 = java.lang.Math.min(r5, r2);
        r0 = r18;
        r2 = r0.f382b;
        if (r12 == r2) goto L_0x00da;
    L_0x0073:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00d0 }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00d0 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00d0 }
    L_0x007f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4 = r4.append(r5);
        r0 = r18;
        r5 = r0.f382b;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.f386h;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00d0:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x007f;
    L_0x00da:
        r6 = 0;
        r2 = 0;
        r5 = r2;
    L_0x00dd:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x033c;
    L_0x00e7:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.be) r2;
        r7 = r2.f426b;
        r0 = r18;
        r8 = r0.f387i;
        if (r7 < r8) goto L_0x01cf;
    L_0x00f9:
        r7 = r2.f426b;
        r0 = r18;
        r8 = r0.f387i;
        if (r7 != r8) goto L_0x033c;
    L_0x0101:
        if (r2 != 0) goto L_0x0339;
    L_0x0103:
        if (r12 <= 0) goto L_0x0339;
    L_0x0105:
        r0 = r18;
        r2 = r0.f387i;
        r0 = r18;
        r2 = r0.m549a(r2, r5);
        r10 = r2;
    L_0x0110:
        if (r10 == 0) goto L_0x0180;
    L_0x0112:
        r9 = 0;
        r8 = r5 + -1;
        if (r8 < 0) goto L_0x01d4;
    L_0x0117:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.be) r2;
    L_0x0121:
        r14 = r18.getClientWidth();
        if (r14 > 0) goto L_0x01d7;
    L_0x0127:
        r6 = 0;
    L_0x0128:
        r0 = r18;
        r7 = r0.f387i;
        r7 = r7 + -1;
        r16 = r7;
        r7 = r9;
        r9 = r16;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x0138:
        if (r9 < 0) goto L_0x0142;
    L_0x013a:
        r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0216;
    L_0x013e:
        if (r9 >= r11) goto L_0x0216;
    L_0x0140:
        if (r2 != 0) goto L_0x01e6;
    L_0x0142:
        r6 = r10.f428d;
        r9 = r8 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x017b;
    L_0x014c:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.size();
        if (r9 >= r2) goto L_0x024c;
    L_0x0156:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r9);
        r2 = (android.support.v4.view.be) r2;
        r7 = r2;
    L_0x0161:
        if (r14 > 0) goto L_0x024f;
    L_0x0163:
        r2 = 0;
        r5 = r2;
    L_0x0165:
        r0 = r18;
        r2 = r0.f387i;
        r2 = r2 + 1;
        r16 = r2;
        r2 = r7;
        r7 = r9;
        r9 = r16;
    L_0x0171:
        if (r9 >= r12) goto L_0x017b;
    L_0x0173:
        r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r11 < 0) goto L_0x029a;
    L_0x0177:
        if (r9 <= r13) goto L_0x029a;
    L_0x0179:
        if (r2 != 0) goto L_0x025c;
    L_0x017b:
        r0 = r18;
        r0.m534a(r10, r8, r4);
    L_0x0180:
        r0 = r18;
        r4 = r0.f386h;
        r0 = r18;
        r5 = r0.f387i;
        if (r10 == 0) goto L_0x02e8;
    L_0x018a:
        r2 = r10.f425a;
    L_0x018c:
        r0 = r18;
        r4.m143b(r0, r5, r2);
        r0 = r18;
        r2 = r0.f386h;
        r0 = r18;
        r2.m142b(r0);
        r5 = r18.getChildCount();
        r2 = 0;
        r4 = r2;
    L_0x01a0:
        if (r4 >= r5) goto L_0x02eb;
    L_0x01a2:
        r0 = r18;
        r6 = r0.getChildAt(r4);
        r2 = r6.getLayoutParams();
        r2 = (android.support.v4.view.bf) r2;
        r2.f435f = r4;
        r7 = r2.f430a;
        if (r7 != 0) goto L_0x01cb;
    L_0x01b4:
        r7 = r2.f432c;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x01cb;
    L_0x01bb:
        r0 = r18;
        r6 = r0.m550a(r6);
        if (r6 == 0) goto L_0x01cb;
    L_0x01c3:
        r7 = r6.f428d;
        r2.f432c = r7;
        r6 = r6.f426b;
        r2.f434e = r6;
    L_0x01cb:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x01a0;
    L_0x01cf:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x00dd;
    L_0x01d4:
        r2 = 0;
        goto L_0x0121;
    L_0x01d7:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r10.f428d;
        r6 = r6 - r7;
        r7 = r18.getPaddingLeft();
        r7 = (float) r7;
        r15 = (float) r14;
        r7 = r7 / r15;
        r6 = r6 + r7;
        goto L_0x0128;
    L_0x01e6:
        r15 = r2.f426b;
        if (r9 != r15) goto L_0x0210;
    L_0x01ea:
        r15 = r2.f427c;
        if (r15 != 0) goto L_0x0210;
    L_0x01ee:
        r0 = r18;
        r15 = r0.f383e;
        r15.remove(r5);
        r0 = r18;
        r15 = r0.f386h;
        r2 = r2.f425a;
        r0 = r18;
        r15.m136a(r0, r9, r2);
        r5 = r5 + -1;
        r8 = r8 + -1;
        if (r5 < 0) goto L_0x0214;
    L_0x0206:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.be) r2;
    L_0x0210:
        r9 = r9 + -1;
        goto L_0x0138;
    L_0x0214:
        r2 = 0;
        goto L_0x0210;
    L_0x0216:
        if (r2 == 0) goto L_0x0230;
    L_0x0218:
        r15 = r2.f426b;
        if (r9 != r15) goto L_0x0230;
    L_0x021c:
        r2 = r2.f428d;
        r7 = r7 + r2;
        r5 = r5 + -1;
        if (r5 < 0) goto L_0x022e;
    L_0x0223:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.be) r2;
        goto L_0x0210;
    L_0x022e:
        r2 = 0;
        goto L_0x0210;
    L_0x0230:
        r2 = r5 + 1;
        r0 = r18;
        r2 = r0.m549a(r9, r2);
        r2 = r2.f428d;
        r7 = r7 + r2;
        r8 = r8 + 1;
        if (r5 < 0) goto L_0x024a;
    L_0x023f:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.be) r2;
        goto L_0x0210;
    L_0x024a:
        r2 = 0;
        goto L_0x0210;
    L_0x024c:
        r7 = 0;
        goto L_0x0161;
    L_0x024f:
        r2 = r18.getPaddingRight();
        r2 = (float) r2;
        r5 = (float) r14;
        r2 = r2 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r5;
        r5 = r2;
        goto L_0x0165;
    L_0x025c:
        r11 = r2.f426b;
        if (r9 != r11) goto L_0x0332;
    L_0x0260:
        r11 = r2.f427c;
        if (r11 != 0) goto L_0x0332;
    L_0x0264:
        r0 = r18;
        r11 = r0.f383e;
        r11.remove(r7);
        r0 = r18;
        r11 = r0.f386h;
        r2 = r2.f425a;
        r0 = r18;
        r11.m136a(r0, r9, r2);
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0298;
    L_0x0280:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.be) r2;
    L_0x028a:
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x028f:
        r9 = r9 + 1;
        r16 = r2;
        r2 = r6;
        r6 = r16;
        goto L_0x0171;
    L_0x0298:
        r2 = 0;
        goto L_0x028a;
    L_0x029a:
        if (r2 == 0) goto L_0x02c1;
    L_0x029c:
        r11 = r2.f426b;
        if (r9 != r11) goto L_0x02c1;
    L_0x02a0:
        r2 = r2.f428d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02bf;
    L_0x02af:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.be) r2;
    L_0x02b9:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02bf:
        r2 = 0;
        goto L_0x02b9;
    L_0x02c1:
        r0 = r18;
        r2 = r0.m549a(r9, r7);
        r7 = r7 + 1;
        r2 = r2.f428d;
        r6 = r6 + r2;
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02e6;
    L_0x02d6:
        r0 = r18;
        r2 = r0.f383e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.be) r2;
    L_0x02e0:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02e6:
        r2 = 0;
        goto L_0x02e0;
    L_0x02e8:
        r2 = 0;
        goto L_0x018c;
    L_0x02eb:
        r18.m545h();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x02f4:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0330;
    L_0x02fa:
        r0 = r18;
        r2 = r0.m561b(r2);
    L_0x0300:
        if (r2 == 0) goto L_0x030a;
    L_0x0302:
        r2 = r2.f426b;
        r0 = r18;
        r4 = r0.f387i;
        if (r2 == r4) goto L_0x002f;
    L_0x030a:
        r2 = 0;
    L_0x030b:
        r4 = r18.getChildCount();
        if (r2 >= r4) goto L_0x002f;
    L_0x0311:
        r0 = r18;
        r4 = r0.getChildAt(r2);
        r0 = r18;
        r5 = r0.m550a(r4);
        if (r5 == 0) goto L_0x032d;
    L_0x031f:
        r5 = r5.f426b;
        r0 = r18;
        r6 = r0.f387i;
        if (r5 != r6) goto L_0x032d;
    L_0x0327:
        r4 = r4.requestFocus(r3);
        if (r4 != 0) goto L_0x002f;
    L_0x032d:
        r2 = r2 + 1;
        goto L_0x030b;
    L_0x0330:
        r2 = 0;
        goto L_0x0300;
    L_0x0332:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x0339:
        r10 = r2;
        goto L_0x0110;
    L_0x033c:
        r2 = r6;
        goto L_0x0101;
    L_0x033f:
        r4 = r3;
        r3 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    protected void m553a(int i, float f, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        if (this.f380V > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                bf bfVar = (bf) childAt.getLayoutParams();
                if (bfVar.f430a) {
                    int max;
                    switch (bfVar.f431b & 7) {
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i4 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        default:
                            max = paddingLeft;
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i4 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i4;
                }
                i3++;
                i4 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i4;
            }
        }
        if (this.f381W != null) {
            this.f381W.m825a(i, f, i2);
        }
        if (this.aa != null) {
            this.aa.m825a(i, f, i2);
        }
        if (this.ac != null) {
            paddingRight = getScrollX();
            i3 = getChildCount();
            for (paddingLeft = 0; paddingLeft < i3; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((bf) childAt2.getLayoutParams()).f430a) {
                    this.ac.m827a(childAt2, ((float) (childAt2.getLeft() - paddingRight)) / ((float) getClientWidth()));
                }
            }
        }
        this.f379U = true;
    }

    void m554a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m536a(false);
            m563c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float a = (((float) i6) * m548a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) clientWidth)))) + ((float) i6);
        int abs = Math.abs(i3);
        if (abs > 0) {
            clientWidth = Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4;
        } else {
            clientWidth = (int) (((((float) Math.abs(i4)) / ((((float) clientWidth) * this.f386h.m146d(this.f387i)) + ((float) this.f393o))) + 1.0f) * 100.0f);
        }
        this.f391m.startScroll(scrollX, scrollY, i4, i5, Math.min(clientWidth, 600));
        ae.m743b(this);
    }

    public void m555a(int i, boolean z) {
        this.f403y = false;
        m556a(i, z, false);
    }

    void m556a(int i, boolean z, boolean z2) {
        m557a(i, z, z2, 0);
    }

    void m557a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f386h == null || this.f386h.m138b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f387i != i || this.f383e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f386h.m138b()) {
                i = this.f386h.m138b() - 1;
            }
            int i3 = this.f404z;
            if (i > this.f387i + i3 || i < this.f387i - i3) {
                for (int i4 = 0; i4 < this.f383e.size(); i4++) {
                    ((be) this.f383e.get(i4)).f427c = true;
                }
            }
            if (this.f387i != i) {
                z3 = true;
            }
            if (this.f377S) {
                this.f387i = i;
                if (z3 && this.f381W != null) {
                    this.f381W.m824a(i);
                }
                if (z3 && this.aa != null) {
                    this.aa.m824a(i);
                }
                requestLayout();
                return;
            }
            m552a(i);
            m532a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean m558a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return m564c(17);
            case 22:
                return m564c(66);
            case 61:
                return VERSION.SDK_INT >= 11 ? C0110n.m880a(keyEvent) ? m564c(2) : C0110n.m881a(keyEvent, 1) ? m564c(1) : false : false;
            default:
                return false;
        }
    }

    protected boolean m559a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m559a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && ae.m742a(view, -i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    be a = m550a(childAt);
                    if (a != null && a.f426b == this.f387i) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                be a = m550a(childAt);
                if (a != null && a.f426b == this.f387i) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        bf bfVar = (bf) generateLayoutParams;
        bfVar.f430a |= view instanceof bd;
        if (!this.f401w) {
            super.addView(view, i, generateLayoutParams);
        } else if (bfVar == null || !bfVar.f430a) {
            bfVar.f433d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    be m560b(int i) {
        for (int i2 = 0; i2 < this.f383e.size(); i2++) {
            be beVar = (be) this.f383e.get(i2);
            if (beVar.f426b == i) {
                return beVar;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v4.view.be m561b(android.view.View r3) {
        /*
        r2 = this;
    L_0x0000:
        r0 = r3.getParent();
        if (r0 == r2) goto L_0x0012;
    L_0x0006:
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r1 = r0 instanceof android.view.View;
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        r0 = 0;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = (android.view.View) r0;
        r3 = r0;
        goto L_0x0000;
    L_0x0012:
        r0 = r2.m550a(r3);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.b(android.view.View):android.support.v4.view.be");
    }

    void m562b() {
        int b = this.f386h.m138b();
        this.f382b = b;
        boolean z = this.f383e.size() < (this.f404z * 2) + 1 && this.f383e.size() < b;
        boolean z2 = false;
        int i = this.f387i;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.f383e.size()) {
            int i3;
            boolean z4;
            int i4;
            boolean z5;
            be beVar = (be) this.f383e.get(i2);
            int a = this.f386h.m127a(beVar.f425a);
            if (a == -1) {
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = z3;
            } else if (a == -2) {
                this.f383e.remove(i2);
                i2--;
                if (!z2) {
                    this.f386h.m135a((ViewGroup) this);
                    z2 = true;
                }
                this.f386h.m136a((ViewGroup) this, beVar.f426b, beVar.f425a);
                if (this.f387i == beVar.f426b) {
                    i3 = i2;
                    z4 = z2;
                    i4 = Math.max(0, Math.min(this.f387i, b - 1));
                    z5 = true;
                } else {
                    i3 = i2;
                    z4 = z2;
                    i4 = i;
                    z5 = true;
                }
            } else if (beVar.f426b != a) {
                if (beVar.f426b == this.f387i) {
                    i = a;
                }
                beVar.f426b = a;
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = true;
            } else {
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = z3;
            }
            z3 = z5;
            i = i4;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.f386h.m142b((ViewGroup) this);
        }
        Collections.sort(this.f383e, f357c);
        if (z3) {
            i4 = getChildCount();
            for (i2 = 0; i2 < i4; i2++) {
                bf bfVar = (bf) getChildAt(i2).getLayoutParams();
                if (!bfVar.f430a) {
                    bfVar.f432c = 0.0f;
                }
            }
            m556a(i, false, true);
            requestLayout();
        }
    }

    void m563c() {
        m552a(this.f387i);
    }

    public boolean m564c(int i) {
        View view;
        boolean d;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                d = m565d();
            } else {
                if (i == 66 || i == 2) {
                    d = m566e();
                }
                d = false;
            }
        } else if (i == 17) {
            d = (view == null || m529a(this.f385g, findNextFocus).left < m529a(this.f385g, view).left) ? findNextFocus.requestFocus() : m565d();
        } else {
            if (i == 66) {
                d = (view == null || m529a(this.f385g, findNextFocus).left > m529a(this.f385g, view).left) ? findNextFocus.requestFocus() : m566e();
            }
            d = false;
        }
        if (d) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return d;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = true;
        if (this.f386h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.f397s))) {
                z = false;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.f398t))) {
                z = false;
            }
            return z;
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof bf) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f391m.isFinished() || !this.f391m.computeScrollOffset()) {
            m536a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f391m.getCurrX();
        int currY = this.f391m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m542d(currX)) {
                this.f391m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ae.m743b(this);
    }

    boolean m565d() {
        if (this.f387i <= 0) {
            return false;
        }
        m555a(this.f387i - 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m558a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                be a = m550a(childAt);
                if (a != null && a.f426b == this.f387i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int a = ae.m738a(this);
        if (a == 0 || (a == 1 && this.f386h != null && this.f386h.m138b() > 1)) {
            int height;
            int width;
            if (!this.f375Q.m495a()) {
                a = canvas.save();
                height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f397s * ((float) width));
                this.f375Q.m494a(height, width);
                i = 0 | this.f375Q.m497a(canvas);
                canvas.restoreToCount(a);
            }
            if (!this.f376R.m495a()) {
                a = canvas.save();
                height = getWidth();
                width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f398t + 1.0f)) * ((float) height));
                this.f376R.m494a(width, height);
                i |= this.f376R.m497a(canvas);
                canvas.restoreToCount(a);
            }
        } else {
            this.f375Q.m498b();
            this.f376R.m498b();
        }
        if (i != 0) {
            ae.m743b(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f394p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    boolean m566e() {
        if (this.f386h == null || this.f387i >= this.f386h.m138b() - 1) {
            return false;
        }
        m555a(this.f387i + 1, true);
        return true;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new bf();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bf(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0022y getAdapter() {
        return this.f386h;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ae == 2) {
            i2 = (i - 1) - i2;
        }
        return ((bf) ((View) this.af.get(i2)).getLayoutParams()).f435f;
    }

    public int getCurrentItem() {
        return this.f387i;
    }

    public int getOffscreenPageLimit() {
        return this.f404z;
    }

    public int getPageMargin() {
        return this.f393o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f377S = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.ah);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f393o > 0 && this.f394p != null && this.f383e.size() > 0 && this.f386h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.f393o) / ((float) width);
            be beVar = (be) this.f383e.get(0);
            float f2 = beVar.f429e;
            int size = this.f383e.size();
            int i = beVar.f426b;
            int i2 = ((be) this.f383e.get(size - 1)).f426b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > beVar.f426b && i3 < size) {
                    i3++;
                    beVar = (be) this.f383e.get(i3);
                }
                if (i4 == beVar.f426b) {
                    f3 = (beVar.f429e + beVar.f428d) * ((float) width);
                    f2 = (beVar.f429e + beVar.f428d) + f;
                } else {
                    float d = this.f386h.m146d(i4);
                    f3 = (f2 + d) * ((float) width);
                    f2 += d + f;
                }
                if (((float) this.f393o) + f3 > ((float) scrollX)) {
                    this.f394p.setBounds((int) f3, this.f395q, (int) ((((float) this.f393o) + f3) + 0.5f), this.f396r);
                    this.f394p.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f359A = false;
            this.f360B = false;
            this.f368J = -1;
            if (this.f369K == null) {
                return false;
            }
            this.f369K.recycle();
            this.f369K = null;
            return false;
        }
        if (action != 0) {
            if (this.f359A) {
                return true;
            }
            if (this.f360B) {
                return false;
            }
        }
        switch (action) {
            case C0607c.AdsAttrs_adSize /*0*/:
                float x = motionEvent.getX();
                this.f366H = x;
                this.f364F = x;
                x = motionEvent.getY();
                this.f367I = x;
                this.f365G = x;
                this.f368J = C0116t.m896b(motionEvent, 0);
                this.f360B = false;
                this.f391m.computeScrollOffset();
                if (this.ai == 2 && Math.abs(this.f391m.getFinalX() - this.f391m.getCurrX()) > this.f373O) {
                    this.f391m.abortAnimation();
                    this.f403y = false;
                    m563c();
                    this.f359A = true;
                    m541c(true);
                    setScrollState(1);
                    break;
                }
                m536a(false);
                this.f359A = false;
                break;
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                action = this.f368J;
                if (action != -1) {
                    action = C0116t.m895a(motionEvent, action);
                    float c = C0116t.m897c(motionEvent, action);
                    float f = c - this.f364F;
                    float abs = Math.abs(f);
                    float d = C0116t.m898d(motionEvent, action);
                    float abs2 = Math.abs(d - this.f367I);
                    if (f == 0.0f || m537a(this.f364F, f) || !m559a(this, false, (int) f, (int) c, (int) d)) {
                        if (abs > ((float) this.f363E) && 0.5f * abs > abs2) {
                            this.f359A = true;
                            m541c(true);
                            setScrollState(1);
                            this.f364F = f > 0.0f ? this.f366H + ((float) this.f363E) : this.f366H - ((float) this.f363E);
                            this.f365G = d;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) this.f363E)) {
                            this.f360B = true;
                        }
                        if (this.f359A && m540b(c)) {
                            ae.m743b(this);
                            break;
                        }
                    }
                    this.f364F = c;
                    this.f365G = d;
                    this.f360B = true;
                    return false;
                }
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                m535a(motionEvent);
                break;
        }
        if (this.f369K == null) {
            this.f369K = VelocityTracker.obtain();
        }
        this.f369K.addMovement(motionEvent);
        return this.f359A;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bf bfVar;
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                bfVar = (bf) childAt.getLayoutParams();
                if (bfVar.f430a) {
                    int i9 = bfVar.f431b & 112;
                    switch (bfVar.f431b & 7) {
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                bfVar = (bf) childAt2.getLayoutParams();
                if (!bfVar.f430a) {
                    be a = m550a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.f429e * ((float) max))) + paddingLeft;
                        if (bfVar.f433d) {
                            bfVar.f433d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (bfVar.f432c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f395q = paddingTop;
        this.f396r = i6 - paddingBottom;
        this.f380V = i7;
        if (this.f377S) {
            m532a(this.f387i, false, 0, false);
        }
        this.f377S = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f362D = Math.min(measuredWidth / 10, this.f361C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            bf bfVar;
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                bfVar = (bf) childAt.getLayoutParams();
                if (bfVar != null && bfVar.f430a) {
                    int i6 = bfVar.f431b & 7;
                    int i7 = bfVar.f431b & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (bfVar.width != -2) {
                        i7 = 1073741824;
                        i3 = bfVar.width != -1 ? bfVar.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (bfVar.height != -2) {
                        i5 = 1073741824;
                        if (bfVar.height != -1) {
                            measuredWidth = bfVar.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.f399u = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f400v = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f401w = true;
        m563c();
        this.f401w = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                bfVar = (bf) childAt2.getLayoutParams();
                if (bfVar == null || !bfVar.f430a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (bfVar.f432c * ((float) paddingLeft)), 1073741824), this.f400v);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                be a = m550a(childAt);
                if (a != null && a.f426b == this.f387i && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.f386h != null) {
                this.f386h.m132a(savedState.f354b, savedState.f355c);
                m556a(savedState.f353a, false, true);
                return;
            }
            this.f388j = savedState.f353a;
            this.f389k = savedState.f354b;
            this.f390l = savedState.f355c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f353a = this.f387i;
        if (this.f386h != null) {
            savedState.f354b = this.f386h.m128a();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m531a(i, i3, this.f393o, this.f393o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f374P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f386h == null || this.f386h.m138b() == 0) {
            return false;
        }
        if (this.f369K == null) {
            this.f369K = VelocityTracker.obtain();
        }
        this.f369K.addMovement(motionEvent);
        float x;
        int a;
        switch (motionEvent.getAction() & 255) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f391m.abortAnimation();
                this.f403y = false;
                m563c();
                x = motionEvent.getX();
                this.f366H = x;
                this.f364F = x;
                x = motionEvent.getY();
                this.f367I = x;
                this.f365G = x;
                this.f368J = C0116t.m896b(motionEvent, 0);
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (this.f359A) {
                    VelocityTracker velocityTracker = this.f369K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f371M);
                    a = (int) C0121z.m915a(velocityTracker, this.f368J);
                    this.f403y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    be i = m546i();
                    m557a(m528a(i.f426b, ((((float) scrollX) / ((float) clientWidth)) - i.f429e) / i.f428d, a, (int) (C0116t.m897c(motionEvent, C0116t.m895a(motionEvent, this.f368J)) - this.f366H)), true, true, a);
                    this.f368J = -1;
                    m547j();
                    z = this.f376R.m499c() | this.f375Q.m499c();
                    break;
                }
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                if (!this.f359A) {
                    a = C0116t.m895a(motionEvent, this.f368J);
                    float c = C0116t.m897c(motionEvent, a);
                    float abs = Math.abs(c - this.f364F);
                    float d = C0116t.m898d(motionEvent, a);
                    x = Math.abs(d - this.f365G);
                    if (abs > ((float) this.f363E) && abs > x) {
                        this.f359A = true;
                        m541c(true);
                        this.f364F = c - this.f366H > 0.0f ? this.f366H + ((float) this.f363E) : this.f366H - ((float) this.f363E);
                        this.f365G = d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f359A) {
                    z = false | m540b(C0116t.m897c(motionEvent, C0116t.m895a(motionEvent, this.f368J)));
                    break;
                }
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (this.f359A) {
                    m532a(this.f387i, true, 0, false);
                    this.f368J = -1;
                    m547j();
                    z = this.f376R.m499c() | this.f375Q.m499c();
                    break;
                }
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                a = C0116t.m894a(motionEvent);
                this.f364F = C0116t.m897c(motionEvent, a);
                this.f368J = C0116t.m896b(motionEvent, a);
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                m535a(motionEvent);
                this.f364F = C0116t.m897c(motionEvent, C0116t.m895a(motionEvent, this.f368J));
                break;
        }
        if (z) {
            ae.m743b(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f401w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0022y c0022y) {
        if (this.f386h != null) {
            this.f386h.m139b(this.f392n);
            this.f386h.m135a((ViewGroup) this);
            for (int i = 0; i < this.f383e.size(); i++) {
                be beVar = (be) this.f383e.get(i);
                this.f386h.m136a((ViewGroup) this, beVar.f426b, beVar.f425a);
            }
            this.f386h.m142b((ViewGroup) this);
            this.f383e.clear();
            m544g();
            this.f387i = 0;
            scrollTo(0, 0);
        }
        C0022y c0022y2 = this.f386h;
        this.f386h = c0022y;
        this.f382b = 0;
        if (this.f386h != null) {
            if (this.f392n == null) {
                this.f392n = new bk();
            }
            this.f386h.m131a(this.f392n);
            this.f403y = false;
            boolean z = this.f377S;
            this.f377S = true;
            this.f382b = this.f386h.m138b();
            if (this.f388j >= 0) {
                this.f386h.m132a(this.f389k, this.f390l);
                m556a(this.f388j, false, true);
                this.f388j = -1;
                this.f389k = null;
                this.f390l = null;
            } else if (z) {
                requestLayout();
            } else {
                m563c();
            }
        }
        if (this.ab != null && c0022y2 != c0022y) {
            this.ab.m823a(c0022y2, c0022y);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ad == null) {
                try {
                    this.ad = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ad.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f403y = false;
        m556a(i, !this.f377S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f404z) {
            this.f404z = i;
            m563c();
        }
    }

    void setOnAdapterChangeListener(bh bhVar) {
        this.ab = bhVar;
    }

    public void setOnPageChangeListener(bi biVar) {
        this.f381W = biVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f393o;
        this.f393o = i;
        int width = getWidth();
        m531a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f394p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f394p;
    }
}
