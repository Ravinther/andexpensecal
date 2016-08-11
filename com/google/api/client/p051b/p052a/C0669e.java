package com.google.api.client.p051b.p052a;

import com.google.api.client.p050d.am;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* renamed from: com.google.api.client.b.a.e */
final class C0669e extends HttpEntityEnclosingRequestBase {
    private final String f7386a;

    public C0669e(String str, String str2) {
        this.f7386a = (String) am.m6911a((Object) str);
        setURI(URI.create(str2));
    }

    public String getMethod() {
        return this.f7386a;
    }
}
