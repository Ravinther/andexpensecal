package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class PropertyList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<Property> items;
    @ab
    private String kind;
    @ab
    private String selfLink;

    public PropertyList clone() {
        return (PropertyList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<Property> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public PropertyList set(String str, Object obj) {
        return (PropertyList) super.set(str, obj);
    }

    public PropertyList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public PropertyList setItems(List<Property> list) {
        this.items = list;
        return this;
    }

    public PropertyList setKind(String str) {
        this.kind = str;
        return this;
    }

    public PropertyList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
