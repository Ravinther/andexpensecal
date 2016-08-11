package com.google.api.services.drive.model;

import com.google.api.client.json.C0657b;
import com.google.api.client.json.C0782j;
import com.google.api.client.p050d.C0719g;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0733u;
import com.google.api.client.p050d.ab;
import java.util.List;
import java.util.Map;

public final class File extends C0657b {
    @ab
    private String alternateLink;
    @ab
    private Boolean appDataContents;
    @ab
    private C0733u createdDate;
    @ab
    private String description;
    @ab
    private String downloadUrl;
    @ab
    private Boolean editable;
    @ab
    private String embedLink;
    @ab
    private String etag;
    @ab
    private Boolean explicitlyTrashed;
    @ab
    private Map<String, String> exportLinks;
    @ab
    private String fileExtension;
    @ab
    @C0782j
    private Long fileSize;
    @ab
    private String iconLink;
    @ab
    private String id;
    @ab
    private ImageMediaMetadata imageMediaMetadata;
    @ab
    private IndexableText indexableText;
    @ab
    private String kind;
    @ab
    private Labels labels;
    @ab
    private User lastModifyingUser;
    @ab
    private String lastModifyingUserName;
    @ab
    private C0733u lastViewedByMeDate;
    @ab
    private String md5Checksum;
    @ab
    private String mimeType;
    @ab
    private C0733u modifiedByMeDate;
    @ab
    private C0733u modifiedDate;
    @ab
    private String originalFilename;
    @ab
    private List<String> ownerNames;
    @ab
    private List<User> owners;
    @ab
    private List<ParentReference> parents;
    @ab
    @C0782j
    private Long quotaBytesUsed;
    @ab
    private String selfLink;
    @ab
    private Boolean shared;
    @ab
    private C0733u sharedWithMeDate;
    @ab
    private Thumbnail thumbnail;
    @ab
    private String thumbnailLink;
    @ab
    private String title;
    @ab
    private Permission userPermission;
    @ab
    private String webContentLink;
    @ab
    private String webViewLink;
    @ab
    private Boolean writersCanShare;

    public final class ImageMediaMetadata extends C0657b {
        @ab
        private Float aperture;
        @ab
        private String cameraMake;
        @ab
        private String cameraModel;
        @ab
        private String colorSpace;
        @ab
        private String date;
        @ab
        private Float exposureBias;
        @ab
        private String exposureMode;
        @ab
        private Float exposureTime;
        @ab
        private Boolean flashUsed;
        @ab
        private Float focalLength;
        @ab
        private Integer height;
        @ab
        private Integer isoSpeed;
        @ab
        private String lens;
        @ab
        private Location location;
        @ab
        private Float maxApertureValue;
        @ab
        private String meteringMode;
        @ab
        private Integer rotation;
        @ab
        private String sensor;
        @ab
        private Integer subjectDistance;
        @ab
        private String whiteBalance;
        @ab
        private Integer width;

        public final class Location extends C0657b {
            @ab
            private Double altitude;
            @ab
            private Double latitude;
            @ab
            private Double longitude;

            public Location clone() {
                return (Location) super.clone();
            }

            public Double getAltitude() {
                return this.altitude;
            }

            public Double getLatitude() {
                return this.latitude;
            }

            public Double getLongitude() {
                return this.longitude;
            }

            public Location set(String str, Object obj) {
                return (Location) super.set(str, obj);
            }

            public Location setAltitude(Double d) {
                this.altitude = d;
                return this;
            }

            public Location setLatitude(Double d) {
                this.latitude = d;
                return this;
            }

            public Location setLongitude(Double d) {
                this.longitude = d;
                return this;
            }
        }

        public ImageMediaMetadata clone() {
            return (ImageMediaMetadata) super.clone();
        }

        public Float getAperture() {
            return this.aperture;
        }

        public String getCameraMake() {
            return this.cameraMake;
        }

        public String getCameraModel() {
            return this.cameraModel;
        }

        public String getColorSpace() {
            return this.colorSpace;
        }

        public String getDate() {
            return this.date;
        }

