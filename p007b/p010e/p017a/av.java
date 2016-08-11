package p007b.p010e.p017a;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p008a.bd;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.av */
public class av extends bd {
    private static C0208c f1588a;
    private static final ax f1589m;
    private static final ax f1590n;
    private static final ax f1591o;
    private static final ax f1592p;
    private static final ax f1593q;
    private int f1594b;
    private int f1595c;
    private int f1596d;
    private int f1597e;
    private URL f1598f;
    private File f1599g;
    private String f1600h;
    private String f1601i;
    private ax f1602j;
    private byte[] f1603k;
    private boolean f1604l;

    static {
        f1588a = C0208c.m1493a(av.class);
        f1589m = new ax();
        f1590n = new ax();
        f1591o = new ax();
        f1592p = new ax();
        f1593q = new ax();
    }

    private String m1586a(String str) {
        String str2;
        int indexOf = str.indexOf(46);
        if (indexOf == -1) {
            str2 = "";
        } else {
            String substring = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 1);
            str = substring;
        }
        if (str.length() > 8) {
            str = (str.substring(0, 6) + "~" + (str.length() - 8)).substring(0, 8);
        }
        str2 = str2.substring(0, Math.min(3, str2.length()));
        return str2.length() > 0 ? str + '.' + str2 : str;
    }

    private byte[] m1587a(byte[] bArr) {
        String url = this.f1598f.toString();
        int length = (bArr.length + 20) + ((url.length() + 1) * 2);
        if (this.f1601i != null) {
            length += ((this.f1601i.length() + 1) * 2) + 4;
        }
        Object obj = new byte[length];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        length = bArr.length;
        if (this.f1601i != null) {
            ar.m1153b(this.f1601i.length() + 1, obj, length);
            ax.m1166b(this.f1601i, obj, length + 4);
            length += ((this.f1601i.length() + 1) * 2) + 4;
        }
        obj[length] = (byte) -32;
        obj[length + 1] = (byte) -55;
        obj[length + 2] = (byte) -22;
        obj[length + 3] = (byte) 121;
        obj[length + 4] = (byte) -7;
        obj[length + 5] = (byte) -70;
        obj[length + 6] = (byte) -50;
        obj[length + 7] = (byte) 17;
        obj[length + 8] = (byte) -116;
        obj[length + 9] = (byte) -126;
        obj[length + 10] = null;
        obj[length + 11] = (byte) -86;
        obj[length + 12] = null;
        obj[length + 13] = (byte) 75;
        obj[length + 14] = (byte) -87;
        obj[length + 15] = (byte) 11;
        ar.m1153b((url.length() + 1) * 2, obj, length + 16);
        ax.m1166b(url, obj, length + 20);
        return obj;
    }

    private byte[] m1588b(byte[] bArr) {
        String path = this.f1599g.getPath();
        Object obj = new byte[(((bArr.length + (path.length() * 2)) + 2) + 4)];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        int length = bArr.length;
        ar.m1153b(path.length() + 1, obj, length);
        ax.m1166b(path, obj, length + 4);
        return obj;
    }

    private byte[] m1589c(byte[] bArr) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(this.f1599g.getName());
        arrayList2.add(m1586a(this.f1599g.getName()));
        for (File parentFile = this.f1599g.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
            arrayList.add(parentFile.getName());
            arrayList2.add(m1586a(parentFile.getName()));
        }
        int i2 = 1;
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i2 != 0) {
            if (((String) arrayList.get(size)).equals("..")) {
                i = i3 + 1;
                arrayList.remove(size);
                arrayList2.remove(size);
                int i4 = i2;
                i2 = i;
                i = i4;
            } else {
                byte b = (byte) 0;
                i2 = i3;
            }
            size--;
            i3 = i2;
            i2 = i;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        if (this.f1599g.getPath().charAt(1) == ':') {
            char charAt = this.f1599g.getPath().charAt(0);
            if (!(charAt == 'C' || charAt == 'c')) {
                stringBuffer.append(charAt);
                stringBuffer.append(':');
                stringBuffer2.append(charAt);
                stringBuffer2.append(':');
            }
        }
        for (i2 = arrayList.size() - 1; i2 >= 0; i2--) {
            stringBuffer.append((String) arrayList.get(i2));
            stringBuffer2.append((String) arrayList2.get(i2));
            if (i2 != 0) {
                stringBuffer.append("\\");
                stringBuffer2.append("\\");
            }
        }
        String stringBuffer3 = stringBuffer.toString();
        String stringBuffer4 = stringBuffer2.toString();
        i = ((((((bArr.length + 4) + (stringBuffer4.length() + 1)) + 16) + 2) + 8) + ((stringBuffer3.length() + 1) * 2)) + 24;
        if (this.f1601i != null) {
            i += ((this.f1601i.length() + 1) * 2) + 4;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        i = bArr.length;
        if (this.f1601i != null) {
            ar.m1153b(this.f1601i.length() + 1, bArr2, i);
            ax.m1166b(this.f1601i, bArr2, i + 4);
            i += ((this.f1601i.length() + 1) * 2) + 4;
        }
        bArr2[i] = (byte) 3;
        bArr2[i + 1] = (byte) 3;
        bArr2[i + 2] = (byte) 0;
        bArr2[i + 3] = (byte) 0;
        bArr2[i + 4] = (byte) 0;
        bArr2[i + 5] = (byte) 0;
        bArr2[i + 6] = (byte) 0;
        bArr2[i + 7] = (byte) 0;
        bArr2[i + 8] = (byte) -64;
        bArr2[i + 9] = (byte) 0;
        bArr2[i + 10] = (byte) 0;
        bArr2[i + 11] = (byte) 0;
        bArr2[i + 12] = (byte) 0;
        bArr2[i + 13] = (byte) 0;
        bArr2[i + 14] = (byte) 0;
        bArr2[i + 15] = (byte) 70;
        i += 16;
        ar.m1150a(i3, bArr2, i);
        i += 2;
        ar.m1153b(stringBuffer4.length() + 1, bArr2, i);
        ax.m1163a(stringBuffer4, bArr2, i + 4);
        i += (stringBuffer4.length() + 1) + 4;
        bArr2[i] = (byte) -1;
        bArr2[i + 1] = (byte) -1;
        bArr2[i + 2] = (byte) -83;
        bArr2[i + 3] = (byte) -34;
        bArr2[i + 4] = (byte) 0;
        bArr2[i + 5] = (byte) 0;
        bArr2[i + 6] = (byte) 0;
        bArr2[i + 7] = (byte) 0;
        bArr2[i + 8] = (byte) 0;
        bArr2[i + 9] = (byte) 0;
        bArr2[i + 10] = (byte) 0;
        bArr2[i + 11] = (byte) 0;
        bArr2[i + 12] = (byte) 0;
        bArr2[i + 13] = (byte) 0;
        bArr2[i + 14] = (byte) 0;
        bArr2[i + 15] = (byte) 0;
        bArr2[i + 16] = (byte) 0;
        bArr2[i + 17] = (byte) 0;
        bArr2[i + 18] = (byte) 0;
        bArr2[i + 19] = (byte) 0;
        bArr2[i + 20] = (byte) 0;
        bArr2[i + 21] = (byte) 0;
        bArr2[i + 22] = (byte) 0;
        bArr2[i + 23] = (byte) 0;
        i += 24;
        ar.m1153b((stringBuffer3.length() * 2) + 6, bArr2, i);
        i += 4;
        ar.m1153b(stringBuffer3.length() * 2, bArr2, i);
        i += 4;
        bArr2[i] = (byte) 3;
        bArr2[i + 1] = (byte) 0;
        i += 2;
        ax.m1166b(stringBuffer3, bArr2, i);
        i += (stringBuffer3.length() + 1) * 2;
        return bArr2;
    }

    private byte[] m1590d(byte[] bArr) {
        Object obj = new byte[((bArr.length + 4) + ((this.f1600h.length() + 1) * 2))];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        int length = bArr.length;
        ar.m1153b(this.f1600h.length() + 1, obj, length);
        ax.m1166b(this.f1600h, obj, length + 4);
        return obj;
    }

    public byte[] m1591a() {
        int i = 8;
        if (!this.f1604l) {
            return this.f1603k;
        }
        byte[] bArr = new byte[32];
        ar.m1150a(this.f1594b, bArr, 0);
        ar.m1150a(this.f1595c, bArr, 2);
        ar.m1150a(this.f1596d, bArr, 4);
        ar.m1150a(this.f1597e, bArr, 6);
        bArr[8] = (byte) -48;
        bArr[9] = (byte) -55;
        bArr[10] = (byte) -22;
        bArr[11] = (byte) 121;
        bArr[12] = (byte) -7;
        bArr[13] = (byte) -70;
        bArr[14] = (byte) -50;
        bArr[15] = (byte) 17;
        bArr[16] = (byte) -116;
        bArr[17] = (byte) -126;
        bArr[18] = (byte) 0;
        bArr[19] = (byte) -86;
        bArr[20] = (byte) 0;
        bArr[21] = (byte) 75;
        bArr[22] = (byte) -87;
        bArr[23] = (byte) 11;
        bArr[24] = (byte) 2;
        bArr[25] = (byte) 0;
        bArr[26] = (byte) 0;
        bArr[27] = (byte) 0;
        if (m1594e()) {
            i = 3;
            if (this.f1601i != null) {
                i = 23;
            }
        } else if (m1592c()) {
            i = 1;
            if (this.f1601i != null) {
                i = 21;
            }
        } else if (!m1595f()) {
            i = m1593d() ? 259 : 0;
        }
        ar.m1153b(i, bArr, 28);
        if (m1594e()) {
            this.f1603k = m1587a(bArr);
        } else if (m1592c()) {
            this.f1603k = m1589c(bArr);
        } else if (m1595f()) {
            this.f1603k = m1590d(bArr);
        } else if (m1593d()) {
            this.f1603k = m1588b(bArr);
        }
        return this.f1603k;
    }

    public boolean m1592c() {
        return this.f1602j == f1590n;
    }

    public boolean m1593d() {
        return this.f1602j == f1591o;
    }

    public boolean m1594e() {
        return this.f1602j == f1589m;
    }

    public boolean m1595f() {
        return this.f1602j == f1592p;
    }

    public String toString() {
        return m1592c() ? this.f1599g.toString() : m1594e() ? this.f1598f.toString() : m1593d() ? this.f1599g.toString() : "";
    }
}
