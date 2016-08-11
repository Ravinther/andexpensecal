package com.expensemanager.calculator;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.expensemanager.calculator.i */
public class C0406i {
    private String f4319a;
    private int f4320b;
    private char f4321c;
    private String f4322d;
    private C0409l f4323e;
    private double f4324f;
    private Map<String, Double> f4325g;

    public C0406i() {
        this.f4325g = new HashMap();
        this.f4319a = "";
        this.f4320b = -1;
        this.f4321c = '\u0000';
        this.f4322d = "";
        this.f4323e = C0409l.NOTHING;
    }

    static double m3920a(double d) {
        int i = (int) d;
        if (d != ((double) i)) {
            throw new C0403f(400, "factorial");
        }
        int i2 = i - 1;
        double d2 = (double) i;
        int i3 = i2;
        while (i3 > 1) {
            double d3 = ((double) i3) * d2;
            i3--;
            d2 = d3;
        }
        return d2 == 0.0d ? 1.0d : d2;
    }

    static double m3921a(double d, double d2) {
        int i = (int) d;
        int i2 = (int) d2;
        if (((double) i) == d && ((double) i2) == d2) {
            return (double) (i % i2);
        }
        throw new C0403f(400, "%");
    }

    static double m3922b(double d) {
        return d > 0.0d ? 1.0d : d < 0.0d ? -1.0d : 0.0d;
    }

