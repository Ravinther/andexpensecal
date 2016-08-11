package com.google.android.gms.internal;

import android.net.Uri.Builder;
import android.text.TextUtils;

@id
public class pk implements pj {
    private final ks f7330a;
    private final ma f7331b;

    public pk(ks ksVar, ma maVar) {
        this.f7330a = ksVar;
        this.f7331b = maVar;
    }

    public void m6482a(String str) {
        ly.m6065a("An auto-clicking creative is blocked");
        Builder builder = new Builder();
        builder.scheme("https");
        builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
        builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(str)) {
            builder.appendQueryParameter("navigationURL", str);
        }
        if (!(this.f7330a == null || this.f7330a.f6999b == null || TextUtils.isEmpty(this.f7330a.f6999b.f6569o))) {
            builder.appendQueryParameter("debugDialog", this.f7330a.f6999b.f6569o);
        }
        li.m6006a(this.f7331b.getContext(), this.f7331b.m6100i().f6668b, builder.toString());
    }
}
