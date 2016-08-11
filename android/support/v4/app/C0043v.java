package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p004c.C0058d;
import android.support.v4.p004c.C0059e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: android.support.v4.app.v */
final class C0043v extends C0041t implements Factory {
    static final Interpolator f279A;
    static final Interpolator f280B;
    static final Interpolator f281C;
    static boolean f282a;
    static final boolean f283b;
    static final Interpolator f284z;
    ArrayList<Runnable> f285c;
    Runnable[] f286d;
    boolean f287e;
    ArrayList<C0032l> f288f;
    ArrayList<C0032l> f289g;
    ArrayList<Integer> f290h;
    ArrayList<C0025d> f291i;
    ArrayList<C0032l> f292j;
    ArrayList<C0025d> f293k;
    ArrayList<Integer> f294l;
    ArrayList<C0042u> f295m;
    int f296n;
    C0037o f297o;
    C0034s f298p;
    C0032l f299q;
    boolean f300r;
    boolean f301s;
    boolean f302t;
    String f303u;
    boolean f304v;
    Bundle f305w;
    SparseArray<Parcelable> f306x;
    Runnable f307y;

    static {
        boolean z = false;
        f282a = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        f283b = z;
        f284z = new DecelerateInterpolator(2.5f);
        f279A = new DecelerateInterpolator(1.5f);
        f280B = new AccelerateInterpolator(2.5f);
        f281C = new AccelerateInterpolator(1.5f);
    }

    C0043v() {
        this.f296n = 0;
        this.f305w = null;
        this.f306x = null;
        this.f307y = new C0044w(this);
    }

