package com.google.api.services.drive;

import com.google.api.client.googleapis.p074d.p075a.C0763c;
import com.google.api.client.p050d.ab;
import com.google.api.client.p051b.C0688p;

public abstract class DriveRequest<T> extends C0763c<T> {
    @ab
    private String alt;
    @ab
    private String fields;
    @ab
    private String key;
    @ab(a = "oauth_token")
    private String oauthToken;
    @ab
    private Boolean prettyPrint;
    @ab
    private String quotaUser;
    @ab
    private String userIp;

    public DriveRequest(Drive drive, String str, String str2, Object obj, Class<T> cls) {
        super(drive, str, str2, obj, cls);
    }

    public final Drive getAbstractGoogleClient() {
        return (Drive) super.getAbstractGoogleClient();
    }

    public String getAlt() {
        return this.alt;
    }

    public String getFields() {
        return this.fields;
    }

    public String getKey() {
        return this.key;
    }

    public String getOauthToken() {
        return this.oauthToken;
    }

    public Boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public String getQuotaUser() {
        return this.quotaUser;
    }

    public String getUserIp() {
        return this.userIp;
    }

    public DriveRequest<T> set(String str, Object obj) {
        return (DriveRequest) super.set(str, obj);
    }

    public DriveRequest<T> setAlt(String str) {
        this.alt = str;
        return this;
    }

    public DriveRequest<T> setDisableGZipContent(boolean z) {
        return (DriveRequest) super.setDisableGZipContent(z);
    }

    public DriveRequest<T> setFields(String str) {
        this.fields = str;
        return this;
    }

    public DriveRequest<T> setKey(String str) {
        this.key = str;
        return this;
    }

    public DriveRequest<T> setOauthToken(String str) {
        this.oauthToken = str;
        return this;
    }

    public DriveRequest<T> setPrettyPrint(Boolean bool) {
        this.prettyPrint = bool;
        return this;
    }

    public DriveRequest<T> setQuotaUser(String str) {
        this.quotaUser = str;
        return this;
    }

    public DriveRequest<T> setRequestHeaders(C0688p c0688p) {
        return (DriveRequest) super.setRequestHeaders(c0688p);
    }

    public DriveRequest<T> setUserIp(String str) {
        this.userIp = str;
        return this;
    }
}
