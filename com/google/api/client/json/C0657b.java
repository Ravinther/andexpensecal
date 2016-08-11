package com.google.api.client.json;

import com.google.api.client.p050d.C0656w;
import com.google.api.client.p050d.as;

/* renamed from: com.google.api.client.json.b */
public class C0657b extends C0656w implements Cloneable {
    private C0771d jsonFactory;

    public C0657b clone() {
        return (C0657b) super.clone();
    }

    public final C0771d getFactory() {
        return this.jsonFactory;
    }

    public C0657b set(String str, Object obj) {
        return (C0657b) super.set(str, obj);
    }

    public final void setFactory(C0771d c0771d) {
        this.jsonFactory = c0771d;
    }

    public String toPrettyString() {
        return this.jsonFactory != null ? this.jsonFactory.m7058b(this) : super.toString();
    }

    public String toString() {
        if (this.jsonFactory == null) {
            return super.toString();
        }
        try {
            return this.jsonFactory.m7057a((Object) this);
        } catch (Throwable e) {
            throw as.m6925a(e);
        }
    }
}
