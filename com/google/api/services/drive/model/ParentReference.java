package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;

public final class ParentReference extends C0657b {
    @ab
    private String id;
    @ab
    private Boolean isRoot;
    @ab
    private String kind;
    @ab
    private String parentLink;
    @ab
    private String selfLink;

    public ParentReference clone() {
        return (ParentReference) super.clone();
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsRoot() {
        return this.isRoot;
    }

    public String getKind() {
        return this.kind;
    }

    public String getParentLink() {
        return this.parentLink;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public ParentReference set(String str, Object obj) {
        return (ParentReference) super.set(str, obj);
    }

    public ParentReference setId(String str) {
        this.id = str;
        return this;
    }

    public ParentReference setIsRoot(Boolean bool) {
        this.isRoot = bool;
        return this;
    }

    public ParentReference setKind(String str) {
        this.kind = str;
        return this;
    }

    public ParentReference setParentLink(String str) {
        this.parentLink = str;
        return this;
    }

    public ParentReference setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
