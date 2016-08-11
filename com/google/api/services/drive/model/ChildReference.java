package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;

public final class ChildReference extends C0657b {
    @ab
    private String childLink;
    @ab
    private String id;
    @ab
    private String kind;
    @ab
    private String selfLink;

    public ChildReference clone() {
        return (ChildReference) super.clone();
    }

    public String getChildLink() {
        return this.childLink;
    }

    public String getId() {
        return this.id;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public ChildReference set(String str, Object obj) {
        return (ChildReference) super.set(str, obj);
    }

    public ChildReference setChildLink(String str) {
        this.childLink = str;
        return this;
    }

    public ChildReference setId(String str) {
        this.id = str;
        return this;
    }

    public ChildReference setKind(String str) {
        this.kind = str;
        return this;
    }

    public ChildReference setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
