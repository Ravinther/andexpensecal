package com.google.api.client.p050d;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.api.client.d.i */
public final class C0721i {
    public static int m6949a(InputStream inputStream, byte[] bArr, int i, int i2) {
        am.m6911a((Object) inputStream);
        am.m6911a((Object) bArr);
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static long m6950a(InputStream inputStream, OutputStream outputStream) {
        am.m6911a((Object) inputStream);
        am.m6911a((Object) outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static InputStream m6951a(InputStream inputStream, long j) {
        return new C0722j(inputStream, j);
    }
}
