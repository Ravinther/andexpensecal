package com.google.api.client.googleapis.p074d.p075a;

import com.google.api.client.googleapis.json.C0770b;
import com.google.api.client.googleapis.p074d.C0758a;
import com.google.api.client.googleapis.p074d.C0764f;
import com.google.api.client.json.C0769f;
import com.google.api.client.json.C0771d;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.ac;

/* renamed from: com.google.api.client.googleapis.d.a.a */
public abstract class C0759a extends C0758a {
    @Deprecated
    protected C0759a(ac acVar, C0659w c0659w, String str, String str2, C0769f c0769f, C0764f c0764f, String str3, boolean z) {
        super(acVar, c0659w, str, str2, c0769f, c0764f, str3, z);
    }

    @Deprecated
    protected C0759a(ac acVar, C0771d c0771d, String str, String str2, C0659w c0659w, boolean z) {
        super(acVar, c0659w, str, str2, z ? new C0770b(c0771d) : new C0769f(c0771d));
    }

    protected C0759a(C0761b c0761b) {
        super(c0761b);
    }

    public final C0771d getJsonFactory() {
        return getObjectParser().m7045a();
    }

    public C0769f getObjectParser() {
        return (C0769f) super.getObjectParser();
    }
}
