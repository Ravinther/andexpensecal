package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.json.C0782j;
import com.google.api.client.p050d.ab;

public final class Change extends C0657b {
    @ab
    private Boolean deleted;
    @ab
    private File file;
    @ab
    private String fileId;
    @ab
    @C0782j
    private Long id;
    @ab
    private String kind;
    @ab
    private String selfLink;

    public Change clone() {
        return (Change) super.clone();
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public File getFile() {
        return this.file;
    }

    public String getFileId() {
        return this.fileId;
    }

    public Long getId() {
        return this.id;
    }

    public String getKind() {
        return this.kind;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public Change set(String str, Object obj) {
        return (Change) super.set(str, obj);
    }

    public Change setDeleted(Boolean bool) {
        this.deleted = bool;
        return this;
    }

    public Change setFile(File file) {
        this.file = file;
        return this;
    }

    public Change setFileId(String str) {
        this.fileId = str;
        return this;
    }

    public Change setId(Long l) {
        this.id = l;
        return this;
    }

    public Change setKind(String str) {
        this.kind = str;
        return this;
    }

    public Change setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }
}
