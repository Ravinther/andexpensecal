package p007b.p013b;

import java.security.AccessControlException;
import p007b.p013b.p014a.C0207a;
import p007b.p013b.p014a.C0209b;

/* renamed from: b.b.c */
public abstract class C0208c {
    private static C0208c f1301a;

    static {
        f1301a = null;
    }

    protected C0208c() {
    }

    public static final C0208c m1493a(Class cls) {
        if (f1301a == null) {
            C0208c.m1494a();
        }
        return f1301a.m1498b(cls);
    }

    private static synchronized void m1494a() {
        String str;
        synchronized (C0208c.class) {
            if (f1301a == null) {
                String str2 = C0207a.f1300a;
                try {
                    str2 = System.getProperty("logger");
                    str = str2 == null ? C0207a.f1300a : str2;
                    try {
                        f1301a = (C0208c) Class.forName(str).newInstance();
                    } catch (IllegalAccessException e) {
                        str2 = str;
                        f1301a = new C0209b();
                        f1301a.m1499b("Could not instantiate logger " + str2 + " using default");
                    } catch (InstantiationException e2) {
                        f1301a = new C0209b();
                        f1301a.m1499b("Could not instantiate logger " + str + " using default");
                    } catch (AccessControlException e3) {
                        f1301a = new C0209b();
                        f1301a.m1499b("Could not instantiate logger " + str + " using default");
                    } catch (ClassNotFoundException e4) {
                        f1301a = new C0209b();
                        f1301a.m1499b("Could not instantiate logger " + str + " using default");
                    }
                } catch (IllegalAccessException e5) {
                    f1301a = new C0209b();
                    f1301a.m1499b("Could not instantiate logger " + str2 + " using default");
                } catch (InstantiationException e6) {
                    str = str2;
                    f1301a = new C0209b();
                    f1301a.m1499b("Could not instantiate logger " + str + " using default");
                } catch (AccessControlException e7) {
                    str = str2;
                    f1301a = new C0209b();
                    f1301a.m1499b("Could not instantiate logger " + str + " using default");
                } catch (ClassNotFoundException e8) {
                    str = str2;
                    f1301a = new C0209b();
                    f1301a.m1499b("Could not instantiate logger " + str + " using default");
                }
            }
        }
    }

    public abstract void m1495a(Object obj);

    public abstract void m1496a(Object obj, Throwable th);

    public void m1497a(boolean z) {
    }

    protected abstract C0208c m1498b(Class cls);

    public abstract void m1499b(Object obj);
}
