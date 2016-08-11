package com.google.api.services.drive;

import com.google.api.client.googleapis.C0742a;
import com.google.api.client.googleapis.p074d.C0762c;
import com.google.api.client.googleapis.p074d.C0764f;
import com.google.api.client.googleapis.p074d.p075a.C0759a;
import com.google.api.client.googleapis.p074d.p075a.C0761b;
import com.google.api.client.json.C0771d;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0672b;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.ac;
import com.google.api.services.drive.model.App;
import com.google.api.services.drive.model.AppList;
import com.google.api.services.drive.model.Change;
import com.google.api.services.drive.model.ChangeList;
import com.google.api.services.drive.model.ChildList;
import com.google.api.services.drive.model.ChildReference;
import com.google.api.services.drive.model.Comment;
import com.google.api.services.drive.model.CommentList;
import com.google.api.services.drive.model.CommentReply;
import com.google.api.services.drive.model.CommentReplyList;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.drive.model.ParentList;
import com.google.api.services.drive.model.ParentReference;
import com.google.api.services.drive.model.Permission;
import com.google.api.services.drive.model.PermissionList;
import com.google.api.services.drive.model.Property;
import com.google.api.services.drive.model.PropertyList;
import com.google.api.services.drive.model.Revision;
import com.google.api.services.drive.model.RevisionList;

public class Drive extends C0759a {
    public static final String DEFAULT_BASE_URL = "https://www.googleapis.com/drive/v2/";
    public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";
    public static final String DEFAULT_SERVICE_PATH = "drive/v2/";

    public class About {

        public class Get extends DriveRequest<com.google.api.services.drive.model.About> {
            private static final String REST_PATH = "about";
            @ab
            private Boolean includeSubscribed;
            @ab
            private Long maxChangeIdCount;
            @ab
            private Long startChangeId;

