package com.google.api.client.json.webtoken;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.ak;
import com.google.api.client.p050d.am;
import java.util.Collections;
import java.util.List;

public class JsonWebToken {
    private final Header f7368a;
    private final Payload f7369b;

    public class Payload extends C0657b {
        @ab(a = "aud")
        private Object audience;
        @ab(a = "exp")
        private Long expirationTimeSeconds;
        @ab(a = "iat")
        private Long issuedAtTimeSeconds;
        @ab(a = "iss")
        private String issuer;
        @ab(a = "jti")
        private String jwtId;
        @ab(a = "nbf")
        private Long notBeforeTimeSeconds;
        @ab(a = "sub")
        private String subject;
        @ab(a = "typ")
        private String type;

        public Payload clone() {
            return (Payload) super.clone();
        }

        public final Object getAudience() {
            return this.audience;
        }

        public final List<String> getAudienceAsList() {
            return this.audience == null ? Collections.emptyList() : this.audience instanceof String ? Collections.singletonList((String) this.audience) : (List) this.audience;
        }

        public final Long getExpirationTimeSeconds() {
            return this.expirationTimeSeconds;
        }

        public final Long getIssuedAtTimeSeconds() {
            return this.issuedAtTimeSeconds;
        }

        public final String getIssuer() {
            return this.issuer;
        }

        public final String getJwtId() {
            return this.jwtId;
        }

        public final Long getNotBeforeTimeSeconds() {
            return this.notBeforeTimeSeconds;
        }

        public final String getSubject() {
            return this.subject;
        }

        public final String getType() {
            return this.type;
        }

        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        public Payload setAudience(Object obj) {
            this.audience = obj;
            return this;
        }

        public Payload setExpirationTimeSeconds(Long l) {
            this.expirationTimeSeconds = l;
            return this;
        }

        public Payload setIssuedAtTimeSeconds(Long l) {
            this.issuedAtTimeSeconds = l;
            return this;
        }

        public Payload setIssuer(String str) {
            this.issuer = str;
            return this;
        }

        public Payload setJwtId(String str) {
            this.jwtId = str;
            return this;
        }

        public Payload setNotBeforeTimeSeconds(Long l) {
            this.notBeforeTimeSeconds = l;
            return this;
        }

        public Payload setSubject(String str) {
            this.subject = str;
            return this;
        }

        public Payload setType(String str) {
            this.type = str;
            return this;
        }
    }

    public class Header extends C0657b {
        @ab(a = "cty")
        private String contentType;
        @ab(a = "typ")
        private String type;

        public Header clone() {
            return (Header) super.clone();
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getType() {
            return this.type;
        }

        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        public Header setContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Header setType(String str) {
            this.type = str;
            return this;
        }
    }

    public JsonWebToken(Header header, Payload payload) {
        this.f7368a = (Header) am.m6911a((Object) header);
        this.f7369b = (Payload) am.m6911a((Object) payload);
    }

    public Payload m6527b() {
        return this.f7369b;
    }

    public Header m6528g() {
        return this.f7368a;
    }

    public String toString() {
        return ak.m6908a(this).m6910a("header", this.f7368a).m6910a("payload", this.f7369b).toString();
    }
}
