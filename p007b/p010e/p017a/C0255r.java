package p007b.p010e.p017a;

import com.google.android.gms.ads.AdRequest;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p007b.p008a.C0187f;
import p007b.p008a.C0188g;
import p007b.p008a.ar;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;
import p007b.p015d.p016a.C0230d;

/* renamed from: b.e.a.r */
final class C0255r extends C0187f {
    private static C0208c f1889c;
    private OutputStream f1890d;
    private ag f1891e;
    private int f1892f;
    private int f1893g;
    private int f1894h;
    private int f1895i;
    private int f1896j;
    private int f1897k;
    private int f1898l;
    private int f1899m;
    private int f1900n;
    private int f1901o;
    private int f1902p;
    private int f1903q;
    private int f1904r;
    private int f1905s;
    private int f1906t;
    private int f1907u;
    private int f1908v;
    private ArrayList f1909w;
    private HashMap f1910x;
    private int f1911y;
    private byte[] f1912z;

    static {
        f1889c = C0208c.m1493a(C0255r.class);
    }

    public C0255r(ag agVar, int i, OutputStream outputStream, C0230d c0230d) {
        this.f1892f = i;
        this.f1891e = agVar;
        m1810a(c0230d);
        this.f1908v = 1;
        this.f1907u = (this.f1909w != null ? this.f1909w.size() : 0) + 4;
        if (this.f1909w != null) {
            this.f1895i = m1808a(this.f1906t * 4);
            this.f1896j = m1808a(this.f1906t * 64);
            this.f1908v += m1808a(this.f1909w.size() * 128);
        }
        int a = m1808a(i);
        if (i < 4096) {
            this.f1893g = 4096;
        } else {
            this.f1893g = a * AdRequest.MAX_CONTENT_URL_LENGTH;
        }
        this.f1890d = outputStream;
        this.f1899m = this.f1893g / AdRequest.MAX_CONTENT_URL_LENGTH;
        this.f1894h = 1;
        int i2 = this.f1908v + (((((this.f1899m + 8) + 8) + this.f1905s) + this.f1896j) + this.f1895i);
        this.f1894h = (int) Math.ceil(((double) (this.f1894h + i2)) / 128.0d);
        this.f1894h = (int) Math.ceil(((double) (this.f1894h + i2)) / 128.0d);
        a = this.f1894h + i2;
        if (this.f1894h > 108) {
            this.f1898l = 0;
            this.f1897k = (int) Math.ceil(((double) ((this.f1894h - 109) + 1)) / 127.0d);
            this.f1894h = (int) Math.ceil(((double) ((this.f1897k + i2) + this.f1894h)) / 128.0d);
            a = (this.f1897k + i2) + this.f1894h;
        } else {
            this.f1898l = -2;
            this.f1897k = 0;
        }
        this.f1901o = this.f1897k;
        this.f1904r = -2;
        if (!(this.f1909w == null || this.f1896j == 0)) {
            this.f1904r = ((this.f1901o + this.f1899m) + this.f1905s) + 16;
        }
        this.f1903q = -2;
        if (this.f1904r != -2) {
            this.f1903q = this.f1904r + this.f1896j;
        }
        if (this.f1903q != -2) {
            this.f1902p = this.f1903q + this.f1895i;
        } else {
            this.f1902p = ((this.f1901o + this.f1899m) + this.f1905s) + 16;
        }
        this.f1900n = this.f1902p + this.f1894h;
        if (a != this.f1900n + this.f1908v) {
            f1889c.m1499b((Object) "Root start block and total blocks are inconsistent  generated file may be corrupt");
            f1889c.m1499b("RootStartBlock " + this.f1900n + " totalBlocks " + a);
        }
    }

    private int m1808a(int i) {
        int i2 = i / AdRequest.MAX_CONTENT_URL_LENGTH;
        return i % AdRequest.MAX_CONTENT_URL_LENGTH > 0 ? i2 + 1 : i2;
    }

    private void m1809a(int i, int i2) {
        int i3 = i + 1;
        int i4 = i2 - 1;
        while (i4 > 0) {
            int i5;
            int min = Math.min(i4, (512 - this.f1911y) / 4);
            for (i5 = 0; i5 < min; i5++) {
                ar.m1153b(i3, this.f1912z, this.f1911y);
                this.f1911y += 4;
                i3++;
            }
            i5 = i4 - min;
            m1817g();
            i4 = i5;
        }
        ar.m1153b(-2, this.f1912z, this.f1911y);
        this.f1911y += 4;
        m1817g();
    }

