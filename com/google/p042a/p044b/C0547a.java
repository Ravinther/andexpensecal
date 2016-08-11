package com.google.p042a.p044b;

import com.expensemanager.adv;
import com.google.ads.AdSize;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.p042a.p043a.C0546a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.a.b.a */
public class C0547a implements Closeable {
    private static final char[] f5919a;
    private final C0555i f5920b;
    private final Reader f5921c;
    private boolean f5922d;
    private final char[] f5923e;
    private int f5924f;
    private int f5925g;
    private int f5926h;
    private int f5927i;
    private C0550d[] f5928j;
    private int f5929k;
    private C0551e f5930l;
    private String f5931m;
    private String f5932n;
    private int f5933o;
    private int f5934p;
    private boolean f5935q;

    static {
        f5919a = ")]}'\n".toCharArray();
        C0546a.f5918a = new C0548b();
    }

    public C0547a(Reader reader) {
        this.f5920b = new C0555i();
        this.f5922d = false;
        this.f5923e = new char[1024];
        this.f5924f = 0;
        this.f5925g = 0;
        this.f5926h = 1;
        this.f5927i = 1;
        this.f5928j = new C0550d[32];
        this.f5929k = 0;
        m4757a(C0550d.EMPTY_DOCUMENT);
        this.f5935q = false;
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f5921c = reader;
    }

    private C0551e m4755a(char[] cArr, int i, int i2) {
        int i3;
        char c = cArr[i];
        if (c == '-') {
            i3 = i + 1;
            c = cArr[i3];
        } else {
            i3 = i;
        }
        if (c == '0') {
            i3++;
            c = cArr[i3];
        } else if (c < '1' || c > '9') {
            return C0551e.STRING;
        } else {
            i3++;
            c = cArr[i3];
            while (c >= '0' && c <= '9') {
                i3++;
                c = cArr[i3];
            }
        }
        if (c == '.') {
            i3++;
            c = cArr[i3];
            while (c >= '0' && c <= '9') {
                i3++;
                c = cArr[i3];
            }
        }
        char c2 = c;
        int i4 = i3;
        char c3 = c2;
        if (c3 == 'e' || c3 == 'E') {
            i3 = i4 + 1;
            c = cArr[i3];
            if (c == '+' || c == '-') {
                i3++;
                c = cArr[i3];
            }
            if (c < '0' || c > '9') {
                return C0551e.STRING;
            }
            i3++;
            i4 = i3;
            c3 = cArr[i3];
            while (c3 >= '0' && c3 <= '9') {
                i3 = i4 + 1;
                i4 = i3;
                c3 = cArr[i3];
            }
        }
        return i4 == i + i2 ? C0551e.NUMBER : C0551e.STRING;
    }

