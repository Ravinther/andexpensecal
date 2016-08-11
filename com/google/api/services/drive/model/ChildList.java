package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class ChildList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<ChildReference> items;
    @ab
    private String kind;
    @ab
    private String nextLink;
    @ab
    private String nextPageToken;
    @ab
    private String selfLink;

    static {
        C0728p.m6961a(ChildReference.class);
    }

    public ChildList clone() {
        return (ChildList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<ChildReference> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getNextLink() {
        return this.nextLink;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public ChildList set(String str, Object obj) {
        return (ChildList) super.set(str, obj);
    }

    public ChildList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public ChildList setItems(List<ChildReference> list) {
        this.items = list;
        return this;
    }

    public ChildList setKind(String str) {
        this.kind = str;
        return this;
    }

    public ChildList setNextLink(String str) {
        this.nextLink = str;
        return this;
    }

    public ChildList setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    public ChildList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
