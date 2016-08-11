package android.support.v4.app;

import android.support.v4.p004c.C0058d;
import android.support.v4.p004c.C0065m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class an extends al {
    static boolean f133a;
    final C0065m<ao> f134b;
    final C0065m<ao> f135c;
    final String f136d;
    C0037o f137e;
    boolean f138f;
    boolean f139g;

    static {
        f133a = false;
    }

    an(String str, C0037o c0037o, boolean z) {
        this.f134b = new C0065m();
        this.f135c = new C0065m();
        this.f136d = str;
        this.f137e = c0037o;
        this.f138f = z;
    }

    void m189a(C0037o c0037o) {
        this.f137e = c0037o;
    }

    public void m190a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.f134b.m491b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.f134b.m491b(); i2++) {
                ao aoVar = (ao) this.f134b.m492b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f134b.m489a(i2));
                printWriter.print(": ");
                printWriter.println(aoVar.toString());
                aoVar.m201a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f135c.m491b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.f135c.m491b()) {
                aoVar = (ao) this.f135c.m492b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f135c.m489a(i));
                printWriter.print(": ");
                printWriter.println(aoVar.toString());
                aoVar.m201a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public boolean m191a() {
        int b = this.f134b.m491b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            ao aoVar = (ao) this.f134b.m492b(i);
            int i2 = (!aoVar.f147h || aoVar.f145f) ? 0 : 1;
            z |= i2;
        }
        return z;
    }

    void m192b() {
        if (f133a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f138f) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f138f = true;
        for (int b = this.f134b.m491b() - 1; b >= 0; b--) {
            ((ao) this.f134b.m492b(b)).m199a();
        }
    }

    void m193c() {
        if (f133a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.f138f) {
            for (int b = this.f134b.m491b() - 1; b >= 0; b--) {
                ((ao) this.f134b.m492b(b)).m205e();
            }
            this.f138f = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    void m194d() {
        if (f133a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.f138f) {
            this.f139g = true;
            this.f138f = false;
            for (int b = this.f134b.m491b() - 1; b >= 0; b--) {
                ((ao) this.f134b.m492b(b)).m202b();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    void m195e() {
        if (this.f139g) {
            if (f133a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f139g = false;
            for (int b = this.f134b.m491b() - 1; b >= 0; b--) {
                ((ao) this.f134b.m492b(b)).m203c();
            }
        }
    }

    void m196f() {
        for (int b = this.f134b.m491b() - 1; b >= 0; b--) {
            ((ao) this.f134b.m492b(b)).f150k = true;
        }
    }

    void m197g() {
        for (int b = this.f134b.m491b() - 1; b >= 0; b--) {
            ((ao) this.f134b.m492b(b)).m204d();
        }
    }

    void m198h() {
        int b;
        if (!this.f139g) {
            if (f133a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (b = this.f134b.m491b() - 1; b >= 0; b--) {
                ((ao) this.f134b.m492b(b)).m206f();
            }
            this.f134b.m493c();
        }
        if (f133a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (b = this.f135c.m491b() - 1; b >= 0; b--) {
            ((ao) this.f135c.m492b(b)).m206f();
        }
        this.f135c.m493c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0058d.m484a(this.f137e, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
