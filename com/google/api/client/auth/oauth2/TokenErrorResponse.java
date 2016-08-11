package com.google.api.client.auth.oauth2;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;

public class TokenErrorResponse extends C0657b {
    @ab
    private String error;
    @ab(a = "error_description")
    private String errorDescription;
    @ab(a = "error_uri")
    private String errorUri;

    public TokenErrorResponse clone() {
        return (TokenErrorResponse) super.clone();
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorUri() {
        return this.errorUri;
    }

    public TokenErrorResponse set(String str, Object obj) {
        return (TokenErrorResponse) super.set(str, obj);
    }

    public TokenErrorResponse setError(String str) {
        this.error = (String) am.m6911a((Object) str);
        return this;
    }

    public TokenErrorResponse setErrorDescription(String str) {
        this.errorDescription = str;
        return this;
    }

    public TokenErrorResponse setErrorUri(String str) {
        this.errorUri = str;
        return this;
    }
}
