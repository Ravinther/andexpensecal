package com.google.p042a.p044b;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.a.b.f */
public class C0552f implements Closeable {
    private final Writer f5957a;
    private final List<C0550d> f5958b;
    private String f5959c;
    private String f5960d;
    private boolean f5961e;
    private boolean f5962f;
    private String f5963g;
    private boolean f5964h;

    public C0552f(Writer writer) {
        this.f5958b = new ArrayList();
        this.f5958b.add(C0550d.EMPTY_DOCUMENT);
        this.f5960d = ":";
        this.f5964h = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f5957a = writer;
    }

    private C0552f m4789a(C0550d c0550d, C0550d c0550d2, String str) {
        C0550d g = m4794g();
        if (g != c0550d2 && g != c0550d) {
            throw new IllegalStateException("Nesting problem: " + this.f5958b);
        } else if (this.f5963g != null) {
            throw new IllegalStateException("Dangling name: " + this.f5963g);
        } else {
            this.f5958b.remove(this.f5958b.size() - 1);
            if (g == c0550d2) {
                m4796i();
            }
            this.f5957a.write(str);
            return this;
        }
    }

    private C0552f m4790a(C0550d c0550d, String str) {
        m4792c(true);
        this.f5958b.add(c0550d);
        this.f5957a.write(str);
        return this;
    }

    private void m4791a(C0550d c0550d) {
        this.f5958b.set(this.f5958b.size() - 1, c0550d);
    }

    private void m4792c(boolean z) {
        switch (C0553g.f5965a[m4794g().ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (this.f5961e || z) {
                    m4791a(C0550d.NONEMPTY_DOCUMENT);
                    return;
                }
                throw new IllegalStateException("JSON must start with an array or an object.");
            case C0607c.LoadingImageView_circleCrop /*2*/:
                m4791a(C0550d.NONEMPTY_ARRAY);
                m4796i();
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f5957a.append(',');
                m4796i();
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                this.f5957a.append(this.f5960d);
                m4791a(C0550d.NONEMPTY_OBJECT);
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                throw new IllegalStateException("JSON must have only one top-level value.");
            default:
                throw new IllegalStateException("Nesting problem: " + this.f5958b);
        }
    }

    private void m4793d(String str) {
        this.f5957a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    this.f5957a.write("\\b");
                    break;
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    this.f5957a.write("\\t");
                    break;
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    this.f5957a.write("\\n");
                    break;
                case adv.TitlePageIndicator_selectedBold /*12*/:
                    this.f5957a.write("\\f");
                    break;
                case adv.TitlePageIndicator_titlePadding /*13*/:
                    this.f5957a.write("\\r");
                    break;
                case '\"':
                case '\\':
                    this.f5957a.write(92);
                    this.f5957a.write(charAt);
                    break;
                case '&':
                case '\'':
                case '<':
                case '=':
                case '>':
                    if (!this.f5962f) {
                        this.f5957a.write(charAt);
                        break;
                    }
                    this.f5957a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    break;
                case '\u2028':
                case '\u2029':
                    this.f5957a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    break;
                default:
                    if (charAt > '\u001f') {
                        this.f5957a.write(charAt);
                        break;
                    }
                    this.f5957a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    break;
            }
        }
        this.f5957a.write("\"");
    }

    private C0550d m4794g() {
        return (C0550d) this.f5958b.get(this.f5958b.size() - 1);
    }

    private void m4795h() {
        if (this.f5963g != null) {
            m4797j();
            m4793d(this.f5963g);
            this.f5963g = null;
        }
    }

    private void m4796i() {
        if (this.f5959c != null) {
            this.f5957a.write("\n");
            for (int i = 1; i < this.f5958b.size(); i++) {
                this.f5957a.write(this.f5959c);
            }
        }
    }

    private void m4797j() {
        C0550d g = m4794g();
        if (g == C0550d.NONEMPTY_OBJECT) {
            this.f5957a.write(44);
        } else if (g != C0550d.EMPTY_OBJECT) {
            throw new IllegalStateException("Nesting problem: " + this.f5958b);
        }
        m4796i();
        m4791a(C0550d.DANGLING_NAME);
    }

    public C0552f m4798a() {
        m4795h();
        return m4790a(C0550d.EMPTY_ARRAY, "[");
    }

    public C0552f m4799a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m4795h();
        m4792c(false);
        this.f5957a.append(Double.toString(d));
        return this;
    }

    public C0552f m4800a(long j) {
        m4795h();
        m4792c(false);
        this.f5957a.write(Long.toString(j));
        return this;
    }

    public C0552f m4801a(Number number) {
        if (number == null) {
            return m4810e();
        }
        m4795h();
        CharSequence obj = number.toString();
        if (this.f5961e || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            m4792c(false);
            this.f5957a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void m4802a(String str) {
        if (str.length() == 0) {
            this.f5959c = null;
            this.f5960d = ":";
            return;
        }
        this.f5959c = str;
        this.f5960d = ": ";
    }

    public final void m4803a(boolean z) {
        this.f5961e = z;
    }

    public C0552f m4804b() {
        return m4789a(C0550d.EMPTY_ARRAY, C0550d.NONEMPTY_ARRAY, "]");
    }

    public C0552f m4805b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f5963g != null) {
            throw new IllegalStateException();
        } else {
            this.f5963g = str;
            return this;
        }
    }

    public C0552f m4806b(boolean z) {
        m4795h();
        m4792c(false);
        this.f5957a.write(z ? "true" : "false");
        return this;
    }

    public C0552f m4807c() {
        m4795h();
        return m4790a(C0550d.EMPTY_OBJECT, "{");
    }

    public C0552f m4808c(String str) {
        if (str == null) {
            return m4810e();
        }
        m4795h();
        m4792c(false);
        m4793d(str);
        return this;
    }

    public void close() {
        this.f5957a.close();
        if (m4794g() != C0550d.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    public C0552f m4809d() {
        return m4789a(C0550d.EMPTY_OBJECT, C0550d.NONEMPTY_OBJECT, "}");
    }

    public C0552f m4810e() {
        if (this.f5963g != null) {
            if (this.f5964h) {
                m4795h();
            } else {
                this.f5963g = null;
                return this;
            }
        }
        m4792c(false);
        this.f5957a.write("null");
        return this;
    }

    public void m4811f() {
        this.f5957a.flush();
    }
}
