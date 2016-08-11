package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class ParentList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<ParentReference> items;
    @ab
    private String kind;
    @ab
    private String selfLink;

    public ParentList clone() {
        return (ParentList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<ParentReference> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public ParentList set(String str, Object obj) {
        return (ParentList) super.set(str, obj);
    }

    public ParentList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public ParentList setItems(List<ParentReference> list) {
        this.items = list;
        return this;
    }

    public ParentList setKind(String str) {
        this.kind = str;
        return this;
    }

    public ParentList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
