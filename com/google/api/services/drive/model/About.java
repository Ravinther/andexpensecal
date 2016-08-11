package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.json.C0782j;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.ab;
import java.util.List;

public final class About extends C0657b {
    @ab
    private List<AdditionalRoleInfo> additionalRoleInfo;
    @ab
    private String domainSharingPolicy;
    @ab
    private String etag;
    @ab
    private List<ExportFormats> exportFormats;
    @ab
    private List<Features> features;
    @ab
    private List<ImportFormats> importFormats;
    @ab
    private Boolean isCurrentAppInstalled;
    @ab
    private String kind;
    @ab
    @C0782j
    private Long largestChangeId;
    @ab
    private List<MaxUploadSizes> maxUploadSizes;
    @ab
    private String name;
    @ab
    private String permissionId;
    @ab
    @C0782j
    private Long quotaBytesTotal;
    @ab
    @C0782j
    private Long quotaBytesUsed;
    @ab
    @C0782j
    private Long quotaBytesUsedAggregate;
    @ab
    @C0782j
    private Long quotaBytesUsedInTrash;
    @ab
    @C0782j
    private Long remainingChangeIds;
    @ab
    private String rootFolderId;
    @ab
    private String selfLink;
    @ab
    private User user;

    public final class AdditionalRoleInfo extends C0657b {
        @ab
        private List<RoleSets> roleSets;
        @ab
        private String type;

        public final class RoleSets extends C0657b {
            @ab
            private List<String> additionalRoles;
            @ab
            private String primaryRole;

            public RoleSets clone() {
                return (RoleSets) super.clone();
            }

            public List<String> getAdditionalRoles() {
                return this.additionalRoles;
            }

            public String getPrimaryRole() {
                return this.primaryRole;
            }

            public RoleSets set(String str, Object obj) {
                return (RoleSets) super.set(str, obj);
            }

            public RoleSets setAdditionalRoles(List<String> list) {
                this.additionalRoles = list;
                return this;
            }

            public RoleSets setPrimaryRole(String str) {
                this.primaryRole = str;
                return this;
            }
        }

        static {
            C0728p.m6961a(RoleSets.class);
        }

        public AdditionalRoleInfo clone() {
            return (AdditionalRoleInfo) super.clone();
        }

        public List<RoleSets> getRoleSets() {
            return this.roleSets;
        }

        public String getType() {
            return this.type;
        }

        public AdditionalRoleInfo set(String str, Object obj) {
            return (AdditionalRoleInfo) super.set(str, obj);
        }

        public AdditionalRoleInfo setRoleSets(List<RoleSets> list) {
            this.roleSets = list;
            return this;
        }

        public AdditionalRoleInfo setType(String str) {
            this.type = str;
            return this;
        }
    }

    public final class ExportFormats extends C0657b {
        @ab
        private String source;
        @ab
        private List<String> targets;

        public ExportFormats clone() {
            return (ExportFormats) super.clone();
        }

        public String getSource() {
            return this.source;
        }

        public List<String> getTargets() {
            return this.targets;
        }

        public ExportFormats set(String str, Object obj) {
            return (ExportFormats) super.set(str, obj);
        }

        public ExportFormats setSource(String str) {
            this.source = str;
            return this;
        }

        public ExportFormats setTargets(List<String> list) {
            this.targets = list;
            return this;
        }
    }

    public final class Features extends C0657b {
        @ab
        private String featureName;
        @ab
        private Double featureRate;

        public Features clone() {
            return (Features) super.clone();
        }

        public String getFeatureName() {
            return this.featureName;
        }

        public Double getFeatureRate() {
            return this.featureRate;
        }

        public Features set(String str, Object obj) {
            return (Features) super.set(str, obj);
        }

        public Features setFeatureName(String str) {
            this.featureName = str;
            return this;
        }

        public Features setFeatureRate(Double d) {
            this.featureRate = d;
            return this;
        }
    }

    public final class ImportFormats extends C0657b {
        @ab
        private String source;
        @ab
        private List<String> targets;

        public ImportFormats clone() {
            return (ImportFormats) super.clone();
        }

        public String getSource() {
            return this.source;
        }

        public List<String> getTargets() {
            return this.targets;
        }

        public ImportFormats set(String str, Object obj) {
            return (ImportFormats) super.set(str, obj);
        }

        public ImportFormats setSource(String str) {
            this.source = str;
            return this;
        }

        public ImportFormats setTargets(List<String> list) {
            this.targets = list;
            return this;
        }
    }

