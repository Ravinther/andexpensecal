package p007b.p008a.p012b;

import com.expensemanager.adv;
import com.google.ads.AdSize;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.Reader;
import p007b.p008a.bb;

/* renamed from: b.a.b.bo */
class bo {
    private static final char[] f937a;
    private static final int[] f938b;
    private static final int[] f939c;
    private static final int[] f940d;
    private static final String[] f941e;
    private static final int[] f942f;
    private Reader f943g;
    private int f944h;
    private int f945i;
    private char[] f946j;
    private int f947k;
    private int f948l;
    private int f949m;
    private int f950n;
    private int f951o;
    private int f952p;
    private int f953q;
    private boolean f954r;
    private boolean f955s;
    private boolean f956t;
    private C0175t f957u;
    private bb f958v;

    static {
        f937a = bo.m1306a("\b\u0000\u0003\u0015\u0015\u0000\u0001\u0015\u0001\u0014\u0001\u0011\u0001\u0016\u0001\b\u0002\u0000\u0001\u0012\u0001\u0005\u0001\u0006\u0001!\u0001\u001f\u0001\u0004\u0001 \u0001\u0007\u0001\u001b\u0001\u001c\t\u0002\u0001\u0003\u0001\u0000\u0001$\u0001#\u0001\"\u0001\u001e\u0001\u0000\u0001\u000e\u0002\u0001\u0001\u0018\u0001\f\u0001\r\u0002\u0001\u0001\u0019\u0002\u0001\u0001\u000f\u0001\u001d\u0001\u0017\u0003\u0001\u0001\n\u0001\u0010\u0001\t\u0001\u000b\u0001\u001a\u0004\u0001\u0004\u0000\u0001\u0013\u0001\u0000\u001a\u0001\uff85\u0000");
        f938b = bo.m1311d();
        f939c = bo.m1312e();
        f940d = bo.m1313f();
        f941e = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
        f942f = bo.m1314g();
    }

    bo(Reader reader) {
        this.f945i = 0;
        this.f946j = new char[16384];
        this.f954r = true;
        this.f943g = reader;
    }

    private static int m1305a(String str, int i, int[] iArr) {
        int i2 = 0;
        int length = str.length();
        int i3 = i;
        while (i2 < length) {
            int i4 = i2 + 1;
            i2 = str.charAt(i2);
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            while (true) {
                i4 = i3 + 1;
                iArr[i3] = charAt;
                i2--;
                if (i2 <= 0) {
                    break;
                }
                i3 = i4;
            }
            i3 = i4;
            i2 = i5;
        }
        return i3;
    }

    private static char[] m1306a(String str) {
        int i = 0;
        char[] cArr = new char[65536];
        int i2 = 0;
        while (i2 < 100) {
            int i3 = i2 + 1;
            i2 = str.charAt(i2);
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            while (true) {
                i3 = i + 1;
                cArr[i] = charAt;
                i2--;
                if (i2 <= 0) {
                    break;
                }
                i = i3;
            }
            i = i3;
            i2 = i4;
        }
        return cArr;
    }

    private static int m1307b(String str, int i, int[] iArr) {
        int i2 = 0;
        int length = str.length();
        while (i2 < length) {
            int i3 = i2 + 1;
            int charAt = str.charAt(i2) << 16;
            i2 = i + 1;
            int i4 = i3 + 1;
            iArr[i] = str.charAt(i3) | charAt;
            i = i2;
            i2 = i4;
        }
        return i;
    }

