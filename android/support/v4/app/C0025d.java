package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.p004c.C0054a;
import android.support.v4.p004c.C0059e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: android.support.v4.app.d */
final class C0025d extends ad implements Runnable {
    final C0043v f155a;
    C0029h f156b;
    C0029h f157c;
    int f158d;
    int f159e;
    int f160f;
    int f161g;
    int f162h;
    int f163i;
    int f164j;
    boolean f165k;
    boolean f166l;
    String f167m;
    boolean f168n;
    int f169o;
    int f170p;
    CharSequence f171q;
    int f172r;
    CharSequence f173s;
    ArrayList<String> f174t;
    ArrayList<String> f175u;

    public C0025d(C0043v c0043v) {
        this.f166l = true;
        this.f169o = -1;
        this.f155a = c0043v;
    }

    private C0030i m213a(SparseArray<C0032l> sparseArray, SparseArray<C0032l> sparseArray2, boolean z) {
        int i = 0;
        C0030i c0030i = new C0030i(this);
        c0030i.f203d = new View(this.f155a.f297o);
        int i2 = 0;
        int i3 = 0;
        while (i2 < sparseArray.size()) {
            int i4 = m234a(sparseArray.keyAt(i2), c0030i, z, (SparseArray) sparseArray, (SparseArray) sparseArray2) ? 1 : i3;
            i2++;
            i3 = i4;
        }
        while (i < sparseArray2.size()) {
            i4 = sparseArray2.keyAt(i);
            if (sparseArray.get(i4) == null && m234a(i4, c0030i, z, (SparseArray) sparseArray, (SparseArray) sparseArray2)) {
                i3 = 1;
            }
            i++;
        }
        return i3 == 0 ? null : c0030i;
    }

    private C0054a<String, View> m215a(C0030i c0030i, C0032l c0032l, boolean z) {
        C0054a c0054a = new C0054a();
        if (this.f174t != null) {
            ae.m179a((Map) c0054a, c0032l.m325p());
            if (z) {
                c0054a.m452a(this.f175u);
            } else {
                c0054a = C0025d.m217a(this.f174t, this.f175u, c0054a);
            }
        }
        if (z) {
            if (c0032l.ah != null) {
                c0032l.ah.m209a(this.f175u, c0054a);
            }
            m227a(c0030i, c0054a, false);
        } else {
            if (c0032l.ai != null) {
                c0032l.ai.m209a(this.f175u, c0054a);
            }
            m237b(c0030i, c0054a, false);
        }
        return c0054a;
    }

    private C0054a<String, View> m216a(C0030i c0030i, boolean z, C0032l c0032l) {
        C0054a b = m235b(c0030i, c0032l, z);
        if (z) {
            if (c0032l.ai != null) {
                c0032l.ai.m209a(this.f175u, b);
            }
            m227a(c0030i, b, true);
        } else {
            if (c0032l.ah != null) {
                c0032l.ah.m209a(this.f175u, b);
            }
            m237b(c0030i, b, true);
        }
        return b;
    }

