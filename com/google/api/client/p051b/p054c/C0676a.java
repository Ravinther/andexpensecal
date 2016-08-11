package com.google.api.client.p051b.p054c;

import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0773e;
import com.google.api.client.json.C0779c;
import com.google.api.client.p050d.am;
import com.google.api.client.p051b.C0671a;
import java.io.OutputStream;

/* renamed from: com.google.api.client.b.c.a */
public class C0676a extends C0671a {
    private final Object f7426a;
    private final C0771d f7427b;
    private String f7428c;

    public C0676a(C0771d c0771d, Object obj) {
        super(C0779c.f7738a);
        this.f7427b = (C0771d) am.m6911a((Object) c0771d);
        this.f7426a = am.m6911a(obj);
    }

    public C0676a m6665a(String str) {
        this.f7428c = str;
        return this;
    }

    public void m6666a(OutputStream outputStream) {
        C0773e a = this.f7427b.m7053a(outputStream, m6597d());
        if (this.f7428c != null) {
            a.m7078d();
            a.m7071a(this.f7428c);
        }
        a.m7070a(this.f7426a);
        if (this.f7428c != null) {
            a.m7079e();
        }
        a.m7065a();
    }
}
