package p007b;

import java.io.File;
import java.io.FileOutputStream;
import p007b.p010e.C0242r;
import p007b.p010e.p017a.dm;

/* renamed from: b.o */
public abstract class C0286o {
    public static C0242r m1902a(File file, C0287p c0287p) {
        return new dm(new FileOutputStream(file), true, c0287p);
    }

    public static String m1903a() {
        return "2.6.12";
    }
}
