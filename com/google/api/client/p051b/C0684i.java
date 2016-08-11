package com.google.api.client.p051b;

import com.google.api.client.p050d.ap;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.api.client.b.i */
public class C0684i implements C0683m {
    public String m6697a() {
        return "gzip";
    }

    public void m6698a(ap apVar, OutputStream outputStream) {
        OutputStream gZIPOutputStream = new GZIPOutputStream(new C0685j(this, outputStream));
        apVar.m6588a(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
