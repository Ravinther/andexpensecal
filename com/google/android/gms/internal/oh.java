package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class oh {
    public static long m6338a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return m6339a(inputStream, outputStream, z, 1024);
    }

    public static long m6339a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m6340a((Closeable) inputStream);
                    m6340a((Closeable) outputStream);
                }
            }
        }
        return j;
    }

    public static void m6340a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static byte[] m6341a(InputStream inputStream) {
        return m6342a(inputStream, true);
    }

    public static byte[] m6342a(InputStream inputStream, boolean z) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m6338a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
