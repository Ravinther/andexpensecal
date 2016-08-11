package p007b.p008a;

import com.google.android.gms.ads.AdRequest;
import java.text.DecimalFormat;
import p007b.C0150a;
import p007b.C0287p;
import p007b.p008a.p012b.C0175t;
import p007b.p008a.p012b.C0177v;
import p007b.p008a.p012b.C0179x;
import p007b.p008a.p012b.as;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.t */
public class C0200t {
    public static final C0202v f1229a;
    public static final C0202v f1230b;
    public static final C0202v f1231c;
    public static final C0202v f1232d;
    public static final C0202v f1233e;
    public static final C0202v f1234f;
    public static final C0202v f1235g;
    public static final C0202v f1236h;
    public static final C0203w f1237i;
    public static final C0203w f1238j;
    public static final C0203w f1239k;
    public static final C0201u f1240l;
    public static final C0201u f1241m;
    public static final C0201u f1242n;
    public static final C0201u f1243o;
    public static final C0201u f1244p;
    public static final C0201u f1245q;
    public static final C0201u f1246r;
    public static final C0201u f1247s;
    private static C0208c f1248t;
    private static DecimalFormat f1249u;
    private boolean f1250A;
    private boolean f1251B;
    private boolean f1252C;
    private String f1253D;
    private String f1254E;
    private String f1255F;
    private String f1256G;
    private C0179x f1257H;
    private String f1258I;
    private C0179x f1259J;
    private String f1260K;
    private int f1261L;
    private int f1262M;
    private int f1263N;
    private int f1264O;
    private boolean f1265P;
    private boolean f1266Q;
    private C0202v f1267v;
    private C0203w f1268w;
    private C0201u f1269x;
    private boolean f1270y;
    private boolean f1271z;

    static {
        f1248t = C0208c.m1493a(C0200t.class);
        f1229a = new C0202v(0, "any");
        f1230b = new C0202v(1, "int");
        f1231c = new C0202v(2, "dec");
        f1232d = new C0202v(3, "list");
        f1233e = new C0202v(4, "date");
        f1234f = new C0202v(5, "time");
        f1235g = new C0202v(6, "strlen");
        f1236h = new C0202v(7, "form");
        f1237i = new C0203w(0);
        f1238j = new C0203w(1);
        f1239k = new C0203w(2);
        f1240l = new C0201u(0, "{0} <= x <= {1}");
        f1241m = new C0201u(1, "!({0} <= x <= {1}");
        f1242n = new C0201u(2, "x == {0}");
        f1243o = new C0201u(3, "x != {0}");
        f1244p = new C0201u(4, "x > {0}");
        f1245q = new C0201u(5, "x < {0}");
        f1246r = new C0201u(6, "x >= {0}");
        f1247s = new C0201u(7, "x <= {0}");
        f1249u = new DecimalFormat("#.#");
    }

    public C0200t(C0200t c0200t) {
        this.f1266Q = true;
        this.f1267v = c0200t.f1267v;
        this.f1268w = c0200t.f1268w;
        this.f1269x = c0200t.f1269x;
        this.f1270y = c0200t.f1270y;
        this.f1271z = c0200t.f1271z;
        this.f1250A = c0200t.f1250A;
        this.f1251B = c0200t.f1251B;
        this.f1252C = c0200t.f1252C;
        this.f1253D = c0200t.f1253D;
        this.f1255F = c0200t.f1255F;
        this.f1254E = c0200t.f1254E;
        this.f1256G = c0200t.f1256G;
        this.f1265P = c0200t.f1265P;
        this.f1262M = c0200t.f1262M;
        this.f1264O = c0200t.f1264O;
        this.f1261L = c0200t.f1261L;
        this.f1263N = c0200t.f1263N;
        if (c0200t.f1258I != null) {
            this.f1258I = c0200t.f1258I;
            this.f1260K = c0200t.f1260K;
            return;
        }
        try {
            this.f1258I = c0200t.f1257H.m1376b();
            this.f1260K = c0200t.f1259J != null ? c0200t.f1259J.m1376b() : null;
        } catch (C0177v e) {
            f1248t.m1499b("Cannot parse validation formula:  " + e.getMessage());
        }
    }

