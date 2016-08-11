package android.support.v4.p002a;

import android.support.v4.p004c.C0058d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.b */
public class C0019b<D> {
    int f76a;
    C0020c<D> f77b;
    boolean f78c;
    boolean f79d;
    boolean f80e;
    boolean f81f;
    boolean f82g;

    public String m112a(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0058d.m484a(d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void m113a() {
        this.f78c = true;
        this.f80e = false;
        this.f79d = false;
        m117b();
    }

    public void m114a(int i, C0020c<D> c0020c) {
        if (this.f77b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f77b = c0020c;
        this.f76a = i;
    }

    public void m115a(C0020c<D> c0020c) {
        if (this.f77b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f77b != c0020c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f77b = null;
        }
    }

    public void m116a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f76a);
        printWriter.print(" mListener=");
        printWriter.println(this.f77b);
        if (this.f78c || this.f81f || this.f82g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f78c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f81f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f82g);
        }
        if (this.f79d || this.f80e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f79d);
            printWriter.print(" mReset=");
            printWriter.println(this.f80e);
        }
    }

    protected void m117b() {
    }

    public void m118c() {
        this.f78c = false;
        m119d();
    }

    protected void m119d() {
    }

    public void m120e() {
        m121f();
        this.f80e = true;
        this.f78c = false;
        this.f79d = false;
        this.f81f = false;
        this.f82g = false;
    }

    protected void m121f() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0058d.m484a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f76a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
