package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@id
public final class dt {
    public final String f6453a;
    public final String f6454b;
    public final List<String> f6455c;
    public final String f6456d;
    public final String f6457e;
    public final List<String> f6458f;
    public final String f6459g;

    public dt(JSONObject jSONObject) {
        String str = null;
        this.f6454b = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f6455c = Collections.unmodifiableList(arrayList);
        this.f6456d = jSONObject.optString("allocation_id", null);
        this.f6458f = ec.m5415a(jSONObject, "imp_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.f6453a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f6459g = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            str = optJSONObject2.optString("class_name");
        }
        this.f6457e = str;
    }
}
