package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import org.json.JSONObject;

@id
public class kd implements kb<ce> {
    public /* synthetic */ cg m5868a(jy jyVar, JSONObject jSONObject) {
        return m5869b(jyVar, jSONObject);
    }

    public ce m5869b(jy jyVar, JSONObject jSONObject) {
        return new ce(jSONObject.getString("headline"), (Drawable) jyVar.m5854a(jSONObject, "image", true).get(), jSONObject.getString("body"), (Drawable) jyVar.m5854a(jSONObject, "secondary_image", false).get(), jSONObject.getString("call_to_action"), jSONObject.getString("attribution"));
    }
}
