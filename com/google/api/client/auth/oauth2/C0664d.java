package com.google.api.client.auth.oauth2;

import com.google.api.client.json.C0769f;
import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0779c;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.aq;
import com.google.api.client.p050d.ar;
import com.google.api.client.p051b.C0663y;
import com.google.api.client.p051b.C0691s;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.C0696z;
import java.io.IOException;

/* renamed from: com.google.api.client.auth.oauth2.d */
public class C0664d extends C0663y {
    private final transient TokenErrorResponse f7367a;

    C0664d(C0696z c0696z, TokenErrorResponse tokenErrorResponse) {
        super(c0696z);
        this.f7367a = tokenErrorResponse;
    }

    public static C0664d m6526a(C0771d c0771d, C0695x c0695x) {
        TokenErrorResponse tokenErrorResponse;
        IOException e;
        TokenErrorResponse tokenErrorResponse2;
        Object obj;
        TokenErrorResponse tokenErrorResponse3 = null;
        C0696z c0696z = new C0696z(c0695x.m6811d(), c0695x.m6812e(), c0695x.m6809b());
        am.m6911a((Object) c0771d);
        String a = c0695x.m6807a();
        StringBuilder a2;
        try {
            if (c0695x.m6810c() || a == null || !C0691s.m6751b(C0779c.f7738a, a)) {
                a = c0695x.m6817j();
                a2 = C0663y.m6525a(c0695x);
                if (!ar.m6924a(a)) {
                    a2.append(aq.f7582a).append(a);
                    c0696z.m6823c(a);
                }
                c0696z.m6821a(a2.toString());
                return new C0664d(c0696z, tokenErrorResponse3);
            }
            tokenErrorResponse = (TokenErrorResponse) new C0769f(c0771d).m7046a(c0695x.m6814g(), c0695x.m6818k(), TokenErrorResponse.class);
            try {
                tokenErrorResponse3 = tokenErrorResponse;
                a = tokenErrorResponse.toPrettyString();
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                tokenErrorResponse2 = tokenErrorResponse3;
                tokenErrorResponse3 = tokenErrorResponse;
                obj = tokenErrorResponse2;
                a2 = C0663y.m6525a(c0695x);
                if (ar.m6924a(a)) {
                    a2.append(aq.f7582a).append(a);
                    c0696z.m6823c(a);
                }
                c0696z.m6821a(a2.toString());
                return new C0664d(c0696z, tokenErrorResponse3);
            }
            a2 = C0663y.m6525a(c0695x);
            if (ar.m6924a(a)) {
                a2.append(aq.f7582a).append(a);
                c0696z.m6823c(a);
            }
            c0696z.m6821a(a2.toString());
            return new C0664d(c0696z, tokenErrorResponse3);
        } catch (IOException e3) {
            e = e3;
            tokenErrorResponse = tokenErrorResponse3;
            e.printStackTrace();
            tokenErrorResponse2 = tokenErrorResponse3;
            tokenErrorResponse3 = tokenErrorResponse;
            obj = tokenErrorResponse2;
            a2 = C0663y.m6525a(c0695x);
            if (ar.m6924a(a)) {
                a2.append(aq.f7582a).append(a);
                c0696z.m6823c(a);
            }
            c0696z.m6821a(a2.toString());
            return new C0664d(c0696z, tokenErrorResponse3);
        }
    }
}
