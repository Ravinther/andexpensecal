package com.google.api.client.p050d.p065a;

/* renamed from: com.google.api.client.d.a.f */
public abstract class C0709f extends C0708b {
    private static char[] m6874a(char[] cArr, int i, int i2) {
        Object obj = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, obj, 0, i);
        }
        return obj;
    }

    protected static int m6875b(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < '\ud800' || charAt > '\udfff') {
                return charAt;
            }
            if (charAt > '\udbff') {
                throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + charAt + " at index " + (i3 - 1));
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + charAt2 + " at index " + i3);
            }
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    protected abstract int m6876a(CharSequence charSequence, int i, int i2);

    protected final String m6877a(String str, int i) {
        int b;
        int length = str.length();
        char[] a = C0711d.m6883a();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            b = C0709f.m6875b(str, i, length);
            if (b < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            int i4;
            Object a2 = m6878a(b);
            b = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
            if (a2 != null) {
                int i5 = i - i2;
                int length2 = (i3 + i5) + a2.length;
                if (a.length < length2) {
                    a = C0709f.m6874a(a, i3, ((length2 + length) - i) + 32);
                }
                if (i5 > 0) {
                    str.getChars(i2, i, a, i3);
                    i3 += i5;
                }
                if (a2.length > 0) {
                    System.arraycopy(a2, 0, a, i3, a2.length);
                    i3 += a2.length;
                }
                i2 = i3;
                i3 = b;
            } else {
                i4 = i2;
                i2 = i3;
                i3 = i4;
            }
            i = m6876a((CharSequence) str, b, length);
            i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        b = length - i2;
        if (b > 0) {
            b += i3;
            if (a.length < b) {
                a = C0709f.m6874a(a, i3, b);
            }
            str.getChars(i2, length, a, i3);
            i3 = b;
        }
        return new String(a, 0, i3);
    }

    protected abstract char[] m6878a(int i);
}
