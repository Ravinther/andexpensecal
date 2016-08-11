package p007b.p008a;

import java.io.UnsupportedEncodingException;
import p007b.C0287p;
import p007b.p013b.C0208c;

/* renamed from: b.a.ax */
public final class ax {
    public static String f768a;
    private static C0208c f769b;

    static {
        f769b = C0208c.m1493a(ax.class);
        f768a = "UnicodeLittle";
    }

    private ax() {
    }

    public static final String m1160a(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        while (indexOf != -1) {
            StringBuffer stringBuffer = new StringBuffer(str.substring(0, indexOf));
            stringBuffer.append(str3);
            stringBuffer.append(str.substring(str2.length() + indexOf));
            str = stringBuffer.toString();
            indexOf = str.indexOf(str2, indexOf + str3.length());
        }
        return str;
    }

    public static String m1161a(byte[] bArr, int i, int i2) {
        try {
            Object obj = new byte[(i * 2)];
            System.arraycopy(bArr, i2, obj, 0, i * 2);
            return new String(obj, f768a);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    public static String m1162a(byte[] bArr, int i, int i2, C0287p c0287p) {
        if (i == 0) {
            return "";
        }
        try {
            return new String(bArr, i2, i, c0287p.m1912g());
        } catch (UnsupportedEncodingException e) {
            f769b.m1499b(e.toString());
            return "";
        }
    }

    public static void m1163a(String str, byte[] bArr, int i) {
        Object a = ax.m1164a(str);
        System.arraycopy(a, 0, bArr, i, a.length);
    }

    public static byte[] m1164a(String str) {
        return str.getBytes();
    }

    public static byte[] m1165a(String str, C0287p c0287p) {
        try {
            return str.getBytes(c0287p.m1912g());
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static void m1166b(String str, byte[] bArr, int i) {
        Object b = ax.m1167b(str);
        System.arraycopy(b, 0, bArr, i, b.length);
    }

    public static byte[] m1167b(String str) {
        try {
            Object bytes = str.getBytes(f768a);
            if (bytes.length != (str.length() * 2) + 2) {
                return bytes;
            }
            Object obj = new byte[(bytes.length - 2)];
            System.arraycopy(bytes, 2, obj, 0, obj.length);
            return obj;
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
