package com.google.api.client.p051b;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.api.client.b.j */
class C0685j extends FilterOutputStream {
    final /* synthetic */ C0684i f7447a;

    C0685j(C0684i c0684i, OutputStream outputStream) {
        this.f7447a = c0684i;
        super(outputStream);
    }

    public void close() {
        try {
            flush();
        } catch (IOException e) {
        }
    }
}
