package com.google.api.client.googleapis.p074d.p075a;

import com.google.api.client.googleapis.json.C0768a;
import com.google.api.client.googleapis.json.GoogleJsonErrorContainer;
import com.google.api.client.googleapis.p066a.C0740b;
import com.google.api.client.googleapis.p066a.p067a.C0739a;
import com.google.api.client.googleapis.p074d.C0762c;
import com.google.api.client.p051b.C0670l;
import com.google.api.client.p051b.C0688p;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.p054c.C0676a;

/* renamed from: com.google.api.client.googleapis.d.a.c */
public abstract class C0763c<T> extends C0762c<T> {
    private final Object jsonContent;

    protected C0763c(C0759a c0759a, String str, String str2, Object obj, Class<T> cls) {
        C0670l c0670l;
        String str3 = null;
        if (obj == null) {
            c0670l = null;
        } else {
            C0676a c0676a = new C0676a(c0759a.getJsonFactory(), obj);
            if (!c0759a.getObjectParser().m7048b().isEmpty()) {
                str3 = "data";
            }
            c0670l = c0676a.m6665a(str3);
        }
        super(c0759a, str, str2, c0670l, cls);
        this.jsonContent = obj;
    }

    public C0759a getAbstractGoogleClient() {
        return (C0759a) super.getAbstractGoogleClient();
    }

    public Object getJsonContent() {
        return this.jsonContent;
    }

    protected C0768a newExceptionOnError(C0695x c0695x) {
        return C0768a.m7043a(getAbstractGoogleClient().getJsonFactory(), c0695x);
    }

    public final void queue(C0740b c0740b, C0739a<T> c0739a) {
        super.queue(c0740b, GoogleJsonErrorContainer.class, c0739a);
    }

    public C0763c<T> set(String str, Object obj) {
        return (C0763c) super.set(str, obj);
    }

    public C0763c<T> setDisableGZipContent(boolean z) {
        return (C0763c) super.setDisableGZipContent(z);
    }

    public C0763c<T> setRequestHeaders(C0688p c0688p) {
        return (C0763c) super.setRequestHeaders(c0688p);
    }
}
