package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.C0022y;
import android.view.View;
import android.view.ViewGroup;

public abstract class ab extends C0022y {
    private final C0041t f109a;
    private ad f110b;
    private C0032l f111c;

    public ab(C0041t c0041t) {
        this.f110b = null;
        this.f111c = null;
        this.f109a = c0041t;
    }

    private static String m147a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    public Parcelable m148a() {
        return null;
    }

    public abstract C0032l m149a(int i);

    public Object m150a(ViewGroup viewGroup, int i) {
        if (this.f110b == null) {
            this.f110b = this.f109a.m369a();
        }
        long b = m155b(i);
        C0032l a = this.f109a.m370a(m147a(viewGroup.getId(), b));
        if (a != null) {
            this.f110b.m166c(a);
        } else {
            a = m149a(i);
            this.f110b.m162a(viewGroup.getId(), a, m147a(viewGroup.getId(), b));
        }
        if (a != this.f111c) {
            a.m307e(false);
            a.m310f(false);
        }
        return a;
    }

    public void m151a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void m152a(ViewGroup viewGroup) {
    }

    public void m153a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f110b == null) {
            this.f110b = this.f109a.m369a();
        }
        this.f110b.m165b((C0032l) obj);
    }

    public boolean m154a(View view, Object obj) {
        return ((C0032l) obj).m325p() == view;
    }

    public long m155b(int i) {
        return (long) i;
    }

    public void m156b(ViewGroup viewGroup) {
        if (this.f110b != null) {
            this.f110b.m164b();
            this.f110b = null;
            this.f109a.m372b();
        }
    }

    public void m157b(ViewGroup viewGroup, int i, Object obj) {
        C0032l c0032l = (C0032l) obj;
        if (c0032l != this.f111c) {
            if (this.f111c != null) {
                this.f111c.m307e(false);
                this.f111c.m310f(false);
            }
            if (c0032l != null) {
                c0032l.m307e(true);
                c0032l.m310f(true);
            }
            this.f111c = c0032l;
        }
    }
}
