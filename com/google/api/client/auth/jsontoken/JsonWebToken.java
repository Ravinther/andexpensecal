package com.google.api.client.auth.jsontoken;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.C0726n;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;

@Deprecated
public class JsonWebToken {

    @Deprecated
    public class Header extends C0657b {
        @ab(a = "typ")
        private String type;

        public Header clone() {
            return (Header) super.clone();
        }

        public final String getType() {
            return this.type;
        }

        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        public Header setType(String str) {
            this.type = str;
            return this;
        }
    }

    @Deprecated
    public class Payload extends C0657b {
        @ab(a = "aud")
        private String audience;
        private final C0726n clock;
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
        @ab(a = "prn")
        private String principal;
        @ab(a = "typ")
        private String type;

        public Payload() {
            this(C0726n.f7610a);
        }

        public Payload(C0726n c0726n) {
            this.clock = (C0726n) am.m6911a((Object) c0726n);
        }

        public Payload clone() {
            return (Payload) super.clone();
        }

        public String getAudience() {
            return this.audience;
        }

        public Long getExpirationTimeSeconds() {
            return this.expirationTimeSeconds;
        }

        public Long getIssuedAtTimeSeconds() {
            return this.issuedAtTimeSeconds;
        }

        public String getIssuer() {
            return this.issuer;
        }

        public String getJwtId() {
            return this.jwtId;
        }

        public Long getNotBeforeTimeSeconds() {
            return this.notBeforeTimeSeconds;
        }

        public String getPrincipal() {
            return this.principal;
        }

        public String getType() {
            return this.type;
        }

        public boolean isValidTime(long j) {
            long a = this.clock.m6959a();
            return (this.expirationTimeSeconds == null || a <= (this.expirationTimeSeconds.longValue() + j) * 1000) && (this.issuedAtTimeSeconds == null || a >= (this.issuedAtTimeSeconds.longValue() - j) * 1000);
        }

        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        public Payload setAudience(String str) {
            this.audience = str;
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

        public Payload setPrincipal(String str) {
            this.principal = str;
            return this;
        }

        public Payload setType(String str) {
            this.type = str;
            return this;
        }
    }
}
