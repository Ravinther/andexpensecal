package com.google.api.client.p051b;

import java.io.IOException;

/* renamed from: com.google.api.client.b.y */
public class C0663y extends IOException {
    private final int f7363a;
    private final String f7364b;
    private final transient C0688p f7365c;
    private final String f7366d;

    public C0663y(C0695x c0695x) {
        this(new C0696z(c0695x));
    }

    protected C0663y(C0696z c0696z) {
        super(c0696z.f7532e);
        this.f7363a = c0696z.f7528a;
        this.f7364b = c0696z.f7529b;
        this.f7365c = c0696z.f7530c;
        this.f7366d = c0696z.f7531d;
    }

    public static StringBuilder m6525a(C0695x c0695x) {
        StringBuilder stringBuilder = new StringBuilder();
        int d = c0695x.m6811d();
        if (d != 0) {
            stringBuilder.append(d);
        }
        String e = c0695x.m6812e();
        if (e != null) {
            if (d != 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(e);
        }
        return stringBuilder;
    }
}
