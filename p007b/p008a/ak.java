package p007b.p008a;

import p007b.p011c.C0153g;
import p007b.p013b.C0208c;

/* renamed from: b.a.ak */
public class ak extends bd implements ab, C0153g {
    public static C0208c f736a;
    public static final am f737b;
    public static final am f738c;
    private static String[] f739j;
    private boolean f740d;
    private byte[] f741e;
    private int f742f;
    private String f743g;
    private boolean f744h;
    private boolean f745i;

    static {
        f736a = C0208c.m1493a(ak.class);
        f739j = new String[]{"dd", "mm", "yy", "hh", "ss", "m/", "/d"};
        f737b = new am();
        f738c = new am();
    }

    protected ak() {
        super(ay.f776G);
        this.f740d = false;
    }

    protected final String m1129a(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        while (indexOf != -1) {
            StringBuffer stringBuffer = new StringBuffer(str.substring(0, indexOf));
            stringBuffer.append(str3);
            stringBuffer.append(str.substring(indexOf + str2.length()));
            str = stringBuffer.toString();
            indexOf = str.indexOf(str2);
        }
        return str;
    }

    public void m1130a(int i) {
        this.f742f = i;
        this.f740d = true;
    }

    protected final void m1131a(String str) {
        this.f743g = str;
    }

    public byte[] m1132a() {
        this.f741e = new byte[(((this.f743g.length() * 2) + 3) + 2)];
        ar.m1150a(this.f742f, this.f741e, 0);
        ar.m1150a(this.f743g.length(), this.f741e, 2);
        this.f741e[4] = (byte) 1;
        ax.m1166b(this.f743g, this.f741e, 5);
        return this.f741e;
    }

    public int a_() {
        return this.f742f;
    }

    public boolean b_() {
        return this.f740d;
    }

    public boolean m1133c() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return (this.f740d && akVar.f740d) ? (this.f744h == akVar.f744h && this.f745i == akVar.f745i) ? this.f743g.equals(akVar.f743g) : false : this.f743g.equals(akVar.f743g);
    }

    public int hashCode() {
        return this.f743g.hashCode();
    }
}
