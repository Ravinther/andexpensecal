package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ci */
class ci extends bd {
    private static int f1711g;
    private int f1712a;
    private int f1713b;
    private ArrayList f1714c;
    private ArrayList f1715d;
    private byte[] f1716e;
    private int f1717f;

    static {
        f1711g = 8216;
    }

    public ci(int i, int i2) {
        super(ay.f812r);
        this.f1712a = i;
        this.f1713b = i2;
        this.f1717f = 0;
        this.f1714c = new ArrayList(50);
        this.f1715d = new ArrayList(50);
    }

    public int m1668a(String str) {
        int length = (str.length() * 2) + 3;
        if (this.f1717f >= f1711g - 5) {
            return str.length() > 0 ? str.length() : -1;
        } else {
            this.f1715d.add(new Integer(str.length()));
            if (this.f1717f + length < f1711g) {
                this.f1714c.add(str);
                this.f1717f = length + this.f1717f;
                return 0;
            }
            length = (f1711g - 3) - this.f1717f;
            length = length % 2 == 0 ? length / 2 : (length - 1) / 2;
            this.f1714c.add(str.substring(0, length));
            this.f1717f += (length * 2) + 3;
            return str.length() - length;
        }
    }

    public byte[] m1669a() {
        this.f1716e = new byte[(this.f1717f + 8)];
        ar.m1153b(this.f1712a, this.f1716e, 0);
        ar.m1153b(this.f1713b, this.f1716e, 4);
        Iterator it = this.f1714c.iterator();
        int i = 0;
        int i2 = 8;
        while (it.hasNext()) {
            String str = (String) it.next();
            ar.m1150a(((Integer) this.f1715d.get(i)).intValue(), this.f1716e, i2);
            this.f1716e[i2 + 2] = (byte) 1;
            ax.m1166b(str, this.f1716e, i2 + 3);
            i++;
            i2 += (str.length() * 2) + 3;
        }
        return this.f1716e;
    }

    public int m1670c() {
        return this.f1717f + 8;
    }
}