    public C0200t(byte[] bArr, C0175t c0175t, bb bbVar, C0287p c0287p) {
        int i;
        boolean z = false;
        C0210a.m1505a(bbVar != null);
        this.f1266Q = false;
        int a = ar.m1149a(bArr[0], bArr[1], bArr[2], bArr[3]);
        this.f1267v = C0202v.m1478a(a & 15);
        this.f1268w = C0203w.m1480a((a & 112) >> 4);
        this.f1269x = C0201u.m1476a((15728640 & a) >> 20);
        this.f1270y = (a & 128) != 0;
        this.f1271z = (a & 256) != 0;
        this.f1250A = (a & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        this.f1251B = (262144 & a) != 0;
        this.f1252C = (524288 & a) != 0;
        a = ar.m1148a(bArr[4], bArr[5]);
        if (a > 0 && bArr[6] == null) {
            this.f1253D = ax.m1162a(bArr, a, 7, c0287p);
            i = 4 + (a + 3);
        } else if (a > 0) {
            this.f1253D = ax.m1161a(bArr, a, 7);
            i = 4 + ((a * 2) + 3);
        } else {
            i = 7;
        }
        int a2 = ar.m1148a(bArr[i], bArr[i + 1]);
        if (a2 > 0 && bArr[i + 2] == null) {
            this.f1254E = ax.m1162a(bArr, a2, i + 3, c0287p);
            i += a2 + 3;
        } else if (a2 > 0) {
            this.f1254E = ax.m1161a(bArr, a2, i + 3);
            i += (a2 * 2) + 3;
        } else {
            i += 3;
        }
        a2 = ar.m1148a(bArr[i], bArr[i + 1]);
        if (a2 > 0 && bArr[i + 2] == null) {
            this.f1255F = ax.m1162a(bArr, a2, i + 3, c0287p);
            i += a2 + 3;
        } else if (a2 > 0) {
            this.f1255F = ax.m1161a(bArr, a2, i + 3);
            i += (a2 * 2) + 3;
        } else {
            i += 3;
        }
        a2 = ar.m1148a(bArr[i], bArr[i + 1]);
        if (a2 > 0 && bArr[i + 2] == null) {
            this.f1256G = ax.m1162a(bArr, a2, i + 3, c0287p);
            i += a2 + 3;
        } else if (a2 > 0) {
            this.f1256G = ax.m1161a(bArr, a2, i + 3);
            i += (a2 * 2) + 3;
        } else {
            i += 3;
        }
        a2 = ar.m1148a(bArr[i], bArr[i + 1]);
        i += 4;
        a = i + a2;
        int a3 = ar.m1148a(bArr[a], bArr[a + 1]);
        int i2 = a + 4;
        a = (i2 + a3) + 2;
        this.f1262M = ar.m1148a(bArr[a], bArr[a + 1]);
        a += 2;
        this.f1264O = ar.m1148a(bArr[a], bArr[a + 1]);
        a += 2;
        this.f1261L = ar.m1148a(bArr[a], bArr[a + 1]);
        a += 2;
        this.f1263N = ar.m1148a(bArr[a], bArr[a + 1]);
        a += 2;
        if (!(this.f1262M == this.f1264O && this.f1261L == this.f1263N)) {
            z = true;
        }
        this.f1265P = z;
        try {
            Object obj;
            C0150a adVar = new ad(this.f1261L, this.f1262M);
            if (a2 != 0) {
                obj = new byte[a2];
                System.arraycopy(bArr, i, obj, 0, a2);
                this.f1257H = new C0179x(obj, adVar, c0175t, bbVar, c0287p, as.f841b);
                this.f1257H.m1375a();
            }
            if (a3 != 0) {
                obj = new byte[a3];
                System.arraycopy(bArr, i2, obj, 0, a3);
                this.f1259J = new C0179x(obj, adVar, c0175t, bbVar, c0287p, as.f841b);
                this.f1259J.m1375a();
            }
        } catch (C0177v e) {
            f1248t.m1499b(e.getMessage() + " for cells " + C0193m.m1451a(this.f1261L, this.f1262M) + "-" + C0193m.m1451a(this.f1263N, this.f1264O));
        }
    }

    public void m1468a(int i, int i2, C0175t c0175t, bb bbVar, C0287p c0287p) {
        if (!this.f1265P) {
            this.f1262M = i2;
            this.f1264O = i2;
            this.f1261L = i;
            this.f1263N = i;
            this.f1257H = new C0179x(this.f1258I, c0175t, bbVar, c0287p, as.f841b);
            this.f1257H.m1375a();
            if (this.f1260K != null) {
                this.f1259J = new C0179x(this.f1260K, c0175t, bbVar, c0287p, as.f841b);
                this.f1259J.m1375a();
            }
        }
    }

    public byte[] m1469a() {
        Object c = this.f1257H != null ? this.f1257H.m1377c() : new byte[0];
        Object c2 = this.f1259J != null ? this.f1259J.m1377c() : new byte[0];
        Object obj = new byte[(((((((((((((((this.f1253D.length() * 2) + 4) + 3) + (this.f1254E.length() * 2)) + 3) + (this.f1255F.length() * 2)) + 3) + (this.f1256G.length() * 2)) + 3) + c.length) + 2) + c2.length) + 2) + 4) + 10)];
        int a = ((this.f1267v.m1479a() | 0) | (this.f1268w.m1481a() << 4)) | (this.f1269x.m1477a() << 20);
        if (this.f1270y) {
            a |= 128;
        }
        if (this.f1271z) {
            a |= 256;
        }
        if (this.f1250A) {
            a |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }
        if (this.f1251B) {
            a |= 262144;
        }
        if (this.f1252C) {
            a |= 524288;
        }
        ar.m1153b(a, obj, 0);
        ar.m1150a(this.f1253D.length(), obj, 4);
        obj[6] = 1;
        ax.m1166b(this.f1253D, obj, 7);
        a = (this.f1253D.length() * 2) + 7;
        ar.m1150a(this.f1254E.length(), obj, a);
        a += 2;
        obj[a] = 1;
        a++;
        ax.m1166b(this.f1254E, obj, a);
        a += this.f1254E.length() * 2;
        ar.m1150a(this.f1255F.length(), obj, a);
        a += 2;
        obj[a] = 1;
        a++;
        ax.m1166b(this.f1255F, obj, a);
        a += this.f1255F.length() * 2;
        ar.m1150a(this.f1256G.length(), obj, a);
        a += 2;
        obj[a] = 1;
        a++;
        ax.m1166b(this.f1256G, obj, a);
        a += this.f1256G.length() * 2;
        ar.m1150a(c.length, obj, a);
        a += 4;
        System.arraycopy(c, 0, obj, a, c.length);
        int length = c.length + a;
        ar.m1150a(c2.length, obj, length);
        length += 4;
        System.arraycopy(c2, 0, obj, length, c2.length);
        length += c2.length;
        ar.m1150a(1, obj, length);
        length += 2;
        ar.m1150a(this.f1262M, obj, length);
        length += 2;
        ar.m1150a(this.f1264O, obj, length);
        length += 2;
        ar.m1150a(this.f1261L, obj, length);
        length += 2;
        ar.m1150a(this.f1263N, obj, length);
        length += 2;
        return obj;
    }

    public int m1470b() {
        return this.f1261L;
    }

    public int m1471c() {
        return this.f1263N;
    }

    public int m1472d() {
        return this.f1262M;
    }

    public int m1473e() {
        return this.f1264O;
    }

    public boolean m1474f() {
        return this.f1265P;
    }

    public boolean m1475g() {
        return this.f1266Q;
    }
}