    private static C0054a<String, View> m217a(ArrayList<String> arrayList, ArrayList<String> arrayList2, C0054a<String, View> c0054a) {
        if (c0054a.isEmpty()) {
            return c0054a;
        }
        C0054a<String, View> c0054a2 = new C0054a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) c0054a.get(arrayList.get(i));
            if (view != null) {
                c0054a2.put(arrayList2.get(i), view);
            }
        }
        return c0054a2;
    }

    private static Object m218a(C0032l c0032l, C0032l c0032l2, boolean z) {
        if (c0032l == null || c0032l2 == null) {
            return null;
        }
        return ae.m167a(z ? c0032l2.m262A() : c0032l.m335z());
    }

    private static Object m219a(C0032l c0032l, boolean z) {
        if (c0032l == null) {
            return null;
        }
        return ae.m167a(z ? c0032l.m334y() : c0032l.m331v());
    }

    private static Object m220a(Object obj, C0032l c0032l, ArrayList<View> arrayList, C0054a<String, View> c0054a) {
        return obj != null ? ae.m168a(obj, c0032l.m325p(), (ArrayList) arrayList, (Map) c0054a) : obj;
    }

    private void m221a(int i, C0032l c0032l, String str, int i2) {
        c0032l.f209C = this.f155a;
        if (str != null) {
            if (c0032l.f215I == null || str.equals(c0032l.f215I)) {
                c0032l.f215I = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + c0032l + ": was " + c0032l.f215I + " now " + str);
            }
        }
        if (i != 0) {
            if (c0032l.f213G == 0 || c0032l.f213G == i) {
                c0032l.f213G = i;
                c0032l.f214H = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + c0032l + ": was " + c0032l.f213G + " now " + i);
            }
        }
        C0029h c0029h = new C0029h();
        c0029h.f193c = i2;
        c0029h.f194d = c0032l;
        m247a(c0029h);
    }

    private void m225a(C0030i c0030i, int i, Object obj) {
        if (this.f155a.f289g != null) {
            for (int i2 = 0; i2 < this.f155a.f289g.size(); i2++) {
                C0032l c0032l = (C0032l) this.f155a.f289g.get(i2);
                if (!(c0032l.f225S == null || c0032l.f224R == null || c0032l.f214H != i)) {
                    if (!c0032l.f216J) {
                        ae.m175a(obj, c0032l.f225S, false);
                        c0030i.f201b.remove(c0032l.f225S);
                    } else if (!c0030i.f201b.contains(c0032l.f225S)) {
                        ae.m175a(obj, c0032l.f225S, true);
                        c0030i.f201b.add(c0032l.f225S);
                    }
                }
            }
        }
    }

    private void m226a(C0030i c0030i, C0032l c0032l, C0032l c0032l2, boolean z, C0054a<String, View> c0054a) {
        aq aqVar = z ? c0032l2.ah : c0032l.ah;
        if (aqVar != null) {
            aqVar.m210b(new ArrayList(c0054a.keySet()), new ArrayList(c0054a.values()), null);
        }
    }

    private void m227a(C0030i c0030i, C0054a<String, View> c0054a, boolean z) {
        int size = this.f175u == null ? 0 : this.f175u.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f174t.get(i);
            View view = (View) c0054a.get((String) this.f175u.get(i));
            if (view != null) {
                String a = ae.m170a(view);
                if (z) {
                    C0025d.m231a(c0030i.f200a, str, a);
                } else {
                    C0025d.m231a(c0030i.f200a, a, str);
                }
            }
        }
    }

    private void m228a(C0030i c0030i, View view, Object obj, C0032l c0032l, C0032l c0032l2, boolean z, ArrayList<View> arrayList) {
        view.getViewTreeObserver().addOnPreDrawListener(new C0027f(this, view, obj, arrayList, c0030i, z, c0032l, c0032l2));
    }

    private static void m229a(C0030i c0030i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0025d.m231a(c0030i.f200a, (String) arrayList.get(i), (String) arrayList2.get(i));
            }
        }
    }

    private void m230a(C0054a<String, View> c0054a, C0030i c0030i) {
        if (this.f175u != null && !c0054a.isEmpty()) {
            View view = (View) c0054a.get(this.f175u.get(0));
            if (view != null) {
                c0030i.f202c.f132a = view;
            }
        }
    }

    private static void m231a(C0054a<String, String> c0054a, String str, String str2) {
        if (str != null && str2 != null && !str.equals(str2)) {
            for (int i = 0; i < c0054a.size(); i++) {
                if (str.equals(c0054a.m449c(i))) {
                    c0054a.m445a(i, (Object) str2);
                    return;
                }
            }
            c0054a.put(str, str2);
        }
    }

    private static void m232a(SparseArray<C0032l> sparseArray, C0032l c0032l) {
        if (c0032l != null) {
            int i = c0032l.f214H;
            if (i != 0 && !c0032l.m323n() && c0032l.m322m() && c0032l.m325p() != null && sparseArray.get(i) == null) {
                sparseArray.put(i, c0032l);
            }
        }
    }

    private void m233a(View view, C0030i c0030i, int i, Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new C0028g(this, view, c0030i, i, obj));
    }

    private boolean m234a(int i, C0030i c0030i, boolean z, SparseArray<C0032l> sparseArray, SparseArray<C0032l> sparseArray2) {
        View view = (ViewGroup) this.f155a.f298p.m349a(i);
        if (view == null) {
            return false;
        }
        C0032l c0032l = (C0032l) sparseArray2.get(i);
        C0032l c0032l2 = (C0032l) sparseArray.get(i);
        Object a = C0025d.m219a(c0032l, z);
        Object a2 = C0025d.m218a(c0032l, c0032l2, z);
        Object b = C0025d.m236b(c0032l2, z);
        if (a == null && a2 == null && b == null) {
            return false;
        }
        C0054a c0054a = null;
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            c0054a = m215a(c0030i, c0032l2, z);
            if (c0054a.isEmpty()) {
                arrayList.add(c0030i.f203d);
            } else {
                arrayList.addAll(c0054a.values());
            }
            aq aqVar = z ? c0032l2.ah : c0032l.ah;
            if (aqVar != null) {
                aqVar.m208a(new ArrayList(c0054a.keySet()), new ArrayList(c0054a.values()), null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object a3 = C0025d.m220a(b, c0032l2, arrayList2, c0054a);
        if (!(this.f175u == null || c0054a == null)) {
            View view2 = (View) c0054a.get(this.f175u.get(0));
            if (view2 != null) {
                if (a3 != null) {
                    ae.m174a(a3, view2);
                }
                if (a2 != null) {
                    ae.m174a(a2, view2);
                }
            }
        }
        ak c0026e = new C0026e(this, c0032l);
        if (a2 != null) {
            m228a(c0030i, view, a2, c0032l, c0032l2, z, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Map c0054a2 = new C0054a();
        Object a4 = ae.m169a(a, a3, a2, z ? c0032l.m264C() : c0032l.m263B());
        if (a4 != null) {
            ae.m176a(a, a2, view, c0026e, c0030i.f203d, c0030i.f202c, c0030i.f200a, arrayList3, c0054a2, arrayList);
            m233a(view, c0030i, i, a4);
            ae.m175a(a4, c0030i.f203d, true);
            m225a(c0030i, i, a4);
            ae.m173a((ViewGroup) view, a4);
            ae.m172a(view, c0030i.f203d, a, arrayList3, a3, arrayList2, a2, arrayList, a4, c0030i.f201b, c0054a2);
        }
        return a4 != null;
    }

    private C0054a<String, View> m235b(C0030i c0030i, C0032l c0032l, boolean z) {
        C0054a c0054a = new C0054a();
        View p = c0032l.m325p();
        if (p == null || this.f174t == null) {
            return c0054a;
        }
        ae.m179a((Map) c0054a, p);
        if (z) {
            return C0025d.m217a(this.f174t, this.f175u, c0054a);
        }
        c0054a.m452a(this.f175u);
        return c0054a;
    }

    private static Object m236b(C0032l c0032l, boolean z) {
        if (c0032l == null) {
            return null;
        }
        return ae.m167a(z ? c0032l.m332w() : c0032l.m333x());
    }

    private void m237b(C0030i c0030i, C0054a<String, View> c0054a, boolean z) {
        int size = c0054a.size();
        for (int i = 0; i < size; i++) {
            String str = (String) c0054a.m448b(i);
            String a = ae.m170a((View) c0054a.m449c(i));
            if (z) {
                C0025d.m231a(c0030i.f200a, str, a);
            } else {
                C0025d.m231a(c0030i.f200a, a, str);
            }
        }
    }

    private void m238b(SparseArray<C0032l> sparseArray, C0032l c0032l) {
        if (c0032l != null) {
            int i = c0032l.f214H;
            if (i != 0) {
                sparseArray.put(i, c0032l);
            }
        }
    }

    private void m239b(SparseArray<C0032l> sparseArray, SparseArray<C0032l> sparseArray2) {
        if (this.f155a.f298p.m350a()) {
            for (C0029h c0029h = this.f156b; c0029h != null; c0029h = c0029h.f191a) {
                switch (c0029h.f193c) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        m238b((SparseArray) sparseArray2, c0029h.f194d);
                        break;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        C0032l c0032l;
                        C0032l c0032l2 = c0029h.f194d;
                        if (this.f155a.f289g != null) {
                            c0032l = c0032l2;
                            for (int i = 0; i < this.f155a.f289g.size(); i++) {
                                C0032l c0032l3 = (C0032l) this.f155a.f289g.get(i);
                                if (c0032l == null || c0032l3.f214H == c0032l.f214H) {
                                    if (c0032l3 == c0032l) {
                                        c0032l = null;
                                    } else {
                                        C0025d.m232a((SparseArray) sparseArray, c0032l3);
                                    }
                                }
                            }
                        } else {
                            c0032l = c0032l2;
                        }
                        m238b((SparseArray) sparseArray2, c0032l);
                        break;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        C0025d.m232a((SparseArray) sparseArray, c0029h.f194d);
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        C0025d.m232a((SparseArray) sparseArray, c0029h.f194d);
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        m238b((SparseArray) sparseArray2, c0029h.f194d);
                        break;
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        C0025d.m232a((SparseArray) sparseArray, c0029h.f194d);
                        break;
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        m238b((SparseArray) sparseArray2, c0029h.f194d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public int m240a() {
        return m241a(false);
    }

    int m241a(boolean z) {
        if (this.f168n) {
            throw new IllegalStateException("commit already called");
        }
        if (C0043v.f282a) {
            Log.v("FragmentManager", "Commit: " + this);
            m249a("  ", null, new PrintWriter(new C0059e("FragmentManager")), null);
        }
        this.f168n = true;
        if (this.f165k) {
            this.f169o = this.f155a.m380a(this);
        } else {
            this.f169o = -1;
        }
        this.f155a.m398a((Runnable) this, z);
        return this.f169o;
    }

    public ad m242a(int i, C0032l c0032l) {
        return m252b(i, c0032l, null);
    }

    public ad m243a(int i, C0032l c0032l, String str) {
        m221a(i, c0032l, str, 1);
        return this;
    }

    public ad m244a(C0032l c0032l) {
        C0029h c0029h = new C0029h();
        c0029h.f193c = 3;
        c0029h.f194d = c0032l;
        m247a(c0029h);
        return this;
    }

    public C0030i m245a(boolean z, C0030i c0030i, SparseArray<C0032l> sparseArray, SparseArray<C0032l> sparseArray2) {
        if (C0043v.f282a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            m249a("  ", null, new PrintWriter(new C0059e("FragmentManager")), null);
        }
        if (c0030i == null) {
            if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
                c0030i = m213a((SparseArray) sparseArray, (SparseArray) sparseArray2, true);
            }
        } else if (!z) {
            C0025d.m229a(c0030i, this.f175u, this.f174t);
        }
        m246a(-1);
        int i = c0030i != null ? 0 : this.f164j;
        int i2 = c0030i != null ? 0 : this.f163i;
        C0029h c0029h = this.f157c;
        while (c0029h != null) {
            int i3 = c0030i != null ? 0 : c0029h.f197g;
            int i4 = c0030i != null ? 0 : c0029h.f198h;
            C0032l c0032l;
            C0032l c0032l2;
            switch (c0029h.f193c) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    c0032l = c0029h.f194d;
                    c0032l.f223Q = i4;
                    this.f155a.m394a(c0032l, C0043v.m378c(i2), i);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    c0032l = c0029h.f194d;
                    if (c0032l != null) {
                        c0032l.f223Q = i4;
                        this.f155a.m394a(c0032l, C0043v.m378c(i2), i);
                    }
                    if (c0029h.f199i == null) {
                        break;
                    }
                    for (int i5 = 0; i5 < c0029h.f199i.size(); i5++) {
                        c0032l2 = (C0032l) c0029h.f199i.get(i5);
                        c0032l2.f223Q = i3;
                        this.f155a.m396a(c0032l2, false);
                    }
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    c0032l2 = c0029h.f194d;
                    c0032l2.f223Q = i3;
                    this.f155a.m396a(c0032l2, false);
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    c0032l2 = c0029h.f194d;
                    c0032l2.f223Q = i3;
                    this.f155a.m412c(c0032l2, C0043v.m378c(i2), i);
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    c0032l = c0029h.f194d;
                    c0032l.f223Q = i4;
                    this.f155a.m407b(c0032l, C0043v.m378c(i2), i);
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    c0032l2 = c0029h.f194d;
                    c0032l2.f223Q = i3;
                    this.f155a.m418e(c0032l2, C0043v.m378c(i2), i);
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    c0032l2 = c0029h.f194d;
                    c0032l2.f223Q = i3;
                    this.f155a.m416d(c0032l2, C0043v.m378c(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0029h.f193c);
            }
            c0029h = c0029h.f192b;
        }
        if (z) {
            this.f155a.m387a(this.f155a.f296n, C0043v.m378c(i2), i, true);
            c0030i = null;
        }
        if (this.f169o >= 0) {
            this.f155a.m404b(this.f169o);
            this.f169o = -1;
        }
        return c0030i;
    }

    void m246a(int i) {
        if (this.f165k) {
            if (C0043v.f282a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (C0029h c0029h = this.f156b; c0029h != null; c0029h = c0029h.f191a) {
                C0032l c0032l;
                if (c0029h.f194d != null) {
                    c0032l = c0029h.f194d;
                    c0032l.f208B += i;
                    if (C0043v.f282a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0029h.f194d + " to " + c0029h.f194d.f208B);
                    }
                }
                if (c0029h.f199i != null) {
                    for (int size = c0029h.f199i.size() - 1; size >= 0; size--) {
                        c0032l = (C0032l) c0029h.f199i.get(size);
                        c0032l.f208B += i;
                        if (C0043v.f282a) {
                            Log.v("FragmentManager", "Bump nesting of " + c0032l + " to " + c0032l.f208B);
                        }
                    }
                }
            }
        }
    }

    void m247a(C0029h c0029h) {
        if (this.f156b == null) {
            this.f157c = c0029h;
            this.f156b = c0029h;
        } else {
            c0029h.f192b = this.f157c;
            this.f157c.f191a = c0029h;
            this.f157c = c0029h;
        }
        c0029h.f195e = this.f159e;
        c0029h.f196f = this.f160f;
        c0029h.f197g = this.f161g;
        c0029h.f198h = this.f162h;
        this.f158d++;
    }

    public void m248a(SparseArray<C0032l> sparseArray, SparseArray<C0032l> sparseArray2) {
        if (this.f155a.f298p.m350a()) {
            for (C0029h c0029h = this.f156b; c0029h != null; c0029h = c0029h.f191a) {
                switch (c0029h.f193c) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        C0025d.m232a((SparseArray) sparseArray, c0029h.f194d);
                        break;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        if (c0029h.f199i != null) {
                            for (int size = c0029h.f199i.size() - 1; size >= 0; size--) {
                                m238b((SparseArray) sparseArray2, (C0032l) c0029h.f199i.get(size));
                            }
                        }
                        C0025d.m232a((SparseArray) sparseArray, c0029h.f194d);
                        break;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        m238b((SparseArray) sparseArray2, c0029h.f194d);
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        m238b((SparseArray) sparseArray2, c0029h.f194d);
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        C0025d.m232a((SparseArray) sparseArray, c0029h.f194d);
                        break;
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        m238b((SparseArray) sparseArray2, c0029h.f194d);
                        break;
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        C0025d.m232a((SparseArray) sparseArray, c0029h.f194d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void m249a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m250a(str, printWriter, true);
    }

    public void m250a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f167m);
            printWriter.print(" mIndex=");
            printWriter.print(this.f169o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f168n);
            if (this.f163i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f163i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f164j));
            }
            if (!(this.f159e == 0 && this.f160f == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f159e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f160f));
            }
            if (!(this.f161g == 0 && this.f162h == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f161g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f162h));
            }
            if (!(this.f170p == 0 && this.f171q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f170p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f171q);
            }
            if (!(this.f172r == 0 && this.f173s == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f172r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f173s);
            }
        }
        if (this.f156b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            C0029h c0029h = this.f156b;
            while (c0029h != null) {
                String str3;
                switch (c0029h.f193c) {
                    case C0607c.AdsAttrs_adSize /*0*/:
                        str3 = "NULL";
                        break;
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        str3 = "ADD";
                        break;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        str3 = "REPLACE";
                        break;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        str3 = "REMOVE";
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        str3 = "HIDE";
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        str3 = "SHOW";
                        break;
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        str3 = "DETACH";
                        break;
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + c0029h.f193c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(c0029h.f194d);
                if (z) {
                    if (!(c0029h.f195e == 0 && c0029h.f196f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0029h.f195e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0029h.f196f));
                    }
                    if (!(c0029h.f197g == 0 && c0029h.f198h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0029h.f197g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0029h.f198h));
                    }
                }
                if (c0029h.f199i != null && c0029h.f199i.size() > 0) {
                    for (int i2 = 0; i2 < c0029h.f199i.size(); i2++) {
                        printWriter.print(str2);
                        if (c0029h.f199i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str2);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0029h.f199i.get(i2));
                    }
                }
                c0029h = c0029h.f191a;
                i++;
            }
        }
    }

    public int m251b() {
        return m241a(true);
    }

    public ad m252b(int i, C0032l c0032l, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m221a(i, c0032l, str, 2);
        return this;
    }

    public ad m253b(C0032l c0032l) {
        C0029h c0029h = new C0029h();
        c0029h.f193c = 6;
        c0029h.f194d = c0032l;
        m247a(c0029h);
        return this;
    }

    public ad m254c(C0032l c0032l) {
        C0029h c0029h = new C0029h();
        c0029h.f193c = 7;
        c0029h.f194d = c0032l;
        m247a(c0029h);
        return this;
    }

    public String m255c() {
        return this.f167m;
    }

    public void run() {
        if (C0043v.f282a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (!this.f165k || this.f169o >= 0) {
            C0030i a;
            m246a(1);
            if (VERSION.SDK_INT >= 21) {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                m239b(sparseArray, sparseArray2);
                a = m213a(sparseArray, sparseArray2, false);
            } else {
                Object obj = null;
            }
            int i = a != null ? 0 : this.f164j;
            int i2 = a != null ? 0 : this.f163i;
            C0029h c0029h = this.f156b;
            while (c0029h != null) {
                int i3 = a != null ? 0 : c0029h.f195e;
                int i4 = a != null ? 0 : c0029h.f196f;
                C0032l c0032l;
                switch (c0029h.f193c) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        c0032l = c0029h.f194d;
                        c0032l.f223Q = i3;
                        this.f155a.m396a(c0032l, false);
                        break;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        C0032l c0032l2;
                        c0032l = c0029h.f194d;
                        if (this.f155a.f289g != null) {
                            c0032l2 = c0032l;
                            for (int i5 = 0; i5 < this.f155a.f289g.size(); i5++) {
                                c0032l = (C0032l) this.f155a.f289g.get(i5);
                                if (C0043v.f282a) {
                                    Log.v("FragmentManager", "OP_REPLACE: adding=" + c0032l2 + " old=" + c0032l);
                                }
                                if (c0032l2 == null || c0032l.f214H == c0032l2.f214H) {
                                    if (c0032l == c0032l2) {
                                        c0029h.f194d = null;
                                        c0032l2 = null;
                                    } else {
                                        if (c0029h.f199i == null) {
                                            c0029h.f199i = new ArrayList();
                                        }
                                        c0029h.f199i.add(c0032l);
                                        c0032l.f223Q = i4;
                                        if (this.f165k) {
                                            c0032l.f208B++;
                                            if (C0043v.f282a) {
                                                Log.v("FragmentManager", "Bump nesting of " + c0032l + " to " + c0032l.f208B);
                                            }
                                        }
                                        this.f155a.m394a(c0032l, i2, i);
                                    }
                                }
                            }
                        } else {
                            c0032l2 = c0032l;
                        }
                        if (c0032l2 == null) {
                            break;
                        }
                        c0032l2.f223Q = i3;
                        this.f155a.m396a(c0032l2, false);
                        break;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        c0032l = c0029h.f194d;
                        c0032l.f223Q = i4;
                        this.f155a.m394a(c0032l, i2, i);
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        c0032l = c0029h.f194d;
                        c0032l.f223Q = i4;
                        this.f155a.m407b(c0032l, i2, i);
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        c0032l = c0029h.f194d;
                        c0032l.f223Q = i3;
                        this.f155a.m412c(c0032l, i2, i);
                        break;
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        c0032l = c0029h.f194d;
                        c0032l.f223Q = i4;
                        this.f155a.m416d(c0032l, i2, i);
                        break;
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        c0032l = c0029h.f194d;
                        c0032l.f223Q = i3;
                        this.f155a.m418e(c0032l, i2, i);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + c0029h.f193c);
                }
                c0029h = c0029h.f191a;
            }
            this.f155a.m387a(this.f155a.f296n, i2, i, true);
            if (this.f165k) {
                this.f155a.m405b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f169o >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f169o);
        }
        if (this.f167m != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f167m);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