        public Float getExposureBias() {
            return this.exposureBias;
        }

        public String getExposureMode() {
            return this.exposureMode;
        }

        public Float getExposureTime() {
            return this.exposureTime;
        }

        public Boolean getFlashUsed() {
            return this.flashUsed;
        }

        public Float getFocalLength() {
            return this.focalLength;
        }

        public Integer getHeight() {
            return this.height;
        }

        public Integer getIsoSpeed() {
            return this.isoSpeed;
        }

        public String getLens() {
            return this.lens;
        }

        public Location getLocation() {
            return this.location;
        }

        public Float getMaxApertureValue() {
            return this.maxApertureValue;
        }

        public String getMeteringMode() {
            return this.meteringMode;
        }

        public Integer getRotation() {
            return this.rotation;
        }

        public String getSensor() {
            return this.sensor;
        }

        public Integer getSubjectDistance() {
            return this.subjectDistance;
        }

        public String getWhiteBalance() {
            return this.whiteBalance;
        }

        public Integer getWidth() {
            return this.width;
        }

        public ImageMediaMetadata set(String str, Object obj) {
            return (ImageMediaMetadata) super.set(str, obj);
        }

        public ImageMediaMetadata setAperture(Float f) {
            this.aperture = f;
            return this;
        }

        public ImageMediaMetadata setCameraMake(String str) {
            this.cameraMake = str;
            return this;
        }

        public ImageMediaMetadata setCameraModel(String str) {
            this.cameraModel = str;
            return this;
        }

        public ImageMediaMetadata setColorSpace(String str) {
            this.colorSpace = str;
            return this;
        }

        public ImageMediaMetadata setDate(String str) {
            this.date = str;
            return this;
        }

        public ImageMediaMetadata setExposureBias(Float f) {
            this.exposureBias = f;
            return this;
        }

        public ImageMediaMetadata setExposureMode(String str) {
            this.exposureMode = str;
            return this;
        }

        public ImageMediaMetadata setExposureTime(Float f) {
            this.exposureTime = f;
            return this;
        }

        public ImageMediaMetadata setFlashUsed(Boolean bool) {
            this.flashUsed = bool;
            return this;
        }

        public ImageMediaMetadata setFocalLength(Float f) {
            this.focalLength = f;
            return this;
        }

        public ImageMediaMetadata setHeight(Integer num) {
            this.height = num;
            return this;
        }

        public ImageMediaMetadata setIsoSpeed(Integer num) {
            this.isoSpeed = num;
            return this;
        }

        public ImageMediaMetadata setLens(String str) {
            this.lens = str;
            return this;
        }

        public ImageMediaMetadata setLocation(Location location) {
            this.location = location;
            return this;
        }

        public ImageMediaMetadata setMaxApertureValue(Float f) {
            this.maxApertureValue = f;
            return this;
        }

        public ImageMediaMetadata setMeteringMode(String str) {
            this.meteringMode = str;
            return this;
        }

        public ImageMediaMetadata setRotation(Integer num) {
            this.rotation = num;
            return this;
        }

        public ImageMediaMetadata setSensor(String str) {
            this.sensor = str;
            return this;
        }

        public ImageMediaMetadata setSubjectDistance(Integer num) {
            this.subjectDistance = num;
            return this;
        }

        public ImageMediaMetadata setWhiteBalance(String str) {
            this.whiteBalance = str;
            return this;
        }

        public ImageMediaMetadata setWidth(Integer num) {
            this.width = num;
            return this;
        }
    }

    public final class IndexableText extends C0657b {
        @ab
        private String text;

        public IndexableText clone() {
            return (IndexableText) super.clone();
        }

        public String getText() {
            return this.text;
        }

        public IndexableText set(String str, Object obj) {
            return (IndexableText) super.set(str, obj);
        }

        public IndexableText setText(String str) {
            this.text = str;
            return this;
        }
    }

    public final class Labels extends C0657b {
        @ab
        private Boolean hidden;
        @ab
        private Boolean restricted;
        @ab
        private Boolean starred;
        @ab
        private Boolean trashed;
        @ab
        private Boolean viewed;

