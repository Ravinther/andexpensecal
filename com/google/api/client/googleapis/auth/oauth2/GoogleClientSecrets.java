package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.json.C0657b;
import com.google.api.client.json.C0771d;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;
import java.io.InputStream;
import java.util.List;

public final class GoogleClientSecrets extends C0657b {
    @ab
    private Details installed;
    @ab
    private Details web;

    public final class Details extends C0657b {
        @ab(a = "auth_uri")
        private String authUri;
        @ab(a = "client_id")
        private String clientId;
        @ab(a = "client_secret")
        private String clientSecret;
        @ab(a = "redirect_uris")
        private List<String> redirectUris;
        @ab(a = "token_uri")
        private String tokenUri;

        public Details clone() {
            return (Details) super.clone();
        }

        public String getAuthUri() {
            return this.authUri;
        }

        public String getClientId() {
            return this.clientId;
        }

        public String getClientSecret() {
            return this.clientSecret;
        }

        public List<String> getRedirectUris() {
            return this.redirectUris;
        }

        public String getTokenUri() {
            return this.tokenUri;
        }

        public Details set(String str, Object obj) {
            return (Details) super.set(str, obj);
        }

        public Details setAuthUri(String str) {
            this.authUri = str;
            return this;
        }

        public Details setClientId(String str) {
            this.clientId = str;
            return this;
        }

        public Details setClientSecret(String str) {
            this.clientSecret = str;
            return this;
        }

        public Details setRedirectUris(List<String> list) {
            this.redirectUris = list;
            return this;
        }

        public Details setTokenUri(String str) {
            this.tokenUri = str;
            return this;
        }
    }

    public static GoogleClientSecrets load(C0771d c0771d, InputStream inputStream) {
        return (GoogleClientSecrets) c0771d.m7056a(inputStream, GoogleClientSecrets.class);
    }

    public GoogleClientSecrets clone() {
        return (GoogleClientSecrets) super.clone();
    }

    public Details getDetails() {
        boolean z = true;
        if ((this.web == null) == (this.installed == null)) {
            z = false;
        }
        am.m6914a(z);
        return this.web == null ? this.installed : this.web;
    }

    public Details getInstalled() {
        return this.installed;
    }

    public Details getWeb() {
        return this.web;
    }

    public GoogleClientSecrets set(String str, Object obj) {
        return (GoogleClientSecrets) super.set(str, obj);
    }

    public GoogleClientSecrets setInstalled(Details details) {
        this.installed = details;
        return this;
    }

    public GoogleClientSecrets setWeb(Details details) {
        this.web = details;
        return this;
    }
}
