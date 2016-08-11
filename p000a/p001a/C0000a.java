package p000a.p001a;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: a.a.a */
public final class C0000a implements Serializable, Comparable<C0000a> {
    private static int f0k;
    private String f1a;
    private Integer f2b;
    private Integer f3c;
    private Integer f4d;
    private Integer f5e;
    private Integer f6f;
    private Integer f7g;
    private Integer f8h;
    private boolean f9i;
    private int f10j;

    static {
        f0k = 2400000;
    }

    public C0000a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f9i = true;
        this.f2b = num;
        this.f3c = num2;
        this.f4d = num3;
        this.f5e = num4;
        this.f6f = num5;
        this.f7g = num6;
        this.f8h = num7;
        m14o();
    }

    static C0000a m0a(int i) {
        int i2 = 68569 + i;
        int i3 = (i2 * 4) / 146097;
        i2 -= ((146097 * i3) + 3) / 4;
        int i4 = ((i2 + 1) * 4000) / 1461001;
        i2 = (i2 - ((i4 * 1461) / 4)) + 31;
        int i5 = (i2 * 80) / 2447;
        i2 -= (i5 * 2447) / 80;
        int i6 = i5 / 11;
        return C0000a.m2a(Integer.valueOf((((i3 - 49) * 100) + i4) + i6), Integer.valueOf((i5 + 2) - (i6 * 12)), Integer.valueOf(i2));
    }

    public static C0000a m1a(long j, TimeZone timeZone) {
        Calendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTimeInMillis(j);
        return new C0000a(Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13)), Integer.valueOf((gregorianCalendar.get(14) * 1000) * 1000));
    }

    public static C0000a m2a(Integer num, Integer num2, Integer num3) {
        return new C0000a(num, num2, num3, null, null, null, null);
    }

    public static C0000a m3a(TimeZone timeZone) {
        return C0000a.m1a(System.currentTimeMillis(), timeZone);
    }

    static Integer m4a(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return null;
        }
        if (num2.intValue() == 1) {
            return Integer.valueOf(31);
        }
        if (num2.intValue() == 2) {
            return Integer.valueOf(C0000a.m10c(num) ? 29 : 28);
        } else if (num2.intValue() == 3) {
            return Integer.valueOf(31);
        } else {
            if (num2.intValue() == 4) {
                return Integer.valueOf(30);
            }
            if (num2.intValue() == 5) {
                return Integer.valueOf(31);
            }
            if (num2.intValue() == 6) {
                return Integer.valueOf(30);
            }
            if (num2.intValue() == 7) {
                return Integer.valueOf(31);
            }
            if (num2.intValue() == 8) {
                return Integer.valueOf(31);
            }
            if (num2.intValue() == 9) {
                return Integer.valueOf(30);
            }
            if (num2.intValue() == 10) {
                return Integer.valueOf(31);
            }
            if (num2.intValue() == 11) {
                return Integer.valueOf(30);
            }
            if (num2.intValue() == 12) {
                return Integer.valueOf(31);
            }
            throw new AssertionError("Month is out of range 1..12:" + num2);
        }
    }

    private void m5a(Integer num, int i, int i2, String str) {
        if (num == null) {
            return;
        }
        if (num.intValue() < i || num.intValue() > i2) {
            throw new C0002c(str + " is not in the range " + i + ".." + i2 + ". Value is:" + num);
        }
    }

    private void m6a(String str, Object obj, StringBuilder stringBuilder) {
        stringBuilder.append(str + ":" + String.valueOf(obj) + " ");
    }

    private boolean m7a(Object... objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static C0000a m8b(TimeZone timeZone) {
        return C0000a.m3a(timeZone).m18a(C0004e.DAY);
    }

    private void m9b(Integer num, Integer num2, Integer num3) {
        if (m11c(num, num2, num3) && num3.intValue() > C0000a.m4a(num, num2).intValue()) {
            throw new C0002c("The day-of-the-month value '" + num3 + "' exceeds the number of days in the month: " + C0000a.m4a(num, num2));
        }
    }

    private static boolean m10c(Integer num) {
        if (num.intValue() % 100 == 0) {
            if (num.intValue() % 400 == 0) {
                return true;
            }
        } else if (num.intValue() % 4 == 0) {
            return true;
        }
        return false;
    }

    private boolean m11c(Integer num, Integer num2, Integer num3) {
        return m7a(num, num2, num3);
    }

    private int m12m() {
        int intValue = this.f2b.intValue();
        int intValue2 = this.f3c.intValue();
        return (((((((intValue + 4800) + ((intValue2 - 14) / 12)) * 1461) / 4) + ((((intValue2 - 2) - (((intValue2 - 14) / 12) * 12)) * 367) / 12)) - (((((intValue + 4900) + ((intValue2 - 14) / 12)) / 100) * 3) / 4)) + this.f4d.intValue()) - 32075;
    }

    private void m13n() {
        m40l();
        if (!m39k()) {
            throw new C0003d("DateTime does not include year/month/day.");
        }
    }

    private void m14o() {
        m5a(this.f2b, 1, 9999, "Year");
        m5a(this.f3c, 1, 12, "Month");
        m5a(this.f4d, 1, 31, "Day");
        m5a(this.f5e, 0, 23, "Hour");
        m5a(this.f6f, 0, 59, "Minute");
        m5a(this.f7g, 0, 59, "Second");
        m5a(this.f8h, 0, 999999999, "Nanosecond");
        m9b(this.f2b, this.f3c, this.f4d);
    }

    private void m15p() {
        C0000a a = new C0011l().m96a(this.f1a);
        this.f2b = a.f2b;
        this.f3c = a.f3c;
        this.f4d = a.f4d;
        this.f5e = a.f5e;
        this.f6f = a.f6f;
        this.f7g = a.f7g;
        this.f8h = a.f8h;
        m14o();
    }

    private Object[] m16q() {
        return new Object[]{this.f2b, this.f3c, this.f4d, this.f5e, this.f6f, this.f7g, this.f8h};
    }

    private String m17r() {
        if (m24a(C0004e.YEAR)) {
            if (m29b(C0004e.MONTH, C0004e.DAY, C0004e.HOUR, C0004e.MINUTE, C0004e.SECOND, C0004e.NANOSECONDS)) {
                return "YYYY";
            }
        }
        if (m24a(C0004e.YEAR, C0004e.MONTH)) {
            if (m29b(C0004e.DAY, C0004e.HOUR, C0004e.MINUTE, C0004e.SECOND, C0004e.NANOSECONDS)) {
                return "YYYY-MM";
            }
        }
        if (m24a(C0004e.YEAR, C0004e.MONTH, C0004e.DAY)) {
            if (m29b(C0004e.HOUR, C0004e.MINUTE, C0004e.SECOND, C0004e.NANOSECONDS)) {
                return "YYYY-MM-DD";
            }
        }
        if (m24a(C0004e.YEAR, C0004e.MONTH, C0004e.DAY, C0004e.HOUR)) {
            if (m29b(C0004e.MINUTE, C0004e.SECOND, C0004e.NANOSECONDS)) {
                return "YYYY-MM-DD hh";
            }
        }
        if (m24a(C0004e.YEAR, C0004e.MONTH, C0004e.DAY, C0004e.HOUR, C0004e.MINUTE)) {
            if (m29b(C0004e.SECOND, C0004e.NANOSECONDS)) {
                return "YYYY-MM-DD hh:mm";
            }
        }
        if (m24a(C0004e.YEAR, C0004e.MONTH, C0004e.DAY, C0004e.HOUR, C0004e.MINUTE, C0004e.SECOND)) {
            if (m29b(C0004e.NANOSECONDS)) {
                return "YYYY-MM-DD hh:mm:ss";
            }
        }
        if (m24a(C0004e.YEAR, C0004e.MONTH, C0004e.DAY, C0004e.HOUR, C0004e.MINUTE, C0004e.SECOND, C0004e.NANOSECONDS)) {
            return "YYYY-MM-DD hh:mm:ss.fffffffff";
        }
        if (m29b(C0004e.YEAR, C0004e.MONTH, C0004e.DAY)) {
            if (m24a(C0004e.HOUR, C0004e.MINUTE, C0004e.SECOND, C0004e.NANOSECONDS)) {
                return "hh:mm:ss.fffffffff";
            }
        }
        if (m29b(C0004e.YEAR, C0004e.MONTH, C0004e.DAY, C0004e.NANOSECONDS)) {
            if (m24a(C0004e.HOUR, C0004e.MINUTE, C0004e.SECOND)) {
                return "hh:mm:ss";
            }
        }
        if (!m29b(C0004e.YEAR, C0004e.MONTH, C0004e.DAY, C0004e.SECOND, C0004e.NANOSECONDS)) {
            return null;
        }
        return m24a(C0004e.HOUR, C0004e.MINUTE) ? "hh:mm" : null;
    }

    public C0000a m18a(C0004e c0004e) {
        m40l();
        if (C0004e.NANOSECONDS != c0004e) {
            return C0004e.SECOND == c0004e ? new C0000a(this.f2b, this.f3c, this.f4d, this.f5e, this.f6f, this.f7g, null) : C0004e.MINUTE == c0004e ? new C0000a(this.f2b, this.f3c, this.f4d, this.f5e, this.f6f, null, null) : C0004e.HOUR == c0004e ? new C0000a(this.f2b, this.f3c, this.f4d, this.f5e, null, null, null) : C0004e.DAY == c0004e ? new C0000a(this.f2b, this.f3c, this.f4d, null, null, null, null) : C0004e.MONTH == c0004e ? new C0000a(this.f2b, this.f3c, null, null, null, null, null) : C0004e.YEAR == c0004e ? new C0000a(this.f2b, null, null, null, null, null, null) : null;
        } else {
            throw new IllegalArgumentException("It makes no sense to truncate to nanosecond precision, since that's the highest precision available.");
        }
    }

    public C0000a m19a(Integer num) {
        m13n();
        C0000a a = C0000a.m0a(((m36h().intValue() + 1) + f0k) + num.intValue());
        return new C0000a(a.m21a(), a.m27b(), a.m31c(), this.f5e, this.f6f, this.f7g, this.f8h);
    }

    public C0000a m20a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, C0001b c0001b) {
        return new C0010k(this, c0001b).m88a(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue(), num7.intValue());
    }

    public Integer m21a() {
        m40l();
        return this.f2b;
    }

    public String m22a(String str) {
        return new C0005f(str).m67a(this);
    }

    public boolean m23a(C0000a c0000a) {
        return m30c(c0000a) < 0;
    }

    public boolean m24a(C0004e... c0004eArr) {
        m40l();
        boolean z = true;
        for (C0004e c0004e : c0004eArr) {
            if (C0004e.NANOSECONDS == c0004e) {
                z = z && this.f8h != null;
            } else if (C0004e.SECOND == c0004e) {
                z = z && this.f7g != null;
            } else if (C0004e.MINUTE == c0004e) {
                z = z && this.f6f != null;
            } else if (C0004e.HOUR == c0004e) {
                z = z && this.f5e != null;
            } else if (C0004e.DAY == c0004e) {
                z = z && this.f4d != null;
            } else if (C0004e.MONTH == c0004e) {
                z = z && this.f3c != null;
            } else if (C0004e.YEAR == c0004e) {
                z = z && this.f2b != null;
            }
        }
        return z;
    }

    public C0000a m25b(Integer num) {
        return m19a(Integer.valueOf(num.intValue() * -1));
    }

    public C0000a m26b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, C0001b c0001b) {
        return new C0010k(this, c0001b).m89b(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue(), num7.intValue());
    }

    public Integer m27b() {
        m40l();
        return this.f3c;
    }

    public boolean m28b(C0000a c0000a) {
        return m30c(c0000a) > 0;
    }

    public boolean m29b(C0004e... c0004eArr) {
        m40l();
        boolean z = true;
        for (C0004e c0004e : c0004eArr) {
            if (C0004e.NANOSECONDS == c0004e) {
                z = z && this.f8h == null;
            } else if (C0004e.SECOND == c0004e) {
                z = z && this.f7g == null;
            } else if (C0004e.MINUTE == c0004e) {
                z = z && this.f6f == null;
            } else if (C0004e.HOUR == c0004e) {
                z = z && this.f5e == null;
            } else if (C0004e.DAY == c0004e) {
                z = z && this.f4d == null;
            } else if (C0004e.MONTH == c0004e) {
                z = z && this.f3c == null;
            } else if (C0004e.YEAR == c0004e) {
                z = z && this.f2b == null;
            }
        }
        return z;
    }

    public int m30c(C0000a c0000a) {
        if (this == c0000a) {
            return 0;
        }
        m40l();
        c0000a.m40l();
        C0016q c0016q = C0016q.FIRST;
        int a = C0015p.m104a(this.f2b, c0000a.f2b, c0016q);
        if (a != 0) {
            return a;
        }
        a = C0015p.m104a(this.f3c, c0000a.f3c, c0016q);
        if (a != 0) {
            return a;
        }
        a = C0015p.m104a(this.f4d, c0000a.f4d, c0016q);
        if (a != 0) {
            return a;
        }
        a = C0015p.m104a(this.f5e, c0000a.f5e, c0016q);
        if (a != 0) {
            return a;
        }
        a = C0015p.m104a(this.f6f, c0000a.f6f, c0016q);
        if (a != 0) {
            return a;
        }
        a = C0015p.m104a(this.f7g, c0000a.f7g, c0016q);
        if (a != 0) {
            return a;
        }
        a = C0015p.m104a(this.f8h, c0000a.f8h, c0016q);
        return a != 0 ? a : 0;
    }

    public Integer m31c() {
        m40l();
        return this.f4d;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m30c((C0000a) obj);
    }

    public Integer m32d() {
        m40l();
        return this.f5e;
    }

    public Integer m33e() {
        m40l();
        return this.f6f;
    }

    public boolean equals(Object obj) {
        m40l();
        Boolean a = C0015p.m106a((Object) this, obj);
        if (a == null) {
            C0000a c0000a = (C0000a) obj;
            c0000a.m40l();
            a = Boolean.valueOf(C0015p.m108a(m16q(), c0000a.m16q()));
        }
        return a.booleanValue();
    }

    public Integer m34f() {
        m40l();
        return this.f7g;
    }

    public Integer m35g() {
        m40l();
        return this.f8h;
    }

    public Integer m36h() {
        m13n();
        return Integer.valueOf((m12m() - 1) - f0k);
    }

    public int hashCode() {
        if (this.f10j == 0) {
            m40l();
            this.f10j = C0015p.m105a(m16q());
        }
        return this.f10j;
    }

    public Integer m37i() {
        m13n();
        return Integer.valueOf(((m12m() + 1) % 7) + 1);
    }

    public int m38j() {
        m13n();
        return C0000a.m4a(this.f2b, this.f3c).intValue();
    }

    public boolean m39k() {
        return m24a(C0004e.YEAR, C0004e.MONTH, C0004e.DAY);
    }

    void m40l() {
        if (!this.f9i) {
            m15p();
        }
    }

    public String toString() {
        String str = "";
        if (C0017r.m111a(this.f1a)) {
            return this.f1a;
        }
        if (m17r() != null) {
            return m22a(m17r());
        }
        StringBuilder stringBuilder = new StringBuilder();
        m6a("Y", this.f2b, stringBuilder);
        m6a("M", this.f3c, stringBuilder);
        m6a("D", this.f4d, stringBuilder);
        m6a("h", this.f5e, stringBuilder);
        m6a("m", this.f6f, stringBuilder);
        m6a("s", this.f7g, stringBuilder);
        m6a("f", this.f8h, stringBuilder);
        return stringBuilder.toString().trim();
    }
}