    public final class MaxUploadSizes extends C0657b {
        @ab
        @C0782j
        private Long size;
        @ab
        private String type;

        public MaxUploadSizes clone() {
            return (MaxUploadSizes) super.clone();
        }

        public Long getSize() {
            return this.size;
        }

        public String getType() {
            return this.type;
        }

        public MaxUploadSizes set(String str, Object obj) {
            return (MaxUploadSizes) super.set(str, obj);
        }

        public MaxUploadSizes setSize(Long l) {
            this.size = l;
            return this;
        }

        public MaxUploadSizes setType(String str) {
            this.type = str;
            return this;
        }
    }

    static {
        C0728p.m6961a(AdditionalRoleInfo.class);
        C0728p.m6961a(ExportFormats.class);
        C0728p.m6961a(Features.class);
        C0728p.m6961a(ImportFormats.class);
        C0728p.m6961a(MaxUploadSizes.class);
    }

    public About clone() {
        return (About) super.clone();
    }

    public List<AdditionalRoleInfo> getAdditionalRoleInfo() {
        return this.additionalRoleInfo;
    }

    public String getDomainSharingPolicy() {
        return this.domainSharingPolicy;
    }

    public String getEtag() {
        return this.etag;
    }

    public List<ExportFormats> getExportFormats() {
        return this.exportFormats;
    }

    public List<Features> getFeatures() {
        return this.features;
    }

    public List<ImportFormats> getImportFormats() {
        return this.importFormats;
    }

    public Boolean getIsCurrentAppInstalled() {
        return this.isCurrentAppInstalled;
    }

    public String getKind() {
        return this.kind;
    }

    public Long getLargestChangeId() {
        return this.largestChangeId;
    }

    public List<MaxUploadSizes> getMaxUploadSizes() {
        return this.maxUploadSizes;
    }

    public String getName() {
        return this.name;
    }

    public String getPermissionId() {
        return this.permissionId;
    }

    public Long getQuotaBytesTotal() {
        return this.quotaBytesTotal;
    }

    public Long getQuotaBytesUsed() {
        return this.quotaBytesUsed;
    }

    public Long getQuotaBytesUsedAggregate() {
        return this.quotaBytesUsedAggregate;
    }

    public Long getQuotaBytesUsedInTrash() {
        return this.quotaBytesUsedInTrash;
    }

    public Long getRemainingChangeIds() {
        return this.remainingChangeIds;
    }

    public String getRootFolderId() {
        return this.rootFolderId;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public User getUser() {
        return this.user;
    }

    public About set(String str, Object obj) {
        return (About) super.set(str, obj);
    }

    public About setAdditionalRoleInfo(List<AdditionalRoleInfo> list) {
        this.additionalRoleInfo = list;
        return this;
    }

    public About setDomainSharingPolicy(String str) {
        this.domainSharingPolicy = str;
        return this;
    }

    public About setEtag(String str) {
        this.etag = str;
        return this;
    }

    public About setExportFormats(List<ExportFormats> list) {
        this.exportFormats = list;
        return this;
    }

    public About setFeatures(List<Features> list) {
        this.features = list;
        return this;
    }

    public About setImportFormats(List<ImportFormats> list) {
        this.importFormats = list;
        return this;
    }

    public About setIsCurrentAppInstalled(Boolean bool) {
        this.isCurrentAppInstalled = bool;
        return this;
    }

    public About setKind(String str) {
        this.kind = str;
        return this;
    }

    public About setLargestChangeId(Long l) {
        this.largestChangeId = l;
        return this;
    }

    public About setMaxUploadSizes(List<MaxUploadSizes> list) {
        this.maxUploadSizes = list;
        return this;
    }

    public About setName(String str) {
        this.name = str;
        return this;
    }

    public About setPermissionId(String str) {
        this.permissionId = str;
        return this;
    }

    public About setQuotaBytesTotal(Long l) {
        this.quotaBytesTotal = l;
        return this;
    }

    public About setQuotaBytesUsed(Long l) {
        this.quotaBytesUsed = l;
        return this;
    }

    public About setQuotaBytesUsedAggregate(Long l) {
        this.quotaBytesUsedAggregate = l;
        return this;
    }

    public About setQuotaBytesUsedInTrash(Long l) {
        this.quotaBytesUsedInTrash = l;
        return this;
    }

    public About setRemainingChangeIds(Long l) {
        this.remainingChangeIds = l;
        return this;
    }

    public About setRootFolderId(String str) {
        this.rootFolderId = str;
        return this;
    }

    public About setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }

    public About setUser(User user) {
        this.user = user;
        return this;
    }
}
