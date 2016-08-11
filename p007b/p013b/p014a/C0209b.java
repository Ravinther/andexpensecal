package p007b.p013b.p014a;

import p007b.p013b.C0208c;

/* renamed from: b.b.a.b */
public class C0209b extends C0208c {
    private boolean f1302a;

    public C0209b() {
        this.f1302a = false;
    }

    public void m1500a(Object obj) {
        System.err.print("Error: ");
        System.err.println(obj);
    }

    public void m1501a(Object obj, Throwable th) {
        if (!this.f1302a) {
            System.err.print("Warning:  ");
            System.err.println(obj);
            th.printStackTrace();
        }
    }

    public void m1502a(boolean z) {
        this.f1302a = z;
    }

    protected C0208c m1503b(Class cls) {
        return this;
    }

    public void m1504b(Object obj) {
        if (!this.f1302a) {
            System.err.print("Warning:  ");
            System.err.println(obj);
        }
    }
}
