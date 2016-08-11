package com.google.api.client.auth.openidconnect;

import com.google.api.client.json.C0771d;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebSignature.Header;
import com.google.api.client.p050d.ab;

public class IdToken extends JsonWebSignature {

    public class Payload extends com.google.api.client.json.webtoken.JsonWebToken.Payload {
        @ab(a = "auth_time")
        private Long authorizationTimeSeconds;
        @ab(a = "azp")
        private Object authorizedParty;

        public final Long getAuthorizationTimeSeconds() {
            return this.authorizationTimeSeconds;
        }

        public final Object getAuthorizedParty() {
            return this.authorizedParty;
        }

        public Payload setAuthorizationTimeSeconds(Long l) {
            this.authorizationTimeSeconds = l;
            return this;
        }

        public Payload setAuthorizedParty(Object obj) {
            this.authorizedParty = obj;
            return this;
        }
    }

    public IdToken(Header header, Payload payload, byte[] bArr, byte[] bArr2) {
        super(header, payload, bArr, bArr2);
    }

    public static IdToken m6535a(C0771d c0771d, String str) {
        JsonWebSignature a = JsonWebSignature.m6529a(c0771d).m7147a(Payload.class).m7146a(str);
        return new IdToken(a.m6531d(), (Payload) a.m6527b(), a.m6532e(), a.m6533f());
    }

    public Payload m6536a() {
        return (Payload) super.m6527b();
    }

    public final boolean m6537a(long j, long j2) {
        return m6540b(j, j2) && m6541c(j, j2);
    }

    public final boolean m6538a(String str) {
        return str.equals(m6536a().getIssuer());
    }

    public /* synthetic */ com.google.api.client.json.webtoken.JsonWebToken.Payload m6539b() {
        return m6536a();
    }

    public final boolean m6540b(long j, long j2) {
        return j <= (m6536a().getExpirationTimeSeconds().longValue() + j2) * 1000;
    }

    public final boolean m6541c(long j, long j2) {
        return j >= (m6536a().getIssuedAtTimeSeconds().longValue() - j2) * 1000;
    }
}