            protected Get() {
                super(Drive.this, "GET", REST_PATH, null, com.google.api.services.drive.model.About.class);
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public Boolean getIncludeSubscribed() {
                return this.includeSubscribed;
            }

            public Long getMaxChangeIdCount() {
                return this.maxChangeIdCount;
            }

            public Long getStartChangeId() {
                return this.startChangeId;
            }

            public boolean isIncludeSubscribed() {
                return (this.includeSubscribed == null || this.includeSubscribed == C0728p.f7611a) ? true : this.includeSubscribed.booleanValue();
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setIncludeSubscribed(Boolean bool) {
                this.includeSubscribed = bool;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setMaxChangeIdCount(Long l) {
                this.maxChangeIdCount = l;
                return this;
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setStartChangeId(Long l) {
                this.startChangeId = l;
                return this;
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public Get get() {
            C0762c get = new Get();
            Drive.this.initialize(get);
            return get;
        }
    }

    public class Apps {

        public class Get extends DriveRequest<App> {
            private static final String REST_PATH = "apps/{appId}";
            @ab
            private String appId;

            protected Get(String str) {
                super(Drive.this, "GET", REST_PATH, null, App.class);
                this.appId = (String) am.m6912a((Object) str, (Object) "Required parameter appId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getAppId() {
                return this.appId;
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setAppId(String str) {
                this.appId = str;
                return this;
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<AppList> {
            private static final String REST_PATH = "apps";

            protected List() {
                super(Drive.this, "GET", REST_PATH, null, AppList.class);
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public Get get(String str) {
            C0762c get = new Get(str);
            Drive.this.initialize(get);
            return get;
        }

        public List list() {
            C0762c list = new List();
            Drive.this.initialize(list);
            return list;
        }
    }

    public final class Builder extends C0761b {
        public Builder(ac acVar, C0771d c0771d, C0659w c0659w) {
            super(acVar, c0771d, Drive.DEFAULT_ROOT_URL, Drive.DEFAULT_SERVICE_PATH, c0659w, false);
        }

        public Drive build() {
            return new Drive(this);
        }

        public Builder setApplicationName(String str) {
            return (Builder) super.setApplicationName(str);
        }

        public Builder setDriveRequestInitializer(DriveRequestInitializer driveRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer((C0764f) driveRequestInitializer);
        }

        public Builder setGoogleClientRequestInitializer(C0764f c0764f) {
            return (Builder) super.setGoogleClientRequestInitializer(c0764f);
        }

        public Builder setHttpRequestInitializer(C0659w c0659w) {
            return (Builder) super.setHttpRequestInitializer(c0659w);
        }

        public Builder setRootUrl(String str) {
            return (Builder) super.setRootUrl(str);
        }

        public Builder setServicePath(String str) {
            return (Builder) super.setServicePath(str);
        }

        public Builder setSuppressAllChecks(boolean z) {
            return (Builder) super.setSuppressAllChecks(z);
        }

        public Builder setSuppressPatternChecks(boolean z) {
            return (Builder) super.setSuppressPatternChecks(z);
        }

        public Builder setSuppressRequiredParameterChecks(boolean z) {
            return (Builder) super.setSuppressRequiredParameterChecks(z);
        }
    }

    public class Changes {

        public class Get extends DriveRequest<Change> {
            private static final String REST_PATH = "changes/{changeId}";
            @ab
            private String changeId;

            protected Get(String str) {
                super(Drive.this, "GET", REST_PATH, null, Change.class);
                this.changeId = (String) am.m6912a((Object) str, (Object) "Required parameter changeId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChangeId() {
                return this.changeId;
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setChangeId(String str) {
                this.changeId = str;
                return this;
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<ChangeList> {
            private static final String REST_PATH = "changes";
            @ab
            private Boolean includeDeleted;
            @ab
            private Boolean includeSubscribed;
            @ab
            private Integer maxResults;
            @ab
            private String pageToken;
            @ab
            private Long startChangeId;

            protected List() {
                super(Drive.this, "GET", REST_PATH, null, ChangeList.class);
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public Boolean getIncludeDeleted() {
                return this.includeDeleted;
            }

            public Boolean getIncludeSubscribed() {
                return this.includeSubscribed;
            }

            public Integer getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public Long getStartChangeId() {
                return this.startChangeId;
            }

            public boolean isIncludeDeleted() {
                return (this.includeDeleted == null || this.includeDeleted == C0728p.f7611a) ? true : this.includeDeleted.booleanValue();
            }

            public boolean isIncludeSubscribed() {
                return (this.includeSubscribed == null || this.includeSubscribed == C0728p.f7611a) ? true : this.includeSubscribed.booleanValue();
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setIncludeDeleted(Boolean bool) {
                this.includeDeleted = bool;
                return this;
            }

            public List setIncludeSubscribed(Boolean bool) {
                this.includeSubscribed = bool;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setMaxResults(Integer num) {
                this.maxResults = num;
                return this;
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setStartChangeId(Long l) {
                this.startChangeId = l;
                return this;
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public Get get(String str) {
            C0762c get = new Get(str);
            Drive.this.initialize(get);
            return get;
        }

        public List list() {
            C0762c list = new List();
            Drive.this.initialize(list);
            return list;
        }
    }

    public class Children {

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{folderId}/children/{childId}";
            @ab
            private String childId;
            @ab
            private String folderId;

            protected Delete(String str, String str2) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.folderId = (String) am.m6912a((Object) str, (Object) "Required parameter folderId must be specified.");
                this.childId = (String) am.m6912a((Object) str2, (Object) "Required parameter childId must be specified.");
            }

            public String getChildId() {
                return this.childId;
            }

            public String getFolderId() {
                return this.folderId;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setChildId(String str) {
                this.childId = str;
                return this;
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFolderId(String str) {
                this.folderId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }
        }

        public class Get extends DriveRequest<ChildReference> {
            private static final String REST_PATH = "files/{folderId}/children/{childId}";
            @ab
            private String childId;
            @ab
            private String folderId;

            protected Get(String str, String str2) {
                super(Drive.this, "GET", REST_PATH, null, ChildReference.class);
                this.folderId = (String) am.m6912a((Object) str, (Object) "Required parameter folderId must be specified.");
                this.childId = (String) am.m6912a((Object) str2, (Object) "Required parameter childId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChildId() {
                return this.childId;
            }

            public String getFolderId() {
                return this.folderId;
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setChildId(String str) {
                this.childId = str;
                return this;
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFolderId(String str) {
                this.folderId = str;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class Insert extends DriveRequest<ChildReference> {
            private static final String REST_PATH = "files/{folderId}/children";
            @ab
            private String folderId;

            protected Insert(String str, ChildReference childReference) {
                super(Drive.this, "POST", REST_PATH, childReference, ChildReference.class);
                this.folderId = (String) am.m6912a((Object) str, (Object) "Required parameter folderId must be specified.");
                checkRequiredParameter(childReference, "content");
                checkRequiredParameter(childReference.getId(), "ChildReference.getId()");
            }

            public String getFolderId() {
                return this.folderId;
            }

            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }

            public Insert setAlt(String str) {
                return (Insert) super.setAlt(str);
            }

            public Insert setFields(String str) {
                return (Insert) super.setFields(str);
            }

            public Insert setFolderId(String str) {
                this.folderId = str;
                return this;
            }

            public Insert setKey(String str) {
                return (Insert) super.setKey(str);
            }

            public Insert setOauthToken(String str) {
                return (Insert) super.setOauthToken(str);
            }

            public Insert setPrettyPrint(Boolean bool) {
                return (Insert) super.setPrettyPrint(bool);
            }

            public Insert setQuotaUser(String str) {
                return (Insert) super.setQuotaUser(str);
            }

            public Insert setUserIp(String str) {
                return (Insert) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<ChildList> {
            private static final String REST_PATH = "files/{folderId}/children";
            @ab
            private String folderId;
            @ab
            private Integer maxResults;
            @ab
            private String pageToken;
            @ab
            private String f7758q;

            protected List(String str) {
                super(Drive.this, "GET", REST_PATH, null, ChildList.class);
                this.folderId = (String) am.m6912a((Object) str, (Object) "Required parameter folderId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFolderId() {
                return this.folderId;
            }

            public Integer getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public String getQ() {
                return this.f7758q;
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setFolderId(String str) {
                this.folderId = str;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setMaxResults(Integer num) {
                this.maxResults = num;
                return this;
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQ(String str) {
                this.f7758q = str;
                return this;
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public Delete delete(String str, String str2) {
            C0762c delete = new Delete(str, str2);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str, String str2) {
            C0762c get = new Get(str, str2);
            Drive.this.initialize(get);
            return get;
        }

        public Insert insert(String str, ChildReference childReference) {
            C0762c insert = new Insert(str, childReference);
            Drive.this.initialize(insert);
            return insert;
        }

        public List list(String str) {
            C0762c list = new List(str);
            Drive.this.initialize(list);
            return list;
        }
    }

    public class Comments {

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}";
            @ab
            private String commentId;
            @ab
            private String fileId;

            protected Delete(String str, String str2) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }
        }

        public class Get extends DriveRequest<Comment> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}";
            @ab
            private String commentId;
            @ab
            private String fileId;
            @ab
            private Boolean includeDeleted;

            protected Get(String str, String str2) {
                super(Drive.this, "GET", REST_PATH, null, Comment.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getIncludeDeleted() {
                return this.includeDeleted;
            }

            public boolean isIncludeDeleted() {
                return (this.includeDeleted == null || this.includeDeleted == C0728p.f7611a) ? false : this.includeDeleted.booleanValue();
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Get setIncludeDeleted(Boolean bool) {
                this.includeDeleted = bool;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class Insert extends DriveRequest<Comment> {
            private static final String REST_PATH = "files/{fileId}/comments";
            @ab
            private String fileId;

            protected Insert(String str, Comment comment) {
                super(Drive.this, "POST", REST_PATH, comment, Comment.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                checkRequiredParameter(comment, "content");
                checkRequiredParameter(comment.getContent(), "Comment.getContent()");
            }

            public String getFileId() {
                return this.fileId;
            }

            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }

            public Insert setAlt(String str) {
                return (Insert) super.setAlt(str);
            }

            public Insert setFields(String str) {
                return (Insert) super.setFields(str);
            }

            public Insert setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Insert setKey(String str) {
                return (Insert) super.setKey(str);
            }

            public Insert setOauthToken(String str) {
                return (Insert) super.setOauthToken(str);
            }

            public Insert setPrettyPrint(Boolean bool) {
                return (Insert) super.setPrettyPrint(bool);
            }

            public Insert setQuotaUser(String str) {
                return (Insert) super.setQuotaUser(str);
            }

            public Insert setUserIp(String str) {
                return (Insert) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<CommentList> {
            private static final String REST_PATH = "files/{fileId}/comments";
            @ab
            private String fileId;
            @ab
            private Boolean includeDeleted;
            @ab
            private Integer maxResults;
            @ab
            private String pageToken;
            @ab
            private String updatedMin;

            protected List(String str) {
                super(Drive.this, "GET", REST_PATH, null, CommentList.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getIncludeDeleted() {
                return this.includeDeleted;
            }

            public Integer getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public String getUpdatedMin() {
                return this.updatedMin;
            }

            public boolean isIncludeDeleted() {
                return (this.includeDeleted == null || this.includeDeleted == C0728p.f7611a) ? false : this.includeDeleted.booleanValue();
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public List setIncludeDeleted(Boolean bool) {
                this.includeDeleted = bool;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setMaxResults(Integer num) {
                this.maxResults = num;
                return this;
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUpdatedMin(String str) {
                this.updatedMin = str;
                return this;
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public class Patch extends DriveRequest<Comment> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}";
            @ab
            private String commentId;
            @ab
            private String fileId;

            protected Patch(String str, String str2, Comment comment) {
                super(Drive.this, "PATCH", REST_PATH, comment, Comment.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }

            public Patch setAlt(String str) {
                return (Patch) super.setAlt(str);
            }

            public Patch setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Patch setFields(String str) {
                return (Patch) super.setFields(str);
            }

            public Patch setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Patch setKey(String str) {
                return (Patch) super.setKey(str);
            }

            public Patch setOauthToken(String str) {
                return (Patch) super.setOauthToken(str);
            }

            public Patch setPrettyPrint(Boolean bool) {
                return (Patch) super.setPrettyPrint(bool);
            }

            public Patch setQuotaUser(String str) {
                return (Patch) super.setQuotaUser(str);
            }

            public Patch setUserIp(String str) {
                return (Patch) super.setUserIp(str);
            }
        }

        public class Update extends DriveRequest<Comment> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}";
            @ab
            private String commentId;
            @ab
            private String fileId;

            protected Update(String str, String str2, Comment comment) {
                super(Drive.this, "PUT", REST_PATH, comment, Comment.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
                checkRequiredParameter(comment, "content");
                checkRequiredParameter(comment.getContent(), "Comment.getContent()");
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }

            public Update setAlt(String str) {
                return (Update) super.setAlt(str);
            }

            public Update setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Update setFields(String str) {
                return (Update) super.setFields(str);
            }

            public Update setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Update setKey(String str) {
                return (Update) super.setKey(str);
            }

            public Update setOauthToken(String str) {
                return (Update) super.setOauthToken(str);
            }

            public Update setPrettyPrint(Boolean bool) {
                return (Update) super.setPrettyPrint(bool);
            }

            public Update setQuotaUser(String str) {
                return (Update) super.setQuotaUser(str);
            }

            public Update setUserIp(String str) {
                return (Update) super.setUserIp(str);
            }
        }

        public Delete delete(String str, String str2) {
            C0762c delete = new Delete(str, str2);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str, String str2) {
            C0762c get = new Get(str, str2);
            Drive.this.initialize(get);
            return get;
        }

        public Insert insert(String str, Comment comment) {
            C0762c insert = new Insert(str, comment);
            Drive.this.initialize(insert);
            return insert;
        }

        public List list(String str) {
            C0762c list = new List(str);
            Drive.this.initialize(list);
            return list;
        }

        public Patch patch(String str, String str2, Comment comment) {
            C0762c patch = new Patch(str, str2, comment);
            Drive.this.initialize(patch);
            return patch;
        }

        public Update update(String str, String str2, Comment comment) {
            C0762c update = new Update(str, str2, comment);
            Drive.this.initialize(update);
            return update;
        }
    }

    public class Files {

        public class Copy extends DriveRequest<File> {
            private static final String REST_PATH = "files/{fileId}/copy";
            @ab
            private Boolean convert;
            @ab
            private String fileId;
            @ab
            private Boolean ocr;
            @ab
            private String ocrLanguage;
            @ab
            private Boolean pinned;
            @ab
            private String timedTextLanguage;
            @ab
            private String timedTextTrackName;

            protected Copy(String str, File file) {
                super(Drive.this, "POST", REST_PATH, file, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public Boolean getConvert() {
                return this.convert;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getOcr() {
                return this.ocr;
            }

            public String getOcrLanguage() {
                return this.ocrLanguage;
            }

            public Boolean getPinned() {
                return this.pinned;
            }

            public String getTimedTextLanguage() {
                return this.timedTextLanguage;
            }

            public String getTimedTextTrackName() {
                return this.timedTextTrackName;
            }

            public boolean isConvert() {
                return (this.convert == null || this.convert == C0728p.f7611a) ? false : this.convert.booleanValue();
            }

            public boolean isOcr() {
                return (this.ocr == null || this.ocr == C0728p.f7611a) ? false : this.ocr.booleanValue();
            }

            public boolean isPinned() {
                return (this.pinned == null || this.pinned == C0728p.f7611a) ? false : this.pinned.booleanValue();
            }

            public Copy set(String str, Object obj) {
                return (Copy) super.set(str, obj);
            }

            public Copy setAlt(String str) {
                return (Copy) super.setAlt(str);
            }

            public Copy setConvert(Boolean bool) {
                this.convert = bool;
                return this;
            }

            public Copy setFields(String str) {
                return (Copy) super.setFields(str);
            }

            public Copy setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Copy setKey(String str) {
                return (Copy) super.setKey(str);
            }

            public Copy setOauthToken(String str) {
                return (Copy) super.setOauthToken(str);
            }

            public Copy setOcr(Boolean bool) {
                this.ocr = bool;
                return this;
            }

            public Copy setOcrLanguage(String str) {
                this.ocrLanguage = str;
                return this;
            }

            public Copy setPinned(Boolean bool) {
                this.pinned = bool;
                return this;
            }

            public Copy setPrettyPrint(Boolean bool) {
                return (Copy) super.setPrettyPrint(bool);
            }

            public Copy setQuotaUser(String str) {
                return (Copy) super.setQuotaUser(str);
            }

            public Copy setTimedTextLanguage(String str) {
                this.timedTextLanguage = str;
                return this;
            }

            public Copy setTimedTextTrackName(String str) {
                this.timedTextTrackName = str;
                return this;
            }

            public Copy setUserIp(String str) {
                return (Copy) super.setUserIp(str);
            }
        }

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{fileId}";
            @ab
            private String fileId;

            protected Delete(String str) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }
        }

        public class Get extends DriveRequest<File> {
            private static final String REST_PATH = "files/{fileId}";
            @ab
            private String fileId;
            @ab
            private String projection;
            @ab
            private Boolean updateViewedDate;

            protected Get(String str) {
                super(Drive.this, "GET", REST_PATH, null, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getProjection() {
                return this.projection;
            }

            public Boolean getUpdateViewedDate() {
                return this.updateViewedDate;
            }

            public boolean isUpdateViewedDate() {
                return (this.updateViewedDate == null || this.updateViewedDate == C0728p.f7611a) ? false : this.updateViewedDate.booleanValue();
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setProjection(String str) {
                this.projection = str;
                return this;
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUpdateViewedDate(Boolean bool) {
                this.updateViewedDate = bool;
                return this;
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class Insert extends DriveRequest<File> {
            private static final String REST_PATH = "files";
            @ab
            private Boolean convert;
            @ab
            private Boolean ocr;
            @ab
            private String ocrLanguage;
            @ab
            private Boolean pinned;
            @ab
            private String timedTextLanguage;
            @ab
            private String timedTextTrackName;
            @ab
            private Boolean useContentAsIndexableText;

            protected Insert(File file) {
                super(Drive.this, "POST", REST_PATH, file, File.class);
            }

            protected Insert(File file, C0672b c0672b) {
                super(Drive.this, "POST", "/upload/" + Drive.this.getServicePath() + REST_PATH, file, File.class);
                initializeMediaUpload(c0672b);
            }

            public Boolean getConvert() {
                return this.convert;
            }

            public Boolean getOcr() {
                return this.ocr;
            }

            public String getOcrLanguage() {
                return this.ocrLanguage;
            }

            public Boolean getPinned() {
                return this.pinned;
            }

            public String getTimedTextLanguage() {
                return this.timedTextLanguage;
            }

            public String getTimedTextTrackName() {
                return this.timedTextTrackName;
            }

            public Boolean getUseContentAsIndexableText() {
                return this.useContentAsIndexableText;
            }

            public boolean isConvert() {
                return (this.convert == null || this.convert == C0728p.f7611a) ? false : this.convert.booleanValue();
            }

            public boolean isOcr() {
                return (this.ocr == null || this.ocr == C0728p.f7611a) ? false : this.ocr.booleanValue();
            }

            public boolean isPinned() {
                return (this.pinned == null || this.pinned == C0728p.f7611a) ? false : this.pinned.booleanValue();
            }

            public boolean isUseContentAsIndexableText() {
                return (this.useContentAsIndexableText == null || this.useContentAsIndexableText == C0728p.f7611a) ? false : this.useContentAsIndexableText.booleanValue();
            }

            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }

            public Insert setAlt(String str) {
                return (Insert) super.setAlt(str);
            }

            public Insert setConvert(Boolean bool) {
                this.convert = bool;
                return this;
            }

            public Insert setFields(String str) {
                return (Insert) super.setFields(str);
            }

            public Insert setKey(String str) {
                return (Insert) super.setKey(str);
            }

            public Insert setOauthToken(String str) {
                return (Insert) super.setOauthToken(str);
            }

            public Insert setOcr(Boolean bool) {
                this.ocr = bool;
                return this;
            }

            public Insert setOcrLanguage(String str) {
                this.ocrLanguage = str;
                return this;
            }

            public Insert setPinned(Boolean bool) {
                this.pinned = bool;
                return this;
            }

            public Insert setPrettyPrint(Boolean bool) {
                return (Insert) super.setPrettyPrint(bool);
            }

            public Insert setQuotaUser(String str) {
                return (Insert) super.setQuotaUser(str);
            }

            public Insert setTimedTextLanguage(String str) {
                this.timedTextLanguage = str;
                return this;
            }

            public Insert setTimedTextTrackName(String str) {
                this.timedTextTrackName = str;
                return this;
            }

            public Insert setUseContentAsIndexableText(Boolean bool) {
                this.useContentAsIndexableText = bool;
                return this;
            }

            public Insert setUserIp(String str) {
                return (Insert) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<FileList> {
            private static final String REST_PATH = "files";
            @ab
            private Integer maxResults;
            @ab
            private String pageToken;
            @ab
            private String projection;
            @ab
            private String f7759q;

            protected List() {
                super(Drive.this, "GET", REST_PATH, null, FileList.class);
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public Integer getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public String getProjection() {
                return this.projection;
            }

            public String getQ() {
                return this.f7759q;
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setMaxResults(Integer num) {
                this.maxResults = num;
                return this;
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setProjection(String str) {
                this.projection = str;
                return this;
            }

            public List setQ(String str) {
                this.f7759q = str;
                return this;
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public class Patch extends DriveRequest<File> {
            private static final String REST_PATH = "files/{fileId}";
            @ab
            private Boolean convert;
            @ab
            private String fileId;
            @ab
            private Boolean newRevision;
            @ab
            private Boolean ocr;
            @ab
            private String ocrLanguage;
            @ab
            private Boolean pinned;
            @ab
            private Boolean setModifiedDate;
            @ab
            private String timedTextLanguage;
            @ab
            private String timedTextTrackName;
            @ab
            private Boolean updateViewedDate;
            @ab
            private Boolean useContentAsIndexableText;

            protected Patch(String str, File file) {
                super(Drive.this, "PATCH", REST_PATH, file, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public Boolean getConvert() {
                return this.convert;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getNewRevision() {
                return this.newRevision;
            }

            public Boolean getOcr() {
                return this.ocr;
            }

            public String getOcrLanguage() {
                return this.ocrLanguage;
            }

            public Boolean getPinned() {
                return this.pinned;
            }

            public Boolean getSetModifiedDate() {
                return this.setModifiedDate;
            }

            public String getTimedTextLanguage() {
                return this.timedTextLanguage;
            }

            public String getTimedTextTrackName() {
                return this.timedTextTrackName;
            }

            public Boolean getUpdateViewedDate() {
                return this.updateViewedDate;
            }

            public Boolean getUseContentAsIndexableText() {
                return this.useContentAsIndexableText;
            }

            public boolean isConvert() {
                return (this.convert == null || this.convert == C0728p.f7611a) ? false : this.convert.booleanValue();
            }

            public boolean isNewRevision() {
                return (this.newRevision == null || this.newRevision == C0728p.f7611a) ? true : this.newRevision.booleanValue();
            }

            public boolean isOcr() {
                return (this.ocr == null || this.ocr == C0728p.f7611a) ? false : this.ocr.booleanValue();
            }

            public boolean isPinned() {
                return (this.pinned == null || this.pinned == C0728p.f7611a) ? false : this.pinned.booleanValue();
            }

            public boolean isSetModifiedDate() {
                return (this.setModifiedDate == null || this.setModifiedDate == C0728p.f7611a) ? false : this.setModifiedDate.booleanValue();
            }

            public boolean isUpdateViewedDate() {
                return (this.updateViewedDate == null || this.updateViewedDate == C0728p.f7611a) ? true : this.updateViewedDate.booleanValue();
            }

            public boolean isUseContentAsIndexableText() {
                return (this.useContentAsIndexableText == null || this.useContentAsIndexableText == C0728p.f7611a) ? false : this.useContentAsIndexableText.booleanValue();
            }

            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }

            public Patch setAlt(String str) {
                return (Patch) super.setAlt(str);
            }

            public Patch setConvert(Boolean bool) {
                this.convert = bool;
                return this;
            }

            public Patch setFields(String str) {
                return (Patch) super.setFields(str);
            }

            public Patch setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Patch setKey(String str) {
                return (Patch) super.setKey(str);
            }

            public Patch setNewRevision(Boolean bool) {
                this.newRevision = bool;
                return this;
            }

            public Patch setOauthToken(String str) {
                return (Patch) super.setOauthToken(str);
            }

            public Patch setOcr(Boolean bool) {
                this.ocr = bool;
                return this;
            }

            public Patch setOcrLanguage(String str) {
                this.ocrLanguage = str;
                return this;
            }

            public Patch setPinned(Boolean bool) {
                this.pinned = bool;
                return this;
            }

            public Patch setPrettyPrint(Boolean bool) {
                return (Patch) super.setPrettyPrint(bool);
            }

            public Patch setQuotaUser(String str) {
                return (Patch) super.setQuotaUser(str);
            }

            public Patch setSetModifiedDate(Boolean bool) {
                this.setModifiedDate = bool;
                return this;
            }

            public Patch setTimedTextLanguage(String str) {
                this.timedTextLanguage = str;
                return this;
            }

            public Patch setTimedTextTrackName(String str) {
                this.timedTextTrackName = str;
                return this;
            }

            public Patch setUpdateViewedDate(Boolean bool) {
                this.updateViewedDate = bool;
                return this;
            }

            public Patch setUseContentAsIndexableText(Boolean bool) {
                this.useContentAsIndexableText = bool;
                return this;
            }

            public Patch setUserIp(String str) {
                return (Patch) super.setUserIp(str);
            }
        }

        public class Touch extends DriveRequest<File> {
            private static final String REST_PATH = "files/{fileId}/touch";
            @ab
            private String fileId;

            protected Touch(String str) {
                super(Drive.this, "POST", REST_PATH, null, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public Touch set(String str, Object obj) {
                return (Touch) super.set(str, obj);
            }

            public Touch setAlt(String str) {
                return (Touch) super.setAlt(str);
            }

            public Touch setFields(String str) {
                return (Touch) super.setFields(str);
            }

            public Touch setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Touch setKey(String str) {
                return (Touch) super.setKey(str);
            }

            public Touch setOauthToken(String str) {
                return (Touch) super.setOauthToken(str);
            }

            public Touch setPrettyPrint(Boolean bool) {
                return (Touch) super.setPrettyPrint(bool);
            }

            public Touch setQuotaUser(String str) {
                return (Touch) super.setQuotaUser(str);
            }

            public Touch setUserIp(String str) {
                return (Touch) super.setUserIp(str);
            }
        }

        public class Trash extends DriveRequest<File> {
            private static final String REST_PATH = "files/{fileId}/trash";
            @ab
            private String fileId;

            protected Trash(String str) {
                super(Drive.this, "POST", REST_PATH, null, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public Trash set(String str, Object obj) {
                return (Trash) super.set(str, obj);
            }

            public Trash setAlt(String str) {
                return (Trash) super.setAlt(str);
            }

            public Trash setFields(String str) {
                return (Trash) super.setFields(str);
            }

            public Trash setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Trash setKey(String str) {
                return (Trash) super.setKey(str);
            }

            public Trash setOauthToken(String str) {
                return (Trash) super.setOauthToken(str);
            }

            public Trash setPrettyPrint(Boolean bool) {
                return (Trash) super.setPrettyPrint(bool);
            }

            public Trash setQuotaUser(String str) {
                return (Trash) super.setQuotaUser(str);
            }

            public Trash setUserIp(String str) {
                return (Trash) super.setUserIp(str);
            }
        }

        public class Untrash extends DriveRequest<File> {
            private static final String REST_PATH = "files/{fileId}/untrash";
            @ab
            private String fileId;

            protected Untrash(String str) {
                super(Drive.this, "POST", REST_PATH, null, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public Untrash set(String str, Object obj) {
                return (Untrash) super.set(str, obj);
            }

            public Untrash setAlt(String str) {
                return (Untrash) super.setAlt(str);
            }

            public Untrash setFields(String str) {
                return (Untrash) super.setFields(str);
            }

            public Untrash setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Untrash setKey(String str) {
                return (Untrash) super.setKey(str);
            }

            public Untrash setOauthToken(String str) {
                return (Untrash) super.setOauthToken(str);
            }

            public Untrash setPrettyPrint(Boolean bool) {
                return (Untrash) super.setPrettyPrint(bool);
            }

            public Untrash setQuotaUser(String str) {
                return (Untrash) super.setQuotaUser(str);
            }

            public Untrash setUserIp(String str) {
                return (Untrash) super.setUserIp(str);
            }
        }

        public class Update extends DriveRequest<File> {
            private static final String REST_PATH = "files/{fileId}";
            @ab
            private Boolean convert;
            @ab
            private String fileId;
            @ab
            private Boolean newRevision;
            @ab
            private Boolean ocr;
            @ab
            private String ocrLanguage;
            @ab
            private Boolean pinned;
            @ab
            private Boolean setModifiedDate;
            @ab
            private String timedTextLanguage;
            @ab
            private String timedTextTrackName;
            @ab
            private Boolean updateViewedDate;
            @ab
            private Boolean useContentAsIndexableText;

            protected Update(String str, File file) {
                super(Drive.this, "PUT", REST_PATH, file, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            protected Update(String str, File file, C0672b c0672b) {
                super(Drive.this, "PUT", "/upload/" + Drive.this.getServicePath() + REST_PATH, file, File.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                initializeMediaUpload(c0672b);
            }

            public Boolean getConvert() {
                return this.convert;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getNewRevision() {
                return this.newRevision;
            }

            public Boolean getOcr() {
                return this.ocr;
            }

            public String getOcrLanguage() {
                return this.ocrLanguage;
            }

            public Boolean getPinned() {
                return this.pinned;
            }

            public Boolean getSetModifiedDate() {
                return this.setModifiedDate;
            }

            public String getTimedTextLanguage() {
                return this.timedTextLanguage;
            }

            public String getTimedTextTrackName() {
                return this.timedTextTrackName;
            }

            public Boolean getUpdateViewedDate() {
                return this.updateViewedDate;
            }

            public Boolean getUseContentAsIndexableText() {
                return this.useContentAsIndexableText;
            }

            public boolean isConvert() {
                return (this.convert == null || this.convert == C0728p.f7611a) ? false : this.convert.booleanValue();
            }

            public boolean isNewRevision() {
                return (this.newRevision == null || this.newRevision == C0728p.f7611a) ? true : this.newRevision.booleanValue();
            }

            public boolean isOcr() {
                return (this.ocr == null || this.ocr == C0728p.f7611a) ? false : this.ocr.booleanValue();
            }

            public boolean isPinned() {
                return (this.pinned == null || this.pinned == C0728p.f7611a) ? false : this.pinned.booleanValue();
            }

            public boolean isSetModifiedDate() {
                return (this.setModifiedDate == null || this.setModifiedDate == C0728p.f7611a) ? false : this.setModifiedDate.booleanValue();
            }

            public boolean isUpdateViewedDate() {
                return (this.updateViewedDate == null || this.updateViewedDate == C0728p.f7611a) ? true : this.updateViewedDate.booleanValue();
            }

            public boolean isUseContentAsIndexableText() {
                return (this.useContentAsIndexableText == null || this.useContentAsIndexableText == C0728p.f7611a) ? false : this.useContentAsIndexableText.booleanValue();
            }

            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }

            public Update setAlt(String str) {
                return (Update) super.setAlt(str);
            }

            public Update setConvert(Boolean bool) {
                this.convert = bool;
                return this;
            }

            public Update setFields(String str) {
                return (Update) super.setFields(str);
            }

            public Update setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Update setKey(String str) {
                return (Update) super.setKey(str);
            }

            public Update setNewRevision(Boolean bool) {
                this.newRevision = bool;
                return this;
            }

            public Update setOauthToken(String str) {
                return (Update) super.setOauthToken(str);
            }

            public Update setOcr(Boolean bool) {
                this.ocr = bool;
                return this;
            }

            public Update setOcrLanguage(String str) {
                this.ocrLanguage = str;
                return this;
            }

            public Update setPinned(Boolean bool) {
                this.pinned = bool;
                return this;
            }

            public Update setPrettyPrint(Boolean bool) {
                return (Update) super.setPrettyPrint(bool);
            }

            public Update setQuotaUser(String str) {
                return (Update) super.setQuotaUser(str);
            }

            public Update setSetModifiedDate(Boolean bool) {
                this.setModifiedDate = bool;
                return this;
            }

            public Update setTimedTextLanguage(String str) {
                this.timedTextLanguage = str;
                return this;
            }

            public Update setTimedTextTrackName(String str) {
                this.timedTextTrackName = str;
                return this;
            }

            public Update setUpdateViewedDate(Boolean bool) {
                this.updateViewedDate = bool;
                return this;
            }

            public Update setUseContentAsIndexableText(Boolean bool) {
                this.useContentAsIndexableText = bool;
                return this;
            }

            public Update setUserIp(String str) {
                return (Update) super.setUserIp(str);
            }
        }

        public Copy copy(String str, File file) {
            C0762c copy = new Copy(str, file);
            Drive.this.initialize(copy);
            return copy;
        }

        public Delete delete(String str) {
            C0762c delete = new Delete(str);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str) {
            C0762c get = new Get(str);
            Drive.this.initialize(get);
            return get;
        }

        public Insert insert(File file) {
            C0762c insert = new Insert(file);
            Drive.this.initialize(insert);
            return insert;
        }

        public Insert insert(File file, C0672b c0672b) {
            C0762c insert = new Insert(file, c0672b);
            Drive.this.initialize(insert);
            return insert;
        }

        public List list() {
            C0762c list = new List();
            Drive.this.initialize(list);
            return list;
        }

        public Patch patch(String str, File file) {
            C0762c patch = new Patch(str, file);
            Drive.this.initialize(patch);
            return patch;
        }

        public Touch touch(String str) {
            C0762c touch = new Touch(str);
            Drive.this.initialize(touch);
            return touch;
        }

        public Trash trash(String str) {
            C0762c trash = new Trash(str);
            Drive.this.initialize(trash);
            return trash;
        }

        public Untrash untrash(String str) {
            C0762c untrash = new Untrash(str);
            Drive.this.initialize(untrash);
            return untrash;
        }

        public Update update(String str, File file) {
            C0762c update = new Update(str, file);
            Drive.this.initialize(update);
            return update;
        }

        public Update update(String str, File file, C0672b c0672b) {
            C0762c update = new Update(str, file, c0672b);
            Drive.this.initialize(update);
            return update;
        }
    }

    public class Parents {

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{fileId}/parents/{parentId}";
            @ab
            private String fileId;
            @ab
            private String parentId;

            protected Delete(String str, String str2) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.parentId = (String) am.m6912a((Object) str2, (Object) "Required parameter parentId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getParentId() {
                return this.parentId;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setParentId(String str) {
                this.parentId = str;
                return this;
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }
        }

        public class Get extends DriveRequest<ParentReference> {
            private static final String REST_PATH = "files/{fileId}/parents/{parentId}";
            @ab
            private String fileId;
            @ab
            private String parentId;

            protected Get(String str, String str2) {
                super(Drive.this, "GET", REST_PATH, null, ParentReference.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.parentId = (String) am.m6912a((Object) str2, (Object) "Required parameter parentId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getParentId() {
                return this.parentId;
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setParentId(String str) {
                this.parentId = str;
                return this;
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class Insert extends DriveRequest<ParentReference> {
            private static final String REST_PATH = "files/{fileId}/parents";
            @ab
            private String fileId;

            protected Insert(String str, ParentReference parentReference) {
                super(Drive.this, "POST", REST_PATH, parentReference, ParentReference.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                checkRequiredParameter(parentReference, "content");
                checkRequiredParameter(parentReference.getId(), "ParentReference.getId()");
            }

            public String getFileId() {
                return this.fileId;
            }

            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }

            public Insert setAlt(String str) {
                return (Insert) super.setAlt(str);
            }

            public Insert setFields(String str) {
                return (Insert) super.setFields(str);
            }

            public Insert setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Insert setKey(String str) {
                return (Insert) super.setKey(str);
            }

            public Insert setOauthToken(String str) {
                return (Insert) super.setOauthToken(str);
            }

            public Insert setPrettyPrint(Boolean bool) {
                return (Insert) super.setPrettyPrint(bool);
            }

            public Insert setQuotaUser(String str) {
                return (Insert) super.setQuotaUser(str);
            }

            public Insert setUserIp(String str) {
                return (Insert) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<ParentList> {
            private static final String REST_PATH = "files/{fileId}/parents";
            @ab
            private String fileId;

            protected List(String str) {
                super(Drive.this, "GET", REST_PATH, null, ParentList.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public Delete delete(String str, String str2) {
            C0762c delete = new Delete(str, str2);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str, String str2) {
            C0762c get = new Get(str, str2);
            Drive.this.initialize(get);
            return get;
        }

        public Insert insert(String str, ParentReference parentReference) {
            C0762c insert = new Insert(str, parentReference);
            Drive.this.initialize(insert);
            return insert;
        }

        public List list(String str) {
            C0762c list = new List(str);
            Drive.this.initialize(list);
            return list;
        }
    }

    public class Permissions {

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{fileId}/permissions/{permissionId}";
            @ab
            private String fileId;
            @ab
            private String permissionId;

            protected Delete(String str, String str2) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.permissionId = (String) am.m6912a((Object) str2, (Object) "Required parameter permissionId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPermissionId() {
                return this.permissionId;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setPermissionId(String str) {
                this.permissionId = str;
                return this;
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }
        }

        public class Get extends DriveRequest<Permission> {
            private static final String REST_PATH = "files/{fileId}/permissions/{permissionId}";
            @ab
            private String fileId;
            @ab
            private String permissionId;

            protected Get(String str, String str2) {
                super(Drive.this, "GET", REST_PATH, null, Permission.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.permissionId = (String) am.m6912a((Object) str2, (Object) "Required parameter permissionId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPermissionId() {
                return this.permissionId;
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPermissionId(String str) {
                this.permissionId = str;
                return this;
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class Insert extends DriveRequest<Permission> {
            private static final String REST_PATH = "files/{fileId}/permissions";
            @ab
            private String emailMessage;
            @ab
            private String fileId;
            @ab
            private Boolean sendNotificationEmails;

            protected Insert(String str, Permission permission) {
                super(Drive.this, "POST", REST_PATH, permission, Permission.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                checkRequiredParameter(permission, "content");
                checkRequiredParameter(permission.getRole(), "Permission.getRole()");
                checkRequiredParameter(permission, "content");
                checkRequiredParameter(permission.getType(), "Permission.getType()");
                checkRequiredParameter(permission, "content");
                checkRequiredParameter(permission.getValue(), "Permission.getValue()");
            }

            public String getEmailMessage() {
                return this.emailMessage;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getSendNotificationEmails() {
                return this.sendNotificationEmails;
            }

            public boolean isSendNotificationEmails() {
                return (this.sendNotificationEmails == null || this.sendNotificationEmails == C0728p.f7611a) ? true : this.sendNotificationEmails.booleanValue();
            }

            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }

            public Insert setAlt(String str) {
                return (Insert) super.setAlt(str);
            }

            public Insert setEmailMessage(String str) {
                this.emailMessage = str;
                return this;
            }

            public Insert setFields(String str) {
                return (Insert) super.setFields(str);
            }

            public Insert setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Insert setKey(String str) {
                return (Insert) super.setKey(str);
            }

            public Insert setOauthToken(String str) {
                return (Insert) super.setOauthToken(str);
            }

            public Insert setPrettyPrint(Boolean bool) {
                return (Insert) super.setPrettyPrint(bool);
            }

            public Insert setQuotaUser(String str) {
                return (Insert) super.setQuotaUser(str);
            }

            public Insert setSendNotificationEmails(Boolean bool) {
                this.sendNotificationEmails = bool;
                return this;
            }

            public Insert setUserIp(String str) {
                return (Insert) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<PermissionList> {
            private static final String REST_PATH = "files/{fileId}/permissions";
            @ab
            private String fileId;

            protected List(String str) {
                super(Drive.this, "GET", REST_PATH, null, PermissionList.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public class Patch extends DriveRequest<Permission> {
            private static final String REST_PATH = "files/{fileId}/permissions/{permissionId}";
            @ab
            private String fileId;
            @ab
            private String permissionId;
            @ab
            private Boolean transferOwnership;

            protected Patch(String str, String str2, Permission permission) {
                super(Drive.this, "PATCH", REST_PATH, permission, Permission.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.permissionId = (String) am.m6912a((Object) str2, (Object) "Required parameter permissionId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPermissionId() {
                return this.permissionId;
            }

            public Boolean getTransferOwnership() {
                return this.transferOwnership;
            }

            public boolean isTransferOwnership() {
                return (this.transferOwnership == null || this.transferOwnership == C0728p.f7611a) ? false : this.transferOwnership.booleanValue();
            }

            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }

            public Patch setAlt(String str) {
                return (Patch) super.setAlt(str);
            }

            public Patch setFields(String str) {
                return (Patch) super.setFields(str);
            }

            public Patch setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Patch setKey(String str) {
                return (Patch) super.setKey(str);
            }

            public Patch setOauthToken(String str) {
                return (Patch) super.setOauthToken(str);
            }

            public Patch setPermissionId(String str) {
                this.permissionId = str;
                return this;
            }

            public Patch setPrettyPrint(Boolean bool) {
                return (Patch) super.setPrettyPrint(bool);
            }

            public Patch setQuotaUser(String str) {
                return (Patch) super.setQuotaUser(str);
            }

            public Patch setTransferOwnership(Boolean bool) {
                this.transferOwnership = bool;
                return this;
            }

            public Patch setUserIp(String str) {
                return (Patch) super.setUserIp(str);
            }
        }

        public class Update extends DriveRequest<Permission> {
            private static final String REST_PATH = "files/{fileId}/permissions/{permissionId}";
            @ab
            private String fileId;
            @ab
            private String permissionId;
            @ab
            private Boolean transferOwnership;

            protected Update(String str, String str2, Permission permission) {
                super(Drive.this, "PUT", REST_PATH, permission, Permission.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.permissionId = (String) am.m6912a((Object) str2, (Object) "Required parameter permissionId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPermissionId() {
                return this.permissionId;
            }

            public Boolean getTransferOwnership() {
                return this.transferOwnership;
            }

            public boolean isTransferOwnership() {
                return (this.transferOwnership == null || this.transferOwnership == C0728p.f7611a) ? false : this.transferOwnership.booleanValue();
            }

            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }

            public Update setAlt(String str) {
                return (Update) super.setAlt(str);
            }

            public Update setFields(String str) {
                return (Update) super.setFields(str);
            }

            public Update setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Update setKey(String str) {
                return (Update) super.setKey(str);
            }

            public Update setOauthToken(String str) {
                return (Update) super.setOauthToken(str);
            }

            public Update setPermissionId(String str) {
                this.permissionId = str;
                return this;
            }

            public Update setPrettyPrint(Boolean bool) {
                return (Update) super.setPrettyPrint(bool);
            }

            public Update setQuotaUser(String str) {
                return (Update) super.setQuotaUser(str);
            }

            public Update setTransferOwnership(Boolean bool) {
                this.transferOwnership = bool;
                return this;
            }

            public Update setUserIp(String str) {
                return (Update) super.setUserIp(str);
            }
        }

        public Delete delete(String str, String str2) {
            C0762c delete = new Delete(str, str2);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str, String str2) {
            C0762c get = new Get(str, str2);
            Drive.this.initialize(get);
            return get;
        }

        public Insert insert(String str, Permission permission) {
            C0762c insert = new Insert(str, permission);
            Drive.this.initialize(insert);
            return insert;
        }

        public List list(String str) {
            C0762c list = new List(str);
            Drive.this.initialize(list);
            return list;
        }

        public Patch patch(String str, String str2, Permission permission) {
            C0762c patch = new Patch(str, str2, permission);
            Drive.this.initialize(patch);
            return patch;
        }

        public Update update(String str, String str2, Permission permission) {
            C0762c update = new Update(str, str2, permission);
            Drive.this.initialize(update);
            return update;
        }
    }

    public class Properties {

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{fileId}/properties/{propertyKey}";
            @ab
            private String fileId;
            @ab
            private String propertyKey;
            @ab
            private String visibility;

            protected Delete(String str, String str2) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.propertyKey = (String) am.m6912a((Object) str2, (Object) "Required parameter propertyKey must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPropertyKey() {
                return this.propertyKey;
            }

            public String getVisibility() {
                return this.visibility;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setPropertyKey(String str) {
                this.propertyKey = str;
                return this;
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }

            public Delete setVisibility(String str) {
                this.visibility = str;
                return this;
            }
        }

        public class Get extends DriveRequest<Property> {
            private static final String REST_PATH = "files/{fileId}/properties/{propertyKey}";
            @ab
            private String fileId;
            @ab
            private String propertyKey;
            @ab
            private String visibility;

            protected Get(String str, String str2) {
                super(Drive.this, "GET", REST_PATH, null, Property.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.propertyKey = (String) am.m6912a((Object) str2, (Object) "Required parameter propertyKey must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPropertyKey() {
                return this.propertyKey;
            }

            public String getVisibility() {
                return this.visibility;
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setPropertyKey(String str) {
                this.propertyKey = str;
                return this;
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }

            public Get setVisibility(String str) {
                this.visibility = str;
                return this;
            }
        }

        public class Insert extends DriveRequest<Property> {
            private static final String REST_PATH = "files/{fileId}/properties";
            @ab
            private String fileId;

            protected Insert(String str, Property property) {
                super(Drive.this, "POST", REST_PATH, property, Property.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }

            public Insert setAlt(String str) {
                return (Insert) super.setAlt(str);
            }

            public Insert setFields(String str) {
                return (Insert) super.setFields(str);
            }

            public Insert setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Insert setKey(String str) {
                return (Insert) super.setKey(str);
            }

            public Insert setOauthToken(String str) {
                return (Insert) super.setOauthToken(str);
            }

            public Insert setPrettyPrint(Boolean bool) {
                return (Insert) super.setPrettyPrint(bool);
            }

            public Insert setQuotaUser(String str) {
                return (Insert) super.setQuotaUser(str);
            }

            public Insert setUserIp(String str) {
                return (Insert) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<PropertyList> {
            private static final String REST_PATH = "files/{fileId}/properties";
            @ab
            private String fileId;

            protected List(String str) {
                super(Drive.this, "GET", REST_PATH, null, PropertyList.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public class Patch extends DriveRequest<Property> {
            private static final String REST_PATH = "files/{fileId}/properties/{propertyKey}";
            @ab
            private String fileId;
            @ab
            private String propertyKey;
            @ab
            private String visibility;

            protected Patch(String str, String str2, Property property) {
                super(Drive.this, "PATCH", REST_PATH, property, Property.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.propertyKey = (String) am.m6912a((Object) str2, (Object) "Required parameter propertyKey must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPropertyKey() {
                return this.propertyKey;
            }

            public String getVisibility() {
                return this.visibility;
            }

            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }

            public Patch setAlt(String str) {
                return (Patch) super.setAlt(str);
            }

            public Patch setFields(String str) {
                return (Patch) super.setFields(str);
            }

            public Patch setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Patch setKey(String str) {
                return (Patch) super.setKey(str);
            }

            public Patch setOauthToken(String str) {
                return (Patch) super.setOauthToken(str);
            }

            public Patch setPrettyPrint(Boolean bool) {
                return (Patch) super.setPrettyPrint(bool);
            }

            public Patch setPropertyKey(String str) {
                this.propertyKey = str;
                return this;
            }

            public Patch setQuotaUser(String str) {
                return (Patch) super.setQuotaUser(str);
            }

            public Patch setUserIp(String str) {
                return (Patch) super.setUserIp(str);
            }

            public Patch setVisibility(String str) {
                this.visibility = str;
                return this;
            }
        }

        public class Update extends DriveRequest<Property> {
            private static final String REST_PATH = "files/{fileId}/properties/{propertyKey}";
            @ab
            private String fileId;
            @ab
            private String propertyKey;
            @ab
            private String visibility;

            protected Update(String str, String str2, Property property) {
                super(Drive.this, "PUT", REST_PATH, property, Property.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.propertyKey = (String) am.m6912a((Object) str2, (Object) "Required parameter propertyKey must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getPropertyKey() {
                return this.propertyKey;
            }

            public String getVisibility() {
                return this.visibility;
            }

            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }

            public Update setAlt(String str) {
                return (Update) super.setAlt(str);
            }

            public Update setFields(String str) {
                return (Update) super.setFields(str);
            }

            public Update setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Update setKey(String str) {
                return (Update) super.setKey(str);
            }

            public Update setOauthToken(String str) {
                return (Update) super.setOauthToken(str);
            }

            public Update setPrettyPrint(Boolean bool) {
                return (Update) super.setPrettyPrint(bool);
            }

            public Update setPropertyKey(String str) {
                this.propertyKey = str;
                return this;
            }

            public Update setQuotaUser(String str) {
                return (Update) super.setQuotaUser(str);
            }

            public Update setUserIp(String str) {
                return (Update) super.setUserIp(str);
            }

            public Update setVisibility(String str) {
                this.visibility = str;
                return this;
            }
        }

        public Delete delete(String str, String str2) {
            C0762c delete = new Delete(str, str2);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str, String str2) {
            C0762c get = new Get(str, str2);
            Drive.this.initialize(get);
            return get;
        }

        public Insert insert(String str, Property property) {
            C0762c insert = new Insert(str, property);
            Drive.this.initialize(insert);
            return insert;
        }

        public List list(String str) {
            C0762c list = new List(str);
            Drive.this.initialize(list);
            return list;
        }

        public Patch patch(String str, String str2, Property property) {
            C0762c patch = new Patch(str, str2, property);
            Drive.this.initialize(patch);
            return patch;
        }

        public Update update(String str, String str2, Property property) {
            C0762c update = new Update(str, str2, property);
            Drive.this.initialize(update);
            return update;
        }
    }

    public class Replies {

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}/replies/{replyId}";
            @ab
            private String commentId;
            @ab
            private String fileId;
            @ab
            private String replyId;

            protected Delete(String str, String str2, String str3) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
                this.replyId = (String) am.m6912a((Object) str3, (Object) "Required parameter replyId must be specified.");
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getReplyId() {
                return this.replyId;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setReplyId(String str) {
                this.replyId = str;
                return this;
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }
        }

        public class Get extends DriveRequest<CommentReply> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}/replies/{replyId}";
            @ab
            private String commentId;
            @ab
            private String fileId;
            @ab
            private Boolean includeDeleted;
            @ab
            private String replyId;

            protected Get(String str, String str2, String str3) {
                super(Drive.this, "GET", REST_PATH, null, CommentReply.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
                this.replyId = (String) am.m6912a((Object) str3, (Object) "Required parameter replyId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getIncludeDeleted() {
                return this.includeDeleted;
            }

            public String getReplyId() {
                return this.replyId;
            }

            public boolean isIncludeDeleted() {
                return (this.includeDeleted == null || this.includeDeleted == C0728p.f7611a) ? false : this.includeDeleted.booleanValue();
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Get setIncludeDeleted(Boolean bool) {
                this.includeDeleted = bool;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setReplyId(String str) {
                this.replyId = str;
                return this;
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class Insert extends DriveRequest<CommentReply> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}/replies";
            @ab
            private String commentId;
            @ab
            private String fileId;

            protected Insert(String str, String str2, CommentReply commentReply) {
                super(Drive.this, "POST", REST_PATH, commentReply, CommentReply.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }

            public Insert setAlt(String str) {
                return (Insert) super.setAlt(str);
            }

            public Insert setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Insert setFields(String str) {
                return (Insert) super.setFields(str);
            }

            public Insert setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Insert setKey(String str) {
                return (Insert) super.setKey(str);
            }

            public Insert setOauthToken(String str) {
                return (Insert) super.setOauthToken(str);
            }

            public Insert setPrettyPrint(Boolean bool) {
                return (Insert) super.setPrettyPrint(bool);
            }

            public Insert setQuotaUser(String str) {
                return (Insert) super.setQuotaUser(str);
            }

            public Insert setUserIp(String str) {
                return (Insert) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<CommentReplyList> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}/replies";
            @ab
            private String commentId;
            @ab
            private String fileId;
            @ab
            private Boolean includeDeleted;
            @ab
            private Integer maxResults;
            @ab
            private String pageToken;

            protected List(String str, String str2) {
                super(Drive.this, "GET", REST_PATH, null, CommentReplyList.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public Boolean getIncludeDeleted() {
                return this.includeDeleted;
            }

            public Integer getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public boolean isIncludeDeleted() {
                return (this.includeDeleted == null || this.includeDeleted == C0728p.f7611a) ? false : this.includeDeleted.booleanValue();
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public List setIncludeDeleted(Boolean bool) {
                this.includeDeleted = bool;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setMaxResults(Integer num) {
                this.maxResults = num;
                return this;
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public class Patch extends DriveRequest<CommentReply> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}/replies/{replyId}";
            @ab
            private String commentId;
            @ab
            private String fileId;
            @ab
            private String replyId;

            protected Patch(String str, String str2, String str3, CommentReply commentReply) {
                super(Drive.this, "PATCH", REST_PATH, commentReply, CommentReply.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
                this.replyId = (String) am.m6912a((Object) str3, (Object) "Required parameter replyId must be specified.");
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getReplyId() {
                return this.replyId;
            }

            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }

            public Patch setAlt(String str) {
                return (Patch) super.setAlt(str);
            }

            public Patch setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Patch setFields(String str) {
                return (Patch) super.setFields(str);
            }

            public Patch setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Patch setKey(String str) {
                return (Patch) super.setKey(str);
            }

            public Patch setOauthToken(String str) {
                return (Patch) super.setOauthToken(str);
            }

            public Patch setPrettyPrint(Boolean bool) {
                return (Patch) super.setPrettyPrint(bool);
            }

            public Patch setQuotaUser(String str) {
                return (Patch) super.setQuotaUser(str);
            }

            public Patch setReplyId(String str) {
                this.replyId = str;
                return this;
            }

            public Patch setUserIp(String str) {
                return (Patch) super.setUserIp(str);
            }
        }

        public class Update extends DriveRequest<CommentReply> {
            private static final String REST_PATH = "files/{fileId}/comments/{commentId}/replies/{replyId}";
            @ab
            private String commentId;
            @ab
            private String fileId;
            @ab
            private String replyId;

            protected Update(String str, String str2, String str3, CommentReply commentReply) {
                super(Drive.this, "PUT", REST_PATH, commentReply, CommentReply.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.commentId = (String) am.m6912a((Object) str2, (Object) "Required parameter commentId must be specified.");
                this.replyId = (String) am.m6912a((Object) str3, (Object) "Required parameter replyId must be specified.");
                checkRequiredParameter(commentReply, "content");
                checkRequiredParameter(commentReply.getContent(), "CommentReply.getContent()");
            }

            public String getCommentId() {
                return this.commentId;
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getReplyId() {
                return this.replyId;
            }

            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }

            public Update setAlt(String str) {
                return (Update) super.setAlt(str);
            }

            public Update setCommentId(String str) {
                this.commentId = str;
                return this;
            }

            public Update setFields(String str) {
                return (Update) super.setFields(str);
            }

            public Update setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Update setKey(String str) {
                return (Update) super.setKey(str);
            }

            public Update setOauthToken(String str) {
                return (Update) super.setOauthToken(str);
            }

            public Update setPrettyPrint(Boolean bool) {
                return (Update) super.setPrettyPrint(bool);
            }

            public Update setQuotaUser(String str) {
                return (Update) super.setQuotaUser(str);
            }

            public Update setReplyId(String str) {
                this.replyId = str;
                return this;
            }

            public Update setUserIp(String str) {
                return (Update) super.setUserIp(str);
            }
        }

        public Delete delete(String str, String str2, String str3) {
            C0762c delete = new Delete(str, str2, str3);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str, String str2, String str3) {
            C0762c get = new Get(str, str2, str3);
            Drive.this.initialize(get);
            return get;
        }

        public Insert insert(String str, String str2, CommentReply commentReply) {
            C0762c insert = new Insert(str, str2, commentReply);
            Drive.this.initialize(insert);
            return insert;
        }

        public List list(String str, String str2) {
            C0762c list = new List(str, str2);
            Drive.this.initialize(list);
            return list;
        }

        public Patch patch(String str, String str2, String str3, CommentReply commentReply) {
            C0762c patch = new Patch(str, str2, str3, commentReply);
            Drive.this.initialize(patch);
            return patch;
        }

        public Update update(String str, String str2, String str3, CommentReply commentReply) {
            C0762c update = new Update(str, str2, str3, commentReply);
            Drive.this.initialize(update);
            return update;
        }
    }

    public class Revisions {

        public class Delete extends DriveRequest<Void> {
            private static final String REST_PATH = "files/{fileId}/revisions/{revisionId}";
            @ab
            private String fileId;
            @ab
            private String revisionId;

            protected Delete(String str, String str2) {
                super(Drive.this, "DELETE", REST_PATH, null, Void.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.revisionId = (String) am.m6912a((Object) str2, (Object) "Required parameter revisionId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getRevisionId() {
                return this.revisionId;
            }

            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }

            public Delete setAlt(String str) {
                return (Delete) super.setAlt(str);
            }

            public Delete setFields(String str) {
                return (Delete) super.setFields(str);
            }

            public Delete setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Delete setKey(String str) {
                return (Delete) super.setKey(str);
            }

            public Delete setOauthToken(String str) {
                return (Delete) super.setOauthToken(str);
            }

            public Delete setPrettyPrint(Boolean bool) {
                return (Delete) super.setPrettyPrint(bool);
            }

            public Delete setQuotaUser(String str) {
                return (Delete) super.setQuotaUser(str);
            }

            public Delete setRevisionId(String str) {
                this.revisionId = str;
                return this;
            }

            public Delete setUserIp(String str) {
                return (Delete) super.setUserIp(str);
            }
        }

        public class Get extends DriveRequest<Revision> {
            private static final String REST_PATH = "files/{fileId}/revisions/{revisionId}";
            @ab
            private String fileId;
            @ab
            private String revisionId;

            protected Get(String str, String str2) {
                super(Drive.this, "GET", REST_PATH, null, Revision.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.revisionId = (String) am.m6912a((Object) str2, (Object) "Required parameter revisionId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getRevisionId() {
                return this.revisionId;
            }

            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }

            public Get setAlt(String str) {
                return (Get) super.setAlt(str);
            }

            public Get setFields(String str) {
                return (Get) super.setFields(str);
            }

            public Get setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Get setKey(String str) {
                return (Get) super.setKey(str);
            }

            public Get setOauthToken(String str) {
                return (Get) super.setOauthToken(str);
            }

            public Get setPrettyPrint(Boolean bool) {
                return (Get) super.setPrettyPrint(bool);
            }

            public Get setQuotaUser(String str) {
                return (Get) super.setQuotaUser(str);
            }

            public Get setRevisionId(String str) {
                this.revisionId = str;
                return this;
            }

            public Get setUserIp(String str) {
                return (Get) super.setUserIp(str);
            }
        }

        public class List extends DriveRequest<RevisionList> {
            private static final String REST_PATH = "files/{fileId}/revisions";
            @ab
            private String fileId;

            protected List(String str) {
                super(Drive.this, "GET", REST_PATH, null, RevisionList.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
            }

            public C0692t buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            public C0695x executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFileId() {
                return this.fileId;
            }

            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }

            public List setAlt(String str) {
                return (List) super.setAlt(str);
            }

            public List setFields(String str) {
                return (List) super.setFields(str);
            }

            public List setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public List setKey(String str) {
                return (List) super.setKey(str);
            }

            public List setOauthToken(String str) {
                return (List) super.setOauthToken(str);
            }

            public List setPrettyPrint(Boolean bool) {
                return (List) super.setPrettyPrint(bool);
            }

            public List setQuotaUser(String str) {
                return (List) super.setQuotaUser(str);
            }

            public List setUserIp(String str) {
                return (List) super.setUserIp(str);
            }
        }

        public class Patch extends DriveRequest<Revision> {
            private static final String REST_PATH = "files/{fileId}/revisions/{revisionId}";
            @ab
            private String fileId;
            @ab
            private String revisionId;

            protected Patch(String str, String str2, Revision revision) {
                super(Drive.this, "PATCH", REST_PATH, revision, Revision.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.revisionId = (String) am.m6912a((Object) str2, (Object) "Required parameter revisionId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getRevisionId() {
                return this.revisionId;
            }

            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }

            public Patch setAlt(String str) {
                return (Patch) super.setAlt(str);
            }

            public Patch setFields(String str) {
                return (Patch) super.setFields(str);
            }

            public Patch setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Patch setKey(String str) {
                return (Patch) super.setKey(str);
            }

            public Patch setOauthToken(String str) {
                return (Patch) super.setOauthToken(str);
            }

            public Patch setPrettyPrint(Boolean bool) {
                return (Patch) super.setPrettyPrint(bool);
            }

            public Patch setQuotaUser(String str) {
                return (Patch) super.setQuotaUser(str);
            }

            public Patch setRevisionId(String str) {
                this.revisionId = str;
                return this;
            }

            public Patch setUserIp(String str) {
                return (Patch) super.setUserIp(str);
            }
        }

        public class Update extends DriveRequest<Revision> {
            private static final String REST_PATH = "files/{fileId}/revisions/{revisionId}";
            @ab
            private String fileId;
            @ab
            private String revisionId;

            protected Update(String str, String str2, Revision revision) {
                super(Drive.this, "PUT", REST_PATH, revision, Revision.class);
                this.fileId = (String) am.m6912a((Object) str, (Object) "Required parameter fileId must be specified.");
                this.revisionId = (String) am.m6912a((Object) str2, (Object) "Required parameter revisionId must be specified.");
            }

            public String getFileId() {
                return this.fileId;
            }

            public String getRevisionId() {
                return this.revisionId;
            }

            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }

            public Update setAlt(String str) {
                return (Update) super.setAlt(str);
            }

            public Update setFields(String str) {
                return (Update) super.setFields(str);
            }

            public Update setFileId(String str) {
                this.fileId = str;
                return this;
            }

            public Update setKey(String str) {
                return (Update) super.setKey(str);
            }

            public Update setOauthToken(String str) {
                return (Update) super.setOauthToken(str);
            }

            public Update setPrettyPrint(Boolean bool) {
                return (Update) super.setPrettyPrint(bool);
            }

            public Update setQuotaUser(String str) {
                return (Update) super.setQuotaUser(str);
            }

            public Update setRevisionId(String str) {
                this.revisionId = str;
                return this;
            }

            public Update setUserIp(String str) {
                return (Update) super.setUserIp(str);
            }
        }

        public Delete delete(String str, String str2) {
            C0762c delete = new Delete(str, str2);
            Drive.this.initialize(delete);
            return delete;
        }

        public Get get(String str, String str2) {
            C0762c get = new Get(str, str2);
            Drive.this.initialize(get);
            return get;
        }

        public List list(String str) {
            C0762c list = new List(str);
            Drive.this.initialize(list);
            return list;
        }

        public Patch patch(String str, String str2, Revision revision) {
            C0762c patch = new Patch(str, str2, revision);
            Drive.this.initialize(patch);
            return patch;
        }

        public Update update(String str, String str2, Revision revision) {
            C0762c update = new Update(str, str2, revision);
            Drive.this.initialize(update);
            return update;
        }
    }

    static {
        am.m6918b(C0742a.f7663d.equals("1.14.1-beta"), "You are currently running with version %s of google-api-client. You need version 1.14.1-beta of google-api-client to run version 1.14.1-beta of the Drive API library.", C0742a.f7663d);
    }

    public Drive(ac acVar, C0771d c0771d, C0659w c0659w) {
        this(new Builder(acVar, c0771d, c0659w));
    }

    Drive(Builder builder) {
        super(builder);
    }

    public About about() {
        return new About();
    }

    public Apps apps() {
        return new Apps();
    }

    public Changes changes() {
        return new Changes();
    }

    public Children children() {
        return new Children();
    }

    public Comments comments() {
        return new Comments();
    }

    public Files files() {
        return new Files();
    }

    protected void initialize(C0762c<?> c0762c) {
        super.initialize(c0762c);
    }

    public Parents parents() {
        return new Parents();
    }

    public Permissions permissions() {
        return new Permissions();
    }

    public Properties properties() {
        return new Properties();
    }

    public Replies replies() {
        return new Replies();
    }

    public Revisions revisions() {
        return new Revisions();
    }
}
