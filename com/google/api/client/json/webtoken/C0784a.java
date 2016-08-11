package com.google.api.client.json.webtoken;

import com.google.api.client.json.C0771d;
import com.google.api.client.json.webtoken.JsonWebSignature.Header;
import com.google.api.client.json.webtoken.JsonWebToken.Payload;
import com.google.api.client.p050d.C0719g;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.aq;
import java.io.ByteArrayInputStream;

/* renamed from: com.google.api.client.json.webtoken.a */
public final class C0784a {
    private final C0771d f7755a;
    private Class<? extends Header> f7756b;
    private Class<? extends Payload> f7757c;

    public C0784a(C0771d c0771d) {
        this.f7756b = Header.class;
        this.f7757c = Payload.class;
        this.f7755a = (C0771d) am.m6911a((Object) c0771d);
    }

    public JsonWebSignature m7146a(String str) {
        boolean z = true;
        int indexOf = str.indexOf(46);
        am.m6914a(indexOf != -1);
        byte[] a = C0719g.m6948a(str.substring(0, indexOf));
        int indexOf2 = str.indexOf(46, indexOf + 1);
        am.m6914a(indexOf2 != -1);
        am.m6914a(str.indexOf(46, indexOf2 + 1) == -1);
        byte[] a2 = C0719g.m6948a(str.substring(indexOf + 1, indexOf2));
        byte[] a3 = C0719g.m6948a(str.substring(indexOf2 + 1));
        byte[] a4 = aq.m6923a(str.substring(0, indexOf2));
        Header header = (Header) this.f7755a.m7056a(new ByteArrayInputStream(a), this.f7756b);
        if (header.getAlgorithm() == null) {
            z = false;
        }
        am.m6914a(z);
        return new JsonWebSignature(header, (Payload) this.f7755a.m7056a(new ByteArrayInputStream(a2), this.f7757c), a3, a4);
    }

    public C0784a m7147a(Class<? extends Payload> cls) {
        this.f7757c = cls;
        return this;
    }
}
