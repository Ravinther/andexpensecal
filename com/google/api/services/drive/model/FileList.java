package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class FileList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<File> items;
    @ab
    private String kind;
    @ab
    private String nextLink;
    @ab
    private String nextPageToken;
    @ab
    private String selfLink;

    public FileList clone() {
        return (FileList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<File> getItems() {
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

    public FileList set(String str, Object obj) {
        return (FileList) super.set(str, obj);
    }

    public FileList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public FileList setItems(List<File> list) {
        this.items = list;
        return this;
    }

    public FileList setKind(String str) {
        this.kind = str;
        return this;
    }

    public FileList setNextLink(String str) {
        this.nextLink = str;
        return this;
    }

    public FileList setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    public FileList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
