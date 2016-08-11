package p007b.p008a;

import p007b.p008a.p012b.C0175t;
import p007b.p013b.C0208c;

/* renamed from: b.a.m */
public final class C0193m {
    private static C0208c f1190a;

    static {
        f1190a = C0208c.m1493a(C0193m.class);
    }

    private C0193m() {
    }

    public static int m1450a(String str) {
        int i = 0;
        int e = C0193m.m1460e(str);
        String toUpperCase = str.toUpperCase();
        int lastIndexOf = str.lastIndexOf(33) + 1;
        if (str.charAt(lastIndexOf) == '$') {
            lastIndexOf++;
        }
        if (str.charAt(e - 1) == '$') {
            e--;
        }
        int i2 = lastIndexOf;
        while (i2 < e) {
            if (i2 != lastIndexOf) {
                i = (i + 1) * 26;
            }
            int charAt = (toUpperCase.charAt(i2) - 65) + i;
            i2++;
            i = charAt;
        }
        return i;
    }

    public static String m1451a(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        C0193m.m1453a(i, i2, stringBuffer);
        return stringBuffer.toString();
    }

    public static void m1452a(int i, int i2, int i3, C0175t c0175t, StringBuffer stringBuffer) {
        stringBuffer.append(ax.m1160a(c0175t.m1369b(i), "'", "''"));
        stringBuffer.append('!');
        C0193m.m1453a(i2, i3, stringBuffer);
    }

    public static void m1453a(int i, int i2, StringBuffer stringBuffer) {
        C0193m.m1455a(i, stringBuffer);
        stringBuffer.append(Integer.toString(i2 + 1));
    }

    public static void m1454a(int i, int i2, boolean z, int i3, boolean z2, C0175t c0175t, StringBuffer stringBuffer) {
        stringBuffer.append(c0175t.m1369b(i));
        stringBuffer.append('!');
        C0193m.m1456a(i2, z, i3, z2, stringBuffer);
    }

    public static void m1455a(int i, StringBuffer stringBuffer) {
        int i2 = i % 26;
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i3 = i / 26; i3 != 0; i3 /= 26) {
            stringBuffer2.append((char) (i2 + 65));
            i2 = (i3 % 26) - 1;
        }
        stringBuffer2.append((char) (i2 + 65));
        for (i2 = stringBuffer2.length() - 1; i2 >= 0; i2--) {
            stringBuffer.append(stringBuffer2.charAt(i2));
        }
    }

    public static void m1456a(int i, boolean z, int i2, boolean z2, StringBuffer stringBuffer) {
        if (z) {
            stringBuffer.append('$');
        }
        C0193m.m1455a(i, stringBuffer);
        if (z2) {
            stringBuffer.append('$');
        }
        stringBuffer.append(Integer.toString(i2 + 1));
    }

    public static int m1457b(String str) {
        try {
            return Integer.parseInt(str.substring(C0193m.m1460e(str))) - 1;
        } catch (Throwable e) {
            f1190a.m1496a(e, e);
            return 65535;
        }
    }

    public static boolean m1458c(String str) {
        return str.charAt(0) != '$';
    }

    public static boolean m1459d(String str) {
        return str.charAt(C0193m.m1460e(str) + -1) != '$';
    }

    private static int m1460e(String str) {
        Object obj = null;
        int lastIndexOf = str.lastIndexOf(33) + 1;
        while (obj == null && lastIndexOf < str.length()) {
            char charAt = str.charAt(lastIndexOf);
            if (charAt < '0' || charAt > '9') {
                lastIndexOf++;
            } else {
                obj = 1;
            }
        }
        return lastIndexOf;
    }
}
