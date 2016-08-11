package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.p002a.C0019b;
import android.support.v4.p002a.C0020c;
import android.support.v4.p004c.C0058d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class ao implements C0020c<Object> {
    final int f140a;
    final Bundle f141b;
    am<Object> f142c;
    C0019b<Object> f143d;
    boolean f144e;
    boolean f145f;
    Object f146g;
    boolean f147h;
    boolean f148i;
    boolean f149j;
    boolean f150k;
    boolean f151l;
    boolean f152m;
    ao f153n;
    final /* synthetic */ an f154o;

    void m199a() {
        if (this.f148i && this.f149j) {
            this.f147h = true;
        } else if (!this.f147h) {
            this.f147h = true;
            if (an.f133a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            if (this.f143d == null && this.f142c != null) {
                this.f143d = this.f142c.m186a(this.f140a, this.f141b);
            }
            if (this.f143d == null) {
                return;
            }
            if (!this.f143d.getClass().isMemberClass() || Modifier.isStatic(this.f143d.getClass().getModifiers())) {
                if (!this.f152m) {
                    this.f143d.m114a(this.f140a, this);
                    this.f152m = true;
                }
                this.f143d.m113a();
                return;
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f143d);
        }
    }

    void m200a(C0019b<Object> c0019b, Object obj) {
        String str;
        if (this.f142c != null) {
            if (this.f154o.f137e != null) {
                String str2 = this.f154o.f137e.f260b.f303u;
                this.f154o.f137e.f260b.f303u = "onLoadFinished";
                str = str2;
            } else {
                str = null;
            }
            try {
                if (an.f133a) {
                    Log.v("LoaderManager", "  onLoadFinished in " + c0019b + ": " + c0019b.m112a(obj));
                }
                this.f142c.m188a((C0019b) c0019b, obj);
                this.f145f = true;
            } finally {
                if (this.f154o.f137e != null) {
                    this.f154o.f137e.f260b.f303u = str;
                }
            }
        }
    }

    public void m201a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f140a);
        printWriter.print(" mArgs=");
        printWriter.println(this.f141b);
        printWriter.print(str);
        printWriter.print("mCallbacks=");
        printWriter.println(this.f142c);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f143d);
        if (this.f143d != null) {
            this.f143d.m116a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f144e || this.f145f) {
            printWriter.print(str);
            printWriter.print("mHaveData=");
            printWriter.print(this.f144e);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.f145f);
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(this.f146g);
        }
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.print(this.f147h);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.f150k);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f151l);
        printWriter.print(str);
        printWriter.print("mRetaining=");
        printWriter.print(this.f148i);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.f149j);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.f152m);
        if (this.f153n != null) {
            printWriter.print(str);
            printWriter.println("Pending Loader ");
            printWriter.print(this.f153n);
            printWriter.println(":");
            this.f153n.m201a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    void m202b() {
        if (an.f133a) {
            Log.v("LoaderManager", "  Retaining: " + this);
        }
        this.f148i = true;
        this.f149j = this.f147h;
        this.f147h = false;
        this.f142c = null;
    }

    void m203c() {
        if (this.f148i) {
            if (an.f133a) {
                Log.v("LoaderManager", "  Finished Retaining: " + this);
            }
            this.f148i = false;
            if (!(this.f147h == this.f149j || this.f147h)) {
                m205e();
            }
        }
        if (this.f147h && this.f144e && !this.f150k) {
            m200a(this.f143d, this.f146g);
        }
    }

    void m204d() {
        if (this.f147h && this.f150k) {
            this.f150k = false;
            if (this.f144e) {
                m200a(this.f143d, this.f146g);
            }
        }
    }

    void m205e() {
        if (an.f133a) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.f147h = false;
        if (!this.f148i && this.f143d != null && this.f152m) {
            this.f152m = false;
            this.f143d.m115a((C0020c) this);
            this.f143d.m118c();
        }
    }

    void m206f() {
        String str;
        am amVar = null;
        if (an.f133a) {
            Log.v("LoaderManager", "  Destroying: " + this);
        }
        this.f151l = true;
        boolean z = this.f145f;
        this.f145f = false;
        if (this.f142c != null && this.f143d != null && this.f144e && z) {
            if (an.f133a) {
                Log.v("LoaderManager", "  Reseting: " + this);
            }
            if (this.f154o.f137e != null) {
                String str2 = this.f154o.f137e.f260b.f303u;
                this.f154o.f137e.f260b.f303u = "onLoaderReset";
                str = str2;
            } else {
                str = null;
            }
            try {
                this.f142c.m187a(this.f143d);
            } finally {
                amVar = this.f154o.f137e;
                if (amVar != null) {
                    amVar = this.f154o.f137e.f260b;
                    amVar.f303u = str;
                }
            }
        }
        this.f142c = amVar;
        this.f146g = amVar;
        this.f144e = false;
        if (this.f143d != null) {
            if (this.f152m) {
                this.f152m = false;
                this.f143d.m115a((C0020c) this);
            }
            this.f143d.m120e();
        }
        if (this.f153n != null) {
            this.f153n.m206f();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.f140a);
        stringBuilder.append(" : ");
        C0058d.m484a(this.f143d, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
