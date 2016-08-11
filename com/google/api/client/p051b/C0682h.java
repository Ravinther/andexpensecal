package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.google.api.client.b.h */
public final class C0682h extends C0672b {
    private final File f7446a;

    public C0682h(String str, File file) {
        super(str);
        this.f7446a = (File) am.m6911a((Object) file);
    }

    public /* synthetic */ C0672b m6688a(String str) {
        return m6691b(str);
    }

    public /* synthetic */ C0672b m6689a(boolean z) {
        return m6692b(z);
    }

    public long m6690b() {
        return this.f7446a.length();
    }

    public C0682h m6691b(String str) {
        return (C0682h) super.m6605a(str);
    }

    public C0682h m6692b(boolean z) {
        return (C0682h) super.m6606a(z);
    }

    public InputStream m6693c() {
        return new FileInputStream(this.f7446a);
    }

    public boolean m6694g() {
        return true;
    }
}
