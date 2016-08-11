package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.C0733u;
import com.google.api.client.p050d.ab;

public final class CommentReply extends C0657b {
    @ab
    private User author;
    @ab
    private String content;
    @ab
    private C0733u createdDate;
    @ab
    private Boolean deleted;
    @ab
    private String htmlContent;
    @ab
    private String kind;
    @ab
    private C0733u modifiedDate;
    @ab
    private String replyId;
    @ab
    private String verb;

    public CommentReply clone() {
        return (CommentReply) super.clone();
    }

    public User getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

    public C0733u getCreatedDate() {
        return this.createdDate;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public String getHtmlContent() {
        return this.htmlContent;
    }

    public String getKind() {
        return this.kind;
    }

    public C0733u getModifiedDate() {
        return this.modifiedDate;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getVerb() {
        return this.verb;
    }

    public CommentReply set(String str, Object obj) {
        return (CommentReply) super.set(str, obj);
    }

    public CommentReply setAuthor(User user) {
        this.author = user;
        return this;
    }

    public CommentReply setContent(String str) {
        this.content = str;
        return this;
    }

    public CommentReply setCreatedDate(C0733u c0733u) {
        this.createdDate = c0733u;
        return this;
    }

    public CommentReply setDeleted(Boolean bool) {
        this.deleted = bool;
        return this;
    }

    public CommentReply setHtmlContent(String str) {
        this.htmlContent = str;
        return this;
    }

    public CommentReply setKind(String str) {
        this.kind = str;
        return this;
    }

    public CommentReply setModifiedDate(C0733u c0733u) {
        this.modifiedDate = c0733u;
        return this;
    }

    public CommentReply setReplyId(String str) {
        this.replyId = str;
        return this;
    }

    public CommentReply setVerb(String str) {
        this.verb = str;
        return this;
    }
}
