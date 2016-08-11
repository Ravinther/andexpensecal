package com.google.api.client.p050d.p065a;

import java.net.URLDecoder;

/* renamed from: com.google.api.client.d.a.a */
public final class C0707a {
    private static final C0708b f7559a;
    private static final C0708b f7560b;
    private static final C0708b f7561c;

    static {
        f7559a = new C0710c("-_.*", true);
        f7560b = new C0710c("-_.!~*'()@:$&,;=", false);
        f7561c = new C0710c("-_.!~*'()@:$,;/?:", false);
    }

    public static String m6869a(String str) {
        return f7559a.m6873a(str);
    }

    public static String m6870b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static String m6871c(String str) {
        return f7560b.m6873a(str);
    }

    public static String m6872d(String str) {
        return f7561c.m6873a(str);
    }
}
