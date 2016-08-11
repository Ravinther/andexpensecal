package com.google.android.gms.internal;

import org.json.JSONObject;

@id
public class fo {
    private final boolean f6594a;
    private final boolean f6595b;
    private final boolean f6596c;
    private final boolean f6597d;
    private final boolean f6598e;

    private fo(fq fqVar) {
        this.f6594a = fqVar.f6599a;
        this.f6595b = fqVar.f6600b;
        this.f6596c = fqVar.f6601c;
        this.f6597d = fqVar.f6602d;
        this.f6598e = fqVar.f6603e;
    }

    public JSONObject m5498a() {
        try {
            return new JSONObject().put("sms", this.f6594a).put("tel", this.f6595b).put("calendar", this.f6596c).put("storePicture", this.f6597d).put("inlineVideo", this.f6598e);
        } catch (Throwable e) {
            ly.m6069b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
