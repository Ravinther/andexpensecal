package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ch */
class ch extends bd {
    private static int f1703h;
    private String f1704a;
    private boolean f1705b;
    private int f1706c;
    private ArrayList f1707d;
    private ArrayList f1708e;
    private byte[] f1709f;
    private int f1710g;

    static {
        f1703h = 8224;
    }

    public ch() {
        super(ay.f815u);
        this.f1710g = 0;
        this.f1707d = new ArrayList(50);
        this.f1708e = new ArrayList(50);
    }

    public int m1664a(String str) {
        int length = (str.length() * 2) + 3;
        if (this.f1710g >= f1703h - 5) {
            return str.length();
        }
        this.f1708e.add(new Integer(str.length()));
        if (this.f1710g + length < f1703h) {
            this.f1707d.add(str);
            this.f1710g = length + this.f1710g;
            return 0;
        }
        length = (f1703h - 3) - this.f1710g;
        length = length % 2 == 0 ? length / 2 : (length - 1) / 2;
        this.f1707d.add(str.substring(0, length));
        this.f1710g += (length * 2) + 3;
        return str.length() - length;
    }

    public int m1665a(String str, boolean z) {
        this.f1705b = z;
        this.f1706c = str.length();
        int length = !this.f1705b ? (str.length() * 2) + 1 : (str.length() * 2) + 3;
        if (length <= f1703h) {
            this.f1704a = str;
            this.f1710g = length + this.f1710g;
            return 0;
        }
        length = this.f1705b ? (f1703h - 4) / 2 : (f1703h - 2) / 2;
        this.f1704a = str.substring(0, length);
        this.f1710g = f1703h - 1;
        return str.length() - length;
    }

    public byte[] m1666a() {
        int i;
        this.f1709f = new byte[this.f1710g];
        if (this.f1705b) {
            ar.m1150a(this.f1706c, this.f1709f, 0);
            this.f1709f[2] = (byte) 1;
            i = 3;
        } else {
            this.f1709f[0] = (byte) 1;
            i = 1;
        }
        ax.m1166b(this.f1704a, this.f1709f, i);
        i += this.f1704a.length() * 2;
        Iterator it = this.f1707d.iterator();
        int i2 = 0;
        int i3 = i;
        while (it.hasNext()) {
            String str = (String) it.next();
            ar.m1150a(((Integer) this.f1708e.get(i2)).intValue(), this.f1709f, i3);
            this.f1709f[i3 + 2] = (byte) 1;
            ax.m1166b(str, this.f1709f, i3 + 3);
            i2++;
            i3 += (str.length() * 2) + 3;
        }
        return this.f1709f;
    }

    public int m1667c() {
        return this.f1710g;
    }
}
