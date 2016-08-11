package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0733u;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class Comment extends C0657b {
    @ab
    private String anchor;
    @ab
    private User author;
    @ab
    private String commentId;
    @ab
    private String content;
    @ab
    private Context context;
    @ab
    private C0733u createdDate;
    @ab
    private Boolean deleted;
    @ab
    private String fileId;
    @ab
    private String fileTitle;
    @ab
    private String htmlContent;
    @ab
    private String kind;
    @ab
    private C0733u modifiedDate;
    @ab
    private List<CommentReply> replies;
    @ab
    private String selfLink;
    @ab
    private String status;

    public final class Context extends C0657b {
        @ab
        private String type;
        @ab
        private String value;

        public Context clone() {
            return (Context) super.clone();
        }

        public String getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }

        public Context set(String str, Object obj) {
            return (Context) super.set(str, obj);
        }

        public Context setType(String str) {
            this.type = str;
            return this;
        }

        public Context setValue(String str) {
            this.value = str;
            return this;
        }
    }

    static {
        C0728p.m6961a(CommentReply.class);
    }

    public Comment clone() {
        return (Comment) super.clone();
    }

    public String getAnchor() {
        return this.anchor;
    }

    public User getAuthor() {
        return this.author;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public String getContent() {
        return this.content;
    }

    public Context getContext() {
        return this.context;
    }

    public C0733u getCreatedDate() {
        return this.createdDate;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileTitle() {
        return this.fileTitle;
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

    public List<CommentReply> getReplies() {
        return this.replies;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public String getStatus() {
        return this.status;
    }

    public Comment set(String str, Object obj) {
        return (Comment) super.set(str, obj);
    }

    public Comment setAnchor(String str) {
        this.anchor = str;
        return this;
    }

    public Comment setAuthor(User user) {
        this.author = user;
        return this;
    }

    public Comment setCommentId(String str) {
        this.commentId = str;
        return this;
    }

    public Comment setContent(String str) {
        this.content = str;
        return this;
    }

    public Comment setContext(Context context) {
        this.context = context;
        return this;
    }

    public Comment setCreatedDate(C0733u c0733u) {
        this.createdDate = c0733u;
        return this;
    }

    public Comment setDeleted(Boolean bool) {
        this.deleted = bool;
        return this;
    }

    public Comment setFileId(String str) {
        this.fileId = str;
        return this;
    }

    public Comment setFileTitle(String str) {
        this.fileTitle = str;
        return this;
    }

    public Comment setHtmlContent(String str) {
        this.htmlContent = str;
        return this;
    }

    public Comment setKind(String str) {
        this.kind = str;
        return this;
    }

    public Comment setModifiedDate(C0733u c0733u) {
        this.modifiedDate = c0733u;
        return this;
    }

    public Comment setReplies(List<CommentReply> list) {
        this.replies = list;
        return this;
    }

    public Comment setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }

    public Comment setStatus(String str) {
        this.status = str;
        return this;
    }
}
