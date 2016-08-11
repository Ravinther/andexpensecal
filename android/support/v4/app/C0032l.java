package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p004c.C0053l;
import android.support.v4.p004c.C0058d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.l */
public class C0032l implements ComponentCallbacks, OnCreateContextMenuListener {
    private static final C0053l<String, Class<?>> f205a;
    static final Object f206j;
    boolean f207A;
    int f208B;
    C0043v f209C;
    C0037o f210D;
    C0043v f211E;
    C0032l f212F;
    int f213G;
    int f214H;
    String f215I;
    boolean f216J;
    boolean f217K;
    boolean f218L;
    boolean f219M;
    boolean f220N;
    boolean f221O;
    boolean f222P;
    int f223Q;
    ViewGroup f224R;
    View f225S;
    View f226T;
    boolean f227U;
    boolean f228V;
    an f229W;
    boolean f230X;
    boolean f231Y;
    Object f232Z;
    Object aa;
    Object ab;
    Object ac;
    Object ad;
    Object ae;
    Boolean af;
    Boolean ag;
    aq ah;
    aq ai;
    int f233k;
    View f234l;
    int f235m;
    Bundle f236n;
    SparseArray<Parcelable> f237o;
    int f238p;
    String f239q;
    Bundle f240r;
    C0032l f241s;
    int f242t;
    int f243u;
    boolean f244v;
    boolean f245w;
    boolean f246x;
    boolean f247y;
    boolean f248z;

    static {
        f205a = new C0053l();
        f206j = new Object();
    }

    public C0032l() {
        this.f233k = 0;
        this.f238p = -1;
        this.f242t = -1;
        this.f221O = true;
        this.f228V = true;
        this.f232Z = null;
        this.aa = f206j;
        this.ab = null;
        this.ac = f206j;
        this.ad = null;
        this.ae = f206j;
        this.ah = null;
        this.ai = null;
    }

    public static C0032l m259a(Context context, String str) {
        return C0032l.m260a(context, str, null);
    }

