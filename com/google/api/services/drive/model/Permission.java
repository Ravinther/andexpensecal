package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class Permission extends C0657b {
    @ab
    private List<String> additionalRoles;
    @ab
    private String authKey;
    @ab
    private String etag;
    @ab
    private String id;
    @ab
    private String kind;
    @ab
    private String name;
    @ab
    private String photoLink;
    @ab
    private String role;
    @ab
    private String selfLink;
    @ab
    private String type;
    @ab
    private String value;
    @ab
    private Boolean withLink;

    public Permission clone() {
        return (Permission) super.clone();
    }

    public List<String> getAdditionalRoles() {
        return this.additionalRoles;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.id;
    }

    public String getKind() {
        return this.kind;
    }

    public String getName() {
        return this.name;
    }

    public String getPhotoLink() {
        return this.photoLink;
    }

    public String getRole() {
        return this.role;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public Boolean getWithLink() {
        return this.withLink;
    }

    public Permission set(String str, Object obj) {
        return (Permission) super.set(str, obj);
    }

    public Permission setAdditionalRoles(List<String> list) {
        this.additionalRoles = list;
        return this;
    }

    public Permission setAuthKey(String str) {
        this.authKey = str;
        return this;
    }

    public Permission setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Permission setId(String str) {
        this.id = str;
        return this;
    }

    public Permission setKind(String str) {
        this.kind = str;
        return this;
    }

    public Permission setName(String str) {
        this.name = str;
        return this;
    }

    public Permission setPhotoLink(String str) {
        this.photoLink = str;
        return this;
    }

    public Permission setRole(String str) {
        this.role = str;
        return this;
    }

    public Permission setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }

    public Permission setType(String str) {
        this.type = str;
        return this;
    }

    public Permission setValue(String str) {
        this.value = str;
        return this;
    }

    public Permission setWithLink(Boolean bool) {
        this.withLink = bool;
        return this;
    }
}