    private void m1810a(C0230d c0230d) {
        Object obj;
        if (c0230d != null) {
            this.f1909w = new ArrayList();
            this.f1910x = new HashMap();
            int a = c0230d.m1537a();
            int i = 0;
            int i2 = 0;
            while (i < a) {
                int i3;
                C0188g b = c0230d.m1540b(i);
                if (b.f1155a.equalsIgnoreCase("Root Entry")) {
                    this.f1910x.put("Root Entry", new C0256s(b, null, i));
                    obj = 1;
                } else {
                    obj = null;
                }
                Object obj2 = obj;
                for (i3 = 0; i3 < b.length && obj2 == null; i3++) {
                    if (b.f1155a.equalsIgnoreCase(b[i3])) {
                        C0188g a2 = c0230d.m1538a(b.f1155a);
                        C0210a.m1505a(a2 != null);
                        if (a2 == b) {
                            this.f1910x.put(b[i3], new C0256s(b, null, i));
                            obj2 = 1;
                        }
                    }
                }
                if (obj2 == null) {
                    try {
                        byte[] a3 = b.f1159e > 0 ? c0230d.m1539a(i) : new byte[0];
                        this.f1909w.add(new C0256s(b, a3, i));
                        if (a3.length > 4096) {
                            i3 = m1808a(a3.length) + i2;
                            i++;
                            i2 = i3;
                        } else {
                            this.f1906t = m1811b(a3.length) + this.f1906t;
                        }
                    } catch (Object obj3) {
                        f1889c.m1495a(obj3);
                        throw new C0257t();
                    }
                }
                i3 = i2;
                i++;
                i2 = i3;
            }
            this.f1905s = i2;
        }
    }

    private int m1811b(int i) {
        int i2 = i / 64;
        return i % 64 > 0 ? i2 + 1 : i2;
    }

    private void m1812b() {
        if (this.f1909w != null) {
            Iterator it = this.f1909w.iterator();
            while (it.hasNext()) {
                byte[] bArr = ((C0256s) it.next()).f1914b;
                if (bArr.length > 4096) {
                    int a = m1808a(bArr.length) * AdRequest.MAX_CONTENT_URL_LENGTH;
                    this.f1890d.write(bArr, 0, bArr.length);
                    bArr = new byte[(a - bArr.length)];
                    this.f1890d.write(bArr, 0, bArr.length);
                }
            }
        }
    }

    private void m1813c() {
        this.f1891e.m1551a(this.f1890d);
        this.f1890d.write(new byte[(this.f1893g - this.f1892f)]);
    }

    private void m1814d() {
        this.f1890d.write(new byte[4096]);
    }

    private void m1815e() {
        this.f1890d.write(new byte[4096]);
    }

    private void m1816f() {
        Object obj = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
        byte[] bArr = new byte[(this.f1897k * AdRequest.MAX_CONTENT_URL_LENGTH)];
        System.arraycopy(a, 0, obj, 0, a.length);
        obj[24] = (byte) 62;
        obj[26] = (byte) 3;
        obj[28] = -2;
        obj[29] = -1;
        obj[30] = (byte) 9;
        obj[32] = (byte) 6;
        obj[57] = (byte) 16;
        ar.m1153b(this.f1894h, obj, 44);
        ar.m1153b(this.f1903q, obj, 60);
        ar.m1153b(this.f1895i, obj, 64);
        ar.m1153b(this.f1898l, obj, 68);
        ar.m1153b(this.f1897k, obj, 72);
        ar.m1153b(this.f1900n, obj, 48);
        int i = 76;
        int min = Math.min(this.f1894h, 109);
        int i2 = 0;
        int i3 = 0;
        while (i2 < min) {
            ar.m1153b(this.f1902p + i2, obj, i);
            i2++;
            i3++;
            i += 4;
        }
        while (i < AdRequest.MAX_CONTENT_URL_LENGTH) {
            obj[i] = -1;
            i++;
        }
        this.f1890d.write(obj);
        i = i3;
        i2 = 0;
        i3 = 0;
        while (i3 < this.f1897k) {
            int min2 = Math.min(this.f1894h - i, 127);
            int i4 = i2;
            for (i2 = 0; i2 < min2; i2++) {
                ar.m1153b((this.f1902p + i) + i2, bArr, i4);
                i4 += 4;
            }
            i += min2;
            ar.m1153b(i == this.f1894h ? -2 : i3 + 1, bArr, i4);
            i2 = i4 + 4;
            i3++;
        }
        if (this.f1897k > 0) {
            while (i2 < bArr.length) {
                bArr[i2] = (byte) -1;
                i2++;
            }
            this.f1890d.write(bArr);
        }
    }

