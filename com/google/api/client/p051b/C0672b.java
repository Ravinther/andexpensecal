package com.google.api.client.p051b;

import com.google.api.client.p050d.aa;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.api.client.b.b */
public abstract class C0672b implements C0670l {
    private String f7389a;
    @Deprecated
    private String f7390b;
    private boolean f7391c;

    public C0672b(String str) {
        this.f7391c = true;
        m6605a(str);
    }

    public C0672b m6605a(String str) {
        this.f7389a = str;
        return this;
    }

    public C0672b m6606a(boolean z) {
        this.f7391c = z;
        return this;
    }

    @Deprecated
    public String m6607a() {
        return this.f7390b;
    }

    public void m6608a(OutputStream outputStream) {
        aa.m6901a(m6609c(), outputStream, this.f7391c);
        outputStream.flush();
    }

    public abstract InputStream m6609c();

    public final boolean m6610d() {
        return this.f7391c;
    }

    public String m6611e() {
        return this.f7389a;
    }
}
