package com.google.api.client.json;

import com.google.api.client.p050d.C0723k;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.google.api.client.json.d */
public abstract class C0771d {
    private String m7051a(Object obj, boolean z) {
        return m7052b(obj, z).toString("UTF-8");
    }

    private ByteArrayOutputStream m7052b(Object obj, boolean z) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0773e a = m7053a(byteArrayOutputStream, C0723k.f7601a);
        if (z) {
            a.m7081g();
        }
        a.m7070a(obj);
        a.m7065a();
        return byteArrayOutputStream;
    }

    public abstract C0773e m7053a(OutputStream outputStream, Charset charset);

    public abstract C0775h m7054a(InputStream inputStream);

    public abstract C0775h m7055a(InputStream inputStream, Charset charset);

    public final <T> T m7056a(InputStream inputStream, Class<T> cls) {
        return m7054a(inputStream).m7105a(cls, null);
    }

    public final String m7057a(Object obj) {
        return m7051a(obj, false);
    }

    public final String m7058b(Object obj) {
        return m7051a(obj, true);
    }
}
