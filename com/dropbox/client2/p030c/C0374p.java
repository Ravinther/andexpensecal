package com.dropbox.client2.p030c;

import java.io.Serializable;

/* renamed from: com.dropbox.client2.c.p */
public abstract class C0374p implements Serializable {
    public final String f2366a;
    public final String f2367b;

    public C0374p(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("'key' must be non-null");
        } else if (str.contains("|")) {
            throw new IllegalArgumentException("'key' must not contain a \"|\" character: \"" + str + "\"");
        } else if (str2 == null) {
            throw new IllegalArgumentException("'secret' must be non-null");
        } else {
            this.f2366a = str;
            this.f2367b = str2;
        }
    }

    public boolean m2333a(C0374p c0374p) {
        return this.f2366a.equals(c0374p.f2366a) && this.f2367b.equals(c0374p.f2367b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0374p) && m2333a((C0374p) obj);
    }

    public int hashCode() {
        return this.f2366a.hashCode() ^ (this.f2367b.hashCode() << 1);
    }

    public String toString() {
        return "{key=\"" + this.f2366a + "\", secret=\"" + this.f2367b.charAt(0) + "...\"}";
    }
}
