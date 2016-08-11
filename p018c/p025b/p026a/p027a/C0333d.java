package p018c.p025b.p026a.p027a;

import com.expensemanager.adv;
import com.google.ads.AdSize;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.Reader;

/* renamed from: c.b.a.a.d */
class C0333d {
    private static final int[] f2299a;
    private static final char[] f2300b;
    private static final int[] f2301c;
    private static final int[] f2302d;
    private static final int[] f2303e;
    private static final String[] f2304f;
    private static final int[] f2305g;
    private Reader f2306h;
    private int f2307i;
    private int f2308j;
    private char[] f2309k;
    private int f2310l;
    private int f2311m;
    private int f2312n;
    private int f2313o;
    private int f2314p;
    private int f2315q;
    private int f2316r;
    private boolean f2317s;
    private boolean f2318t;
    private StringBuffer f2319u;

    static {
        f2299a = new int[]{0, 0, 1, 1};
        f2300b = C0333d.m2243a("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016\uff82\u0000");
        f2301c = C0333d.m2247d();
        f2302d = C0333d.m2248e();
        f2303e = new int[]{2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};
        f2304f = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
        f2305g = C0333d.m2249f();
    }

    C0333d(Reader reader) {
        this.f2308j = 0;
        this.f2309k = new char[16384];
        this.f2317s = true;
        this.f2319u = new StringBuffer();
        this.f2306h = reader;
    }