    public static C0032l m260a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f205a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f205a.put(str, cls);
            }
            C0032l c0032l = (C0032l) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(c0032l.getClass().getClassLoader());
                c0032l.f240r = bundle;
            }
            return c0032l;
        } catch (Exception e) {
            throw new C0036n("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (Exception e2) {
            throw new C0036n("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new C0036n("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e22);
        }
    }

    static boolean m261b(Context context, String str) {
        try {
            Class cls = (Class) f205a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f205a.put(str, cls);
            }
            return C0032l.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public Object m262A() {
        return this.ae == f206j ? m335z() : this.ae;
    }

    public boolean m263B() {
        return this.ag == null ? true : this.ag.booleanValue();
    }

    public boolean m264C() {
        return this.af == null ? true : this.af.booleanValue();
    }

    void m265D() {
        this.f211E = new C0043v();
        this.f211E.m397a(this.f210D, new C0035m(this), this);
    }

    void m266E() {
        if (this.f211E != null) {
            this.f211E.m424i();
            this.f211E.m419e();
        }
        this.f222P = false;
        m300d();
        if (this.f222P) {
            if (this.f211E != null) {
                this.f211E.m427l();
            }
            if (this.f229W != null) {
                this.f229W.m197g();
                return;
            }
            return;
        }
        throw new ar("Fragment " + this + " did not call through to super.onStart()");
    }

    void m267F() {
        if (this.f211E != null) {
            this.f211E.m424i();
            this.f211E.m419e();
        }
        this.f222P = false;
        m326q();
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.f211E != null) {
            this.f211E.m428m();
            this.f211E.m419e();
        }
    }

    void m268G() {
        onLowMemory();
        if (this.f211E != null) {
            this.f211E.m434s();
        }
    }

    void m269H() {
        if (this.f211E != null) {
            this.f211E.m429n();
        }
        this.f222P = false;
        m327r();
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void m270I() {
        if (this.f211E != null) {
            this.f211E.m430o();
        }
        this.f222P = false;
        m305e();
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void m271J() {
        if (this.f211E != null) {
            this.f211E.m431p();
        }
        if (this.f230X) {
            this.f230X = false;
            if (!this.f231Y) {
                this.f231Y = true;
                this.f229W = this.f210D.m355a(this.f239q, this.f230X, false);
            }
            if (this.f229W == null) {
                return;
            }
            if (this.f210D.f266h) {
                this.f229W.m194d();
            } else {
                this.f229W.m193c();
            }
        }
    }

    void m272K() {
        if (this.f211E != null) {
            this.f211E.m432q();
        }
        this.f222P = false;
        m308f();
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.f229W != null) {
            this.f229W.m196f();
        }
    }

    void m273L() {
        if (this.f211E != null) {
            this.f211E.m433r();
        }
        this.f222P = false;
        m328s();
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public View m274a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation m275a(int i, boolean z, int i2) {
        return null;
    }

    public void m276a(int i, int i2, Intent intent) {
    }

    final void m277a(int i, C0032l c0032l) {
        this.f238p = i;
        if (c0032l != null) {
            this.f239q = c0032l.f239q + ":" + this.f238p;
        } else {
            this.f239q = "android:fragment:" + this.f238p;
        }
    }

    public void m278a(Activity activity) {
        this.f222P = true;
    }

    public void m279a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f222P = true;
    }

    public void m280a(Intent intent) {
        if (this.f210D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f210D.m358a(this, intent, -1);
    }

    public void m281a(Intent intent, int i) {
        if (this.f210D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f210D.m358a(this, intent, i);
    }

    void m282a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f211E != null) {
            this.f211E.m390a(configuration);
        }
    }

    public void m283a(Bundle bundle) {
        this.f222P = true;
    }

    public void m284a(Menu menu) {
    }

    public void m285a(Menu menu, MenuInflater menuInflater) {
    }

    public void m286a(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void m287a(View view, Bundle bundle) {
    }

    public void m288a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f213G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f214H));
        printWriter.print(" mTag=");
        printWriter.println(this.f215I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f233k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f238p);
        printWriter.print(" mWho=");
        printWriter.print(this.f239q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f208B);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f244v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f245w);
        printWriter.print(" mResumed=");
        printWriter.print(this.f246x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f247y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f248z);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f216J);
        printWriter.print(" mDetached=");
        printWriter.print(this.f217K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f221O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f220N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f218L);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f219M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f228V);
        if (this.f209C != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f209C);
        }
        if (this.f210D != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.f210D);
        }
        if (this.f212F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f212F);
        }
        if (this.f240r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f240r);
        }
        if (this.f236n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f236n);
        }
        if (this.f237o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f237o);
        }
        if (this.f241s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f241s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f243u);
        }
        if (this.f223Q != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f223Q);
        }
        if (this.f224R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f224R);
        }
        if (this.f225S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f225S);
        }
        if (this.f226T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f225S);
        }
        if (this.f234l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f234l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f235m);
        }
        if (this.f229W != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f229W.m190a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f211E != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f211E + ":");
            this.f211E.m399a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public boolean m289a(MenuItem menuItem) {
        return false;
    }

    public LayoutInflater m290b(Bundle bundle) {
        LayoutInflater cloneInContext = this.f210D.getLayoutInflater().cloneInContext(this.f210D);
        m321l();
        cloneInContext.setFactory(this.f211E.m435t());
        return cloneInContext;
    }

    View m291b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f211E != null) {
            this.f211E.m424i();
        }
        return m274a(layoutInflater, viewGroup, bundle);
    }

    public void m292b(Menu menu) {
    }

    public void m293b(boolean z) {
    }

    boolean m294b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f216J) {
            return false;
        }
        if (this.f220N && this.f221O) {
            z = true;
            m285a(menu, menuInflater);
        }
        return this.f211E != null ? z | this.f211E.m402a(menu, menuInflater) : z;
    }

    public boolean m295b(MenuItem menuItem) {
        return false;
    }

    public void m296c() {
        this.f222P = true;
    }

    public void m297c(boolean z) {
        if (!z || this.f212F == null) {
            this.f218L = z;
            return;
        }
        throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
    }

    boolean m298c(Menu menu) {
        boolean z = false;
        if (this.f216J) {
            return false;
        }
        if (this.f220N && this.f221O) {
            z = true;
            m284a(menu);
        }
        return this.f211E != null ? z | this.f211E.m401a(menu) : z;
    }

    boolean m299c(MenuItem menuItem) {
        if (!this.f216J) {
            if (this.f220N && this.f221O && m289a(menuItem)) {
                return true;
            }
            if (this.f211E != null && this.f211E.m403a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m300d() {
        this.f222P = true;
        if (!this.f230X) {
            this.f230X = true;
            if (!this.f231Y) {
                this.f231Y = true;
                this.f229W = this.f210D.m355a(this.f239q, this.f230X, false);
            }
            if (this.f229W != null) {
                this.f229W.m192b();
            }
        }
    }

    public void m301d(Bundle bundle) {
        this.f222P = true;
    }

    void m302d(Menu menu) {
        if (!this.f216J) {
            if (this.f220N && this.f221O) {
                m292b(menu);
            }
            if (this.f211E != null) {
                this.f211E.m408b(menu);
            }
        }
    }

    public void m303d(boolean z) {
        if (this.f220N != z) {
            this.f220N = z;
            if (m322m() && !m323n()) {
                this.f210D.m364d();
            }
        }
    }

    boolean m304d(MenuItem menuItem) {
        if (!this.f216J) {
            if (m295b(menuItem)) {
                return true;
            }
            if (this.f211E != null && this.f211E.m410b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m305e() {
        this.f222P = true;
    }

    public void m306e(Bundle bundle) {
    }

    public void m307e(boolean z) {
        if (this.f221O != z) {
            this.f221O = z;
            if (this.f220N && m322m() && !m323n()) {
                this.f210D.m364d();
            }
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void m308f() {
        this.f222P = true;
    }

    final void m309f(Bundle bundle) {
        if (this.f237o != null) {
            this.f226T.restoreHierarchyState(this.f237o);
            this.f237o = null;
        }
        this.f222P = false;
        m314h(bundle);
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void m310f(boolean z) {
        if (!this.f228V && z && this.f233k < 4) {
            this.f209C.m393a(this);
        }
        this.f228V = z;
        this.f227U = !z;
    }

    public void m311g(Bundle bundle) {
        if (this.f238p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f240r = bundle;
    }

    final boolean m312g() {
        return this.f208B > 0;
    }

    public final Bundle m313h() {
        return this.f240r;
    }

    public void m314h(Bundle bundle) {
        this.f222P = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final C0037o m315i() {
        return this.f210D;
    }

    void m316i(Bundle bundle) {
        if (this.f211E != null) {
            this.f211E.m424i();
        }
        this.f222P = false;
        m283a(bundle);
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onCreate()");
        } else if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f211E == null) {
                    m265D();
                }
                this.f211E.m392a(parcelable, null);
                this.f211E.m425j();
            }
        }
    }

    public final Resources m317j() {
        if (this.f210D != null) {
            return this.f210D.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    void m318j(Bundle bundle) {
        if (this.f211E != null) {
            this.f211E.m424i();
        }
        this.f222P = false;
        m301d(bundle);
        if (!this.f222P) {
            throw new ar("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f211E != null) {
            this.f211E.m426k();
        }
    }

    public final C0041t m319k() {
        return this.f209C;
    }

    void m320k(Bundle bundle) {
        m306e(bundle);
        if (this.f211E != null) {
            Parcelable h = this.f211E.m423h();
            if (h != null) {
                bundle.putParcelable("android:support:fragments", h);
            }
        }
    }

    public final C0041t m321l() {
        if (this.f211E == null) {
            m265D();
            if (this.f233k >= 5) {
                this.f211E.m428m();
            } else if (this.f233k >= 4) {
                this.f211E.m427l();
            } else if (this.f233k >= 2) {
                this.f211E.m426k();
            } else if (this.f233k >= 1) {
                this.f211E.m425j();
            }
        }
        return this.f211E;
    }

    public final boolean m322m() {
        return this.f210D != null && this.f244v;
    }

    public final boolean m323n() {
        return this.f216J;
    }

    public final boolean m324o() {
        return this.f218L;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f222P = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m315i().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f222P = true;
    }

    public View m325p() {
        return this.f225S;
    }

    public void m326q() {
        this.f222P = true;
    }

    public void m327r() {
        this.f222P = true;
    }

    public void m328s() {
        this.f222P = true;
        if (!this.f231Y) {
            this.f231Y = true;
            this.f229W = this.f210D.m355a(this.f239q, this.f230X, false);
        }
        if (this.f229W != null) {
            this.f229W.m198h();
        }
    }

    void m329t() {
        this.f238p = -1;
        this.f239q = null;
        this.f244v = false;
        this.f245w = false;
        this.f246x = false;
        this.f247y = false;
        this.f248z = false;
        this.f207A = false;
        this.f208B = 0;
        this.f209C = null;
        this.f211E = null;
        this.f210D = null;
        this.f213G = 0;
        this.f214H = 0;
        this.f215I = null;
        this.f216J = false;
        this.f217K = false;
        this.f219M = false;
        this.f229W = null;
        this.f230X = false;
        this.f231Y = false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0058d.m484a(this, stringBuilder);
        if (this.f238p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f238p);
        }
        if (this.f213G != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f213G));
        }
        if (this.f215I != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f215I);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void m330u() {
    }

    public Object m331v() {
        return this.f232Z;
    }

    public Object m332w() {
        return this.aa == f206j ? m331v() : this.aa;
    }

    public Object m333x() {
        return this.ab;
    }

    public Object m334y() {
        return this.ac == f206j ? m333x() : this.ac;
    }

    public Object m335z() {
        return this.ad;
    }
}