    double m3923a(C0408k c0408k, double d, double d2) {
        switch (C0407j.f4327b[c0408k.ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return (double) (((int) d) & ((int) d2));
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return (double) (((int) d) | ((int) d2));
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                return (double) (((int) d) << ((int) d2));
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                return (double) (((int) d) >> ((int) d2));
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                return d != d2 ? 0.0d : 1.0d;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                return d == d2 ? 0.0d : 1.0d;
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                return d >= d2 ? 0.0d : 1.0d;
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                return d <= d2 ? 0.0d : 1.0d;
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                return d > d2 ? 0.0d : 1.0d;
            case adv.TitlePageIndicator_footerPadding /*10*/:
                return d < d2 ? 0.0d : 1.0d;
            case adv.TitlePageIndicator_linePosition /*11*/:
                return d + d2;
            case adv.TitlePageIndicator_selectedBold /*12*/:
                return d - d2;
            case adv.TitlePageIndicator_titlePadding /*13*/:
                return d * d2;
            case adv.TitlePageIndicator_topPadding /*14*/:
                return d / d2;
            case 15:
                return C0406i.m3921a(d, d2);
            case 16:
                return (double) (((int) d) ^ ((int) d2));
            case 17:
                return Math.pow(d, d2);
            case 18:
                return C0406i.m3920a(d);
            default:
                throw new C0403f(m3948o(), m3949p(), 104);
        }
    }

    public double m3924a(String str) {
        try {
            this.f4319a = str;
            this.f4324f = 0.0d;
            m3928b();
            m3932c();
            if (this.f4323e == C0409l.DELIMETER && this.f4321c == '\u0000') {
                throw new C0403f(m3948o(), m3949p(), 4);
            }
            this.f4324f = m3934d();
            if (this.f4323e == C0409l.DELIMETER && this.f4322d.length() <= 0) {
                this.f4325g.put(new String("ANS"), new Double(this.f4324f));
                return this.f4324f;
            } else if (this.f4323e == C0409l.DELIMETER) {
                throw new C0403f(m3948o(), m3949p(), 101, this.f4322d);
            } else {
                throw new C0403f(m3948o(), m3949p(), 5, this.f4322d);
            }
        } catch (C0403f e) {
            this.f4324f = 0.0d;
        }
    }

    double m3925a(String str, double d) {
        String toUpperCase = str.toUpperCase();
        if (toUpperCase.equals("ABS")) {
            return Math.abs(d);
        }
        if (toUpperCase.equals("EXP")) {
            return Math.exp(d);
        }
        if (toUpperCase.equals("SIGN")) {
            return C0406i.m3922b(d);
        }
        if (toUpperCase.equals("SQRT")) {
            return Math.sqrt(d);
        }
        if (toUpperCase.equals("LOG")) {
            return Math.log(d);
        }
        if (toUpperCase.equals("LOG10")) {
            return Math.log10(d);
        }
        if (toUpperCase.equals("SIN")) {
            return Math.sin(d);
        }
        if (toUpperCase.equals("COS")) {
            return Math.cos(d);
        }
        if (toUpperCase.equals("TAN")) {
            return Math.tan(d);
        }
        if (toUpperCase.equals("ASIN")) {
            return Math.asin(d);
        }
        if (toUpperCase.equals("ACOS")) {
            return Math.acos(d);
        }
        if (toUpperCase.equals("ATAN")) {
            return Math.atan(d);
        }
        if (toUpperCase.equals("FACTORIAL")) {
            return C0406i.m3920a(d);
        }
        throw new C0403f(m3948o(), m3949p(), 102, str);
    }

    void m3926a() {
        this.f4320b++;
        if (this.f4320b < this.f4319a.length()) {
            this.f4321c = this.f4319a.charAt(this.f4320b);
        } else {
            this.f4321c = '\u0000';
        }
    }

    boolean m3927a(char c) {
        return c == ' ' || c == '\t';
    }

    void m3928b() {
        this.f4320b = 0;
        if (this.f4320b < this.f4319a.length()) {
            this.f4321c = this.f4319a.charAt(this.f4320b);
        } else {
            this.f4321c = '\u0000';
        }
    }

    boolean m3929b(char c) {
        return "&|<>=+/*%^!".indexOf(c) != -1;
    }

    boolean m3930b(String str) {
        String toUpperCase = str.toUpperCase();
        return (toUpperCase.equals("E") || toUpperCase.equals("PI")) ? false : true;
    }

    C0408k m3931c(String str) {
        return str.equals("&") ? C0408k.AND : str.equals("|") ? C0408k.OR : str.equals("<<") ? C0408k.BITSHIFTLEFT : str.equals(">>") ? C0408k.BITSHIFTRIGHT : str.equals("=") ? C0408k.EQUAL : str.equals("<>") ? C0408k.UNEQUAL : str.equals("<") ? C0408k.SMALLER : str.equals(">") ? C0408k.LARGER : str.equals("<=") ? C0408k.SMALLEREQ : str.equals(">=") ? C0408k.LARGEREQ : str.equals("+") ? C0408k.PLUS : str.equals("-") ? C0408k.MINUS : str.equals("*") ? C0408k.MULTIPLY : str.equals("/") ? C0408k.DIVIDE : str.equals("%") ? C0408k.MODULUS : str.equals("||") ? C0408k.XOR : str.equals("^") ? C0408k.POW : str.equals("!") ? C0408k.FACTORIAL : C0408k.UNKNOWN;
    }

    void m3932c() {
        this.f4323e = C0409l.NOTHING;
        this.f4322d = "";
        while (m3927a(this.f4321c)) {
            m3926a();
        }
        if (this.f4321c == '\u0000') {
            this.f4323e = C0409l.DELIMETER;
        } else if (this.f4321c == '-') {
            this.f4323e = C0409l.DELIMETER;
            this.f4322d += this.f4321c;
            m3926a();
        } else if (this.f4321c == '(' || this.f4321c == ')') {
            this.f4323e = C0409l.DELIMETER;
            this.f4322d += this.f4321c;
            m3926a();
        } else if (m3929b(this.f4321c)) {
            this.f4323e = C0409l.DELIMETER;
            while (m3929b(this.f4321c)) {
                this.f4322d += this.f4321c;
                m3926a();
            }
        } else if (m3936d(this.f4321c)) {
            this.f4323e = C0409l.NUMBER;
            while (m3936d(this.f4321c)) {
                this.f4322d += this.f4321c;
                m3926a();
            }
            if (this.f4321c == 'e' || this.f4321c == 'E') {
                this.f4322d += this.f4321c;
                m3926a();
                if (this.f4321c == '+' || this.f4321c == '-') {
                    this.f4322d += this.f4321c;
                    m3926a();
                }
                while (m3938e(this.f4321c)) {
                    this.f4322d += this.f4321c;
                    m3926a();
                }
            }
        } else if (m3933c(this.f4321c)) {
            while (true) {
                if (!m3933c(this.f4321c) && !m3938e(this.f4321c)) {
                    break;
                }
                this.f4322d += this.f4321c;
                m3926a();
            }
            while (m3927a(this.f4321c)) {
                m3926a();
            }
            if (this.f4321c == '(') {
                this.f4323e = C0409l.FUNCTION;
            } else {
                this.f4323e = C0409l.VARIABLE;
            }
        } else {
            this.f4323e = C0409l.UNKNOWN;
            while (this.f4321c != '\u0000') {
                this.f4322d += this.f4321c;
                m3926a();
            }
            throw new C0403f(m3948o(), m3949p(), 1, this.f4322d);
        }
    }

    boolean m3933c(char c) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ_".indexOf(Character.toUpperCase(c)) != -1;
    }

