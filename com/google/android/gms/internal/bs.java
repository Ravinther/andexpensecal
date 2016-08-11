package com.google.android.gms.internal;

import android.text.TextUtils;

@id
public final class bs {
    private String f6335a;
    private String f6336b;
    private String f6337c;
    private String f6338d;

    public bs() {
        this.f6335a = null;
        this.f6336b = null;
        this.f6337c = null;
        this.f6338d = null;
        this.f6335a = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html";
        this.f6336b = null;
        this.f6337c = null;
        this.f6338d = null;
    }

    public bs(String str, String str2, String str3, String str4) {
        this.f6335a = null;
        this.f6336b = null;
        this.f6337c = null;
        this.f6338d = null;
        if (TextUtils.isEmpty(str)) {
            this.f6335a = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html";
        } else {
            this.f6335a = str;
        }
        this.f6336b = str2;
        this.f6337c = str3;
        this.f6338d = str4;
    }

    public String m5220a() {
        return this.f6335a;
    }

    public String m5221b() {
        return this.f6336b;
    }

    public String m5222c() {
        return this.f6337c;
    }

    public String m5223d() {
        return this.f6338d;
    }
}
