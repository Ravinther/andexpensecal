package com.google.api.client.auth.openidconnect;

import com.google.api.client.auth.oauth2.C0658a;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;

public class IdTokenResponse extends TokenResponse {
    @ab(a = "id_token")
    private String idToken;

    public static IdTokenResponse execute(C0658a c0658a) {
        return (IdTokenResponse) c0658a.m6522a().m6806a(IdTokenResponse.class);
    }

    public IdTokenResponse clone() {
        return (IdTokenResponse) super.clone();
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public IdToken parseIdToken() {
        return IdToken.m6535a(getFactory(), this.idToken);
    }

    public IdTokenResponse set(String str, Object obj) {
        return (IdTokenResponse) super.set(str, obj);
    }

    public IdTokenResponse setAccessToken(String str) {
        super.setAccessToken(str);
        return this;
    }

    public IdTokenResponse setExpiresInSeconds(Long l) {
        super.setExpiresInSeconds(l);
        return this;
    }

    public IdTokenResponse setIdToken(String str) {
        this.idToken = (String) am.m6911a((Object) str);
        return this;
    }

    public IdTokenResponse setRefreshToken(String str) {
        super.setRefreshToken(str);
        return this;
    }

    public IdTokenResponse setScope(String str) {
        super.setScope(str);
        return this;
    }

    public IdTokenResponse setTokenType(String str) {
        super.setTokenType(str);
        return this;
    }
}
