package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class RevisionList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<Revision> items;
    @ab
    private String kind;
    @ab
    private String selfLink;

    static {
        C0728p.m6961a(Revision.class);
    }

    public RevisionList clone() {
        return (RevisionList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<Revision> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public RevisionList set(String str, Object obj) {
        return (RevisionList) super.set(str, obj);
    }

    public RevisionList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public RevisionList setItems(List<Revision> list) {
        this.items = list;
        return this;
    }

    public RevisionList setKind(String str) {
        this.kind = str;
        return this;
    }

    public RevisionList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