    static Animation m374a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f279A);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    static Animation m375a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f284z);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(f279A);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private void m376a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0059e("FragmentManager"));
        if (this.f297o != null) {
            try {
                this.f297o.dump("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m399a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public static int m377b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    public static int m378c(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    private void m379u() {
        if (this.f301s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f303u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f303u);
        }
    }

    public int m380a(C0025d c0025d) {
        int size;
        synchronized (this) {
            if (this.f294l == null || this.f294l.size() <= 0) {
                if (this.f293k == null) {
                    this.f293k = new ArrayList();
                }
                size = this.f293k.size();
                if (f282a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0025d);
                }
                this.f293k.add(c0025d);
            } else {
                size = ((Integer) this.f294l.remove(this.f294l.size() - 1)).intValue();
                if (f282a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + c0025d);
                }
                this.f293k.set(size, c0025d);
            }
        }
        return size;
    }

    public ad m381a() {
        return new C0025d(this);
    }

    public C0032l m382a(int i) {
        int size;
        C0032l c0032l;
        if (this.f289g != null) {
            for (size = this.f289g.size() - 1; size >= 0; size--) {
                c0032l = (C0032l) this.f289g.get(size);
                if (c0032l != null && c0032l.f213G == i) {
                    return c0032l;
                }
            }
        }
        if (this.f288f != null) {
            for (size = this.f288f.size() - 1; size >= 0; size--) {
                c0032l = (C0032l) this.f288f.get(size);
                if (c0032l != null && c0032l.f213G == i) {
                    return c0032l;
                }
            }
        }
        return null;
    }

    public C0032l m383a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f288f.size()) {
            m376a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        C0032l c0032l = (C0032l) this.f288f.get(i);
        if (c0032l != null) {
            return c0032l;
        }
        m376a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return c0032l;
    }

    public C0032l m384a(String str) {
        int size;
        C0032l c0032l;
        if (!(this.f289g == null || str == null)) {
            for (size = this.f289g.size() - 1; size >= 0; size--) {
                c0032l = (C0032l) this.f289g.get(size);
                if (c0032l != null && str.equals(c0032l.f215I)) {
                    return c0032l;
                }
            }
        }
        if (!(this.f288f == null || str == null)) {
            for (size = this.f288f.size() - 1; size >= 0; size--) {
                c0032l = (C0032l) this.f288f.get(size);
                if (c0032l != null && str.equals(c0032l.f215I)) {
                    return c0032l;
                }
            }
        }
        return null;
    }

    Animation m385a(C0032l c0032l, int i, boolean z, int i2) {
        Animation a = c0032l.m275a(i, z, c0032l.f223Q);
        if (a != null) {
            return a;
        }
        if (c0032l.f223Q != 0) {
            a = AnimationUtils.loadAnimation(this.f297o, c0032l.f223Q);
            if (a != null) {
                return a;
            }
        }
        if (i == 0) {
            return null;
        }
        int b = C0043v.m377b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return C0043v.m375a(this.f297o, 1.125f, 1.0f, 0.0f, 1.0f);
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return C0043v.m375a(this.f297o, 1.0f, 0.975f, 1.0f, 0.0f);
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                return C0043v.m375a(this.f297o, 0.975f, 1.0f, 0.0f, 1.0f);
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                return C0043v.m375a(this.f297o, 1.0f, 1.075f, 1.0f, 0.0f);
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                return C0043v.m374a(this.f297o, 0.0f, 1.0f);
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                return C0043v.m374a(this.f297o, 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f297o.getWindow() != null) {
                    i2 = this.f297o.getWindow().getAttributes().windowAnimations;
                }
                return i2 == 0 ? null : null;
        }
    }

    public void m386a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        m398a(new C0045x(this, i, i2), false);
    }

    void m387a(int i, int i2, int i3, boolean z) {
        if (this.f297o == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || this.f296n != i) {
            this.f296n = i;
            if (this.f288f != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f288f.size()) {
                    int a;
                    C0032l c0032l = (C0032l) this.f288f.get(i4);
                    if (c0032l != null) {
                        m395a(c0032l, i, i2, i3, false);
                        if (c0032l.f229W != null) {
                            a = i5 | c0032l.f229W.m191a();
                            i4++;
                            i5 = a;
                        }
                    }
                    a = i5;
                    i4++;
                    i5 = a;
                }
                if (i5 == 0) {
                    m414d();
                }
                if (this.f300r && this.f297o != null && this.f296n == 5) {
                    this.f297o.m364d();
                    this.f300r = false;
                }
            }
        }
    }

    public void m388a(int i, C0025d c0025d) {
        synchronized (this) {
            if (this.f293k == null) {
                this.f293k = new ArrayList();
            }
            int size = this.f293k.size();
            if (i < size) {
                if (f282a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0025d);
                }
                this.f293k.set(i, c0025d);
            } else {
                while (size < i) {
                    this.f293k.add(null);
                    if (this.f294l == null) {
                        this.f294l = new ArrayList();
                    }
                    if (f282a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f294l.add(Integer.valueOf(size));
                    size++;
                }
                if (f282a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0025d);
                }
                this.f293k.add(c0025d);
            }
        }
    }

    void m389a(int i, boolean z) {
        m387a(i, 0, 0, z);
    }

    public void m390a(Configuration configuration) {
        if (this.f289g != null) {
            for (int i = 0; i < this.f289g.size(); i++) {
                C0032l c0032l = (C0032l) this.f289g.get(i);
                if (c0032l != null) {
                    c0032l.m282a(configuration);
                }
            }
        }
    }

    public void m391a(Bundle bundle, String str, C0032l c0032l) {
        if (c0032l.f238p < 0) {
            m376a(new IllegalStateException("Fragment " + c0032l + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, c0032l.f238p);
    }

    void m392a(Parcelable parcelable, ArrayList<C0032l> arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f94a != null) {
                int i;
                C0032l c0032l;
                int i2;
                if (arrayList != null) {
                    for (i = 0; i < arrayList.size(); i++) {
                        c0032l = (C0032l) arrayList.get(i);
                        if (f282a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + c0032l);
                        }
                        FragmentState fragmentState = fragmentManagerState.f94a[c0032l.f238p];
                        fragmentState.f107k = c0032l;
                        c0032l.f237o = null;
                        c0032l.f208B = 0;
                        c0032l.f248z = false;
                        c0032l.f244v = false;
                        c0032l.f241s = null;
                        if (fragmentState.f106j != null) {
                            fragmentState.f106j.setClassLoader(this.f297o.getClassLoader());
                            c0032l.f237o = fragmentState.f106j.getSparseParcelableArray("android:view_state");
                            c0032l.f236n = fragmentState.f106j;
                        }
                    }
                }
                this.f288f = new ArrayList(fragmentManagerState.f94a.length);
                if (this.f290h != null) {
                    this.f290h.clear();
                }
                for (i2 = 0; i2 < fragmentManagerState.f94a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.f94a[i2];
                    if (fragmentState2 != null) {
                        C0032l a = fragmentState2.m123a(this.f297o, this.f299q);
                        if (f282a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + a);
                        }
                        this.f288f.add(a);
                        fragmentState2.f107k = null;
                    } else {
                        this.f288f.add(null);
                        if (this.f290h == null) {
                            this.f290h = new ArrayList();
                        }
                        if (f282a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.f290h.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        c0032l = (C0032l) arrayList.get(i3);
                        if (c0032l.f242t >= 0) {
                            if (c0032l.f242t < this.f288f.size()) {
                                c0032l.f241s = (C0032l) this.f288f.get(c0032l.f242t);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + c0032l + " target no longer exists: " + c0032l.f242t);
                                c0032l.f241s = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.f95b != null) {
                    this.f289g = new ArrayList(fragmentManagerState.f95b.length);
                    for (i = 0; i < fragmentManagerState.f95b.length; i++) {
                        c0032l = (C0032l) this.f288f.get(fragmentManagerState.f95b[i]);
                        if (c0032l == null) {
                            m376a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f95b[i]));
                        }
                        c0032l.f244v = true;
                        if (f282a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i + ": " + c0032l);
                        }
                        if (this.f289g.contains(c0032l)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f289g.add(c0032l);
                    }
                } else {
                    this.f289g = null;
                }
                if (fragmentManagerState.f96c != null) {
                    this.f291i = new ArrayList(fragmentManagerState.f96c.length);
                    for (i2 = 0; i2 < fragmentManagerState.f96c.length; i2++) {
                        C0025d a2 = fragmentManagerState.f96c[i2].m122a(this);
                        if (f282a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.f169o + "): " + a2);
                            a2.m250a("  ", new PrintWriter(new C0059e("FragmentManager")), false);
                        }
                        this.f291i.add(a2);
                        if (a2.f169o >= 0) {
                            m388a(a2.f169o, a2);
                        }
                    }
                    return;
                }
                this.f291i = null;
            }
        }
    }

    public void m393a(C0032l c0032l) {
        if (!c0032l.f227U) {
            return;
        }
        if (this.f287e) {
            this.f304v = true;
            return;
        }
        c0032l.f227U = false;
        m395a(c0032l, this.f296n, 0, 0, false);
    }

    public void m394a(C0032l c0032l, int i, int i2) {
        if (f282a) {
            Log.v("FragmentManager", "remove: " + c0032l + " nesting=" + c0032l.f208B);
        }
        boolean z = !c0032l.m312g();
        if (!c0032l.f217K || z) {
            if (this.f289g != null) {
                this.f289g.remove(c0032l);
            }
            if (c0032l.f220N && c0032l.f221O) {
                this.f300r = true;
            }
            c0032l.f244v = false;
            c0032l.f245w = true;
            m395a(c0032l, z ? 0 : 1, i, i2, false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m395a(android.support.v4.app.C0032l r10, int r11, int r12, int r13, boolean r14) {
        /*
        r9 = this;
        r8 = 4;
        r6 = 3;
        r3 = 0;
        r5 = 1;
        r7 = 0;
        r0 = r10.f244v;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r10.f217K;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r11 <= r5) goto L_0x0010;
    L_0x000f:
        r11 = r5;
    L_0x0010:
        r0 = r10.f245w;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r10.f233k;
        if (r11 <= r0) goto L_0x001a;
    L_0x0018:
        r11 = r10.f233k;
    L_0x001a:
        r0 = r10.f227U;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r10.f233k;
        if (r0 >= r8) goto L_0x0025;
    L_0x0022:
        if (r11 <= r6) goto L_0x0025;
    L_0x0024:
        r11 = r6;
    L_0x0025:
        r0 = r10.f233k;
        if (r0 >= r11) goto L_0x024b;
    L_0x0029:
        r0 = r10.f247y;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r10.f248z;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r10.f234l;
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r10.f234l = r7;
        r2 = r10.f235m;
        r0 = r9;
        r1 = r10;
        r4 = r3;
        r0.m395a(r1, r2, r3, r4, r5);
    L_0x0040:
        r0 = r10.f233k;
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x0131;
            case 2: goto L_0x01fa;
            case 3: goto L_0x01fa;
            case 4: goto L_0x021b;
            default: goto L_0x0045;
        };
    L_0x0045:
        r10.f233k = r11;
        goto L_0x0031;
    L_0x0048:
        r0 = f282a;
        if (r0 == 0) goto L_0x0064;
    L_0x004c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0064:
        r0 = r10.f236n;
        if (r0 == 0) goto L_0x00a8;
    L_0x0068:
        r0 = r10.f236n;
        r1 = r9.f297o;
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r10.f236n;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r10.f237o = r0;
        r0 = r10.f236n;
        r1 = "android:target_state";
        r0 = r9.m383a(r0, r1);
        r10.f241s = r0;
        r0 = r10.f241s;
        if (r0 == 0) goto L_0x0095;
    L_0x008b:
        r0 = r10.f236n;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r10.f243u = r0;
    L_0x0095:
        r0 = r10.f236n;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r10.f228V = r0;
        r0 = r10.f228V;
        if (r0 != 0) goto L_0x00a8;
    L_0x00a3:
        r10.f227U = r5;
        if (r11 <= r6) goto L_0x00a8;
    L_0x00a7:
        r11 = r6;
    L_0x00a8:
        r0 = r9.f297o;
        r10.f210D = r0;
        r0 = r9.f299q;
        r10.f212F = r0;
        r0 = r9.f299q;
        if (r0 == 0) goto L_0x00e4;
    L_0x00b4:
        r0 = r9.f299q;
        r0 = r0.f211E;
    L_0x00b8:
        r10.f209C = r0;
        r10.f222P = r3;
        r0 = r9.f297o;
        r10.m278a(r0);
        r0 = r10.f222P;
        if (r0 != 0) goto L_0x00e9;
    L_0x00c5:
        r0 = new android.support.v4.app.ar;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00e4:
        r0 = r9.f297o;
        r0 = r0.f260b;
        goto L_0x00b8;
    L_0x00e9:
        r0 = r10.f212F;
        if (r0 != 0) goto L_0x00f2;
    L_0x00ed:
        r0 = r9.f297o;
        r0.m357a(r10);
    L_0x00f2:
        r0 = r10.f219M;
        if (r0 != 0) goto L_0x00fb;
    L_0x00f6:
        r0 = r10.f236n;
        r10.m316i(r0);
    L_0x00fb:
        r10.f219M = r3;
        r0 = r10.f247y;
        if (r0 == 0) goto L_0x0131;
    L_0x0101:
        r0 = r10.f236n;
        r0 = r10.m290b(r0);
        r1 = r10.f236n;
        r0 = r10.m291b(r0, r7, r1);
        r10.f225S = r0;
        r0 = r10.f225S;
        if (r0 == 0) goto L_0x0244;
    L_0x0113:
        r0 = r10.f225S;
        r10.f226T = r0;
        r0 = r10.f225S;
        r0 = android.support.v4.app.ap.m207a(r0);
        r10.f225S = r0;
        r0 = r10.f216J;
        if (r0 == 0) goto L_0x012a;
    L_0x0123:
        r0 = r10.f225S;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x012a:
        r0 = r10.f225S;
        r1 = r10.f236n;
        r10.m287a(r0, r1);
    L_0x0131:
        if (r11 <= r5) goto L_0x01fa;
    L_0x0133:
        r0 = f282a;
        if (r0 == 0) goto L_0x014f;
    L_0x0137:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x014f:
        r0 = r10.f247y;
        if (r0 != 0) goto L_0x01ea;
    L_0x0153:
        r0 = r10.f214H;
        if (r0 == 0) goto L_0x03a6;
    L_0x0157:
        r0 = r9.f298p;
        r1 = r10.f214H;
        r0 = r0.m349a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x01a6;
    L_0x0163:
        r1 = r10.f207A;
        if (r1 != 0) goto L_0x01a6;
    L_0x0167:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "No view found for id 0x";
        r2 = r2.append(r3);
        r3 = r10.f214H;
        r3 = java.lang.Integer.toHexString(r3);
        r2 = r2.append(r3);
        r3 = " (";
        r2 = r2.append(r3);
        r3 = r10.m317j();
        r4 = r10.f214H;
        r3 = r3.getResourceName(r4);
        r2 = r2.append(r3);
        r3 = ") for fragment ";
        r2 = r2.append(r3);
        r2 = r2.append(r10);
        r2 = r2.toString();
        r1.<init>(r2);
        r9.m376a(r1);
    L_0x01a6:
        r10.f224R = r0;
        r1 = r10.f236n;
        r1 = r10.m290b(r1);
        r2 = r10.f236n;
        r1 = r10.m291b(r1, r0, r2);
        r10.f225S = r1;
        r1 = r10.f225S;
        if (r1 == 0) goto L_0x0248;
    L_0x01ba:
        r1 = r10.f225S;
        r10.f226T = r1;
        r1 = r10.f225S;
        r1 = android.support.v4.app.ap.m207a(r1);
        r10.f225S = r1;
        if (r0 == 0) goto L_0x01d8;
    L_0x01c8:
        r1 = r9.m385a(r10, r12, r5, r13);
        if (r1 == 0) goto L_0x01d3;
    L_0x01ce:
        r2 = r10.f225S;
        r2.startAnimation(r1);
    L_0x01d3:
        r1 = r10.f225S;
        r0.addView(r1);
    L_0x01d8:
        r0 = r10.f216J;
        if (r0 == 0) goto L_0x01e3;
    L_0x01dc:
        r0 = r10.f225S;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x01e3:
        r0 = r10.f225S;
        r1 = r10.f236n;
        r10.m287a(r0, r1);
    L_0x01ea:
        r0 = r10.f236n;
        r10.m318j(r0);
        r0 = r10.f225S;
        if (r0 == 0) goto L_0x01f8;
    L_0x01f3:
        r0 = r10.f236n;
        r10.m309f(r0);
    L_0x01f8:
        r10.f236n = r7;
    L_0x01fa:
        if (r11 <= r6) goto L_0x021b;
    L_0x01fc:
        r0 = f282a;
        if (r0 == 0) goto L_0x0218;
    L_0x0200:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0218:
        r10.m266E();
    L_0x021b:
        if (r11 <= r8) goto L_0x0045;
    L_0x021d:
        r0 = f282a;
        if (r0 == 0) goto L_0x0239;
    L_0x0221:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0239:
        r10.f246x = r5;
        r10.m267F();
        r10.f236n = r7;
        r10.f237o = r7;
        goto L_0x0045;
    L_0x0244:
        r10.f226T = r7;
        goto L_0x0131;
    L_0x0248:
        r10.f226T = r7;
        goto L_0x01ea;
    L_0x024b:
        r0 = r10.f233k;
        if (r0 <= r11) goto L_0x0045;
    L_0x024f:
        r0 = r10.f233k;
        switch(r0) {
            case 1: goto L_0x0256;
            case 2: goto L_0x02d6;
            case 3: goto L_0x02b5;
            case 4: goto L_0x0294;
            case 5: goto L_0x0270;
            default: goto L_0x0254;
        };
    L_0x0254:
        goto L_0x0045;
    L_0x0256:
        if (r11 >= r5) goto L_0x0045;
    L_0x0258:
        r0 = r9.f302t;
        if (r0 == 0) goto L_0x0267;
    L_0x025c:
        r0 = r10.f234l;
        if (r0 == 0) goto L_0x0267;
    L_0x0260:
        r0 = r10.f234l;
        r10.f234l = r7;
        r0.clearAnimation();
    L_0x0267:
        r0 = r10.f234l;
        if (r0 == 0) goto L_0x0343;
    L_0x026b:
        r10.f235m = r11;
        r11 = r5;
        goto L_0x0045;
    L_0x0270:
        r0 = 5;
        if (r11 >= r0) goto L_0x0294;
    L_0x0273:
        r0 = f282a;
        if (r0 == 0) goto L_0x028f;
    L_0x0277:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x028f:
        r10.m269H();
        r10.f246x = r3;
    L_0x0294:
        if (r11 >= r8) goto L_0x02b5;
    L_0x0296:
        r0 = f282a;
        if (r0 == 0) goto L_0x02b2;
    L_0x029a:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02b2:
        r10.m270I();
    L_0x02b5:
        if (r11 >= r6) goto L_0x02d6;
    L_0x02b7:
        r0 = f282a;
        if (r0 == 0) goto L_0x02d3;
    L_0x02bb:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02d3:
        r10.m271J();
    L_0x02d6:
        r0 = 2;
        if (r11 >= r0) goto L_0x0256;
    L_0x02d9:
        r0 = f282a;
        if (r0 == 0) goto L_0x02f5;
    L_0x02dd:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02f5:
        r0 = r10.f225S;
        if (r0 == 0) goto L_0x0308;
    L_0x02f9:
        r0 = r9.f297o;
        r0 = r0.isFinishing();
        if (r0 != 0) goto L_0x0308;
    L_0x0301:
        r0 = r10.f237o;
        if (r0 != 0) goto L_0x0308;
    L_0x0305:
        r9.m417e(r10);
    L_0x0308:
        r10.m272K();
        r0 = r10.f225S;
        if (r0 == 0) goto L_0x033b;
    L_0x030f:
        r0 = r10.f224R;
        if (r0 == 0) goto L_0x033b;
    L_0x0313:
        r0 = r9.f296n;
        if (r0 <= 0) goto L_0x03a3;
    L_0x0317:
        r0 = r9.f302t;
        if (r0 != 0) goto L_0x03a3;
    L_0x031b:
        r0 = r9.m385a(r10, r12, r3, r13);
    L_0x031f:
        if (r0 == 0) goto L_0x0334;
    L_0x0321:
        r1 = r10.f225S;
        r10.f234l = r1;
        r10.f235m = r11;
        r1 = new android.support.v4.app.y;
        r1.<init>(r9, r10);
        r0.setAnimationListener(r1);
        r1 = r10.f225S;
        r1.startAnimation(r0);
    L_0x0334:
        r0 = r10.f224R;
        r1 = r10.f225S;
        r0.removeView(r1);
    L_0x033b:
        r10.f224R = r7;
        r10.f225S = r7;
        r10.f226T = r7;
        goto L_0x0256;
    L_0x0343:
        r0 = f282a;
        if (r0 == 0) goto L_0x035f;
    L_0x0347:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x035f:
        r0 = r10.f219M;
        if (r0 != 0) goto L_0x0366;
    L_0x0363:
        r10.m273L();
    L_0x0366:
        r10.f222P = r3;
        r10.m296c();
        r0 = r10.f222P;
        if (r0 != 0) goto L_0x038e;
    L_0x036f:
        r0 = new android.support.v4.app.ar;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r2 = " did not call through to super.onDetach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x038e:
        if (r14 != 0) goto L_0x0045;
    L_0x0390:
        r0 = r10.f219M;
        if (r0 != 0) goto L_0x0399;
    L_0x0394:
        r9.m415d(r10);
        goto L_0x0045;
    L_0x0399:
        r10.f210D = r7;
        r10.f212F = r7;
        r10.f209C = r7;
        r10.f211E = r7;
        goto L_0x0045;
    L_0x03a3:
        r0 = r7;
        goto L_0x031f;
    L_0x03a6:
        r0 = r7;
        goto L_0x01a6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.v.a(android.support.v4.app.l, int, int, int, boolean):void");
    }

    public void m396a(C0032l c0032l, boolean z) {
        if (this.f289g == null) {
            this.f289g = new ArrayList();
        }
        if (f282a) {
            Log.v("FragmentManager", "add: " + c0032l);
        }
        m411c(c0032l);
        if (!c0032l.f217K) {
            if (this.f289g.contains(c0032l)) {
                throw new IllegalStateException("Fragment already added: " + c0032l);
            }
            this.f289g.add(c0032l);
            c0032l.f244v = true;
            c0032l.f245w = false;
            if (c0032l.f220N && c0032l.f221O) {
                this.f300r = true;
            }
            if (z) {
                m406b(c0032l);
            }
        }
    }

    public void m397a(C0037o c0037o, C0034s c0034s, C0032l c0032l) {
        if (this.f297o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f297o = c0037o;
        this.f298p = c0034s;
        this.f299q = c0032l;
    }

    public void m398a(Runnable runnable, boolean z) {
        if (!z) {
            m379u();
        }
        synchronized (this) {
            if (this.f302t || this.f297o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f285c == null) {
                this.f285c = new ArrayList();
            }
            this.f285c.add(runnable);
            if (this.f285c.size() == 1) {
                this.f297o.f259a.removeCallbacks(this.f307y);
                this.f297o.f259a.post(this.f307y);
            }
        }
    }

    public void m399a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        C0032l c0032l;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f288f != null) {
            size = this.f288f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    c0032l = (C0032l) this.f288f.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0032l);
                    if (c0032l != null) {
                        c0032l.m288a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.f289g != null) {
            size = this.f289g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    c0032l = (C0032l) this.f289g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0032l.toString());
                }
            }
        }
        if (this.f292j != null) {
            size = this.f292j.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    c0032l = (C0032l) this.f292j.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0032l.toString());
                }
            }
        }
        if (this.f291i != null) {
            size = this.f291i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C0025d c0025d = (C0025d) this.f291i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0025d.toString());
                    c0025d.m249a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f293k != null) {
                int size2 = this.f293k.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        c0025d = (C0025d) this.f293k.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(c0025d);
                    }
                }
            }
            if (this.f294l != null && this.f294l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f294l.toArray()));
            }
        }
        if (this.f285c != null) {
            i = this.f285c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.f285c.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(runnable);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.f297o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f298p);
        if (this.f299q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f299q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f296n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f301s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f302t);
        if (this.f300r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f300r);
        }
        if (this.f303u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f303u);
        }
        if (this.f290h != null && this.f290h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f290h.toArray()));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean m400a(android.os.Handler r12, java.lang.String r13, int r14, int r15) {
        /*
        r11 = this;
        r4 = 0;
        r2 = 1;
        r3 = 0;
        r0 = r11.f291i;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r3;
    L_0x0008:
        if (r13 != 0) goto L_0x0037;
    L_0x000a:
        if (r14 >= 0) goto L_0x0037;
    L_0x000c:
        r0 = r15 & 1;
        if (r0 != 0) goto L_0x0037;
    L_0x0010:
        r0 = r11.f291i;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x0007;
    L_0x001a:
        r1 = r11.f291i;
        r0 = r1.remove(r0);
        r0 = (android.support.v4.app.C0025d) r0;
        r1 = new android.util.SparseArray;
        r1.<init>();
        r3 = new android.util.SparseArray;
        r3.<init>();
        r0.m248a(r1, r3);
        r0.m245a(r2, r4, r1, r3);
        r11.m421f();
    L_0x0035:
        r3 = r2;
        goto L_0x0007;
    L_0x0037:
        r0 = -1;
        if (r13 != 0) goto L_0x003c;
    L_0x003a:
        if (r14 < 0) goto L_0x008b;
    L_0x003c:
        r0 = r11.f291i;
        r0 = r0.size();
        r1 = r0 + -1;
    L_0x0044:
        if (r1 < 0) goto L_0x005a;
    L_0x0046:
        r0 = r11.f291i;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.C0025d) r0;
        if (r13 == 0) goto L_0x0081;
    L_0x0050:
        r5 = r0.m255c();
        r5 = r13.equals(r5);
        if (r5 == 0) goto L_0x0081;
    L_0x005a:
        if (r1 < 0) goto L_0x0007;
    L_0x005c:
        r0 = r15 & 1;
        if (r0 == 0) goto L_0x008a;
    L_0x0060:
        r1 = r1 + -1;
    L_0x0062:
        if (r1 < 0) goto L_0x008a;
    L_0x0064:
        r0 = r11.f291i;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.C0025d) r0;
        if (r13 == 0) goto L_0x0078;
    L_0x006e:
        r5 = r0.m255c();
        r5 = r13.equals(r5);
        if (r5 != 0) goto L_0x007e;
    L_0x0078:
        if (r14 < 0) goto L_0x008a;
    L_0x007a:
        r0 = r0.f169o;
        if (r14 != r0) goto L_0x008a;
    L_0x007e:
        r1 = r1 + -1;
        goto L_0x0062;
    L_0x0081:
        if (r14 < 0) goto L_0x0087;
    L_0x0083:
        r0 = r0.f169o;
        if (r14 == r0) goto L_0x005a;
    L_0x0087:
        r1 = r1 + -1;
        goto L_0x0044;
    L_0x008a:
        r0 = r1;
    L_0x008b:
        r1 = r11.f291i;
        r1 = r1.size();
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x0007;
    L_0x0095:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r1 = r11.f291i;
        r1 = r1.size();
        r1 = r1 + -1;
    L_0x00a2:
        if (r1 <= r0) goto L_0x00b0;
    L_0x00a4:
        r5 = r11.f291i;
        r5 = r5.remove(r1);
        r6.add(r5);
        r1 = r1 + -1;
        goto L_0x00a2;
    L_0x00b0:
        r0 = r6.size();
        r7 = r0 + -1;
        r8 = new android.util.SparseArray;
        r8.<init>();
        r9 = new android.util.SparseArray;
        r9.<init>();
        r1 = r3;
    L_0x00c1:
        if (r1 > r7) goto L_0x00d0;
    L_0x00c3:
        r0 = r6.get(r1);
        r0 = (android.support.v4.app.C0025d) r0;
        r0.m248a(r8, r9);
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00c1;
    L_0x00d0:
        r5 = r4;
        r4 = r3;
    L_0x00d2:
        if (r4 > r7) goto L_0x0108;
    L_0x00d4:
        r0 = f282a;
        if (r0 == 0) goto L_0x00f4;
    L_0x00d8:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r10 = "Popping back stack state: ";
        r1 = r1.append(r10);
        r10 = r6.get(r4);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x00f4:
        r0 = r6.get(r4);
        r0 = (android.support.v4.app.C0025d) r0;
        if (r4 != r7) goto L_0x0106;
    L_0x00fc:
        r1 = r2;
    L_0x00fd:
        r1 = r0.m245a(r1, r5, r8, r9);
        r0 = r4 + 1;
        r4 = r0;
        r5 = r1;
        goto L_0x00d2;
    L_0x0106:
        r1 = r3;
        goto L_0x00fd;
    L_0x0108:
        r11.m421f();
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.v.a(android.os.Handler, java.lang.String, int, int):boolean");
    }

    public boolean m401a(Menu menu) {
        if (this.f289g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f289g.size(); i++) {
            C0032l c0032l = (C0032l) this.f289g.get(i);
            if (c0032l != null && c0032l.m298c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean m402a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        C0032l c0032l;
        int i = 0;
        ArrayList arrayList = null;
        if (this.f289g != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.f289g.size()) {
                c0032l = (C0032l) this.f289g.get(i2);
                if (c0032l != null && c0032l.m294b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0032l);
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f292j != null) {
            while (i < this.f292j.size()) {
                c0032l = (C0032l) this.f292j.get(i);
                if (arrayList == null || !arrayList.contains(c0032l)) {
                    c0032l.m330u();
                }
                i++;
            }
        }
        this.f292j = arrayList;
        return z;
    }

    public boolean m403a(MenuItem menuItem) {
        if (this.f289g == null) {
            return false;
        }
        for (int i = 0; i < this.f289g.size(); i++) {
            C0032l c0032l = (C0032l) this.f289g.get(i);
            if (c0032l != null && c0032l.m299c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m404b(int i) {
        synchronized (this) {
            this.f293k.set(i, null);
            if (this.f294l == null) {
                this.f294l = new ArrayList();
            }
            if (f282a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f294l.add(Integer.valueOf(i));
        }
    }

    void m405b(C0025d c0025d) {
        if (this.f291i == null) {
            this.f291i = new ArrayList();
        }
        this.f291i.add(c0025d);
        m421f();
    }

    void m406b(C0032l c0032l) {
        m395a(c0032l, this.f296n, 0, 0, false);
    }

    public void m407b(C0032l c0032l, int i, int i2) {
        if (f282a) {
            Log.v("FragmentManager", "hide: " + c0032l);
        }
        if (!c0032l.f216J) {
            c0032l.f216J = true;
            if (c0032l.f225S != null) {
                Animation a = m385a(c0032l, i, false, i2);
                if (a != null) {
                    c0032l.f225S.startAnimation(a);
                }
                c0032l.f225S.setVisibility(8);
            }
            if (c0032l.f244v && c0032l.f220N && c0032l.f221O) {
                this.f300r = true;
            }
            c0032l.m293b(true);
        }
    }

    public void m408b(Menu menu) {
        if (this.f289g != null) {
            for (int i = 0; i < this.f289g.size(); i++) {
                C0032l c0032l = (C0032l) this.f289g.get(i);
                if (c0032l != null) {
                    c0032l.m302d(menu);
                }
            }
        }
    }

    public boolean m409b() {
        return m419e();
    }

    public boolean m410b(MenuItem menuItem) {
        if (this.f289g == null) {
            return false;
        }
        for (int i = 0; i < this.f289g.size(); i++) {
            C0032l c0032l = (C0032l) this.f289g.get(i);
            if (c0032l != null && c0032l.m304d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void m411c(C0032l c0032l) {
        if (c0032l.f238p < 0) {
            if (this.f290h == null || this.f290h.size() <= 0) {
                if (this.f288f == null) {
                    this.f288f = new ArrayList();
                }
                c0032l.m277a(this.f288f.size(), this.f299q);
                this.f288f.add(c0032l);
            } else {
                c0032l.m277a(((Integer) this.f290h.remove(this.f290h.size() - 1)).intValue(), this.f299q);
                this.f288f.set(c0032l.f238p, c0032l);
            }
            if (f282a) {
                Log.v("FragmentManager", "Allocated fragment index " + c0032l);
            }
        }
    }

    public void m412c(C0032l c0032l, int i, int i2) {
        if (f282a) {
            Log.v("FragmentManager", "show: " + c0032l);
        }
        if (c0032l.f216J) {
            c0032l.f216J = false;
            if (c0032l.f225S != null) {
                Animation a = m385a(c0032l, i, true, i2);
                if (a != null) {
                    c0032l.f225S.startAnimation(a);
                }
                c0032l.f225S.setVisibility(0);
            }
            if (c0032l.f244v && c0032l.f220N && c0032l.f221O) {
                this.f300r = true;
            }
            c0032l.m293b(false);
        }
    }

    public boolean m413c() {
        m379u();
        m409b();
        return m400a(this.f297o.f259a, null, -1, 0);
    }

    void m414d() {
        if (this.f288f != null) {
            for (int i = 0; i < this.f288f.size(); i++) {
                C0032l c0032l = (C0032l) this.f288f.get(i);
                if (c0032l != null) {
                    m393a(c0032l);
                }
            }
        }
    }

    void m415d(C0032l c0032l) {
        if (c0032l.f238p >= 0) {
            if (f282a) {
                Log.v("FragmentManager", "Freeing fragment index " + c0032l);
            }
            this.f288f.set(c0032l.f238p, null);
            if (this.f290h == null) {
                this.f290h = new ArrayList();
            }
            this.f290h.add(Integer.valueOf(c0032l.f238p));
            this.f297o.m359a(c0032l.f239q);
            c0032l.m329t();
        }
    }

    public void m416d(C0032l c0032l, int i, int i2) {
        if (f282a) {
            Log.v("FragmentManager", "detach: " + c0032l);
        }
        if (!c0032l.f217K) {
            c0032l.f217K = true;
            if (c0032l.f244v) {
                if (this.f289g != null) {
                    if (f282a) {
                        Log.v("FragmentManager", "remove from detach: " + c0032l);
                    }
                    this.f289g.remove(c0032l);
                }
                if (c0032l.f220N && c0032l.f221O) {
                    this.f300r = true;
                }
                c0032l.f244v = false;
                m395a(c0032l, 1, i, i2, false);
            }
        }
    }

    void m417e(C0032l c0032l) {
        if (c0032l.f226T != null) {
            if (this.f306x == null) {
                this.f306x = new SparseArray();
            } else {
                this.f306x.clear();
            }
            c0032l.f226T.saveHierarchyState(this.f306x);
            if (this.f306x.size() > 0) {
                c0032l.f237o = this.f306x;
                this.f306x = null;
            }
        }
    }

    public void m418e(C0032l c0032l, int i, int i2) {
        if (f282a) {
            Log.v("FragmentManager", "attach: " + c0032l);
        }
        if (c0032l.f217K) {
            c0032l.f217K = false;
            if (!c0032l.f244v) {
                if (this.f289g == null) {
                    this.f289g = new ArrayList();
                }
                if (this.f289g.contains(c0032l)) {
                    throw new IllegalStateException("Fragment already added: " + c0032l);
                }
                if (f282a) {
                    Log.v("FragmentManager", "add from attach: " + c0032l);
                }
                this.f289g.add(c0032l);
                c0032l.f244v = true;
                if (c0032l.f220N && c0032l.f221O) {
                    this.f300r = true;
                }
                m395a(c0032l, this.f296n, i, i2, false);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m419e() {
        /*
        r6 = this;
        r0 = 1;
        r2 = 0;
        r1 = r6.f287e;
        if (r1 == 0) goto L_0x000e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = "Recursive entry to executePendingTransactions";
        r0.<init>(r1);
        throw r0;
    L_0x000e:
        r1 = android.os.Looper.myLooper();
        r3 = r6.f297o;
        r3 = r3.f259a;
        r3 = r3.getLooper();
        if (r1 == r3) goto L_0x0024;
    L_0x001c:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must be called from main thread of process";
        r0.<init>(r1);
        throw r0;
    L_0x0024:
        r1 = r2;
    L_0x0025:
        monitor-enter(r6);
        r3 = r6.f285c;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x0032;
    L_0x002a:
        r3 = r6.f285c;	 Catch:{ all -> 0x0097 }
        r3 = r3.size();	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x005a;
    L_0x0032:
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r0 = r6.f304v;
        if (r0 == 0) goto L_0x00a5;
    L_0x0037:
        r3 = r2;
        r4 = r2;
    L_0x0039:
        r0 = r6.f288f;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x009e;
    L_0x0041:
        r0 = r6.f288f;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.C0032l) r0;
        if (r0 == 0) goto L_0x0056;
    L_0x004b:
        r5 = r0.f229W;
        if (r5 == 0) goto L_0x0056;
    L_0x004f:
        r0 = r0.f229W;
        r0 = r0.m191a();
        r4 = r4 | r0;
    L_0x0056:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0039;
    L_0x005a:
        r1 = r6.f285c;	 Catch:{ all -> 0x0097 }
        r3 = r1.size();	 Catch:{ all -> 0x0097 }
        r1 = r6.f286d;	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x0069;
    L_0x0064:
        r1 = r6.f286d;	 Catch:{ all -> 0x0097 }
        r1 = r1.length;	 Catch:{ all -> 0x0097 }
        if (r1 >= r3) goto L_0x006d;
    L_0x0069:
        r1 = new java.lang.Runnable[r3];	 Catch:{ all -> 0x0097 }
        r6.f286d = r1;	 Catch:{ all -> 0x0097 }
    L_0x006d:
        r1 = r6.f285c;	 Catch:{ all -> 0x0097 }
        r4 = r6.f286d;	 Catch:{ all -> 0x0097 }
        r1.toArray(r4);	 Catch:{ all -> 0x0097 }
        r1 = r6.f285c;	 Catch:{ all -> 0x0097 }
        r1.clear();	 Catch:{ all -> 0x0097 }
        r1 = r6.f297o;	 Catch:{ all -> 0x0097 }
        r1 = r1.f259a;	 Catch:{ all -> 0x0097 }
        r4 = r6.f307y;	 Catch:{ all -> 0x0097 }
        r1.removeCallbacks(r4);	 Catch:{ all -> 0x0097 }
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r6.f287e = r0;
        r1 = r2;
    L_0x0086:
        if (r1 >= r3) goto L_0x009a;
    L_0x0088:
        r4 = r6.f286d;
        r4 = r4[r1];
        r4.run();
        r4 = r6.f286d;
        r5 = 0;
        r4[r1] = r5;
        r1 = r1 + 1;
        goto L_0x0086;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        throw r0;
    L_0x009a:
        r6.f287e = r2;
        r1 = r0;
        goto L_0x0025;
    L_0x009e:
        if (r4 != 0) goto L_0x00a5;
    L_0x00a0:
        r6.f304v = r2;
        r6.m414d();
    L_0x00a5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.v.e():boolean");
    }

    Bundle m420f(C0032l c0032l) {
        Bundle bundle;
        if (this.f305w == null) {
            this.f305w = new Bundle();
        }
        c0032l.m320k(this.f305w);
        if (this.f305w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f305w;
            this.f305w = null;
        }
        if (c0032l.f225S != null) {
            m417e(c0032l);
        }
        if (c0032l.f237o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", c0032l.f237o);
        }
        if (!c0032l.f228V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", c0032l.f228V);
        }
        return bundle;
    }

    void m421f() {
        if (this.f295m != null) {
            for (int i = 0; i < this.f295m.size(); i++) {
                ((C0042u) this.f295m.get(i)).m373a();
            }
        }
    }

    ArrayList<C0032l> m422g() {
        ArrayList<C0032l> arrayList = null;
        if (this.f288f != null) {
            for (int i = 0; i < this.f288f.size(); i++) {
                C0032l c0032l = (C0032l) this.f288f.get(i);
                if (c0032l != null && c0032l.f218L) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0032l);
                    c0032l.f219M = true;
                    c0032l.f242t = c0032l.f241s != null ? c0032l.f241s.f238p : -1;
                    if (f282a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + c0032l);
                    }
                }
            }
        }
        return arrayList;
    }

    Parcelable m423h() {
        BackStackState[] backStackStateArr = null;
        m419e();
        if (f283b) {
            this.f301s = true;
        }
        if (this.f288f == null || this.f288f.size() <= 0) {
            return null;
        }
        int size = this.f288f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            C0032l c0032l = (C0032l) this.f288f.get(i);
            if (c0032l != null) {
                if (c0032l.f238p < 0) {
                    m376a(new IllegalStateException("Failure saving state: active " + c0032l + " has cleared index: " + c0032l.f238p));
                }
                FragmentState fragmentState = new FragmentState(c0032l);
                fragmentStateArr[i] = fragmentState;
                if (c0032l.f233k <= 0 || fragmentState.f106j != null) {
                    fragmentState.f106j = c0032l.f236n;
                } else {
                    fragmentState.f106j = m420f(c0032l);
                    if (c0032l.f241s != null) {
                        if (c0032l.f241s.f238p < 0) {
                            m376a(new IllegalStateException("Failure saving state: " + c0032l + " has target not in fragment manager: " + c0032l.f241s));
                        }
                        if (fragmentState.f106j == null) {
                            fragmentState.f106j = new Bundle();
                        }
                        m391a(fragmentState.f106j, "android:target_state", c0032l.f241s);
                        if (c0032l.f243u != 0) {
                            fragmentState.f106j.putInt("android:target_req_state", c0032l.f243u);
                        }
                    }
                }
                if (f282a) {
                    Log.v("FragmentManager", "Saved state of " + c0032l + ": " + fragmentState.f106j);
                }
                z2 = true;
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        if (z) {
            int[] iArr;
            int i2;
            FragmentManagerState fragmentManagerState;
            if (this.f289g != null) {
                i = this.f289g.size();
                if (i > 0) {
                    iArr = new int[i];
                    for (i2 = 0; i2 < i; i2++) {
                        iArr[i2] = ((C0032l) this.f289g.get(i2)).f238p;
                        if (iArr[i2] < 0) {
                            m376a(new IllegalStateException("Failure saving state: active " + this.f289g.get(i2) + " has cleared index: " + iArr[i2]));
                        }
                        if (f282a) {
                            Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f289g.get(i2));
                        }
                    }
                    if (this.f291i != null) {
                        i = this.f291i.size();
                        if (i > 0) {
                            backStackStateArr = new BackStackState[i];
                            for (i2 = 0; i2 < i; i2++) {
                                backStackStateArr[i2] = new BackStackState(this, (C0025d) this.f291i.get(i2));
                                if (f282a) {
                                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f291i.get(i2));
                                }
                            }
                        }
                    }
                    fragmentManagerState = new FragmentManagerState();
                    fragmentManagerState.f94a = fragmentStateArr;
                    fragmentManagerState.f95b = iArr;
                    fragmentManagerState.f96c = backStackStateArr;
                    return fragmentManagerState;
                }
            }
            iArr = null;
            if (this.f291i != null) {
                i = this.f291i.size();
                if (i > 0) {
                    backStackStateArr = new BackStackState[i];
                    for (i2 = 0; i2 < i; i2++) {
                        backStackStateArr[i2] = new BackStackState(this, (C0025d) this.f291i.get(i2));
                        if (f282a) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f291i.get(i2));
                        }
                    }
                }
            }
            fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f94a = fragmentStateArr;
            fragmentManagerState.f95b = iArr;
            fragmentManagerState.f96c = backStackStateArr;
            return fragmentManagerState;
        } else if (!f282a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public void m424i() {
        this.f301s = false;
    }

    public void m425j() {
        this.f301s = false;
        m389a(1, false);
    }

    public void m426k() {
        this.f301s = false;
        m389a(2, false);
    }

    public void m427l() {
        this.f301s = false;
        m389a(4, false);
    }

    public void m428m() {
        this.f301s = false;
        m389a(5, false);
    }

    public void m429n() {
        m389a(4, false);
    }

    public void m430o() {
        this.f301s = true;
        m389a(3, false);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View view = null;
        if (!"fragment".equals(str)) {
            return view;
        }
        String attributeValue = attributeSet.getAttributeValue(view, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0047z.f314a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0032l.m261b(this.f297o, string)) {
            return view;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        C0032l c0032l;
        if (resourceId != -1) {
            C0032l a = m382a(resourceId);
        } else {
            Object obj = view;
        }
        if (a == null && string2 != null) {
            a = m384a(string2);
        }
        if (a == null && id != -1) {
            a = m382a(id);
        }
        if (f282a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + a);
        }
        if (a == null) {
            C0032l a2 = C0032l.m259a(context, string);
            a2.f247y = true;
            a2.f213G = resourceId != 0 ? resourceId : id;
            a2.f214H = id;
            a2.f215I = string2;
            a2.f248z = true;
            a2.f209C = this;
            a2.m279a(this.f297o, attributeSet, a2.f236n);
            m396a(a2, true);
            c0032l = a2;
        } else if (a.f248z) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            a.f248z = true;
            if (!a.f219M) {
                a.m279a(this.f297o, attributeSet, a.f236n);
            }
            c0032l = a;
        }
        if (this.f296n >= 1 || !c0032l.f247y) {
            m406b(c0032l);
        } else {
            m395a(c0032l, 1, 0, 0, false);
        }
        if (c0032l.f225S == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            c0032l.f225S.setId(resourceId);
        }
        if (c0032l.f225S.getTag() == null) {
            c0032l.f225S.setTag(string2);
        }
        return c0032l.f225S;
    }

    public void m431p() {
        m389a(2, false);
    }

    public void m432q() {
        m389a(1, false);
    }

    public void m433r() {
        this.f302t = true;
        m419e();
        m389a(0, false);
        this.f297o = null;
        this.f298p = null;
        this.f299q = null;
    }

    public void m434s() {
        if (this.f289g != null) {
            for (int i = 0; i < this.f289g.size(); i++) {
                C0032l c0032l = (C0032l) this.f289g.get(i);
                if (c0032l != null) {
                    c0032l.m268G();
                }
            }
        }
    }

    Factory m435t() {
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f299q != null) {
            C0058d.m484a(this.f299q, stringBuilder);
        } else {
            C0058d.m484a(this.f297o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
