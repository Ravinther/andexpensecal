package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class App extends C0657b {
    @ab
    private Boolean authorized;
    @ab
    private List<Icons> icons;
    @ab
    private String id;
    @ab
    private Boolean installed;
    @ab
    private String kind;
    @ab
    private String name;
    @ab
    private String objectType;
    @ab
    private List<String> primaryFileExtensions;
    @ab
    private List<String> primaryMimeTypes;
    @ab
    private String productUrl;
    @ab
    private List<String> secondaryFileExtensions;
    @ab
    private List<String> secondaryMimeTypes;
    @ab
    private Boolean supportsCreate;
    @ab
    private Boolean supportsImport;
    @ab
    private Boolean useByDefault;

    public final class Icons extends C0657b {
        @ab
        private String category;
        @ab
        private String iconUrl;
        @ab
        private Integer size;

        public Icons clone() {
            return (Icons) super.clone();
        }

        public String getCategory() {
            return this.category;
        }

        public String getIconUrl() {
            return this.iconUrl;
        }

        public Integer getSize() {
            return this.size;
        }

        public Icons set(String str, Object obj) {
            return (Icons) super.set(str, obj);
        }

        public Icons setCategory(String str) {
            this.category = str;
            return this;
        }

        public Icons setIconUrl(String str) {
            this.iconUrl = str;
            return this;
        }

        public Icons setSize(Integer num) {
            this.size = num;
            return this;
        }
    }

    static {
        C0728p.m6961a(Icons.class);
    }

    public App clone() {
        return (App) super.clone();
    }

    public Boolean getAuthorized() {
        return this.authorized;
    }

    public List<Icons> getIcons() {
        return this.icons;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getInstalled() {
        return this.installed;
    }

    public String getKind() {
        return this.kind;
    }

    public String getName() {
        return this.name;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public List<String> getPrimaryFileExtensions() {
        return this.primaryFileExtensions;
    }

    public List<String> getPrimaryMimeTypes() {
        return this.primaryMimeTypes;
    }

    public String getProductUrl() {
        return this.productUrl;
    }

    public List<String> getSecondaryFileExtensions() {
        return this.secondaryFileExtensions;
    }

    public List<String> getSecondaryMimeTypes() {
        return this.secondaryMimeTypes;
    }

    public Boolean getSupportsCreate() {
        return this.supportsCreate;
    }

    public Boolean getSupportsImport() {
        return this.supportsImport;
    }

    public Boolean getUseByDefault() {
        return this.useByDefault;
    }

    public App set(String str, Object obj) {
        return (App) super.set(str, obj);
    }

    public App setAuthorized(Boolean bool) {
        this.authorized = bool;
        return this;
    }

    public App setIcons(List<Icons> list) {
        this.icons = list;
        return this;
    }

    public App setId(String str) {
        this.id = str;
        return this;
    }

    public App setInstalled(Boolean bool) {
        this.installed = bool;
        return this;
    }

    public App setKind(String str) {
        this.kind = str;
        return this;
    }

    public App setName(String str) {
        this.name = str;
        return this;
    }

    public App setObjectType(String str) {
        this.objectType = str;
        return this;
    }

    public App setPrimaryFileExtensions(List<String> list) {
        this.primaryFileExtensions = list;
        return this;
    }

    public App setPrimaryMimeTypes(List<String> list) {
        this.primaryMimeTypes = list;
        return this;
    }

    public App setProductUrl(String str) {
        this.productUrl = str;
        return this;
    }

    public App setSecondaryFileExtensions(List<String> list) {
        this.secondaryFileExtensions = list;
        return this;
    }

    public App setSecondaryMimeTypes(List<String> list) {
        this.secondaryMimeTypes = list;
        return this;
    }

    public App setSupportsCreate(Boolean bool) {
        this.supportsCreate = bool;
        return this;
    }

    public App setSupportsImport(Boolean bool) {
        this.supportsImport = bool;
        return this;
    }

    public App setUseByDefault(Boolean bool) {
        this.useByDefault = bool;
        return this;
    }
}
