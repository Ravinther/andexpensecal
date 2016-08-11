package com.dropbox.client2;

import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* renamed from: com.dropbox.client2.k */
public class C0387k extends HttpEntityWrapper {
    private final C0386j f2400a;
    private final long f2401b;

    public C0387k(HttpEntity httpEntity, C0386j c0386j) {
        super(httpEntity);
        if (c0386j == null) {
            throw new IllegalArgumentException("'listener' is null");
        }
        this.f2400a = c0386j;
        this.f2401b = httpEntity.getContentLength();
    }

    public void writeTo(OutputStream outputStream) {
        this.wrappedEntity.writeTo(new C0388l(this, outputStream));
    }
}
