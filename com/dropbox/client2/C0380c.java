package com.dropbox.client2;

import com.dropbox.client2.p029a.C0347c;
import com.dropbox.client2.p029a.C0350f;
import com.dropbox.client2.p030c.C0357m;
import java.util.Map;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: com.dropbox.client2.c */
public final class C0380c implements C0379i {
    private final HttpUriRequest f2375a;
    private final C0357m f2376b;

    public C0380c(HttpUriRequest httpUriRequest, C0357m c0357m) {
        this.f2375a = httpUriRequest;
        this.f2376b = c0357m;
    }

    public void m2336a() {
        this.f2375a.abort();
    }

    public C0383f m2337b() {
        try {
            return new C0383f((Map) C0389m.m2350a(C0389m.m2354a(this.f2376b, this.f2375a, 180000)));
        } catch (C0347c e) {
            if (this.f2375a.isAborted()) {
                throw new C0350f(-1);
            }
            throw e;
        }
    }
}
