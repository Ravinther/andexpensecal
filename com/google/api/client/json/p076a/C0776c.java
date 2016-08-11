package com.google.api.client.json.p076a;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0775h;
import com.google.api.client.json.C0783k;
import com.google.api.client.p050d.am;
import com.google.p042a.p044b.C0547a;
import com.google.p042a.p044b.C0551e;
import java.io.EOFException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.api.client.json.a.c */
class C0776c extends C0775h {
    private final C0547a f7731a;
    private final C0772a f7732b;
    private List<String> f7733c;
    private C0783k f7734d;
    private String f7735e;

    C0776c(C0772a c0772a, C0547a c0547a) {
        this.f7733c = new ArrayList();
        this.f7732b = c0772a;
        this.f7731a = c0547a;
        c0547a.m4779a(true);
    }

    private void m7124p() {
        boolean z = this.f7734d == C0783k.VALUE_NUMBER_INT || this.f7734d == C0783k.VALUE_NUMBER_FLOAT;
        am.m6914a(z);
    }

    public C0771d m7125a() {
        return this.f7732b;
    }

    public void m7126b() {
        this.f7731a.close();
    }

    public C0783k m7127c() {
        C0551e e;
        if (this.f7734d != null) {
            switch (C0777d.f7736a[this.f7734d.ordinal()]) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    this.f7731a.m4778a();
                    this.f7733c.add(null);
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    this.f7731a.m4781c();
                    this.f7733c.add(null);
                    break;
            }
        }
        try {
            e = this.f7731a.m4783e();
        } catch (EOFException e2) {
            e = C0551e.END_DOCUMENT;
        }
        switch (C0777d.f7737b[e.ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f7735e = "[";
                this.f7734d = C0783k.START_ARRAY;
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f7735e = "]";
                this.f7734d = C0783k.END_ARRAY;
                this.f7733c.remove(this.f7733c.size() - 1);
                this.f7731a.m4780b();
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f7735e = "{";
                this.f7734d = C0783k.START_OBJECT;
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                this.f7735e = "}";
                this.f7734d = C0783k.END_OBJECT;
                this.f7733c.remove(this.f7733c.size() - 1);
                this.f7731a.m4782d();
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                if (!this.f7731a.m4786h()) {
                    this.f7735e = "false";
                    this.f7734d = C0783k.VALUE_FALSE;
                    break;
                }
                this.f7735e = "true";
                this.f7734d = C0783k.VALUE_TRUE;
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                this.f7735e = "null";
                this.f7734d = C0783k.VALUE_NULL;
                this.f7731a.m4787i();
                break;
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                this.f7735e = this.f7731a.m4785g();
                this.f7734d = C0783k.VALUE_STRING;
                break;
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                this.f7735e = this.f7731a.m4785g();
                this.f7734d = this.f7735e.indexOf(46) == -1 ? C0783k.VALUE_NUMBER_INT : C0783k.VALUE_NUMBER_FLOAT;
                break;
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                this.f7735e = this.f7731a.m4784f();
                this.f7734d = C0783k.FIELD_NAME;
                this.f7733c.set(this.f7733c.size() - 1, this.f7735e);
                break;
            default:
                this.f7735e = null;
                this.f7734d = null;
                break;
        }
        return this.f7734d;
    }

    public C0783k m7128d() {
        return this.f7734d;
    }

    public String m7129e() {
        return this.f7733c.isEmpty() ? null : (String) this.f7733c.get(this.f7733c.size() - 1);
    }

    public C0775h m7130f() {
        if (this.f7734d != null) {
            switch (C0777d.f7736a[this.f7734d.ordinal()]) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    this.f7731a.m4788j();
                    this.f7735e = "]";
                    this.f7734d = C0783k.END_ARRAY;
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    this.f7731a.m4788j();
                    this.f7735e = "}";
                    this.f7734d = C0783k.END_OBJECT;
                    break;
            }
        }
        return this;
    }

    public String m7131g() {
        return this.f7735e;
    }

    public byte m7132h() {
        m7124p();
        return Byte.valueOf(this.f7735e).byteValue();
    }

    public short m7133i() {
        m7124p();
        return Short.valueOf(this.f7735e).shortValue();
    }

    public int m7134j() {
        m7124p();
        return Integer.valueOf(this.f7735e).intValue();
    }

    public float m7135k() {
        m7124p();
        return Float.valueOf(this.f7735e).floatValue();
    }

    public long m7136l() {
        m7124p();
        return Long.valueOf(this.f7735e).longValue();
    }

    public double m7137m() {
        m7124p();
        return Double.valueOf(this.f7735e).doubleValue();
    }

    public BigInteger m7138n() {
        m7124p();
        return new BigInteger(this.f7735e);
    }

    public BigDecimal m7139o() {
        m7124p();
        return new BigDecimal(this.f7735e);
    }
}
