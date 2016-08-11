package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.json.C0782j;
import com.google.api.client.p050d.C0733u;
import com.google.api.client.p050d.ab;
import java.util.Map;

public final class Revision extends C0657b {
    @ab
    private String downloadUrl;
    @ab
    private String etag;
    @ab
    private Map<String, String> exportLinks;
    @ab
    @C0782j
    private Long fileSize;
    @ab
    private String id;
    @ab
    private String kind;
    @ab
    private User lastModifyingUser;
    @ab
    private String lastModifyingUserName;
    @ab
    private String md5Checksum;
    @ab
    private String mimeType;
    @ab
    private C0733u modifiedDate;
    @ab
    private String originalFilename;
    @ab
    private Boolean pinned;
    @ab
    private Boolean publishAuto;
    @ab
    private Boolean published;
    @ab
    private String publishedLink;
    @ab
    private Boolean publishedOutsideDomain;
    @ab
    private String selfLink;

    public Revision clone() {
        return (Revision) super.clone();
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getEtag() {
        return this.etag;
    }

    public Map<String, String> getExportLinks() {
        return this.exportLinks;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public String getId() {
        return this.id;
    }

    public String getKind() {
        return this.kind;
    }

    public User getLastModifyingUser() {
        return this.lastModifyingUser;
    }

    public String getLastModifyingUserName() {
        return this.lastModifyingUserName;
    }

    public String getMd5Checksum() {
        return this.md5Checksum;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public C0733u getModifiedDate() {
        return this.modifiedDate;
    }

    public String getOriginalFilename() {
        return this.originalFilename;
    }

    public Boolean getPinned() {
        return this.pinned;
    }

    public Boolean getPublishAuto() {
        return this.publishAuto;
    }

    public Boolean getPublished() {
        return this.published;
    }

    public String getPublishedLink() {
        return this.publishedLink;
    }

    public Boolean getPublishedOutsideDomain() {
        return this.publishedOutsideDomain;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public Revision set(String str, Object obj) {
        return (Revision) super.set(str, obj);
    }

    public Revision setDownloadUrl(String str) {
        this.downloadUrl = str;
        return this;
    }

    public Revision setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Revision setExportLinks(Map<String, String> map) {
        this.exportLinks = map;
        return this;
    }

    public Revision setFileSize(Long l) {
        this.fileSize = l;
        return this;
    }

    public Revision setId(String str) {
        this.id = str;
        return this;
    }

    public Revision setKind(String str) {
        this.kind = str;
        return this;
    }

    public Revision setLastModifyingUser(User user) {
        this.lastModifyingUser = user;
        return this;
    }

    public Revision setLastModifyingUserName(String str) {
        this.lastModifyingUserName = str;
        return this;
    }

    public Revision setMd5Checksum(String str) {
        this.md5Checksum = str;
        return this;
    }

    public Revision setMimeType(String str) {
        this.mimeType = str;
        return this;
    }

    public Revision setModifiedDate(C0733u c0733u) {
        this.modifiedDate = c0733u;
        return this;
    }

    public Revision setOriginalFilename(String str) {
        this.originalFilename = str;
        return this;
    }

    public Revision setPinned(Boolean bool) {
        this.pinned = bool;
        return this;
    }

    public Revision setPublishAuto(Boolean bool) {
        this.publishAuto = bool;
        return this;
    }

    public Revision setPublished(Boolean bool) {
        this.published = bool;
        return this;
    }

    public Revision setPublishedLink(String str) {
        this.publishedLink = str;
        return this;
    }

    public Revision setPublishedOutsideDomain(Boolean bool) {
        this.publishedOutsideDomain = bool;
        return this;
    }

    public Revision setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
