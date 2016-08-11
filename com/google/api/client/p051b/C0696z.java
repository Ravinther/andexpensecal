package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import com.google.api.client.p050d.aq;
import java.io.IOException;

/* renamed from: com.google.api.client.b.z */
public class C0696z {
    int f7528a;
    String f7529b;
    C0688p f7530c;
    String f7531d;
    String f7532e;

    public C0696z(int i, String str, C0688p c0688p) {
        m6819a(i);
        m6822b(str);
        m6820a(c0688p);
    }

    public C0696z(C0695x c0695x) {
        this(c0695x.m6811d(), c0695x.m6812e(), c0695x.m6809b());
        try {
            this.f7531d = c0695x.m6817j();
            if (this.f7531d.length() == 0) {
                this.f7531d = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder a = C0663y.m6525a(c0695x);
        if (this.f7531d != null) {
            a.append(aq.f7582a).append(this.f7531d);
        }
        this.f7532e = a.toString();
    }

    public C0696z m6819a(int i) {
        am.m6914a(i >= 0);
        this.f7528a = i;
        return this;
    }

    public C0696z m6820a(C0688p c0688p) {
        this.f7530c = (C0688p) am.m6911a((Object) c0688p);
        return this;
    }

    public C0696z m6821a(String str) {
        this.f7532e = str;
        return this;
    }

    public C0696z m6822b(String str) {
        this.f7529b = str;
        return this;
    }

    public C0696z m6823c(String str) {
        this.f7531d = str;
        return this;
    }
}