        public Labels clone() {
            return (Labels) super.clone();
        }

        public Boolean getHidden() {
            return this.hidden;
        }

        public Boolean getRestricted() {
            return this.restricted;
        }

        public Boolean getStarred() {
            return this.starred;
        }

        public Boolean getTrashed() {
            return this.trashed;
        }

        public Boolean getViewed() {
            return this.viewed;
        }

        public Labels set(String str, Object obj) {
            return (Labels) super.set(str, obj);
        }

        public Labels setHidden(Boolean bool) {
            this.hidden = bool;
            return this;
        }

        public Labels setRestricted(Boolean bool) {
            this.restricted = bool;
            return this;
        }

        public Labels setStarred(Boolean bool) {
            this.starred = bool;
            return this;
        }

        public Labels setTrashed(Boolean bool) {
            this.trashed = bool;
            return this;
        }

        public Labels setViewed(Boolean bool) {
            this.viewed = bool;
            return this;
        }
    }

    public final class Thumbnail extends C0657b {
        @ab
        private String image;
        @ab
        private String mimeType;

        public Thumbnail clone() {
            return (Thumbnail) super.clone();
        }

        public byte[] decodeImage() {
            return C0719g.m6948a(this.image);
        }

        public Thumbnail encodeImage(byte[] bArr) {
            this.image = C0719g.m6947a(bArr);
            return this;
        }

        public String getImage() {
            return this.image;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public Thumbnail set(String str, Object obj) {
            return (Thumbnail) super.set(str, obj);
        }

        public Thumbnail setImage(String str) {
            this.image = str;
            return this;
        }

        public Thumbnail setMimeType(String str) {
            this.mimeType = str;
            return this;
        }
    }

    static {
        C0728p.m6961a(User.class);
        C0728p.m6961a(ParentReference.class);
    }

    public File clone() {
        return (File) super.clone();
    }

    public String getAlternateLink() {
        return this.alternateLink;
    }

    public Boolean getAppDataContents() {
        return this.appDataContents;
    }

