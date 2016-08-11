package com.expensemanager.calculator;

import android.text.SpannableStringBuilder;

/* renamed from: com.expensemanager.calculator.c */
class C0400c extends SpannableStringBuilder {
    private static final char[] f4303a;
    private static final char[] f4304b;
    private boolean f4305c;
    private C0405h f4306d;

    static {
        f4303a = new char[]{'*', '/'};
        f4304b = new char[]{'\u00d7', '\u00f7'};
    }

    private C0400c(CharSequence charSequence, C0405h c0405h) {
        super(charSequence);
        this.f4305c = false;
        this.f4306d = c0405h;
    }

    private SpannableStringBuilder m3903a(int i, int i2, String str) {
        int length;
        CharSequence replace;
        if (!this.f4306d.m3916b(str)) {
            this.f4306d.m3911a();
            i2 = length();
            i = 0;
        }
        for (length = f4303a.length - 1; length >= 0; length--) {
            replace = replace.replace(f4303a[length], f4304b[length]);
        }
        if (replace.length() == 1) {
            char charAt = replace.charAt(0);
            if (charAt == '.') {
                length = i - 1;
                while (length >= 0 && Character.isDigit(charAt(length))) {
                    length--;
                }
                if (length >= 0 && charAt(length) == '.') {
                    return super.replace(i, i2, "");
                }
            }
            char charAt2 = i > 0 ? charAt(i - 1) : '\u0000';
            if (charAt == '-' && charAt2 == '-') {
                return super.replace(i, i2, "");
            }
            if (C0405h.m3907a(charAt)) {
                while (C0405h.m3907a(charAt2) && (charAt != '-' || charAt2 == '+')) {
                    i--;
                    charAt2 = i > 0 ? charAt(i - 1) : '\u0000';
                }
            }
            if (i == 0 && C0405h.m3907a(charAt) && charAt != '-') {
                return super.replace(i, i2, "");
            }
        }
        return super.replace(i, i2, replace);
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f4305c) {
            return super.replace(i, i2, charSequence, i3, i4);
        }
        this.f4305c = true;
        try {
            SpannableStringBuilder a = m3903a(i, i2, charSequence.subSequence(i3, i4).toString());
            return a;
        } finally {
            this.f4305c = false;
        }
    }
}
