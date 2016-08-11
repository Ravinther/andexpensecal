package com.google.api.client.p050d;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.api.client.d.aa */
public class aa {
    public static long m6899a(ap apVar) {
        OutputStream c0720h = new C0720h();
        try {
            apVar.m6588a(c0720h);
            return c0720h.f7598a;
        } finally {
            c0720h.close();
        }
    }

    public static void m6900a(InputStream inputStream, OutputStream outputStream) {
        aa.m6901a(inputStream, outputStream, true);
    }

    public static void m6901a(InputStream inputStream, OutputStream outputStream, boolean z) {
        try {
            C0721i.m6950a(inputStream, outputStream);
            if (z) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (z) {
                inputStream.close();
            }
        }
    }
}
