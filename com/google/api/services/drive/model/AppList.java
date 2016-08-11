package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class AppList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<App> items;
    @ab
    private String kind;
    @ab
    private String selfLink;

    public AppList clone() {
        return (AppList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<App> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public AppList set(String str, Object obj) {
        return (AppList) super.set(str, obj);
    }

    public AppList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public AppList setItems(List<App> list) {
        this.items = list;
        return this;
    }

    public AppList setKind(String str) {
        this.kind = str;
        return this;
    }

    public AppList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
