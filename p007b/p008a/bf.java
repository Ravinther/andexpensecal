package p007b.p008a;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import p007b.p011c.C0152f;
import p007b.p011c.C0153g;
import p007b.p011c.C0183d;
import p007b.p011c.C0213a;
import p007b.p011c.C0214b;
import p007b.p011c.C0215c;
import p007b.p011c.C0216e;
import p007b.p011c.C0217h;
import p007b.p011c.C0221l;
import p007b.p011c.C0225p;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.bf */
public class bf extends bd implements C0183d {
    private static final int[] f1085N;
    private static final DateFormat[] f1086O;
    private static int[] f1087P;
    private static NumberFormat[] f1088Q;
    public static final bh f1089b;
    public static final bh f1090c;
    protected static final bi f1091d;
    protected static final bi f1092e;
    private static C0208c f1093f;
    private C0216e f1094A;
    private C0216e f1095B;
    private C0221l f1096C;
    private int f1097D;
    private int f1098E;
    private ag f1099F;
    private ab f1100G;
    private boolean f1101H;
    private boolean f1102I;
    private C0153g f1103J;
    private boolean f1104K;
    private boolean f1105L;
    private an f1106M;
    private bh f1107R;
    public int f1108a;
    private int f1109g;
    private bi f1110h;
    private NumberFormat f1111i;
    private byte f1112j;
    private int f1113k;
    private boolean f1114l;
    private boolean f1115m;
    private C0213a f1116n;
    private C0225p f1117o;
    private C0217h f1118p;
    private boolean f1119q;
    private int f1120r;
    private boolean f1121s;
    private C0215c f1122t;
    private C0215c f1123u;
    private C0215c f1124v;
    private C0215c f1125w;
    private C0216e f1126x;
    private C0216e f1127y;
    private C0216e f1128z;

