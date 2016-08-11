package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;

public final class Property extends C0657b {
    @ab
    private String etag;
    @ab
    private String key;
    @ab
    private String kind;
    @ab
    private String selfLink;
    @ab
    private String value;
    @ab
    private String visibility;

    public Property clone() {
        return (Property) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public String getKey() {
        return this.key;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public String getValue() {
        return this.value;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public Property set(String str, Object obj) {
        return (Property) super.set(str, obj);
    }

    public Property setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Property setKey(String str) {
        this.key = str;
        return this;
    }

    public Property setKind(String str) {
        this.kind = str;
        return this;
    }

    public Property setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }

    public Property setValue(String str) {
        this.value = str;
        return this;
    }

    public Property setVisibility(String str) {
        this.visibility = str;
        return this;
    }
}
