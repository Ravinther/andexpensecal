package com.google.api.client.googleapis.json;

import com.google.api.client.json.C0769f;
import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0775h;
import com.google.api.client.json.C0783k;
import com.google.api.client.p050d.am;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;

@Deprecated
/* renamed from: com.google.api.client.googleapis.json.b */
public final class C0770b extends C0769f {
    private final C0771d f7728a;

    public C0770b(C0771d c0771d) {
        super(c0771d);
        this.f7728a = (C0771d) am.m6911a((Object) c0771d);
    }

    public static C0775h m7049a(C0775h c0775h) {
        try {
            if (c0775h.m7107a(new HashSet(Arrays.asList(new String[]{"data", "error"}))) != null && c0775h.m7112d() != C0783k.END_OBJECT) {
                return c0775h;
            }
            throw new IllegalArgumentException("data key not found");
        } catch (Throwable th) {
            c0775h.m7110b();
        }
    }

    public Object m7050a(InputStream inputStream, Charset charset, Type type) {
        return C0770b.m7049a(this.f7728a.m7055a(inputStream, charset)).m7106a(type, true, null);
    }
}
