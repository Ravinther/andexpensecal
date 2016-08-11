package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import org.json.JSONObject;

@id
public class kc implements kb<cd> {
    public /* synthetic */ cg m5866a(jy jyVar, JSONObject jSONObject) {
        return m5867b(jyVar, jSONObject);
    }

    public cd m5867b(jy jyVar, JSONObject jSONObject) {
        return new cd(jSONObject.getString("headline"), (Drawable) jyVar.m5854a(jSONObject, "image", true).get(), jSONObject.getString("body"), (Drawable) jyVar.m5854a(jSONObject, "app_icon", true).get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString("price"));
    }
}
