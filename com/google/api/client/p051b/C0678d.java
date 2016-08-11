package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.api.client.b.d */
public final class C0678d extends C0672b {
    private final byte[] f7429a;
    private final int f7430b;
    private final int f7431c;

    public C0678d(String str, byte[] bArr, int i, int i2) {
        super(str);
        this.f7429a = (byte[]) am.m6911a((Object) bArr);
        boolean z = i >= 0 && i2 >= 0 && i + i2 <= bArr.length;
        am.m6914a(z);
        this.f7430b = i;
        this.f7431c = i2;
    }

    public /* synthetic */ C0672b m6670a(String str) {
        return m6673b(str);
    }

    public /* synthetic */ C0672b m6671a(boolean z) {
        return m6674b(z);
    }

    public long m6672b() {
        return (long) this.f7431c;
    }

    public C0678d m6673b(String str) {
        return (C0678d) super.m6605a(str);
    }

    public C0678d m6674b(boolean z) {
        return (C0678d) super.m6606a(z);
    }

    public InputStream m6675c() {
        return new ByteArrayInputStream(this.f7429a, this.f7430b, this.f7431c);
    }

    public boolean m6676g() {
        return true;
    }
}