    private String m4756a(char c) {
        char[] cArr = this.f5923e;
        StringBuilder stringBuilder = null;
        do {
            int i = this.f5924f;
            int i2 = this.f5925g;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.f5924f = i4;
                    if (this.f5935q) {
                        return "skipped!";
                    }
                    if (stringBuilder == null) {
                        return this.f5920b.m4812a(cArr, i, (i4 - i) - 1);
                    }
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    return stringBuilder.toString();
                }
                StringBuilder stringBuilder2;
                int i5;
                int i6;
                if (c2 == '\\') {
                    this.f5924f = i4;
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder();
                    }
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    stringBuilder.append(m4774s());
                    i = this.f5924f;
                    stringBuilder2 = stringBuilder;
                    i5 = i;
                    i6 = i;
                    i = this.f5925g;
                    i2 = i6;
                } else {
                    i6 = i;
                    i = i2;
                    i2 = i4;
                    stringBuilder2 = stringBuilder;
                    i5 = i6;
                }
                i3 = i2;
                i2 = i;
                i = i5;
                stringBuilder = stringBuilder2;
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(cArr, i, i3 - i);
            this.f5924f = i3;
        } while (m4759a(1));
        throw m4762b("Unterminated string");
    }

    private void m4757a(C0550d c0550d) {
        if (this.f5929k == this.f5928j.length) {
            Object obj = new C0550d[(this.f5929k * 2)];
            System.arraycopy(this.f5928j, 0, obj, 0, this.f5929k);
            this.f5928j = obj;
        }
        C0550d[] c0550dArr = this.f5928j;
        int i = this.f5929k;
        this.f5929k = i + 1;
        c0550dArr[i] = c0550d;
    }

    private void m4758a(C0551e c0551e) {
        m4783e();
        if (this.f5930l != c0551e) {
            throw new IllegalStateException("Expected " + c0551e + " but was " + m4783e() + " at line " + m4770o() + " column " + m4771p());
        }
        m4767l();
    }

    private boolean m4759a(int i) {
        Object obj = this.f5923e;
        int i2 = this.f5926h;
        int i3 = this.f5927i;
        int i4 = this.f5924f;
        for (int i5 = 0; i5 < i4; i5++) {
            if (obj[i5] == '\n') {
                i2++;
                i3 = 1;
            } else {
                i3++;
            }
        }
        this.f5926h = i2;
        this.f5927i = i3;
        if (this.f5925g != this.f5924f) {
            this.f5925g -= this.f5924f;
            System.arraycopy(obj, this.f5924f, obj, 0, this.f5925g);
        } else {
            this.f5925g = 0;
        }
        this.f5924f = 0;
        do {
            i3 = this.f5921c.read(obj, this.f5925g, obj.length - this.f5925g);
            if (i3 == -1) {
                return false;
            }
            this.f5925g = i3 + this.f5925g;
            if (this.f5926h == 1 && this.f5927i == 1 && this.f5925g > 0 && obj[0] == '\ufeff') {
                this.f5924f++;
                this.f5927i--;
            }
        } while (this.f5925g < i);
        return true;
    }

    private boolean m4760a(String str) {
        while (true) {
            if (this.f5924f + str.length() > this.f5925g && !m4759a(str.length())) {
                return false;
            }
            int i = 0;
            while (i < str.length()) {
                if (this.f5923e[this.f5924f + i] != str.charAt(i)) {
                    this.f5924f++;
                } else {
                    i++;
                }
            }
            return true;
        }
    }

    private C0551e m4761b(boolean z) {
        C0551e c0551e;
        if (z) {
            this.f5928j[this.f5929k - 1] = C0550d.NONEMPTY_ARRAY;
        } else {
            switch (m4764d(true)) {
                case 44:
                    break;
                case 59:
                    m4772q();
                    break;
                case 93:
                    this.f5929k--;
                    c0551e = C0551e.END_ARRAY;
                    this.f5930l = c0551e;
                    return c0551e;
                default:
                    throw m4762b("Unterminated array");
            }
        }
        switch (m4764d(true)) {
            case 44:
            case 59:
                break;
            case 93:
                if (z) {
                    this.f5929k--;
                    c0551e = C0551e.END_ARRAY;
                    this.f5930l = c0551e;
                    return c0551e;
                }
                break;
            default:
                this.f5924f--;
                return m4769n();
        }
        m4772q();
        this.f5924f--;
        this.f5932n = "null";
        c0551e = C0551e.NULL;
        this.f5930l = c0551e;
        return c0551e;
    }

    private IOException m4762b(String str) {
        throw new C0554h(str + " at line " + m4770o() + " column " + m4771p());
    }

    private C0551e m4763c(boolean z) {
        C0551e c0551e;
        if (z) {
            switch (m4764d(true)) {
                case 125:
                    this.f5929k--;
                    c0551e = C0551e.END_OBJECT;
                    this.f5930l = c0551e;
                    return c0551e;
                default:
                    this.f5924f--;
                    break;
            }
        }
        switch (m4764d(true)) {
            case 44:
            case 59:
                break;
            case 125:
                this.f5929k--;
                c0551e = C0551e.END_OBJECT;
                this.f5930l = c0551e;
                return c0551e;
            default:
                throw m4762b("Unterminated object");
        }
        int d = m4764d(true);
        switch (d) {
            case 34:
                break;
            case 39:
                m4772q();
                break;
            default:
                m4772q();
                this.f5924f--;
                this.f5931m = m4765e(false);
                if (this.f5931m.length() == 0) {
                    throw m4762b("Expected name");
                }
                break;
        }
        this.f5931m = m4756a((char) d);
        this.f5928j[this.f5929k - 1] = C0550d.DANGLING_NAME;
        c0551e = C0551e.NAME;
        this.f5930l = c0551e;
        return c0551e;
    }

    private int m4764d(boolean z) {
        char[] cArr = this.f5923e;
        int i = this.f5924f;
        int i2 = this.f5925g;
        while (true) {
            if (i == i2) {
                this.f5924f = i;
                if (m4759a(1)) {
                    i = this.f5924f;
                    i2 = this.f5925g;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input at line " + m4770o() + " column " + m4771p());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            switch (c) {
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                case adv.TitlePageIndicator_footerPadding /*10*/:
                case adv.TitlePageIndicator_titlePadding /*13*/:
                case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                    i = i3;
                    break;
                case '#':
                    this.f5924f = i3;
                    m4772q();
                    m4773r();
                    i = this.f5924f;
                    i2 = this.f5925g;
                    break;
                case '/':
                    this.f5924f = i3;
                    if (i3 == i2 && !m4759a(1)) {
                        return c;
                    }
                    m4772q();
                    switch (cArr[this.f5924f]) {
                        case '*':
                            this.f5924f++;
                            if (m4760a("*/")) {
                                i = this.f5924f + 2;
                                i2 = this.f5925g;
                                break;
                            }
                            throw m4762b("Unterminated comment");
                        case '/':
                            this.f5924f++;
                            m4773r();
                            i = this.f5924f;
                            i2 = this.f5925g;
                            break;
                        default:
                            return c;
                    }
                default:
                    this.f5924f = i3;
                    return c;
            }
        }
    }

    private String m4765e(boolean z) {
        String str = null;
        this.f5933o = -1;
        this.f5934p = 0;
        int i = 0;
        StringBuilder stringBuilder = null;
        while (true) {
            if (this.f5924f + i < this.f5925g) {
                switch (this.f5923e[this.f5924f + i]) {
                    case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    case adv.TitlePageIndicator_footerPadding /*10*/:
                    case adv.TitlePageIndicator_selectedBold /*12*/:
                    case adv.TitlePageIndicator_titlePadding /*13*/:
                    case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m4772q();
                        break;
                    default:
                        i++;
                        continue;
                }
            } else if (i >= this.f5923e.length) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.f5923e, this.f5924f, i);
                this.f5934p += i;
                this.f5924f = i + this.f5924f;
                i = !m4759a(1) ? 0 : 0;
            } else if (!m4759a(i + 1)) {
                this.f5923e[this.f5925g] = '\u0000';
            }
            if (z && stringBuilder == null) {
                this.f5933o = this.f5924f;
            } else if (this.f5935q) {
                str = "skipped!";
            } else if (stringBuilder == null) {
                str = this.f5920b.m4812a(this.f5923e, this.f5924f, i);
            } else {
                stringBuilder.append(this.f5923e, this.f5924f, i);
                str = stringBuilder.toString();
            }
            this.f5934p += i;
            this.f5924f += i;
            return str;
        }
    }

    private void m4766k() {
        m4764d(true);
        this.f5924f--;
        if (this.f5924f + f5919a.length <= this.f5925g || m4759a(f5919a.length)) {
            int i = 0;
            while (i < f5919a.length) {
                if (this.f5923e[this.f5924f + i] == f5919a[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.f5924f += f5919a.length;
        }
    }

    private C0551e m4767l() {
        m4783e();
        C0551e c0551e = this.f5930l;
        this.f5930l = null;
        this.f5932n = null;
        this.f5931m = null;
        return c0551e;
    }

    private C0551e m4768m() {
        switch (m4764d(true)) {
            case 58:
                break;
            case 61:
                m4772q();
                if ((this.f5924f < this.f5925g || m4759a(1)) && this.f5923e[this.f5924f] == '>') {
                    this.f5924f++;
                    break;
                }
            default:
                throw m4762b("Expected ':'");
        }
        this.f5928j[this.f5929k - 1] = C0550d.NONEMPTY_OBJECT;
        return m4769n();
    }

    private C0551e m4769n() {
        C0551e c0551e;
        int d = m4764d(true);
        switch (d) {
            case 34:
                break;
            case 39:
                m4772q();
                break;
            case 91:
                m4757a(C0550d.EMPTY_ARRAY);
                c0551e = C0551e.BEGIN_ARRAY;
                this.f5930l = c0551e;
                return c0551e;
            case 123:
                m4757a(C0550d.EMPTY_OBJECT);
                c0551e = C0551e.BEGIN_OBJECT;
                this.f5930l = c0551e;
                return c0551e;
            default:
                this.f5924f--;
                return m4775t();
        }
        this.f5932n = m4756a((char) d);
        c0551e = C0551e.STRING;
        this.f5930l = c0551e;
        return c0551e;
    }

    private int m4770o() {
        int i = this.f5926h;
        for (int i2 = 0; i2 < this.f5924f; i2++) {
            if (this.f5923e[i2] == '\n') {
                i++;
            }
        }
        return i;
    }

    private int m4771p() {
        int i = this.f5927i;
        for (int i2 = 0; i2 < this.f5924f; i2++) {
            i = this.f5923e[i2] == '\n' ? 1 : i + 1;
        }
        return i;
    }

    private void m4772q() {
        if (!this.f5922d) {
            throw m4762b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void m4773r() {
        char c;
        do {
            if (this.f5924f < this.f5925g || m4759a(1)) {
                char[] cArr = this.f5923e;
                int i = this.f5924f;
                this.f5924f = i + 1;
                c = cArr[i];
                if (c == '\r') {
                    return;
                }
            } else {
                return;
            }
        } while (c != '\n');
    }

    private char m4774s() {
        if (this.f5924f != this.f5925g || m4759a(1)) {
            char[] cArr = this.f5923e;
            int i = this.f5924f;
            this.f5924f = i + 1;
            char c = cArr[i];
            switch (c) {
                case 'b':
                    return '\b';
                case 'f':
                    return '\f';
                case 'n':
                    return '\n';
                case 'r':
                    return '\r';
                case 't':
                    return '\t';
                case 'u':
                    if (this.f5924f + 4 <= this.f5925g || m4759a(4)) {
                        int i2 = this.f5924f;
                        int i3 = i2 + 4;
                        int i4 = i2;
                        c = '\u0000';
                        for (i = i4; i < i3; i++) {
                            char c2 = this.f5923e[i];
                            c = (char) (c << 4);
                            if (c2 >= '0' && c2 <= '9') {
                                c = (char) (c + (c2 - 48));
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                c = (char) (c + ((c2 - 97) + 10));
                            } else if (c2 < 'A' || c2 > 'F') {
                                throw new NumberFormatException("\\u" + this.f5920b.m4812a(this.f5923e, this.f5924f, 4));
                            } else {
                                c = (char) (c + ((c2 - 65) + 10));
                            }
                        }
                        this.f5924f += 4;
                        return c;
                    }
                    throw m4762b("Unterminated escape sequence");
                default:
                    return c;
            }
        }
        throw m4762b("Unterminated escape sequence");
    }

    private C0551e m4775t() {
        this.f5932n = m4765e(true);
        if (this.f5934p == 0) {
            throw m4762b("Expected literal value");
        }
        this.f5930l = m4776u();
        if (this.f5930l == C0551e.STRING) {
            m4772q();
        }
        return this.f5930l;
    }

    private C0551e m4776u() {
        if (this.f5933o == -1) {
            return C0551e.STRING;
        }
        if (this.f5934p == 4 && (('n' == this.f5923e[this.f5933o] || 'N' == this.f5923e[this.f5933o]) && (('u' == this.f5923e[this.f5933o + 1] || 'U' == this.f5923e[this.f5933o + 1]) && (('l' == this.f5923e[this.f5933o + 2] || 'L' == this.f5923e[this.f5933o + 2]) && ('l' == this.f5923e[this.f5933o + 3] || 'L' == this.f5923e[this.f5933o + 3]))))) {
            this.f5932n = "null";
            return C0551e.NULL;
        } else if (this.f5934p == 4 && (('t' == this.f5923e[this.f5933o] || 'T' == this.f5923e[this.f5933o]) && (('r' == this.f5923e[this.f5933o + 1] || 'R' == this.f5923e[this.f5933o + 1]) && (('u' == this.f5923e[this.f5933o + 2] || 'U' == this.f5923e[this.f5933o + 2]) && ('e' == this.f5923e[this.f5933o + 3] || 'E' == this.f5923e[this.f5933o + 3]))))) {
            this.f5932n = "true";
            return C0551e.BOOLEAN;
        } else if (this.f5934p == 5 && (('f' == this.f5923e[this.f5933o] || 'F' == this.f5923e[this.f5933o]) && (('a' == this.f5923e[this.f5933o + 1] || 'A' == this.f5923e[this.f5933o + 1]) && (('l' == this.f5923e[this.f5933o + 2] || 'L' == this.f5923e[this.f5933o + 2]) && (('s' == this.f5923e[this.f5933o + 3] || 'S' == this.f5923e[this.f5933o + 3]) && ('e' == this.f5923e[this.f5933o + 4] || 'E' == this.f5923e[this.f5933o + 4])))))) {
            this.f5932n = "false";
            return C0551e.BOOLEAN;
        } else {
            this.f5932n = this.f5920b.m4812a(this.f5923e, this.f5933o, this.f5934p);
            return m4755a(this.f5923e, this.f5933o, this.f5934p);
        }
    }

    private CharSequence m4777v() {
        CharSequence stringBuilder = new StringBuilder();
        int min = Math.min(this.f5924f, 20);
        stringBuilder.append(this.f5923e, this.f5924f - min, min);
        stringBuilder.append(this.f5923e, this.f5924f, Math.min(this.f5925g - this.f5924f, 20));
        return stringBuilder;
    }

    public void m4778a() {
        m4758a(C0551e.BEGIN_ARRAY);
    }

    public final void m4779a(boolean z) {
        this.f5922d = z;
    }

    public void m4780b() {
        m4758a(C0551e.END_ARRAY);
    }

    public void m4781c() {
        m4758a(C0551e.BEGIN_OBJECT);
    }

    public void close() {
        this.f5932n = null;
        this.f5930l = null;
        this.f5928j[0] = C0550d.CLOSED;
        this.f5929k = 1;
        this.f5921c.close();
    }

    public void m4782d() {
        m4758a(C0551e.END_OBJECT);
    }

    public C0551e m4783e() {
        if (this.f5930l != null) {
            return this.f5930l;
        }
        switch (C0549c.f5936a[this.f5928j[this.f5929k - 1].ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (this.f5922d) {
                    m4766k();
                }
                this.f5928j[this.f5929k - 1] = C0550d.NONEMPTY_DOCUMENT;
                C0551e n = m4769n();
                if (this.f5922d || this.f5930l == C0551e.BEGIN_ARRAY || this.f5930l == C0551e.BEGIN_OBJECT) {
                    return n;
                }
                throw new IOException("Expected JSON document to start with '[' or '{' but was " + this.f5930l + " at line " + m4770o() + " column " + m4771p());
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return m4761b(true);
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                return m4761b(false);
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                return m4763c(true);
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                return m4768m();
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                return m4763c(false);
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                if (m4764d(false) == -1) {
                    return C0551e.END_DOCUMENT;
                }
                this.f5924f--;
                if (this.f5922d) {
                    return m4769n();
                }
                throw m4762b("Expected EOF");
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    public String m4784f() {
        m4783e();
        if (this.f5930l != C0551e.NAME) {
            throw new IllegalStateException("Expected a name but was " + m4783e() + " at line " + m4770o() + " column " + m4771p());
        }
        String str = this.f5931m;
        m4767l();
        return str;
    }

    public String m4785g() {
        m4783e();
        if (this.f5930l == C0551e.STRING || this.f5930l == C0551e.NUMBER) {
            String str = this.f5932n;
            m4767l();
            return str;
        }
        throw new IllegalStateException("Expected a string but was " + m4783e() + " at line " + m4770o() + " column " + m4771p());
    }

    public boolean m4786h() {
        m4783e();
        if (this.f5930l != C0551e.BOOLEAN) {
            throw new IllegalStateException("Expected a boolean but was " + this.f5930l + " at line " + m4770o() + " column " + m4771p());
        }
        boolean z = this.f5932n == "true";
        m4767l();
        return z;
    }

    public void m4787i() {
        m4783e();
        if (this.f5930l != C0551e.NULL) {
            throw new IllegalStateException("Expected null but was " + this.f5930l + " at line " + m4770o() + " column " + m4771p());
        }
        m4767l();
    }

    public void m4788j() {
        this.f5935q = true;
        int i = 0;
        while (true) {
            try {
                C0551e l = m4767l();
                if (l == C0551e.BEGIN_ARRAY || l == C0551e.BEGIN_OBJECT) {
                    i++;
                    continue;
                } else if (l == C0551e.END_ARRAY || l == C0551e.END_OBJECT) {
                    i--;
                    continue;
                }
                if (i == 0) {
                    break;
                }
            } finally {
                this.f5935q = false;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + " near " + m4777v();
    }
}
