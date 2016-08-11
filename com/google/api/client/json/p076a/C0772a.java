package com.google.api.client.json.p076a;

import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0773e;
import com.google.api.client.json.C0775h;
import com.google.api.client.p050d.C0723k;
import com.google.p042a.p044b.C0547a;
import com.google.p042a.p044b.C0552f;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: com.google.api.client.json.a.a */
public class C0772a extends C0771d {
    public C0773e m7059a(OutputStream outputStream, Charset charset) {
        return m7060a(new OutputStreamWriter(outputStream, charset));
    }

    public C0773e m7060a(Writer writer) {
        return new C0774b(this, new C0552f(writer));
    }

    public C0775h m7061a(InputStream inputStream) {
        return m7063a(new InputStreamReader(inputStream, C0723k.f7601a));
    }

    public C0775h m7062a(InputStream inputStream, Charset charset) {
        return charset == null ? m7061a(inputStream) : m7063a(new InputStreamReader(inputStream, charset));
    }

    public C0775h m7063a(Reader reader) {
        return new C0776c(this, new C0547a(reader));
    }
}
