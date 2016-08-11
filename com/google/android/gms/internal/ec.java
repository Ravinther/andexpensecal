package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@id
public final class ec {
    public static List<String> m5415a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void m5416a(Context context, String str, kr krVar, String str2, boolean z, List<String> list) {
        String str3 = z ? "1" : "0";
        for (String replaceAll : list) {
            String replaceAll2 = replaceAll2.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", krVar.f6989o.f6465f).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", kw.f7020a).replaceAll("@gw_seqnum@", krVar.f6983i);
            if (krVar.f6986l != null) {
                replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", krVar.f6986l.f6454b).replaceAll("@gw_allocid@", krVar.f6986l.f6456d);
            }
            new lw(context, str, replaceAll2).m5624e();
        }
    }
}
