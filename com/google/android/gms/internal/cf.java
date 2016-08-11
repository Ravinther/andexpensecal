package com.google.android.gms.internal;

import org.json.JSONObject;

@id
public class cf {
    private pb f6383a;
    private C0645q f6384b;
    private JSONObject f6385c;

    public cf(pb pbVar, C0645q c0645q, JSONObject jSONObject) {
        this.f6383a = pbVar;
        this.f6384b = c0645q;
        this.f6385c = jSONObject;
    }

    public void m5287a() {
        this.f6383a.m6459h();
    }

    public void m5288a(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset", i);
            jSONObject.put("template", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad", this.f6385c);
            jSONObject2.put("click", jSONObject);
            this.f6384b.m6500a("google.afma.nativeAds.handleClick", jSONObject2);
        } catch (Throwable e) {
            ly.m6069b("Unable to create click JSON.", e);
        }
    }
}
