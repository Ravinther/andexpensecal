package p000a.p001a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.a.l */
final class C0011l {
    private static final Pattern f60a;
    private static final Integer f61b;
    private static final Pattern f62c;
    private Integer f63d;
    private Integer f64e;
    private Integer f65f;
    private Integer f66g;
    private Integer f67h;
    private Integer f68i;
    private Integer f69j;

    static {
        f60a = Pattern.compile("(\\d{1,4})-(\\d\\d)-(\\d\\d)|(\\d{1,4})-(\\d\\d)|(\\d{1,4})");
        f61b = Integer.valueOf("9");
        f62c = Pattern.compile("(\\d\\d)\\:(\\d\\d)\\:(\\d\\d)\\.(\\d{1,9})|(\\d\\d)\\:(\\d\\d)\\:(\\d\\d)|(\\d\\d)\\:(\\d\\d)|(\\d\\d)");
    }

    C0011l() {
    }

    private String m90a(Matcher matcher, int... iArr) {
        String str = null;
        for (int group : iArr) {
            str = matcher.group(group);
            if (str != null) {
                break;
            }
        }
        return str;
    }

    private C0013n m91c(String str) {
        C0013n c0013n = new C0013n();
        int b = m97b(str);
        int i = (b <= 0 || b >= str.length()) ? 0 : 1;
        if (i != 0) {
            c0013n.f70a = str.substring(0, b);
            c0013n.f71b = str.substring(b + 1);
        } else if (m92d(str)) {
            c0013n.f71b = str;
        } else {
            c0013n.f70a = str;
        }
        return c0013n;
    }

    private boolean m92d(String str) {
        return str.length() >= 2 ? ":".equals(str.substring(2, 3)) : false;
    }

    private void m93e(String str) {
        Matcher matcher = f60a.matcher(str);
        if (matcher.matches()) {
            String a = m90a(matcher, 1, 4, 6);
            if (a != null) {
                this.f63d = Integer.valueOf(a);
            }
            a = m90a(matcher, 2, 5);
            if (a != null) {
                this.f64e = Integer.valueOf(a);
            }
            String a2 = m90a(matcher, 3);
            if (a2 != null) {
                this.f65f = Integer.valueOf(a2);
                return;
            }
            return;
        }
        throw new C0014o("Unexpected format for date:" + str);
    }

    private void m94f(String str) {
        Matcher matcher = f62c.matcher(str);
        if (matcher.matches()) {
            String a = m90a(matcher, 1, 5, 8, 10);
            if (a != null) {
                this.f66g = Integer.valueOf(a);
            }
            a = m90a(matcher, 2, 6, 9);
            if (a != null) {
                this.f67h = Integer.valueOf(a);
            }
            a = m90a(matcher, 3, 7);
            if (a != null) {
                this.f68i = Integer.valueOf(a);
            }
            String a2 = m90a(matcher, 4);
            if (a2 != null) {
                this.f69j = Integer.valueOf(m95g(a2));
                return;
            }
            return;
        }
        throw new C0014o("Unexpected format for time:" + str);
    }

    private String m95g(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        while (stringBuilder.length() < f61b.intValue()) {
            stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }

    C0000a m96a(String str) {
        if (str == null) {
            throw new NullPointerException("DateTime string is null");
        }
        C0013n c = m91c(str.trim());
        if (c.m98a()) {
            m93e(c.f70a);
            m94f(c.f71b);
        } else if (c.m99b()) {
            m93e(c.f70a);
        } else if (c.m100c()) {
            m94f(c.f71b);
        }
        return new C0000a(this.f63d, this.f64e, this.f65f, this.f66g, this.f67h, this.f68i, this.f69j);
    }

    int m97b(String str) {
        int indexOf = str.indexOf(" ");
        return indexOf == -1 ? str.indexOf("T") : indexOf;
    }
}
