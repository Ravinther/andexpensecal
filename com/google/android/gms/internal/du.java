package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@id
public final class du {
    public final List<dt> f6460a;
    public final long f6461b;
    public final List<String> f6462c;
    public final List<String> f6463d;
    public final List<String> f6464e;
    public final String f6465f;
    public final long f6466g;
    public int f6467h;
    public int f6468i;

    public du(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (ly.m6067a(2)) {
            ly.m6072d("Mediation Response JSON: " + jSONObject.toString(2));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            dt dtVar = new dt(jSONArray.getJSONObject(i2));
            arrayList.add(dtVar);
            if (i < 0 && m5373a(dtVar)) {
                i = i2;
            }
        }
        this.f6467h = i;
        this.f6468i = jSONArray.length();
        this.f6460a = Collections.unmodifiableList(arrayList);
        this.f6465f = jSONObject.getString("qdata");
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f6461b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f6462c = ec.m5415a(optJSONObject, "click_urls");
            this.f6463d = ec.m5415a(optJSONObject, "imp_urls");
            this.f6464e = ec.m5415a(optJSONObject, "nofill_urls");
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f6466g = optLong > 0 ? optLong * 1000 : -1;
            return;
        }
        this.f6461b = -1;
        this.f6462c = null;
        this.f6463d = null;
        this.f6464e = null;
        this.f6466g = -1;
    }

    private boolean m5373a(dt dtVar) {
        for (String equals : dtVar.f6455c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
