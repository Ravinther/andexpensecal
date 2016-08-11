package p007b.p015d.p016a;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import p007b.p008a.C0187f;
import p007b.p008a.C0188g;
import p007b.p013b.C0208c;

/* renamed from: b.d.a.d */
public final class C0230d extends C0187f {
    private static C0208c f1511c;
    private byte[] f1512d;
    private int[] f1513e;
    private int[] f1514f;
    private ArrayList f1515g;
    private C0188g f1516h;

    static {
        f1511c = C0208c.m1493a(C0230d.class);
    }

    private C0188g m1532a(String str, C0188g c0188g) {
        if (c0188g.f1162h == -1) {
            return null;
        }
        C0188g c = m1535c(c0188g.f1162h);
        if (c.f1155a.equalsIgnoreCase(str)) {
            return c;
        }
        C0188g c0188g2 = c;
        while (c0188g2.f1160f != -1) {
            c0188g2 = m1535c(c0188g2.f1160f);
            if (c0188g2.f1155a.equalsIgnoreCase(str)) {
                return c0188g2;
            }
        }
        c0188g2 = c;
        while (c0188g2.f1161g != -1) {
            c0188g2 = m1535c(c0188g2.f1161g);
            if (c0188g2.f1155a.equalsIgnoreCase(str)) {
                return c0188g2;
            }
        }
        return m1532a(str, c);
    }

    private byte[] m1533a(C0188g c0188g) {
        int i = c0188g.f1159e / AdRequest.MAX_CONTENT_URL_LENGTH;
        if (c0188g.f1159e % AdRequest.MAX_CONTENT_URL_LENGTH != 0) {
            i++;
        }
        Object obj = new byte[(i * AdRequest.MAX_CONTENT_URL_LENGTH)];
        int i2 = c0188g.f1158d;
        int i3 = 0;
        while (i2 != -2 && i3 < i) {
            System.arraycopy(this.f1512d, (i2 + 1) * AdRequest.MAX_CONTENT_URL_LENGTH, obj, i3 * AdRequest.MAX_CONTENT_URL_LENGTH, AdRequest.MAX_CONTENT_URL_LENGTH);
            i3++;
            i2 = this.f1513e[i2];
        }
        if (i2 != -2 && i3 == i) {
            f1511c.m1499b((Object) "Property storage size inconsistent with block chain.");
        }
        return obj;
    }

    private byte[] m1534b(C0188g c0188g) {
        Object d = m1536d(this.f1516h.f1158d);
        Object obj = new byte[0];
        int i = c0188g.f1158d;
        int i2 = 0;
        while (i2 <= this.f1514f.length && i != -2) {
            Object obj2 = new byte[(obj.length + 64)];
            System.arraycopy(obj, 0, obj2, 0, obj.length);
            System.arraycopy(d, i * 64, obj2, obj.length, 64);
            i = this.f1514f[i];
            if (i == -1) {
                f1511c.m1499b("Incorrect terminator for small block stream " + c0188g.f1155a);
                i = -2;
            }
            i2++;
            obj = obj2;
        }
        if (i2 <= this.f1514f.length) {
            return obj;
        }
        throw new C0228b(C0228b.f1509h);
    }

    private C0188g m1535c(int i) {
        return (C0188g) this.f1515g.get(i);
    }

    private byte[] m1536d(int i) {
        Object obj = new byte[0];
        int i2 = 0;
        while (i2 <= this.f1513e.length && i != -2) {
            Object obj2 = new byte[(obj.length + AdRequest.MAX_CONTENT_URL_LENGTH)];
            System.arraycopy(obj, 0, obj2, 0, obj.length);
            System.arraycopy(this.f1512d, (i + 1) * AdRequest.MAX_CONTENT_URL_LENGTH, obj2, obj.length, AdRequest.MAX_CONTENT_URL_LENGTH);
            if (this.f1513e[i] == i) {
                throw new C0228b(C0228b.f1509h);
            }
            i = this.f1513e[i];
            i2++;
            obj = obj2;
        }
        if (i2 <= this.f1513e.length) {
            return obj;
        }
        throw new C0228b(C0228b.f1509h);
    }

    public int m1537a() {
        return this.f1515g.size();
    }

    public C0188g m1538a(String str) {
        return m1532a(str, this.f1516h);
    }

    public byte[] m1539a(int i) {
        C0188g c = m1535c(i);
        return (c.f1159e >= 4096 || c.f1155a.equalsIgnoreCase("Root Entry")) ? m1533a(c) : m1534b(c);
    }

    public C0188g m1540b(int i) {
        return m1535c(i);
    }
}
