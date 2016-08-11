package com.google.api.client.auth.jsontoken;

import com.google.api.client.p050d.ab;

@Deprecated
public class JsonWebSignature extends JsonWebToken {

    @Deprecated
    public class Header extends com.google.api.client.auth.jsontoken.JsonWebToken.Header {
        @ab(a = "alg")
        private String algorithm;
        @ab(a = "jku")
        private String jwkUrl;
        @ab(a = "kid")
        private String keyId;
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

        public String getJwkUrl() {
            return this.jwkUrl;
        }

        public String getKeyId() {
            return this.keyId;
        }

        public String getX509Thumbprint() {
            return this.x509Thumbprint;
        }

        public String getX509Url() {
            return this.x509Url;
        }

        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        public Header setAlgorithm(String str) {
            this.algorithm = str;
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

        public Header setX509Thumbprint(String str) {
            this.x509Thumbprint = str;
            return this;
        }

        public Header setX509Url(String str) {
            this.x509Url = str;
            return this;
        }
    }
}