    static {
        f1093f = C0208c.m1493a(bf.class);
        f1085N = new int[]{14, 15, 16, 17, 18, 19, 20, 21, 22, 45, 46, 47};
        f1086O = new DateFormat[]{SimpleDateFormat.getDateInstance(3), SimpleDateFormat.getDateInstance(2), new SimpleDateFormat("d-MMM"), new SimpleDateFormat("MMM-yy"), new SimpleDateFormat("h:mm a"), new SimpleDateFormat("h:mm:ss a"), new SimpleDateFormat("H:mm"), new SimpleDateFormat("H:mm:ss"), new SimpleDateFormat("M/d/yy H:mm"), new SimpleDateFormat("mm:ss"), new SimpleDateFormat("H:mm:ss"), new SimpleDateFormat("mm:ss.S")};
        f1087P = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 37, 38, 39, 40, 41, 42, 43, 44, 48};
        f1088Q = new NumberFormat[]{new DecimalFormat("0"), new DecimalFormat("0.00"), new DecimalFormat("#,##0"), new DecimalFormat("#,##0.00"), new DecimalFormat("$#,##0;($#,##0)"), new DecimalFormat("$#,##0;($#,##0)"), new DecimalFormat("$#,##0.00;($#,##0.00)"), new DecimalFormat("$#,##0.00;($#,##0.00)"), new DecimalFormat("0%"), new DecimalFormat("0.00%"), new DecimalFormat("0.00E00"), new DecimalFormat("#,##0;(#,##0)"), new DecimalFormat("#,##0;(#,##0)"), new DecimalFormat("#,##0.00;(#,##0.00)"), new DecimalFormat("#,##0.00;(#,##0.00)"), new DecimalFormat("#,##0;(#,##0)"), new DecimalFormat("$#,##0;($#,##0)"), new DecimalFormat("#,##0.00;(#,##0.00)"), new DecimalFormat("$#,##0.00;($#,##0.00)"), new DecimalFormat("##0.0E0")};
        f1089b = new bh();
        f1090c = new bh();
        f1091d = new bi();
        f1092e = new bi();
    }

    public bf(ag agVar, ab abVar) {
        boolean z = true;
        super(ay.f777H);
        this.f1101H = false;
        this.f1114l = true;
        this.f1115m = false;
        this.f1116n = C0213a.f1303a;
        this.f1117o = C0225p.f1495c;
        this.f1118p = C0217h.f1388a;
        this.f1119q = false;
        this.f1122t = C0215c.f1319a;
        this.f1123u = C0215c.f1319a;
        this.f1124v = C0215c.f1319a;
        this.f1125w = C0215c.f1319a;
        this.f1126x = C0216e.ai;
        this.f1127y = C0216e.ai;
        this.f1128z = C0216e.ai;
        this.f1094A = C0216e.ai;
        this.f1096C = C0221l.f1454a;
        this.f1095B = C0216e.f1366e;
        this.f1120r = 0;
        this.f1121s = false;
        this.f1112j = (byte) 124;
        this.f1109g = 0;
        this.f1110h = null;
        this.f1099F = agVar;
        this.f1100G = abVar;
        this.f1107R = f1089b;
        this.f1102I = false;
        this.f1105L = false;
        this.f1104K = true;
        C0210a.m1505a(this.f1099F != null);
        if (this.f1100G == null) {
            z = false;
        }
        C0210a.m1505a(z);
    }

    protected bf(bf bfVar) {
        super(ay.f777H);
        this.f1101H = false;
        this.f1114l = bfVar.f1114l;
        this.f1115m = bfVar.f1115m;
        this.f1116n = bfVar.f1116n;
        this.f1117o = bfVar.f1117o;
        this.f1118p = bfVar.f1118p;
        this.f1119q = bfVar.f1119q;
        this.f1122t = bfVar.f1122t;
        this.f1123u = bfVar.f1123u;
        this.f1124v = bfVar.f1124v;
        this.f1125w = bfVar.f1125w;
        this.f1126x = bfVar.f1126x;
        this.f1127y = bfVar.f1127y;
        this.f1128z = bfVar.f1128z;
        this.f1094A = bfVar.f1094A;
        this.f1096C = bfVar.f1096C;
        this.f1110h = bfVar.f1110h;
        this.f1120r = bfVar.f1120r;
        this.f1121s = bfVar.f1121s;
        this.f1109g = bfVar.f1109g;
        this.f1095B = bfVar.f1095B;
        this.f1099F = bfVar.f1099F;
        this.f1100G = bfVar.f1100G;
        this.f1113k = bfVar.f1113k;
        this.f1108a = bfVar.f1108a;
        this.f1104K = bfVar.f1104K;
        this.f1107R = f1089b;
        this.f1102I = false;
        this.f1105L = true;
    }

    private void m1396p() {
        boolean z = false;
        if (this.f1108a >= C0189h.f1165a.length || C0189h.f1165a[this.f1108a] == null) {
            this.f1103J = this.f1106M.m1135a(this.f1108a);
        } else {
            this.f1103J = C0189h.f1165a[this.f1108a];
        }
        this.f1099F = this.f1106M.m1134a().m1125a(this.f1113k);
        byte[] a = g_().m1542a();
        int a2 = ar.m1148a(a[4], a[5]);
        this.f1109g = (65520 & a2) >> 4;
        this.f1110h = (a2 & 4) == 0 ? f1091d : f1092e;
        this.f1114l = (a2 & 1) != 0;
        this.f1115m = (a2 & 2) != 0;
        if (this.f1110h == f1091d && (this.f1109g & 4095) == 4095) {
            this.f1109g = 0;
            f1093f.m1499b((Object) "Invalid parent format found - ignoring");
        }
        int a3 = ar.m1148a(a[6], a[7]);
        if ((a3 & 8) != 0) {
            this.f1119q = true;
        }
        this.f1116n = C0213a.m1508a(a3 & 7);
        this.f1117o = C0225p.m1527a((a3 >> 4) & 7);
        this.f1118p = C0217h.m1515a((a3 >> 8) & 255);
        a3 = ar.m1148a(a[8], a[9]);
        this.f1120r = a3 & 15;
        if ((a3 & 16) != 0) {
            z = true;
        }
        this.f1121s = z;
        if (this.f1107R == f1089b) {
            this.f1112j = a[9];
        }
        a3 = ar.m1148a(a[10], a[11]);
        this.f1122t = C0215c.m1510a(a3 & 7);
        this.f1123u = C0215c.m1510a((a3 >> 4) & 7);
        this.f1124v = C0215c.m1510a((a3 >> 8) & 7);
        this.f1125w = C0215c.m1510a((a3 >> 12) & 7);
        a3 = ar.m1148a(a[12], a[13]);
        this.f1126x = C0216e.m1513a(a3 & 127);
        this.f1127y = C0216e.m1513a((a3 & 16256) >> 7);
        a3 = ar.m1148a(a[14], a[15]);
        this.f1128z = C0216e.m1513a(a3 & 127);
        this.f1094A = C0216e.m1513a((a3 & 16256) >> 7);
        if (this.f1107R == f1089b) {
            this.f1096C = C0221l.m1518a((ar.m1148a(a[16], a[17]) & 64512) >> 10);
            this.f1095B = C0216e.m1513a(ar.m1148a(a[18], a[19]) & 63);
            if (this.f1095B == C0216e.f1362a || this.f1095B == C0216e.f1365d) {
                this.f1095B = C0216e.f1366e;
            }
        } else {
            this.f1096C = C0221l.f1454a;
            this.f1095B = C0216e.f1366e;
        }
        this.f1104K = true;
    }

    public C0215c m1397a(C0214b c0214b) {
        if (c0214b == C0214b.f1312a || c0214b == C0214b.f1313b) {
            return C0215c.f1319a;
        }
        if (!this.f1104K) {
            m1396p();
        }
        return c0214b == C0214b.f1316e ? this.f1122t : c0214b == C0214b.f1317f ? this.f1123u : c0214b == C0214b.f1314c ? this.f1124v : c0214b == C0214b.f1315d ? this.f1125w : C0215c.f1319a;
    }

    protected final void m1398a(int i) {
        this.f1097D |= i;
    }

    public final void m1399a(int i, an anVar, aj ajVar) {
        this.f1098E = i;
        this.f1106M = anVar;
        if (this.f1102I || this.f1105L) {
            this.f1101H = true;
            return;
        }
        if (!this.f1099F.m1114c()) {
            ajVar.m1127a(this.f1099F);
        }
        if (!this.f1100G.b_()) {
            anVar.m1137a(this.f1100G);
        }
        this.f1113k = this.f1099F.m1116e();
        this.f1108a = this.f1100G.a_();
        this.f1101H = true;
    }

    public void m1400a(ag agVar) {
        this.f1099F = agVar;
    }

    void m1401a(aq aqVar) {
        this.f1098E = aqVar.m1146a(this.f1098E);
        if (this.f1110h == f1091d) {
            this.f1109g = aqVar.m1146a(this.f1109g);
        }
    }

    protected void m1402a(bi biVar, int i) {
        this.f1110h = biVar;
        this.f1109g = i;
    }

    protected void m1403a(C0214b c0214b, C0215c c0215c, C0216e c0216e) {
        C0210a.m1505a(!this.f1101H);
        if (c0216e == C0216e.f1363b || c0216e == C0216e.f1362a) {
            c0216e = C0216e.f1367f;
        }
        if (c0214b == C0214b.f1316e) {
            this.f1122t = c0215c;
            this.f1126x = c0216e;
        } else if (c0214b == C0214b.f1317f) {
            this.f1123u = c0215c;
            this.f1127y = c0216e;
        } else if (c0214b == C0214b.f1314c) {
            this.f1124v = c0215c;
            this.f1128z = c0216e;
        } else if (c0214b == C0214b.f1315d) {
            this.f1125w = c0215c;
            this.f1094A = c0216e;
        }
        this.f1112j = (byte) (this.f1112j | 32);
    }

    protected final void m1404a(boolean z) {
        this.f1114l = z;
        this.f1112j = (byte) (this.f1112j | 128);
    }

    public byte[] m1405a() {
        int i = 0;
        if (!this.f1104K) {
            m1396p();
        }
        byte[] bArr = new byte[20];
        ar.m1150a(this.f1113k, bArr, 0);
        ar.m1150a(this.f1108a, bArr, 2);
        if (m1412e()) {
            i = 1;
        }
        if (m1413f()) {
            i |= 2;
        }
        if (this.f1110h == f1092e) {
            i |= 4;
            this.f1109g = 65535;
        }
        ar.m1150a(i | (this.f1109g << 4), bArr, 4);
        i = this.f1116n.m1509a();
        if (this.f1119q) {
            i |= 8;
        }
        ar.m1150a((i | (this.f1117o.m1528a() << 4)) | (this.f1118p.m1516a() << 8), bArr, 6);
        bArr[9] = (byte) 16;
        i = ((this.f1122t.m1511a() | (this.f1123u.m1511a() << 4)) | (this.f1124v.m1511a() << 8)) | (this.f1125w.m1511a() << 12);
        ar.m1150a(i, bArr, 10);
        if (i != 0) {
            i = (((byte) this.f1126x.m1514a()) & 127) | ((((byte) this.f1127y.m1514a()) & 127) << 7);
            int a = (((byte) this.f1128z.m1514a()) & 127) | ((((byte) this.f1094A.m1514a()) & 127) << 7);
            ar.m1150a(i, bArr, 12);
            ar.m1150a(a, bArr, 14);
        }
        ar.m1150a(this.f1096C.m1519a() << 10, bArr, 16);
        ar.m1150a(this.f1095B.m1514a() | 8192, bArr, 18);
        this.f1097D |= this.f1120r & 15;
        if (this.f1121s) {
            this.f1097D |= 16;
        } else {
            this.f1097D &= 239;
        }
        bArr[8] = (byte) this.f1097D;
        if (this.f1107R == f1089b) {
            bArr[9] = this.f1112j;
        }
        return bArr;
    }

    public C0216e m1406b(C0214b c0214b) {
        if (c0214b == C0214b.f1312a || c0214b == C0214b.f1313b) {
            return C0216e.f1367f;
        }
        if (!this.f1104K) {
            m1396p();
        }
        return c0214b == C0214b.f1316e ? this.f1126x : c0214b == C0214b.f1317f ? this.f1127y : c0214b == C0214b.f1314c ? this.f1128z : c0214b == C0214b.f1315d ? this.f1094A : C0216e.f1363b;
    }

    void m1407b(int i) {
        this.f1108a = i;
    }

    protected void m1408b(boolean z) {
        C0210a.m1505a(!this.f1101H);
        this.f1119q = z;
        this.f1112j = (byte) (this.f1112j | 16);
    }

    public NumberFormat m1409c() {
        return this.f1111i;
    }

    void m1410c(int i) {
        this.f1113k = i;
    }

    public int m1411d() {
        return this.f1108a;
    }

    protected final boolean m1412e() {
        return this.f1114l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        if (!this.f1104K) {
            m1396p();
        }
        if (!bfVar.f1104K) {
            bfVar.m1396p();
        }
        return (this.f1110h == bfVar.f1110h && this.f1109g == bfVar.f1109g && this.f1114l == bfVar.f1114l && this.f1115m == bfVar.f1115m && this.f1112j == bfVar.f1112j) ? (this.f1116n == bfVar.f1116n && this.f1117o == bfVar.f1117o && this.f1118p == bfVar.f1118p && this.f1119q == bfVar.f1119q && this.f1121s == bfVar.f1121s && this.f1120r == bfVar.f1120r) ? (this.f1122t == bfVar.f1122t && this.f1123u == bfVar.f1123u && this.f1124v == bfVar.f1124v && this.f1125w == bfVar.f1125w) ? (this.f1126x == bfVar.f1126x && this.f1127y == bfVar.f1127y && this.f1128z == bfVar.f1128z && this.f1094A == bfVar.f1094A) ? (this.f1095B == bfVar.f1095B && this.f1096C == bfVar.f1096C) ? (this.f1101H && bfVar.f1101H) ? this.f1113k == bfVar.f1113k && this.f1108a == bfVar.f1108a : this.f1099F.equals(bfVar.f1099F) && this.f1100G.equals(bfVar.f1100G) : false : false : false : false : false;
    }

    protected final boolean m1413f() {
        return this.f1115m;
    }

    public final boolean m1414h() {
        if (!this.f1104K) {
            m1396p();
        }
        return (this.f1122t == C0215c.f1319a && this.f1123u == C0215c.f1319a && this.f1124v == C0215c.f1319a && this.f1125w == C0215c.f1319a) ? false : true;
    }

    public int hashCode() {
        int i = 1;
        if (!this.f1104K) {
            m1396p();
        }
        int i2 = ((this.f1119q ? 1 : 0) + (37 * ((this.f1114l ? 1 : 0) + (37 * ((this.f1115m ? 1 : 0) + 629))))) * 37;
        if (!this.f1121s) {
            i = 0;
        }
        i2 += i;
        if (this.f1110h == f1091d) {
            i2 = (i2 * 37) + 1;
        } else if (this.f1110h == f1092e) {
            i2 = (i2 * 37) + 2;
        }
        return (((((((((((((((((((((((((((((((i2 * 37) + (this.f1116n.m1509a() + 1)) * 37) + (this.f1117o.m1528a() + 1)) * 37) + this.f1118p.m1516a()) ^ this.f1122t.m1512b().hashCode()) ^ this.f1123u.m1512b().hashCode()) ^ this.f1124v.m1512b().hashCode()) ^ this.f1125w.m1512b().hashCode()) * 37) + this.f1126x.m1514a()) * 37) + this.f1127y.m1514a()) * 37) + this.f1128z.m1514a()) * 37) + this.f1094A.m1514a()) * 37) + this.f1095B.m1514a()) * 37) + (this.f1096C.m1519a() + 1)) * 37) + this.f1112j) * 37) + this.f1109g) * 37) + this.f1113k) * 37) + this.f1108a) * 37) + this.f1120r;
    }

    public final void m1415i() {
        if (this.f1101H) {
            f1093f.m1499b((Object) "A default format has been initialized");
        }
        this.f1101H = false;
    }

    public final int m1416j() {
        return this.f1098E;
    }

    public final boolean m1417k() {
        return this.f1101H;
    }

    public final boolean m1418l() {
        return this.f1102I;
    }

    public C0152f m1419m() {
        if (!this.f1104K) {
            m1396p();
        }
        return this.f1099F;
    }

    public int m1420n() {
        return this.f1113k;
    }
}
