package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;

public final class User extends C0657b {
    @ab
    private String displayName;
    @ab
    private Boolean isAuthenticatedUser;
    @ab
    private String kind;
    @ab
    private String permissionId;
    @ab
    private Picture picture;

    public final class Picture extends C0657b {
        @ab
        private String url;

        public Picture clone() {
            return (Picture) super.clone();
        }

        public String getUrl() {
            return this.url;
        }

        public Picture set(String str, Object obj) {
            return (Picture) super.set(str, obj);
        }

        public Picture setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public User clone() {
        return (User) super.clone();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public Boolean getIsAuthenticatedUser() {
        return this.isAuthenticatedUser;
    }

    public String getKind() {
        return this.kind;
    }

    public String getPermissionId() {
        return this.permissionId;
    }

    public Picture getPicture() {
        return this.picture;
    }

    public User set(String str, Object obj) {
        return (User) super.set(str, obj);
    }

    public User setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public User setIsAuthenticatedUser(Boolean bool) {
        this.isAuthenticatedUser = bool;
        return this;
    }

    public User setKind(String str) {
        this.kind = str;
        return this;
    }

    public User setPermissionId(String str) {
        this.permissionId = str;
        return this;
    }

    public User setPicture(Picture picture) {
        this.picture = picture;
        return this;
    }
}