    public C0733u getCreatedDate() {
        return this.createdDate;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public Boolean getEditable() {
        return this.editable;
    }

    public String getEmbedLink() {
        return this.embedLink;
    }

    public String getEtag() {
        return this.etag;
    }

    public Boolean getExplicitlyTrashed() {
        return this.explicitlyTrashed;
    }

    public Map<String, String> getExportLinks() {
        return this.exportLinks;
    }

    public String getFileExtension() {
        return this.fileExtension;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public String getIconLink() {
        return this.iconLink;
    }

    public String getId() {
        return this.id;
    }

    public ImageMediaMetadata getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    public IndexableText getIndexableText() {
        return this.indexableText;
    }

    public String getKind() {
        return this.kind;
    }

    public Labels getLabels() {
        return this.labels;
    }

    public User getLastModifyingUser() {
        return this.lastModifyingUser;
    }

    public String getLastModifyingUserName() {
        return this.lastModifyingUserName;
    }

    public C0733u getLastViewedByMeDate() {
        return this.lastViewedByMeDate;
    }

    public String getMd5Checksum() {
        return this.md5Checksum;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public C0733u getModifiedByMeDate() {
        return this.modifiedByMeDate;
    }

    public C0733u getModifiedDate() {
        return this.modifiedDate;
    }

    public String getOriginalFilename() {
        return this.originalFilename;
    }

    public List<String> getOwnerNames() {
        return this.ownerNames;
    }

    public List<User> getOwners() {
        return this.owners;
    }

    public List<ParentReference> getParents() {
        return this.parents;
    }

    public Long getQuotaBytesUsed() {
        return this.quotaBytesUsed;
    }

    public String getSelfLink() {
        return this.selfLink;
    }

    public Boolean getShared() {
        return this.shared;
    }

    public C0733u getSharedWithMeDate() {
        return this.sharedWithMeDate;
    }

    public Thumbnail getThumbnail() {
        return this.thumbnail;
    }

    public String getThumbnailLink() {
        return this.thumbnailLink;
    }

    public String getTitle() {
        return this.title;
    }

    public Permission getUserPermission() {
        return this.userPermission;
    }

    public String getWebContentLink() {
        return this.webContentLink;
    }

    public String getWebViewLink() {
        return this.webViewLink;
    }

    public Boolean getWritersCanShare() {
        return this.writersCanShare;
    }

    public File set(String str, Object obj) {
        return (File) super.set(str, obj);
    }

    public File setAlternateLink(String str) {
        this.alternateLink = str;
        return this;
    }

    public File setAppDataContents(Boolean bool) {
        this.appDataContents = bool;
        return this;
    }

    public File setCreatedDate(C0733u c0733u) {
        this.createdDate = c0733u;
        return this;
    }

    public File setDescription(String str) {
        this.description = str;
        return this;
    }

    public File setDownloadUrl(String str) {
        this.downloadUrl = str;
        return this;
    }

    public File setEditable(Boolean bool) {
        this.editable = bool;
        return this;
    }

    public File setEmbedLink(String str) {
        this.embedLink = str;
        return this;
    }

    public File setEtag(String str) {
        this.etag = str;
        return this;
    }

    public File setExplicitlyTrashed(Boolean bool) {
        this.explicitlyTrashed = bool;
        return this;
    }

    public File setExportLinks(Map<String, String> map) {
        this.exportLinks = map;
        return this;
    }

    public File setFileExtension(String str) {
        this.fileExtension = str;
        return this;
    }

    public File setFileSize(Long l) {
        this.fileSize = l;
        return this;
    }

    public File setIconLink(String str) {
        this.iconLink = str;
        return this;
    }

    public File setId(String str) {
        this.id = str;
        return this;
    }

    public File setImageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
        this.imageMediaMetadata = imageMediaMetadata;
        return this;
    }

    public File setIndexableText(IndexableText indexableText) {
        this.indexableText = indexableText;
        return this;
    }

    public File setKind(String str) {
        this.kind = str;
        return this;
    }

    public File setLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public File setLastModifyingUser(User user) {
        this.lastModifyingUser = user;
        return this;
    }

    public File setLastModifyingUserName(String str) {
        this.lastModifyingUserName = str;
        return this;
    }

    public File setLastViewedByMeDate(C0733u c0733u) {
        this.lastViewedByMeDate = c0733u;
        return this;
    }

    public File setMd5Checksum(String str) {
        this.md5Checksum = str;
        return this;
    }

    public File setMimeType(String str) {
        this.mimeType = str;
        return this;
    }

    public File setModifiedByMeDate(C0733u c0733u) {
        this.modifiedByMeDate = c0733u;
        return this;
    }

    public File setModifiedDate(C0733u c0733u) {
        this.modifiedDate = c0733u;
        return this;
    }

    public File setOriginalFilename(String str) {
        this.originalFilename = str;
        return this;
    }

    public File setOwnerNames(List<String> list) {
        this.ownerNames = list;
        return this;
    }

    public File setOwners(List<User> list) {
        this.owners = list;
        return this;
    }

    public File setParents(List<ParentReference> list) {
        this.parents = list;
        return this;
    }

    public File setQuotaBytesUsed(Long l) {
        this.quotaBytesUsed = l;
        return this;
    }

    public File setSelfLink(String str) {
        this.selfLink = str;
        return this;
    }

    public File setShared(Boolean bool) {
        this.shared = bool;
        return this;
    }

    public File setSharedWithMeDate(C0733u c0733u) {
        this.sharedWithMeDate = c0733u;
        return this;
    }

    public File setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public File setThumbnailLink(String str) {
        this.thumbnailLink = str;
        return this;
    }

    public File setTitle(String str) {
        this.title = str;
        return this;
    }

    public File setUserPermission(Permission permission) {
        this.userPermission = permission;
        return this;
    }

    public File setWebContentLink(String str) {
        this.webContentLink = str;
        return this;
    }

    public File setWebViewLink(String str) {
        this.webViewLink = str;
        return this;
    }

    public File setWritersCanShare(Boolean bool) {
        this.writersCanShare = bool;
        return this;
    }
}
