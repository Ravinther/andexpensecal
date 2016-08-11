package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class CommentReplyList extends C0657b {
    @ab
    private List<CommentReply> items;
    @ab
    private String kind;
    @ab
    private String nextPageToken;

    public CommentReplyList clone() {
        return (CommentReplyList) super.clone();
    }

    public List<CommentReply> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public CommentReplyList set(String str, Object obj) {
        return (CommentReplyList) super.set(str, obj);
    }

    public CommentReplyList setItems(List<CommentReply> list) {
        this.items = list;
        return this;
    }

    public CommentReplyList setKind(String str) {
        this.kind = str;
        return this;
    }

    public CommentReplyList setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }
}
