package com.google.api.client.p050d;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: com.google.api.client.d.u */
public final class C0733u implements Serializable {
    private static final TimeZone f7637a;
    private final long f7638b;
    private final boolean f7639c;
    private final int f7640d;

    static {
        f7637a = TimeZone.getTimeZone("GMT");
    }

    public C0733u(long j) {
        this(false, j, null);
    }

    public C0733u(boolean z, long j, Integer num) {
        this.f7639c = z;
        this.f7638b = j;
        int offset = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        this.f7640d = offset;
    }

    public static C0733u m6977a(String str) {
        try {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            long j;
            Integer valueOf;
            int parseInt = Integer.parseInt(str.substring(0, 4));
            int parseInt2 = Integer.parseInt(str.substring(5, 7)) - 1;
            int parseInt3 = Integer.parseInt(str.substring(8, 10));
            int length = str.length();
            boolean z = length <= 10 || Character.toUpperCase(str.charAt(10)) != 'T';
            if (z) {
                i = Integer.MAX_VALUE;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                i = Integer.parseInt(str.substring(11, 13));
                i4 = Integer.parseInt(str.substring(14, 16));
                i3 = Integer.parseInt(str.substring(17, 19));
                if (str.charAt(19) == '.') {
                    i2 = Integer.parseInt(str.substring(20, 23));
                    i5 = i;
                    i = 23;
                } else {
                    i2 = 0;
                    i5 = i;
                    i = 19;
                }
            }
            Calendar gregorianCalendar = new GregorianCalendar(f7637a);
            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i5, i4, i3);
            gregorianCalendar.set(14, i2);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (length > i) {
                if (Character.toUpperCase(str.charAt(i)) == 'Z') {
                    j = timeInMillis;
                    parseInt2 = 0;
                } else {
                    int parseInt4 = (Integer.parseInt(str.substring(i + 1, i + 3)) * 60) + Integer.parseInt(str.substring(i + 4, i + 6));
                    if (str.charAt(i) == '-') {
                        parseInt4 = -parseInt4;
                    }
                    int i6 = parseInt4;
                    j = timeInMillis - (((long) parseInt4) * 60000);
                    parseInt2 = i6;
                }
                valueOf = Integer.valueOf(parseInt2);
            } else {
                j = timeInMillis;
                valueOf = null;
            }
            return new C0733u(z, j, valueOf);
        } catch (StringIndexOutOfBoundsException e) {
            throw new NumberFormatException("Invalid date/time format: " + str);
        }
    }

    private static void m6978a(StringBuilder stringBuilder, int i, int i2) {
        if (i < 0) {
            stringBuilder.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (i3 = 0; i3 < i2; i3++) {
            stringBuilder.append('0');
        }
        if (i != 0) {
            stringBuilder.append(i);
        }
    }

    public String m6979a() {
        StringBuilder stringBuilder = new StringBuilder();
        Calendar gregorianCalendar = new GregorianCalendar(f7637a);
        gregorianCalendar.setTimeInMillis(this.f7638b + (((long) this.f7640d) * 60000));
        C0733u.m6978a(stringBuilder, gregorianCalendar.get(1), 4);
        stringBuilder.append('-');
        C0733u.m6978a(stringBuilder, gregorianCalendar.get(2) + 1, 2);
        stringBuilder.append('-');
        C0733u.m6978a(stringBuilder, gregorianCalendar.get(5), 2);
        if (!this.f7639c) {
            stringBuilder.append('T');
            C0733u.m6978a(stringBuilder, gregorianCalendar.get(11), 2);
            stringBuilder.append(':');
            C0733u.m6978a(stringBuilder, gregorianCalendar.get(12), 2);
            stringBuilder.append(':');
            C0733u.m6978a(stringBuilder, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                stringBuilder.append('.');
                C0733u.m6978a(stringBuilder, gregorianCalendar.get(14), 3);
            }
            if (this.f7640d == 0) {
                stringBuilder.append('Z');
            } else {
                int i = this.f7640d;
                if (this.f7640d > 0) {
                    stringBuilder.append('+');
                } else {
                    stringBuilder.append('-');
                    i = -i;
                }
                int i2 = i / 60;
                i %= 60;
                C0733u.m6978a(stringBuilder, i2, 2);
                stringBuilder.append(':');
                C0733u.m6978a(stringBuilder, i, 2);
            }
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0733u)) {
            return false;
        }
        C0733u c0733u = (C0733u) obj;
        return this.f7639c == c0733u.f7639c && this.f7638b == c0733u.f7638b && this.f7640d == c0733u.f7640d;
    }

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.f7638b;
        jArr[1] = this.f7639c ? 1 : 0;
        jArr[2] = (long) this.f7640d;
        return Arrays.hashCode(jArr);
    }

    public String toString() {
        return m6979a();
    }
}
