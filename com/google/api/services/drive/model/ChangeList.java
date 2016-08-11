package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.json.C0782j;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class ChangeList extends C0657b {
    @ab
    private String etag;
    @ab
    private List<Change> items;
    @ab
    private String kind;
    @ab
    @C0782j
    private Long largestChangeId;
    @ab
    private String nextLink;
    @ab
    private String nextPageToken;
    @ab
    private String selfLink;

    public ChangeList clone() {
        return (ChangeList) super.clone();
    }

    public String getEtag() {
        return this.etag;
    }

    public List<Change> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public Long getLargestChangeId() {
        return this.largestChangeId;
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

    public ChangeList set(String str, Object obj) {
        return (ChangeList) super.set(str, obj);
    }

    public ChangeList setEtag(String str) {
        this.etag = str;
        return this;
    }

    public ChangeList setItems(List<Change> list) {
        this.items = list;
        return this;
    }

    public ChangeList setKind(String str) {
        this.kind = str;
        return this;
    }

    public ChangeList setLargestChangeId(Long l) {
        this.largestChangeId = l;
        return this;
    }

    public ChangeList setNextLink(String str) {
        this.nextLink = str;
        return this;
    }

    public ChangeList setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    public ChangeList setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
