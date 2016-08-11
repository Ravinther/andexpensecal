package com.google.api.client.p055c.p060b.p061a.p062a.p063a.p064a;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.api.client.c.b.a.a.a.a.c */
public class C0706c {
    private static IllegalStateException m6864a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static String m6865a(byte[] bArr) {
        return C0706c.m6866a(bArr, "UTF-8");
    }

    public static String m6866a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw C0706c.m6864a(str, e);
        }
    }

    public static byte[] m6867a(String str) {
        return C0706c.m6868a(str, "UTF-8");
    }

    public static byte[] m6868a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw C0706c.m6864a(str2, e);
        }
    }
}