    private static int m2242a(String str, int i, int[] iArr) {
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

    private static char[] m2243a(String str) {
        int i = 0;
        char[] cArr = new char[65536];
        int i2 = 0;
        while (i2 < 90) {
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

    private static int m2244b(String str, int i, int[] iArr) {
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

    private static int m2245c(String str, int i, int[] iArr) {
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

    private void m2246c(int i) {
        String str;
        try {
            str = f2304f[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            str = f2304f[0];
        }
        throw new Error(str);
    }

    private static int[] m2247d() {
        int[] iArr = new int[45];
        C0333d.m2242a("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", 0, iArr);
        return iArr;
    }

    private static int[] m2248e() {
        int[] iArr = new int[45];
        C0333d.m2244b("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000\u00a2\u0000\u00bd\u0000\u00d8\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u00f3\u0000\u010e\u00006\u0000\u0129\u0000\u0144\u0000\u015f\u0000\u017a\u0000\u0195\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u01b0\u0000\u01cb\u0000\u01e6\u0000\u01e6\u0000\u0201\u0000\u021c\u0000\u0237\u0000\u0252\u00006\u00006\u0000\u026d\u0000\u0288\u00006", 0, iArr);
        return iArr;
    }

    private static int[] m2249f() {
        int[] iArr = new int[45];
        C0333d.m2245c("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", 0, iArr);
        return iArr;
    }

    private boolean m2250g() {
        if (this.f2312n > 0) {
            System.arraycopy(this.f2309k, this.f2312n, this.f2309k, 0, this.f2313o - this.f2312n);
            this.f2313o -= this.f2312n;
            this.f2311m -= this.f2312n;
            this.f2310l -= this.f2312n;
            this.f2312n = 0;
        }
        if (this.f2311m >= this.f2309k.length) {
            Object obj = new char[(this.f2311m * 2)];
            System.arraycopy(this.f2309k, 0, obj, 0, this.f2309k.length);
            this.f2309k = obj;
        }
        int read = this.f2306h.read(this.f2309k, this.f2313o, this.f2309k.length - this.f2313o);
        if (read > 0) {
            this.f2313o += read;
            return false;
        } else if (read != 0) {
            return true;
        } else {
            read = this.f2306h.read();
            if (read == -1) {
                return true;
            }
            char[] cArr = this.f2309k;
            int i = this.f2313o;
            this.f2313o = i + 1;
            cArr[i] = (char) read;
            return false;
        }
    }

    int m2251a() {
        return this.f2315q;
    }

    public final void m2252a(int i) {
        this.f2308j = i;
    }

    public final void m2253a(Reader reader) {
        this.f2306h = reader;
        this.f2317s = true;
        this.f2318t = false;
        this.f2312n = 0;
        this.f2313o = 0;
        this.f2310l = 0;
        this.f2311m = 0;
        this.f2316r = 0;
        this.f2315q = 0;
        this.f2314p = 0;
        this.f2308j = 0;
    }

    public final char m2254b(int i) {
        return this.f2309k[this.f2312n + i];
    }

    public final String m2255b() {
        return new String(this.f2309k, this.f2312n, this.f2310l - this.f2312n);
    }

    public C0334e m2256c() {
        int i = this.f2313o;
        char[] cArr = this.f2309k;
        char[] cArr2 = f2300b;
        int[] iArr = f2303e;
        int[] iArr2 = f2302d;
        int[] iArr3 = f2305g;
        while (true) {
            int i2 = this.f2310l;
            this.f2315q += i2 - this.f2312n;
            int i3 = -1;
            this.f2312n = i2;
            this.f2311m = i2;
            this.f2307i = f2299a[this.f2308j];
            int i4 = i2;
            while (true) {
                int i5;
                if (i4 < i) {
                    i5 = i4 + 1;
                    i4 = cArr[i4];
                } else {
                    if (this.f2318t) {
                        i4 = -1;
                    } else {
                        this.f2311m = i4;
                        this.f2310l = i2;
                        boolean g = m2250g();
                        i4 = this.f2311m;
                        i2 = this.f2310l;
                        cArr = this.f2309k;
                        i = this.f2313o;
                        if (g) {
                            i4 = -1;
                        } else {
                            i5 = i4 + 1;
                            i4 = cArr[i4];
                        }
                    }
                    this.f2310l = i2;
                    if (i3 >= 0) {
                        i3 = f2301c[i3];
                    }
                    switch (i3) {
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            throw new C0332c(this.f2315q, 0, new Character(m2254b(0)));
                        case C0607c.LoadingImageView_circleCrop /*2*/:
                            return new C0334e(0, Long.valueOf(m2255b()));
                        case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
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
                            break;
                        case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                            this.f2319u.delete(0, this.f2319u.length());
                            m2252a(2);
                            break;
                        case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                            return new C0334e(1, null);
                        case adv.TitlePageIndicator_footerLineHeight /*6*/:
                            return new C0334e(2, null);
                        case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                            return new C0334e(3, null);
                        case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                            return new C0334e(4, null);
                        case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                            return new C0334e(5, null);
                        case adv.TitlePageIndicator_footerPadding /*10*/:
                            return new C0334e(6, null);
                        case adv.TitlePageIndicator_linePosition /*11*/:
                            this.f2319u.append(m2255b());
                            break;
                        case adv.TitlePageIndicator_selectedBold /*12*/:
                            this.f2319u.append('\\');
                            break;
                        case adv.TitlePageIndicator_titlePadding /*13*/:
                            m2252a(0);
                            return new C0334e(0, this.f2319u.toString());
                        case adv.TitlePageIndicator_topPadding /*14*/:
                            this.f2319u.append('\"');
                            break;
                        case 15:
                            this.f2319u.append('/');
                            break;
                        case 16:
                            this.f2319u.append('\b');
                            break;
                        case 17:
                            this.f2319u.append('\f');
                            break;
                        case 18:
                            this.f2319u.append('\n');
                            break;
                        case 19:
                            this.f2319u.append('\r');
                            break;
                        case 20:
                            this.f2319u.append('\t');
                            break;
                        case 21:
                            return new C0334e(0, Double.valueOf(m2255b()));
                        case 22:
                            return new C0334e(0, null);
                        case 23:
                            return new C0334e(0, Boolean.valueOf(m2255b()));
                        case 24:
                            try {
                                this.f2319u.append((char) Integer.parseInt(m2255b().substring(2), 16));
                                break;
                            } catch (Exception e) {
                                throw new C0332c(this.f2315q, 2, e);
                            }
                        default:
                            if (i4 == -1 || this.f2312n != this.f2311m) {
                                m2246c(1);
                                break;
                            }
                            this.f2318t = true;
                            return null;
                    }
                }
                int i6 = iArr[iArr2[this.f2307i] + cArr2[i4]];
                if (i6 != -1) {
                    this.f2307i = i6;
                    i6 = iArr3[this.f2307i];
                    if ((i6 & 1) == 1) {
                        i2 = this.f2307i;
                        if ((i6 & 8) == 8) {
                            i3 = i2;
                            i2 = i5;
                        } else {
                            i4 = i2;
                            i2 = i5;
                        }
                    } else {
                        i4 = i3;
                    }
                    i3 = i4;
                    i4 = i5;
                }
                this.f2310l = i2;
                if (i3 >= 0) {
                    i3 = f2301c[i3];
                }
                switch (i3) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        throw new C0332c(this.f2315q, 0, new Character(m2254b(0)));
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        return new C0334e(0, Long.valueOf(m2255b()));
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
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
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        this.f2319u.delete(0, this.f2319u.length());
                        m2252a(2);
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        return new C0334e(1, null);
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        return new C0334e(2, null);
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        return new C0334e(3, null);
                    case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                        return new C0334e(4, null);
                    case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                        return new C0334e(5, null);
                    case adv.TitlePageIndicator_footerPadding /*10*/:
                        return new C0334e(6, null);
                    case adv.TitlePageIndicator_linePosition /*11*/:
                        this.f2319u.append(m2255b());
                        break;
                    case adv.TitlePageIndicator_selectedBold /*12*/:
                        this.f2319u.append('\\');
                        break;
                    case adv.TitlePageIndicator_titlePadding /*13*/:
                        m2252a(0);
                        return new C0334e(0, this.f2319u.toString());
                    case adv.TitlePageIndicator_topPadding /*14*/:
                        this.f2319u.append('\"');
                        break;
                    case 15:
                        this.f2319u.append('/');
                        break;
                    case 16:
                        this.f2319u.append('\b');
                        break;
                    case 17:
                        this.f2319u.append('\f');
                        break;
                    case 18:
                        this.f2319u.append('\n');
                        break;
                    case 19:
                        this.f2319u.append('\r');
                        break;
                    case 20:
                        this.f2319u.append('\t');
                        break;
                    case 21:
                        return new C0334e(0, Double.valueOf(m2255b()));
                    case 22:
                        return new C0334e(0, null);
                    case 23:
                        return new C0334e(0, Boolean.valueOf(m2255b()));
                    case 24:
                        this.f2319u.append((char) Integer.parseInt(m2255b().substring(2), 16));
                        break;
                    default:
                        if (i4 == -1) {
                            break;
                        }
                        m2246c(1);
                        break;
                }
            }
        }
    }
}
