package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import java.io.InputStream;

/* renamed from: com.google.api.client.b.ae */
public final class ae extends C0672b {
    private long f7392a;
    private boolean f7393b;
    private final InputStream f7394c;

    public ae(String str, InputStream inputStream) {
        super(str);
        this.f7392a = -1;
        this.f7394c = (InputStream) am.m6911a((Object) inputStream);
    }

    public ae m6612a(long j) {
        this.f7392a = j;
        return this;
    }

    public /* synthetic */ C0672b m6613a(String str) {
        return m6616b(str);
    }

    public /* synthetic */ C0672b m6614a(boolean z) {
        return m6618c(z);
    }

    public long m6615b() {
        return this.f7392a;
    }

    public ae m6616b(String str) {
        return (ae) super.m6605a(str);
    }

    public ae m6617b(boolean z) {
        this.f7393b = z;
        return this;
    }

    public ae m6618c(boolean z) {
        return (ae) super.m6606a(z);
    }

    public InputStream m6619c() {
        return this.f7394c;
    }

    public boolean m6620g() {
        return this.f7393b;
    }
}
