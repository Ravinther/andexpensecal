package com.google.api.client.googleapis.p074d.p075a;

import com.google.api.client.googleapis.p074d.C0760b;
import com.google.api.client.googleapis.p074d.C0764f;
import com.google.api.client.json.C0769f;
import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0780g;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.ac;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.api.client.googleapis.d.a.b */
public abstract class C0761b extends C0760b {
    protected C0761b(ac acVar, C0771d c0771d, String str, String str2, C0659w c0659w, boolean z) {
        Collection asList;
        C0780g c0780g = new C0780g(c0771d);
        if (z) {
            asList = Arrays.asList(new String[]{"data", "error"});
        } else {
            asList = Collections.emptySet();
        }
        super(acVar, str, str2, c0780g.m7145a(asList).m7144a(), c0659w);
    }

    public abstract C0759a build();

    public final C0771d getJsonFactory() {
        return getObjectParser().m7045a();
    }

    public final C0769f getObjectParser() {
        return (C0769f) super.getObjectParser();
    }

    public C0761b setApplicationName(String str) {
        return (C0761b) super.setApplicationName(str);
    }

    public C0761b setGoogleClientRequestInitializer(C0764f c0764f) {
        return (C0761b) super.setGoogleClientRequestInitializer(c0764f);
    }

    public C0761b setHttpRequestInitializer(C0659w c0659w) {
        return (C0761b) super.setHttpRequestInitializer(c0659w);
    }

    public C0761b setRootUrl(String str) {
        return (C0761b) super.setRootUrl(str);
    }

    public C0761b setServicePath(String str) {
        return (C0761b) super.setServicePath(str);
    }

    public C0761b setSuppressPatternChecks(boolean z) {
        return (C0761b) super.setSuppressPatternChecks(z);
    }

    public C0761b setSuppressRequiredParameterChecks(boolean z) {
        return (C0761b) super.setSuppressRequiredParameterChecks(z);
    }
}
