package com.google.api.client.googleapis.p074d;

import com.google.api.client.p050d.aj;
import com.google.api.client.p050d.am;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.ac;

/* renamed from: com.google.api.client.googleapis.d.b */
public abstract class C0760b {
    String applicationName;
    C0764f googleClientRequestInitializer;
    C0659w httpRequestInitializer;
    final aj objectParser;
    String rootUrl;
    String servicePath;
    boolean suppressPatternChecks;
    boolean suppressRequiredParameterChecks;
    final ac transport;

    protected C0760b(ac acVar, String str, String str2, aj ajVar, C0659w c0659w) {
        this.transport = (ac) am.m6911a((Object) acVar);
        this.objectParser = ajVar;
        setRootUrl(str);
        setServicePath(str2);
        this.httpRequestInitializer = c0659w;
    }

    public abstract C0758a build();

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final C0764f getGoogleClientRequestInitializer() {
        return this.googleClientRequestInitializer;
    }

    public final C0659w getHttpRequestInitializer() {
        return this.httpRequestInitializer;
    }

    public aj getObjectParser() {
        return this.objectParser;
    }

    public final String getRootUrl() {
        return this.rootUrl;
    }

    public final String getServicePath() {
        return this.servicePath;
    }

    public final boolean getSuppressPatternChecks() {
        return this.suppressPatternChecks;
    }

    public final boolean getSuppressRequiredParameterChecks() {
        return this.suppressRequiredParameterChecks;
    }

    public final ac getTransport() {
        return this.transport;
    }

    public C0760b setApplicationName(String str) {
        this.applicationName = str;
        return this;
    }

    public C0760b setGoogleClientRequestInitializer(C0764f c0764f) {
        this.googleClientRequestInitializer = c0764f;
        return this;
    }

    public C0760b setHttpRequestInitializer(C0659w c0659w) {
        this.httpRequestInitializer = c0659w;
        return this;
    }

    public C0760b setRootUrl(String str) {
        this.rootUrl = C0758a.normalizeRootUrl(str);
        return this;
    }

    public C0760b setServicePath(String str) {
        this.servicePath = C0758a.normalizeServicePath(str);
        return this;
    }

    public C0760b setSuppressAllChecks(boolean z) {
        return setSuppressPatternChecks(true).setSuppressRequiredParameterChecks(true);
    }

    public C0760b setSuppressPatternChecks(boolean z) {
        this.suppressPatternChecks = z;
        return this;
    }

    public C0760b setSuppressRequiredParameterChecks(boolean z) {
        this.suppressRequiredParameterChecks = z;
        return this;
    }
}
