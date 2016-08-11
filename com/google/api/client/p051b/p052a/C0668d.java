package com.google.api.client.p051b.p052a;

import com.google.api.client.p050d.am;
import com.google.api.client.p050d.ap;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: com.google.api.client.b.a.d */
final class C0668d extends AbstractHttpEntity {
    private final long f7384a;
    private final ap f7385b;

    C0668d(long j, ap apVar) {
        this.f7384a = j;
        this.f7385b = (ap) am.m6911a((Object) apVar);
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    public long getContentLength() {
        return this.f7384a;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return true;
    }

    public void writeTo(OutputStream outputStream) {
        if (this.f7384a != 0) {
            this.f7385b.m6588a(outputStream);
        }
    }
}
