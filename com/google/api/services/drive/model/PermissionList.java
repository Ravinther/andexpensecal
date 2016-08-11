package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class PermissionList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<Permission> items;
    @ab
    private String kind;
    @ab
    private String selfLink;

    static {
        C0728p.m6961a(Permission.class);
    }

    public PermissionList clone() {
        return (PermissionList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<Permission> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public PermissionList set(String str, Object obj) {
        return (PermissionList) super.set(str, obj);
    }

    public PermissionList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public PermissionList setItems(List<Permission> list) {
        this.items = list;
        return this;
    }

    public PermissionList setKind(String str) {
        this.kind = str;
        return this;
    }

    public PermissionList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
