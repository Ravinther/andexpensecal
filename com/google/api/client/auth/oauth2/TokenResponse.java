package com.google.api.client.auth.oauth2;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;

public class TokenResponse extends C0657b {
    @ab(a = "access_token")
    private String accessToken;
    @ab(a = "expires_in")
    private Long expiresInSeconds;
    @ab(a = "refresh_token")
    private String refreshToken;
    @ab
    private String scope;
    @ab(a = "token_type")
    private String tokenType;

    public TokenResponse clone() {
        return (TokenResponse) super.clone();
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public TokenResponse set(String str, Object obj) {
        return (TokenResponse) super.set(str, obj);
    }

    public TokenResponse setAccessToken(String str) {
        this.accessToken = (String) am.m6911a((Object) str);
        return this;
    }

    public TokenResponse setExpiresInSeconds(Long l) {
        this.expiresInSeconds = l;
        return this;
    }

    public TokenResponse setRefreshToken(String str) {
        this.refreshToken = str;
        return this;
    }

    public TokenResponse setScope(String str) {
        this.scope = str;
        return this;
    }

    public TokenResponse setTokenType(String str) {
        this.tokenType = (String) am.m6911a((Object) str);
        return this;
    }
}
