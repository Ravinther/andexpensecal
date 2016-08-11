package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdToken;
import com.google.api.client.json.C0771d;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebSignature.Header;
import com.google.api.client.p050d.C0726n;
import com.google.api.client.p050d.ab;

public class GoogleIdToken extends IdToken {

    public class Payload extends com.google.api.client.auth.openidconnect.IdToken.Payload {
        @ab(a = "token_hash")
        private String accessTokenHash;
        @ab(a = "email")
        private String email;
        @ab(a = "verified_email")
        private boolean emailVerified;
        @ab(a = "hd")
        private String hostedDomain;
        @ab(a = "cid")
        private String issuee;
        @ab(a = "id")
        private String userId;

        @Deprecated
        public Payload(C0726n c0726n) {
        }

        public Payload clone() {
            return (Payload) super.clone();
        }

        public String getAccessTokenHash() {
            return this.accessTokenHash;
        }

        public String getEmail() {
            return this.email;
        }

        public boolean getEmailVerified() {
            return this.emailVerified;
        }

        public String getHostedDomain() {
            return this.hostedDomain;
        }

        public String getIssuee() {
            return this.issuee;
        }

        public String getUserId() {
            return this.userId;
        }

        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        public Payload setAccessTokenHash(String str) {
            this.accessTokenHash = str;
            return this;
        }

        public Payload setEmail(String str) {
            this.email = str;
            return this;
        }

        public Payload setEmailVerified(boolean z) {
            this.emailVerified = z;
            return this;
        }

        public Payload setHostedDomain(String str) {
            this.hostedDomain = str;
            return this;
        }

        public Payload setIssuee(String str) {
            this.issuee = str;
            return this;
        }

        public Payload setUserId(String str) {
            this.userId = str;
            return this;
        }
    }

    public GoogleIdToken(Header header, Payload payload, byte[] bArr, byte[] bArr2) {
        super(header, payload, bArr, bArr2);
    }

    public static GoogleIdToken m6996b(C0771d c0771d, String str) {
        JsonWebSignature a = JsonWebSignature.m6529a(c0771d).m7147a(Payload.class).m7146a(str);
        return new GoogleIdToken(a.m6531d(), (Payload) a.m6527b(), a.m6532e(), a.m6533f());
    }

    public /* synthetic */ com.google.api.client.auth.openidconnect.IdToken.Payload m6997a() {
        return m6999c();
    }

    public /* synthetic */ com.google.api.client.json.webtoken.JsonWebToken.Payload m6998b() {
        return m6999c();
    }

    public Payload m6999c() {
        return (Payload) super.m6536a();
    }
}