    private void m1817g() {
        if (this.f1911y >= AdRequest.MAX_CONTENT_URL_LENGTH) {
            this.f1890d.write(this.f1912z);
            this.f1912z = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
            this.f1911y = 0;
        }
    }

    private void m1818h() {
        if (this.f1909w != null) {
            int i = (this.f1901o + this.f1899m) + 16;
            Iterator it = this.f1909w.iterator();
            int i2 = i;
            while (it.hasNext()) {
                C0256s c0256s = (C0256s) it.next();
                if (c0256s.f1914b.length > 4096) {
                    i = m1808a(c0256s.f1914b.length);
                    m1809a(i2, i);
                    i += i2;
                } else {
                    i = i2;
                }
                i2 = i;
            }
        }
    }

    private void m1819i() {
        if (this.f1903q != -2) {
            byte[] bArr = new byte[(this.f1895i * AdRequest.MAX_CONTENT_URL_LENGTH)];
            Iterator it = this.f1909w.iterator();
            int i = 1;
            int i2 = 0;
            while (it.hasNext()) {
                int i3;
                C0256s c0256s = (C0256s) it.next();
                if (c0256s.f1914b.length > 4096 || c0256s.f1914b.length == 0) {
                    i3 = i;
                    i = i2;
                } else {
                    int b = m1811b(c0256s.f1914b.length);
                    for (i3 = 0; i3 < b - 1; i3++) {
                        ar.m1153b(i, bArr, i2);
                        i2 += 4;
                        i++;
                    }
                    ar.m1153b(-2, bArr, i2);
                    i3 = i + 1;
                    i = i2 + 4;
                }
                i2 = i;
                i = i3;
            }
            this.f1890d.write(bArr);
        }
    }