    private void m1308b(int i) {
        String str;
        try {
            str = f941e[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            str = f941e[0];
        }
        throw new Error(str);
    }

    private static int m1309c(String str, int i, int[] iArr) {
        int i2 = 0;
        int length = str.length();
        int i3 = i;
        while (i2 < length) {
            int i4 = i2 + 1;
            i2 = str.charAt(i2);
            int i5 = i4 + 1;
            int charAt = str.charAt(i4) - 1;
            while (true) {
                i4 = i3 + 1;
                iArr[i3] = charAt;
                i2--;
                if (i2 <= 0) {
                    break;
                }
                i3 = i4;
            }
            i3 = i4;
            i2 = i5;
        }
        return i3;
    }

    private static int m1310d(String str, int i, int[] iArr) {
        int i2 = 0;
        int length = str.length();
        int i3 = i;
        while (i2 < length) {
            int i4 = i2 + 1;
            i2 = str.charAt(i2);
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            while (true) {
                i4 = i3 + 1;
                iArr[i3] = charAt;
                i2--;
                if (i2 <= 0) {
                    break;
                }
                i3 = i4;
            }
            i3 = i4;
            i2 = i5;
        }
        return i3;
    }

    private static int[] m1311d() {
        int[] iArr = new int[94];
        bo.m1305a("\u0001\u0000\u0001\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\u0000\u0002\u0002\u0001\b\u0001\u0000\u0001\t\u0001\u0000\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0001\u0001\u0011\u0001\u0002\u0001\u0012\u0001\u0000\u0001\u0013\u0001\u0000\u0001\u0002\u0003\u0000\u0002\u0002\u0005\u0000\u0001\u0014\u0001\u0015\u0001\u0016\u0001\u0002\u0001\u0000\u0001\u0017\u0001\u0000\u0001\u0012\u0002\u0000\u0001\u0018\u0001\u0000\u0002\u0002\b\u0000\u0001\u0017\u0001\u0000\u0001\u0019\u0001\u0000\u0001\u001a\b\u0000\u0001\u001b\u0002\u0000\u0001\u0019\u0002\u0000\u0001\u001c\u0004\u0000\u0001\u001d\u0003\u0000\u0001\u001d\u0001\u0000\u0001\u001e\u0001\u0000", 0, iArr);
        return iArr;
    }

    private static int[] m1312e() {
        int[] iArr = new int[94];
        bo.m1307b("\u0000\u0000\u0000%\u0000J\u0000o\u0000\u0094\u0000\u0094\u0000\u0094\u0000\u0094\u0000\u00b9\u0000\u00de\u0000\u0103\u0000\u0094\u0000\u0128\u0000\u0094\u0000\u014d\u0000\u0094\u0000\u0094\u0000\u0094\u0000\u0094\u0000\u0172\u0000\u0094\u0000\u0197\u0000\u01bc\u0000\u0094\u0000\u01e1\u0000\u0206\u0000\u022b\u0000\u0094\u0000\u0250\u0000\u0275\u0000\u029a\u0000\u02bf\u0000\u02e4\u0000\u0309\u0000\u032e\u0000\u0353\u0000\u0378\u0000\u039d\u0000\u03c2\u0000\u03e7\u0000\u0094\u0000\u0094\u0000\u0094\u0000\u040c\u0000\u0431\u0000\u0456\u0000\u047b\u0000\u04a0\u0000\u04c5\u0000\u04ea\u0000\u02bf\u0000\u050f\u0000\u0534\u0000\u0559\u0000\u057e\u0000\u05a3\u0000\u05c8\u0000\u05ed\u0000\u0612\u0000\u0637\u0000\u065c\u0000\u0681\u0000\u0094\u0000\u06a6\u0000\u06cb\u0000\u06cb\u0000\u040c\u0000\u06f0\u0000\u0715\u0000\u073a\u0000\u075f\u0000\u0784\u0000\u07a9\u0000\u07ce\u0000\u07f3\u0000\u0818\u0000\u0818\u0000\u083d\u0000\u0862\u0000\u0887\u0000\u08ac\u0000\u0094\u0000\u08d1\u0000\u08f6\u0000\u091b\u0000\u0940\u0000\u0965\u0000\u098a\u0000\u09af\u0000\u09d4\u0000\u0094\u0000\u09f9\u0000\u0a1e\u0000\u0a1e", 0, iArr);
        return iArr;
    }

    private static int[] m1313f() {
        int[] iArr = new int[2627];
        bo.m1309c("\u0001\u0000\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\u0000\u0001\t\u0001\n\u0003\u0003\u0001\u000b\u0003\u0003\u0001\f\u0001\r\u0002\u0000\u0001\u000e\u0001\u000f\u0004\u0003\u0001\u0010\u0001\u0004\u0001\u0003\u0001\u0000\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0015\u0001\u0016\u0011\u0017\u0001\u0018\u0013\u0017\u0001\u0000\u0001\u0019\u0001\u001a\u0001\u001b\u0001\u0000\u0001\u001c\u0002\u0000\u0001\u001d\b\u0019\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004\u0019\u0001\u0000\u0001\u001a\u0001\u0019\t\u0000\u0001\u0004\u0004\u0000\u0001 \u0014\u0000\u0001\u0004.\u0000\u0001!\u0007\u0000\b!\u0006\u0000\u0004!\u0002\u0000\u0001!\b\u0000\u0001\u0019\u0001\u001a\u0001\u001b\u0001\u0000\u0001\u001c\u0002\u0000\u0001\u001d\u0001\u0019\u0001\"\u0006\u0019\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004\u0019\u0001\u0000\u0001\u001a\u0001\u0019\b\u0000\u0001\u0019\u0001\u001a\u0001\u001b\u0001\u0000\u0001\u001c\u0002\u0000\u0001\u001d\u0005\u0019\u0001#\u0002\u0019\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004\u0019\u0001\u0000\u0001\u001a\u0001\u0019\u0007\u0000\u0012\r\u0001$\u0012\r\n\u0000\u0001%\f\u0000\u0001&\u0001'\u0001\u0000\u0001(-\u0000\u0001)#\u0000\u0001*\u0001+\u0001\u0000\u0011\u0017\u0001\u0000\u0013\u0017\u0001\u0000\u0001,\u0001\u001a\u0001\u001b\u0001\u0000\u0001\u001c\u0002\u0000\u0001\u001d\b,\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004,\u0001\u0000\u0001\u001a\u0001,\b\u0000\u0001\u001e\u0001\u001a\u0001-\u0005\u0000\b\u001e\u0002\u0000\u0001\u001e\u0003\u0000\u0004\u001e\u0001\u0000\u0001\u001a\u0001\u001e\b\u0000\u0001.\u0006\u0000\u0001/\b.\u0006\u0000\u0004.\u0002\u0000\u0001.\t\u0000\u00010\u0019\u0000\u00010\t\u0000\u0002\u001e\u0006\u0000\b\u001e\u0002\u0000\u0001\u001e\u0003\u0000\u0004\u001e\u0001\u0000\u0002\u001e\b\u0000\u00011\u0006\u0000\u00012\b1\u0006\u0000\u00041\u0002\u0000\u00011\t\u0000\u00013\u0019\u0000\u00013\t\u0000\u00014\u00010\u0001\u001b\u0004\u0000\u0001\u001d\b4\u0006\u0000\u00044\u0001\u0000\u00010\u00014\b\u0000\u0001,\u0001\u001a\u0001\u001b\u0001\u0000\u0001\u001c\u0002\u0000\u0001\u001d\u0002,\u00015\u0005,\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004,\u0001\u0000\u0001\u001a\u0001,\b\u0000\u0001,\u0001\u001a\u0001\u001b\u0001\u0000\u0001\u001c\u0002\u0000\u0001\u001d\u0006,\u00016\u0001,\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004,\u0001\u0000\u0001\u001a\u0001,\u001b\u0000\u00017\u001c\u0000\u00018#\u0000\u00019\u0002\u0000\u0001:/\u0000\u0001;\u0019\u0000\u0001<\u0017\u0000\u0001,\u0001\u001e\u0002\u0000\u0001\u001c\u0003\u0000\b,\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004,\u0001\u0000\u0001\u001e\u0001,\b\u0000\u0001=\u0006\u0000\u0001>\b=\u0006\u0000\u0004=\u0002\u0000\u0001=\b\u0000\u0001?\u0007\u0000\b?\u0006\u0000\u0004?\u0002\u0000\u0001?\b\u0000\u0001.\u0007\u0000\b.\u0006\u0000\u0004.\u0002\u0000\u0001.\t\u0000\u00010\u0001-\u0018\u0000\u00010\t\u0000\u0001@\u0001A\u0005\u0000\u0001B\b@\u0006\u0000\u0004@\u0001\u0000\u0001A\u0001@\b\u0000\u00011\u0007\u0000\b1\u0006\u0000\u00041\u0002\u0000\u00011\t\u0000\u00010\u0001\u001b\u0004\u0000\u0001\u001d\u0013\u0000\u00010\t\u0000\u0001,\u0001\u001e\u0002\u0000\u0001\u001c\u0003\u0000\u0003,\u0001C\u0004,\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004,\u0001\u0000\u0001\u001e\u0001,\b\u0000\u0001,\u0001\u001e\u0002\u0000\u0001\u001c\u0003\u0000\u0007,\u00015\u0002\u0000\u0001\u001e\u0001\u001f\u0002\u0000\u0004,\u0001\u0000\u0001\u001e\u0001,\b\u0000\u0001D\u0006\u0000\u0001E\bD\u0006\u0000\u0004D\u0002\u0000\u0001D\u0014\u0000\u0001F&\u0000\u0001G\r\u0000\u0001F$\u0000\u0001H!\u0000\u0001I\u0019\u0000\u0001J\u0016\u0000\u0001K\u0001L\u0005\u0000\u0001M\bK\u0006\u0000\u0004K\u0001\u0000\u0001L\u0001K\b\u0000\u0001=\u0007\u0000\b=\u0006\u0000\u0004=\u0002\u0000\u0001=\t\u0000\u0001A\u0005\u0000\u0001B\u0013\u0000\u0001A\n\u0000\u0001A\u0019\u0000\u0001A\t\u0000\u0001N\u0001O\u0001P\u0004\u0000\u0001Q\bN\u0006\u0000\u0004N\u0001\u0000\u0001O\u0001N\b\u0000\u0001D\u0007\u0000\bD\u0006\u0000\u0004D\u0002\u0000\u0001D\u001b\u0000\u0001R\u001f\u0000\u0001F!\u0000\u0001S3\u0000\u0001T\u0014\u0000\u0001U\u001b\u0000\u0001L\u0005\u0000\u0001M\u0013\u0000\u0001L\n\u0000\u0001L\u0019\u0000\u0001L\n\u0000\u0001O\u0001P\u0004\u0000\u0001Q\u0013\u0000\u0001O\n\u0000\u0001O\u0001V\u0018\u0000\u0001O\t\u0000\u0001W\u0006\u0000\u0001X\bW\u0006\u0000\u0004W\u0002\u0000\u0001W\t\u0000\u0001O\u0019\u0000\u0001O&\u0000\u0001R\"\u0000\u0001F\u0014\u0000\u0001F\u0019\u0000\u0001Y\u0006\u0000\u0001Z\bY\u0006\u0000\u0004Y\u0002\u0000\u0001Y\b\u0000\u0001[\u0007\u0000\b[\u0006\u0000\u0004[\u0002\u0000\u0001[\b\u0000\u0001W\u0007\u0000\bW\u0006\u0000\u0004W\u0002\u0000\u0001W\b\u0000\u0001\\\u0001]\u0005\u0000\u0001^\b\\\u0006\u0000\u0004\\\u0001\u0000\u0001]\u0001\\\b\u0000\u0001Y\u0007\u0000\bY\u0006\u0000\u0004Y\u0002\u0000\u0001Y\t\u0000\u0001]\u0005\u0000\u0001^\u0013\u0000\u0001]\n\u0000\u0001]\u0019\u0000\u0001]\b\u0000", 0, iArr);
        return iArr;
    }

    private static int[] m1314g() {
        int[] iArr = new int[94];
        bo.m1310d("\u0001\u0000\u0003\u0001\u0004\t\u0001\u0000\u0002\u0001\u0001\t\u0001\u0000\u0001\t\u0001\u0000\u0004\t\u0001\u0001\u0001\t\u0002\u0001\u0001\t\u0002\u0001\u0001\u0000\u0001\t\u0001\u0000\u0001\u0001\u0003\u0000\u0002\u0001\u0005\u0000\u0003\t\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0001\u0001\u0001\u0000\u0002\u0001\b\u0000\u0001\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\b\u0000\u0001\u0001\u0002\u0000\u0001\u0001\u0002\u0000\u0001\t\u0004\u0000\u0001\u0001\u0003\u0000\u0001\t\u0001\u0000\u0001\u0001\u0001\u0000", 0, iArr);
        return iArr;
    }

    private boolean m1315h() {
        if (this.f950n > 0) {
            System.arraycopy(this.f946j, this.f950n, this.f946j, 0, this.f951o - this.f950n);
            this.f951o -= this.f950n;
            this.f949m -= this.f950n;
            this.f947k -= this.f950n;
            this.f948l -= this.f950n;
            this.f950n = 0;
        }
        if (this.f949m >= this.f946j.length) {
            Object obj = new char[(this.f949m * 2)];
            System.arraycopy(this.f946j, 0, obj, 0, this.f946j.length);
            this.f946j = obj;
        }
        int read = this.f943g.read(this.f946j, this.f951o, this.f946j.length - this.f951o);
        if (read < 0) {
            return true;
        }
        this.f951o = read + this.f951o;
        return false;
    }

    int m1316a() {
        return this.f953q;
    }

    public final void m1317a(int i) {
        this.f945i = i;
    }

    void m1318a(C0175t c0175t) {
        this.f957u = c0175t;
    }

    void m1319a(bb bbVar) {
        this.f958v = bbVar;
    }

    public final String m1320b() {
        return new String(this.f946j, this.f950n, this.f947k - this.f950n);
    }

    public at m1321c() {
        int i = this.f951o;
        char[] cArr = this.f946j;
        char[] cArr2 = f937a;
        int[] iArr = f940d;
        int[] iArr2 = f939c;
        int[] iArr3 = f942f;
        while (true) {
            int i2;
            int i3;
            int i4 = this.f947k;
            this.f953q += i4 - this.f950n;
            Object obj = null;
            for (i2 = this.f950n; i2 < i4; i2++) {
                switch (cArr[i2]) {
                    case adv.TitlePageIndicator_footerPadding /*10*/:
                        if (obj == null) {
                            this.f952p++;
                            break;
                        }
                        obj = null;
                        break;
                    case adv.TitlePageIndicator_linePosition /*11*/:
                    case adv.TitlePageIndicator_selectedBold /*12*/:
                    case '\u0085':
                    case '\u2028':
                    case '\u2029':
                        this.f952p++;
                        obj = null;
                        break;
                    case adv.TitlePageIndicator_titlePadding /*13*/:
                        this.f952p++;
                        obj = 1;
                        break;
                    default:
                        obj = null;
                        break;
                }
            }
            if (obj != null) {
                Object obj2;
                if (i4 < i) {
                    i3 = i4;
                    obj2 = cArr[i4] == '\n' ? 1 : null;
                } else if (this.f955s) {
                    i3 = i4;
                    obj2 = null;
                } else {
                    boolean h = m1315h();
                    i4 = this.f951o;
                    i2 = this.f947k;
                    char[] cArr3 = this.f946j;
                    if (h) {
                        cArr = cArr3;
                        i = i4;
                        obj2 = null;
                        i3 = i2;
                    } else {
                        Object obj3 = cArr3[i2] == '\n' ? 1 : null;
                        i3 = i2;
                        char[] cArr4 = cArr3;
                        i = i4;
                        obj2 = obj3;
                        cArr = cArr4;
                    }
                }
                if (obj2 != null) {
                    this.f952p--;
                }
            } else {
                i3 = i4;
            }
            int i5 = -1;
            this.f950n = i3;
            this.f949m = i3;
            this.f944h = this.f945i;
            i2 = i3;
            while (true) {
                if (i2 >= i) {
                    if (this.f955s) {
                        i2 = -1;
                    } else {
                        this.f949m = i2;
                        this.f947k = i3;
                        boolean h2 = m1315h();
                        i2 = this.f949m;
                        i3 = this.f947k;
                        cArr = this.f946j;
                        i = this.f951o;
                        if (h2) {
                            i2 = -1;
                        } else {
                            i4 = i2 + 1;
                            i2 = cArr[i2];
                        }
                    }
                    this.f947k = i3;
                    if (i5 >= 0) {
                        i5 = f938b[i5];
                    }
                    switch (i5) {
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            this.f956t = false;
                            return new bf(m1320b());
                        case C0607c.LoadingImageView_circleCrop /*2*/:
                            return new al(m1320b(), this.f958v);
                        case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                            return new ac(m1320b());
                        case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                            return new ay();
                        case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                            return new C0160d();
                        case adv.TitlePageIndicator_footerLineHeight /*6*/:
                            return new ao();
                        case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                            return new C0167l();
                        case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                            this.f956t = true;
                            m1317a(1);
                            break;
                        case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                        case 31:
                        case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case AdSize.PORTRAIT_AD_HEIGHT /*50*/:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                            break;
                        case adv.TitlePageIndicator_footerPadding /*10*/:
                            return new C0171p();
                        case adv.TitlePageIndicator_linePosition /*11*/:
                            return new aw();
                        case adv.TitlePageIndicator_selectedBold /*12*/:
                            return new ah();
                        case adv.TitlePageIndicator_titlePadding /*13*/:
                            return new aj();
                        case adv.TitlePageIndicator_topPadding /*14*/:
                            return new ab();
                        case 15:
                            return new C0173r();
                        case 16:
                            return new ae();
                        case 17:
                            m1317a(0);
                            if (this.f956t) {
                                break;
                            }
                            return new bf("");
                        case 18:
                            return new C0164i(m1320b());
                        case 19:
                            return new bc(m1320b());
                        case 20:
                            return new aa();
                        case 21:
                            return new am();
                        case 22:
                            return new ad();
                        case 23:
                            return new C0168m(m1320b());
                        case 24:
                            return new C0172q(m1320b());
                        case 25:
                            return new C0165j(m1320b(), this.f957u);
                        case 26:
                            return new C0162g(m1320b());
                        case 27:
                            return new C0158b(m1320b());
                        case 28:
                            return new C0174s(m1320b());
                        case 29:
                            return new C0169n(m1320b(), this.f957u);
                        case 30:
                            return new C0159c(m1320b(), this.f957u);
                        default:
                            if (i2 == -1 || this.f950n != this.f949m) {
                                m1308b(1);
                                break;
                            }
                            this.f955s = true;
                            return null;
                            break;
                    }
                }
                i4 = i2 + 1;
                i2 = cArr[i2];
                int i6 = iArr[iArr2[this.f944h] + cArr2[i2]];
                if (i6 != -1) {
                    this.f944h = i6;
                    i6 = iArr3[this.f944h];
                    if ((i6 & 1) == 1) {
                        i3 = this.f944h;
                        if ((i6 & 8) == 8) {
                            i5 = i3;
                            i3 = i4;
                        } else {
                            i2 = i3;
                            i3 = i4;
                        }
                    } else {
                        i2 = i5;
                    }
                    i5 = i2;
                    i2 = i4;
                }
                this.f947k = i3;
                if (i5 >= 0) {
                    i5 = f938b[i5];
                }
                switch (i5) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        this.f956t = false;
                        return new bf(m1320b());
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        return new al(m1320b(), this.f958v);
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        return new ac(m1320b());
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        return new ay();
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        return new C0160d();
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        return new ao();
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        return new C0167l();
                    case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                        this.f956t = true;
                        m1317a(1);
                        break;
                    case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    case 31:
                    case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case AdSize.PORTRAIT_AD_HEIGHT /*50*/:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        break;
                    case adv.TitlePageIndicator_footerPadding /*10*/:
                        return new C0171p();
                    case adv.TitlePageIndicator_linePosition /*11*/:
                        return new aw();
                    case adv.TitlePageIndicator_selectedBold /*12*/:
                        return new ah();
                    case adv.TitlePageIndicator_titlePadding /*13*/:
                        return new aj();
                    case adv.TitlePageIndicator_topPadding /*14*/:
                        return new ab();
                    case 15:
                        return new C0173r();
                    case 16:
                        return new ae();
                    case 17:
                        m1317a(0);
                        if (this.f956t) {
                            break;
                        }
                        return new bf("");
                    case 18:
                        return new C0164i(m1320b());
                    case 19:
                        return new bc(m1320b());
                    case 20:
                        return new aa();
                    case 21:
                        return new am();
                    case 22:
                        return new ad();
                    case 23:
                        return new C0168m(m1320b());
                    case 24:
                        return new C0172q(m1320b());
                    case 25:
                        return new C0165j(m1320b(), this.f957u);
                    case 26:
                        return new C0162g(m1320b());
                    case 27:
                        return new C0158b(m1320b());
                    case 28:
                        return new C0174s(m1320b());
                    case 29:
                        return new C0169n(m1320b(), this.f957u);
                    case 30:
                        return new C0159c(m1320b(), this.f957u);
                    default:
                        if (i2 == -1) {
                            break;
                        }
                        m1308b(1);
                        break;
                }
            }
        }
    }
}
