package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class CommentList extends C0657b {
    @ab
    private List<Comment> items;
    @ab
    private String kind;
    @ab
    private String nextPageToken;

    public CommentList clone() {
        return (CommentList) super.clone();
    }

    public List<Comment> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public CommentList set(String str, Object obj) {
        return (CommentList) super.set(str, obj);
    }

    public CommentList setItems(List<Comment> list) {
        this.items = list;
        return this;
    }

    public CommentList setKind(String str) {
        this.kind = str;
        return this;
    }

    public CommentList setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }
}