    private void m1820j() {
        if (this.f1909w != null) {
            Object obj = new byte[(this.f1896j * AdRequest.MAX_CONTENT_URL_LENGTH)];
            Iterator it = this.f1909w.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2;
                C0256s c0256s = (C0256s) it.next();
                if (c0256s.f1914b.length <= 4096) {
                    int b = m1811b(c0256s.f1914b.length) * 64;
                    System.arraycopy(c0256s.f1914b, 0, obj, i, c0256s.f1914b.length);
                    i2 = i + b;
                } else {
                    i2 = i;
                }
                i = i2;
            }
            this.f1890d.write(obj);
        }
    }

    private void m1821k() {
        int i;
        int i2 = 0;
        this.f1912z = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.f1911y = 0;
        for (i = 0; i < this.f1897k; i++) {
            ar.m1153b(-3, this.f1912z, this.f1911y);
            this.f1911y += 4;
            m1817g();
        }
        m1809a(this.f1901o, this.f1899m);
        int i3 = this.f1905s + (this.f1901o + this.f1899m);
        for (i = i3; i < i3 + 7; i++) {
            ar.m1153b(i + 1, this.f1912z, this.f1911y);
            this.f1911y += 4;
            m1817g();
        }
        ar.m1153b(-2, this.f1912z, this.f1911y);
        this.f1911y += 4;
        m1817g();
        for (i = i3 + 8; i < i3 + 15; i++) {
            ar.m1153b(i + 1, this.f1912z, this.f1911y);
            this.f1911y += 4;
            m1817g();
        }
        ar.m1153b(-2, this.f1912z, this.f1911y);
        this.f1911y += 4;
        m1817g();
        m1818h();
        if (this.f1904r != -2) {
            m1809a(this.f1904r, this.f1896j);
            m1809a(this.f1903q, this.f1895i);
        }
        while (i2 < this.f1894h) {
            ar.m1153b(-3, this.f1912z, this.f1911y);
            this.f1911y += 4;
            m1817g();
            i2++;
        }
        m1809a(this.f1900n, this.f1908v);
        if (this.f1911y != 0) {
            for (i = this.f1911y; i < AdRequest.MAX_CONTENT_URL_LENGTH; i++) {
                this.f1912z[i] = (byte) -1;
            }
            this.f1890d.write(this.f1912z);
        }
    }

    private void m1822l() {
        C0256s c0256s;
        int length;
        Iterator it;
        int[] iArr;
        int i;
        C0188g c0188g;
        Iterator it2;
        int i2;
        int i3 = 1;
        Object obj = new byte[(this.f1908v * AdRequest.MAX_CONTENT_URL_LENGTH)];
        if (this.f1909w != null) {
            int i4;
            int[] iArr2 = new int[this.f1907u];
            for (i4 = 0; i4 < b.length; i4++) {
                c0256s = (C0256s) this.f1910x.get(b[i4]);
                if (c0256s != null) {
                    iArr2[c0256s.f1915c] = i4;
                } else {
                    f1889c.m1499b("Standard property set " + b[i4] + " not present in source file");
                }
            }
            length = b.length;
            it = this.f1909w.iterator();
            i4 = length;
            while (it.hasNext()) {
                iArr2[((C0256s) it.next()).f1915c] = i4;
                i4++;
            }
            iArr = iArr2;
        } else {
            iArr = null;
        }
        if (this.f1909w != null) {
            length = (((m1808a(this.f1893g) * AdRequest.MAX_CONTENT_URL_LENGTH) + 0) + (m1808a(4096) * AdRequest.MAX_CONTENT_URL_LENGTH)) + (m1808a(4096) * AdRequest.MAX_CONTENT_URL_LENGTH);
            it = this.f1909w.iterator();
            i = length;
            while (it.hasNext()) {
                c0256s = (C0256s) it.next();
                length = c0256s.f1913a.f1156b != 1 ? c0256s.f1913a.f1159e >= 4096 ? (m1808a(c0256s.f1913a.f1159e) * AdRequest.MAX_CONTENT_URL_LENGTH) + i : (m1811b(c0256s.f1913a.f1159e) * 64) + i : i;
                i = length;
            }
        } else {
            i = 0;
        }
        C0188g c0188g2 = new C0188g(this, "Root Entry");
        c0188g2.m1435a(5);
        c0188g2.m1436b(this.f1904r);
        c0188g2.m1437c(i);
        c0188g2.m1438d(-1);
        c0188g2.m1439e(-1);
        c0188g2.m1441g(0);
        c0188g2.m1440f(this.f1909w != null ? iArr[((C0256s) this.f1910x.get("Root Entry")).f1913a.f1162h] : 1);
        System.arraycopy(c0188g2.f1163i, 0, obj, 0, 128);
        c0188g2 = new C0188g(this, "Workbook");
        c0188g2.m1435a(2);
        c0188g2.m1436b(this.f1901o);
        c0188g2.m1437c(this.f1893g);
        i = 3;
        if (this.f1909w != null) {
            c0256s = (C0256s) this.f1910x.get("Workbook");
            i = c0256s.f1913a.f1160f != -1 ? iArr[c0256s.f1913a.f1160f] : -1;
            length = c0256s.f1913a.f1161g != -1 ? iArr[c0256s.f1913a.f1161g] : -1;
        } else {
            length = -1;
        }
        c0188g2.m1438d(i);
        c0188g2.m1439e(length);
        c0188g2.m1440f(-1);
        System.arraycopy(c0188g2.f1163i, 0, obj, 128, 128);
        C0188g c0188g3 = new C0188g(this, "\u0005SummaryInformation");
        c0188g3.m1435a(2);
        c0188g3.m1436b(this.f1901o + this.f1899m);
        c0188g3.m1437c(4096);
        if (this.f1909w != null) {
            c0256s = (C0256s) this.f1910x.get("\u0005SummaryInformation");
            if (c0256s != null) {
                i = c0256s.f1913a.f1160f != -1 ? iArr[c0256s.f1913a.f1160f] : -1;
                length = c0256s.f1913a.f1161g != -1 ? iArr[c0256s.f1913a.f1161g] : -1;
                i3 = i;
                c0188g3.m1438d(i3);
                c0188g3.m1439e(length);
                c0188g3.m1440f(-1);
                System.arraycopy(c0188g3.f1163i, 0, obj, 256, 128);
                c0188g = new C0188g(this, "\u0005DocumentSummaryInformation");
                c0188g.m1435a(2);
                c0188g.m1436b((this.f1901o + this.f1899m) + 8);
                c0188g.m1437c(4096);
                c0188g.m1438d(-1);
                c0188g.m1439e(-1);
                c0188g.m1440f(-1);
                System.arraycopy(c0188g.f1163i, 0, obj, 384, 128);
                if (this.f1909w != null) {
                    this.f1890d.write(obj);
                }
                length = (this.f1901o + this.f1899m) + 16;
                it2 = this.f1909w.iterator();
                i3 = length;
                i2 = AdRequest.MAX_CONTENT_URL_LENGTH;
                i = 0;
                while (it2.hasNext()) {
                    c0256s = (C0256s) it2.next();
                    int i5 = c0256s.f1914b.length <= 4096 ? i3 : i;
                    C0188g c0188g4 = new C0188g(this, c0256s.f1913a.f1155a);
                    c0188g4.m1435a(c0256s.f1913a.f1156b);
                    c0188g4.m1436b(i5);
                    c0188g4.m1437c(c0256s.f1913a.f1159e);
                    i5 = c0256s.f1913a.f1160f == -1 ? iArr[c0256s.f1913a.f1160f] : -1;
                    int i6 = c0256s.f1913a.f1161g == -1 ? iArr[c0256s.f1913a.f1161g] : -1;
                    int i7 = c0256s.f1913a.f1162h == -1 ? iArr[c0256s.f1913a.f1162h] : -1;
                    c0188g4.m1438d(i5);
                    c0188g4.m1439e(i6);
                    c0188g4.m1440f(i7);
                    System.arraycopy(c0188g4.f1163i, 0, obj, i2, 128);
                    i2 += 128;
                    if (c0256s.f1914b.length <= 4096) {
                        i3 += m1808a(c0256s.f1914b.length);
                        length = i;
                        i = i3;
                    } else {
                        length = m1811b(c0256s.f1914b.length) + i;
                        i = i3;
                    }
                    i3 = i;
                    i = length;
                }
                this.f1890d.write(obj);
                return;
            }
        }
        length = 3;
        c0188g3.m1438d(i3);
        c0188g3.m1439e(length);
        c0188g3.m1440f(-1);
        System.arraycopy(c0188g3.f1163i, 0, obj, 256, 128);
        c0188g = new C0188g(this, "\u0005DocumentSummaryInformation");
        c0188g.m1435a(2);
        c0188g.m1436b((this.f1901o + this.f1899m) + 8);
        c0188g.m1437c(4096);
        c0188g.m1438d(-1);
        c0188g.m1439e(-1);
        c0188g.m1440f(-1);
        System.arraycopy(c0188g.f1163i, 0, obj, 384, 128);
        if (this.f1909w != null) {
            length = (this.f1901o + this.f1899m) + 16;
            it2 = this.f1909w.iterator();
            i3 = length;
            i2 = AdRequest.MAX_CONTENT_URL_LENGTH;
            i = 0;
            while (it2.hasNext()) {
                c0256s = (C0256s) it2.next();
                if (c0256s.f1914b.length <= 4096) {
                }
                C0188g c0188g42 = new C0188g(this, c0256s.f1913a.f1155a);
                c0188g42.m1435a(c0256s.f1913a.f1156b);
                c0188g42.m1436b(i5);
                c0188g42.m1437c(c0256s.f1913a.f1159e);
                if (c0256s.f1913a.f1160f == -1) {
                }
                if (c0256s.f1913a.f1161g == -1) {
                }
                if (c0256s.f1913a.f1162h == -1) {
                }
                c0188g42.m1438d(i5);
                c0188g42.m1439e(i6);
                c0188g42.m1440f(i7);
                System.arraycopy(c0188g42.f1163i, 0, obj, i2, 128);
                i2 += 128;
                if (c0256s.f1914b.length <= 4096) {
                    length = m1811b(c0256s.f1914b.length) + i;
                    i = i3;
                } else {
                    i3 += m1808a(c0256s.f1914b.length);
                    length = i;
                    i = i3;
                }
                i3 = i;
                i = length;
            }
            this.f1890d.write(obj);
            return;
        }
        this.f1890d.write(obj);
    }

    public void m1823a() {
        m1816f();
        m1813c();
        m1814d();
        m1815e();
        m1812b();
        m1820j();
        m1819i();
        m1821k();
        m1822l();
    }
}