    double m3934d() {
        if (this.f4323e == C0409l.VARIABLE) {
            while (m3927a(this.f4321c)) {
                m3926a();
            }
            if (this.f4321c == '=') {
                String str = this.f4322d;
                m3932c();
                m3932c();
                double e = m3937e();
                if (m3930b(str)) {
                    this.f4325g.put(str.toUpperCase(), new Double(e));
                    return e;
                }
                throw new C0403f(m3948o(), m3949p(), 300);
            }
        }
        return m3937e();
    }

    double m3935d(String str) {
        String toUpperCase = str.toUpperCase();
        if (toUpperCase.equals("E")) {
            return 2.718281828459045d;
        }
        if (toUpperCase.equals("PI")) {
            return 3.141592653589793d;
        }
        if (this.f4325g.containsKey(toUpperCase)) {
            return ((Double) this.f4325g.get(toUpperCase)).doubleValue();
        }
        throw new C0403f(m3948o(), m3949p(), 103, str);
    }

    boolean m3936d(char c) {
        return "0123456789.".indexOf(c) != -1;
    }

    double m3937e() {
        double f = m3939f();
        C0408k c = m3931c(this.f4322d);
        while (true) {
            if (c != C0408k.AND && c != C0408k.OR && c != C0408k.BITSHIFTLEFT && c != C0408k.BITSHIFTRIGHT) {
                return f;
            }
            m3932c();
            f = m3923a(c, f, m3939f());
            c = m3931c(this.f4322d);
        }
    }

    boolean m3938e(char c) {
        return "0123456789".indexOf(c) != -1;
    }

    double m3939f() {
        double g = m3940g();
        C0408k c = m3931c(this.f4322d);
        while (true) {
            if (c != C0408k.EQUAL && c != C0408k.UNEQUAL && c != C0408k.SMALLER && c != C0408k.LARGER && c != C0408k.SMALLEREQ && c != C0408k.LARGEREQ) {
                return g;
            }
            m3932c();
            g = m3923a(c, g, m3940g());
            c = m3931c(this.f4322d);
        }
    }

    double m3940g() {
        double h = m3941h();
        C0408k c = m3931c(this.f4322d);
        while (true) {
            if (c != C0408k.PLUS && c != C0408k.MINUS) {
                return h;
            }
            m3932c();
            h = m3923a(c, h, m3941h());
            c = m3931c(this.f4322d);
        }
    }

    double m3941h() {
        double i = m3942i();
        C0408k c = m3931c(this.f4322d);
        while (true) {
            if (c != C0408k.MULTIPLY && c != C0408k.DIVIDE && c != C0408k.MODULUS && c != C0408k.XOR) {
                return i;
            }
            m3932c();
            i = m3923a(c, i, m3942i());
            c = m3931c(this.f4322d);
        }
    }

    double m3942i() {
        double j = m3943j();
        C0408k c = m3931c(this.f4322d);
        while (c == C0408k.POW) {
            m3932c();
            j = m3923a(c, j, m3943j());
            c = m3931c(this.f4322d);
        }
        return j;
    }

    double m3943j() {
        double k = m3944k();
        C0408k c = m3931c(this.f4322d);
        while (c == C0408k.FACTORIAL) {
            m3932c();
            k = m3923a(c, k, 0.0d);
            c = m3931c(this.f4322d);
        }
        return k;
    }

    double m3944k() {
        if (m3931c(this.f4322d) != C0408k.MINUS) {
            return m3945l();
        }
        m3932c();
        return -m3945l();
    }

    double m3945l() {
        if (this.f4323e != C0409l.FUNCTION) {
            return m3946m();
        }
        String str = this.f4322d;
        m3932c();
        return m3925a(str, m3946m());
    }

    double m3946m() {
        if (this.f4323e != C0409l.DELIMETER || !this.f4322d.equals("(")) {
            return m3947n();
        }
        m3932c();
        double e = m3937e();
        if (this.f4323e == C0409l.DELIMETER && this.f4322d.equals(")")) {
            m3932c();
            return e;
        }
        throw new C0403f(m3948o(), m3949p(), 3);
    }

    double m3947n() {
        double parseDouble;
        switch (C0407j.f4326a[this.f4323e.ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                parseDouble = Double.parseDouble(this.f4322d);
                m3932c();
                return parseDouble;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                parseDouble = m3935d(this.f4322d);
                m3932c();
                return parseDouble;
            default:
                if (this.f4322d.length() == 0) {
                    throw new C0403f(m3948o(), m3949p(), 6);
                }
                throw new C0403f(m3948o(), m3949p(), 7);
        }
    }

    int m3948o() {
        return -1;
    }

    int m3949p() {
        return (this.f4320b - this.f4322d.length()) + 1;
    }
}
