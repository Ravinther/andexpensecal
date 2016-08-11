package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

class jz implements cz {
    final /* synthetic */ C0645q f6897a;
    final /* synthetic */ ll f6898b;
    final /* synthetic */ jy f6899c;

    jz(jy jyVar, C0645q c0645q, ll llVar) {
        this.f6899c = jyVar;
        this.f6897a = c0645q;
        this.f6898b = llVar;
    }

    public void m5858a(ma maVar, Map<String, String> map) {
        this.f6897a.m6502b("/nativeAdPreProcess");
        try {
            String str = (String) map.get("success");
            if (!TextUtils.isEmpty(str)) {
                this.f6898b.m6035a(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
                return;
            }
        } catch (Throwable e) {
            ly.m6069b("Malformed native JSON response.", e);
        }
        this.f6899c.m5855a(0);
        ob.m6320a(this.f6899c.m5857b(), (Object) "Unable to set the ad state error!");
        this.f6898b.m6035a(null);
    }
}
