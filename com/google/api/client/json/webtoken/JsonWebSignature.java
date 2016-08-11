package com.google.api.client.json.webtoken;

import com.google.api.client.json.C0771d;
import com.google.api.client.json.webtoken.JsonWebToken.Payload;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.an;
import java.security.PublicKey;

public class JsonWebSignature extends JsonWebToken {
    private final byte[] f7370a;
    private final byte[] f7371b;

    public class Header extends com.google.api.client.json.webtoken.JsonWebToken.Header {
        @ab(a = "alg")
        private String algorithm;
        @ab(a = "jwk")
        private String jwk;
        @ab(a = "jku")
        private String jwkUrl;
        @ab(a = "kid")
        private String keyId;
        @ab(a = "x5c")
        private String x509Certificate;
        @ab(a = "x5t")
        private String x509Thumbprint;
        @ab(a = "x5u")
        private String x509Url;

        public Header clone() {
            return (Header) super.clone();
        }

        public final String getAlgorithm() {
            return this.algorithm;
        }

        public final String getJwk() {
            return this.jwk;
        }

        public final String getJwkUrl() {
            return this.jwkUrl;
        }

        public final String getKeyId() {
            return this.keyId;
        }

        public final String getX509Certificate() {
            return this.x509Certificate;
        }

        public final String getX509Thumbprint() {
            return this.x509Thumbprint;
        }

        public final String getX509Url() {
            return this.x509Url;
        }

        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        public Header setAlgorithm(String str) {
            this.algorithm = str;
            return this;
        }

        public Header setJwk(String str) {
            this.jwk = str;
            return this;
        }

        public Header setJwkUrl(String str) {
            this.jwkUrl = str;
            return this;
        }

        public Header setKeyId(String str) {
            this.keyId = str;
            return this;
        }

        public Header setType(String str) {
            super.setType(str);
            return this;
        }

        public Header setX509Certificate(String str) {
            this.x509Certificate = str;
            return this;
        }

        public Header setX509Thumbprint(String str) {
            this.x509Thumbprint = str;
            return this;
        }

        public Header setX509Url(String str) {
            this.x509Url = str;
            return this;
        }
    }

    public JsonWebSignature(Header header, Payload payload, byte[] bArr, byte[] bArr2) {
        super(header, payload);
        this.f7370a = (byte[]) am.m6911a((Object) bArr);
        this.f7371b = (byte[]) am.m6911a((Object) bArr2);
    }

    public static C0784a m6529a(C0771d c0771d) {
        return new C0784a(c0771d);
    }

    public final boolean m6530a(PublicKey publicKey) {
        return "RS256".equals(m6531d().getAlgorithm()) ? an.m6920a(an.m6919a(), publicKey, this.f7370a, this.f7371b) : false;
    }

    public Header m6531d() {
        return (Header) super.m6528g();
    }

    public final byte[] m6532e() {
        return this.f7370a;
    }

    public final byte[] m6533f() {
        return this.f7371b;
    }

    public /* synthetic */ com.google.api.client.json.webtoken.JsonWebToken.Header m6534g() {
        return m6531d();
    }
}
