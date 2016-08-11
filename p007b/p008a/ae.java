package p007b.p008a;

import p007b.C0287p;
import p007b.p013b.C0208c;

/* renamed from: b.a.ae */
public class ae {
    private static C0208c f713a;
    private static byte f714b;
    private static byte f715c;
    private static byte f716d;
    private static byte f717e;
    private static byte f718f;

    static {
        f713a = C0208c.m1493a(ae.class);
        f714b = (byte) 1;
        f715c = (byte) 2;
        f716d = (byte) 3;
        f717e = (byte) 4;
        f718f = (byte) 5;
    }

    public static byte[] m1100a(String str, C0287p c0287p) {
        return str.startsWith("http:") ? ae.m1102c(str, c0287p) : ae.m1101b(str, c0287p);
    }

    private static byte[] m1101b(String str, C0287p c0287p) {
        int i;
        C0192k c0192k = new C0192k();
        if (str.charAt(1) == ':') {
            c0192k.m1447a(f714b);
            c0192k.m1447a((byte) str.charAt(0));
            i = 2;
        } else {
            if (str.charAt(0) == '\\' || str.charAt(0) == '/') {
                c0192k.m1447a(f715c);
            }
            i = 0;
        }
        while (true) {
            if (str.charAt(i) != '\\' && str.charAt(i) != '/') {
                break;
            }
            i++;
        }
        while (i < str.length()) {
            String str2;
            int indexOf = str.indexOf(47, i);
            int indexOf2 = str.indexOf(92, i);
            indexOf = (indexOf == -1 || indexOf2 == -1) ? (indexOf == -1 || indexOf2 == -1) ? Math.max(indexOf, indexOf2) : 0 : Math.min(indexOf, indexOf2);
            String substring;
            if (indexOf == -1) {
                substring = str.substring(i);
                i = str.length();
                str2 = substring;
            } else {
                substring = str.substring(i, indexOf);
                i = indexOf + 1;
                str2 = substring;
            }
            if (!str2.equals(".")) {
                if (str2.equals("..")) {
                    c0192k.m1447a(f717e);
                } else {
                    c0192k.m1448a(ax.m1165a(str2, c0287p));
                }
            }
            if (i < str.length()) {
                c0192k.m1447a(f716d);
            }
        }
        return c0192k.m1449a();
    }

    private static byte[] m1102c(String str, C0287p c0287p) {
        C0192k c0192k = new C0192k();
        c0192k.m1447a(f718f);
        c0192k.m1447a((byte) str.length());
        c0192k.m1448a(ax.m1165a(str, c0287p));
        return c0192k.m1449a();
    }
}
