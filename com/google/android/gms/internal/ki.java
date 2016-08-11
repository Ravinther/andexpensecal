package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@id
public final class ki {
    private static final SimpleDateFormat f6916a;

    static {
        f6916a = new SimpleDateFormat("yyyyMMdd");
    }

    public static fj m5877a(Context context, fh fhVar, String str) {
        try {
            fj fjVar;
            int i;
            List list;
            List list2;
            List list3;
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ad_base_url", null);
            String optString2 = jSONObject.optString("ad_url", null);
            String optString3 = jSONObject.optString("ad_size", null);
            String optString4 = jSONObject.optString("ad_html", null);
            long j = -1;
            String optString5 = jSONObject.optString("debug_dialog", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            String optString6 = jSONObject.optString("orientation", null);
            int i2 = -1;
            if ("portrait".equals(optString6)) {
                i2 = li.m6024c();
            } else if ("landscape".equals(optString6)) {
                i2 = li.m6020b();
            }
            if (TextUtils.isEmpty(optString4)) {
                if (TextUtils.isEmpty(optString2)) {
                    ly.m6074e("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                    return new fj(0);
                }
                fj a = ke.m5871a(context, fhVar.f6548k.f6668b, optString2, null, null);
                optString = a.f6556b;
                optString4 = a.f6557c;
                j = a.f6568n;
                fjVar = a;
            } else if (TextUtils.isEmpty(optString)) {
                ly.m6074e("Could not parse the mediation config: Missing required ad_base_url field");
                return new fj(0);
            } else {
                fjVar = null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list4 = fjVar == null ? null : fjVar.f6558d;
            if (optJSONArray != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (i = 0; i < optJSONArray.length(); i++) {
                    list4.add(optJSONArray.getString(i));
                }
                list = list4;
            } else {
                list = list4;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
            list4 = fjVar == null ? null : fjVar.f6560f;
            if (optJSONArray2 != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (i = 0; i < optJSONArray2.length(); i++) {
                    list4.add(optJSONArray2.getString(i));
                }
                list2 = list4;
            } else {
                list2 = list4;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("manual_impression_urls");
            list4 = fjVar == null ? null : fjVar.f6564j;
            if (optJSONArray3 != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (i = 0; i < optJSONArray3.length(); i++) {
                    list4.add(optJSONArray3.getString(i));
                }
                list3 = list4;
            } else {
                list3 = list4;
            }
            if (fjVar != null) {
                if (fjVar.f6566l != -1) {
                    i2 = fjVar.f6566l;
                }
                if (fjVar.f6561g > 0) {
                    j2 = fjVar.f6561g;
                }
            }
            String optString7 = jSONObject.optString("active_view");
            String str2 = null;
            boolean optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str2 = jSONObject.optString("ad_passback_url", null);
            }
            return new fj(optString, optString4, list, list2, j2, false, -1, list3, -1, i2, optString3, j, optString5, optBoolean, str2, optString7, false, false, fhVar.f6553p, false);
        } catch (JSONException e) {
            ly.m6074e("Could not parse the mediation config: " + e.getMessage());
            return new fj(0);
        }
    }

    private static Integer m5878a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String m5879a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    public static String m5880a(fh fhVar, ko koVar, Location location, String str, String str2, String str3) {
        try {
            Map hashMap = new HashMap();
            Iterable arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(str3);
            }
            if (arrayList.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", arrayList));
            }
            if (fhVar.f6539b != null) {
                hashMap.put("ad_pos", fhVar.f6539b);
            }
            m5882a((HashMap) hashMap, fhVar.f6540c);
            hashMap.put("format", fhVar.f6541d.f6254b);
            if (fhVar.f6541d.f6258f == -1) {
                hashMap.put("smart_w", "full");
            }
            if (fhVar.f6541d.f6255c == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (fhVar.f6541d.f6260h != null) {
                StringBuilder stringBuilder = new StringBuilder();
                for (ay ayVar : fhVar.f6541d.f6260h) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    stringBuilder.append(ayVar.f6258f == -1 ? (int) (((float) ayVar.f6259g) / koVar.f6968q) : ayVar.f6258f);
                    stringBuilder.append("x");
                    stringBuilder.append(ayVar.f6255c == -2 ? (int) (((float) ayVar.f6256d) / koVar.f6968q) : ayVar.f6255c);
                }
                hashMap.put("sz", stringBuilder);
            }
            if (fhVar.f6550m != 0) {
                hashMap.put("native_version", Integer.valueOf(fhVar.f6550m));
                hashMap.put("native_templates", fhVar.f6551n);
            }
            hashMap.put("slotname", fhVar.f6542e);
            hashMap.put("pn", fhVar.f6543f.packageName);
            if (fhVar.f6544g != null) {
                hashMap.put("vc", Integer.valueOf(fhVar.f6544g.versionCode));
            }
            hashMap.put("ms", fhVar.f6545h);
            hashMap.put("seq_num", fhVar.f6546i);
            hashMap.put("session_id", fhVar.f6547j);
            hashMap.put("js", fhVar.f6548k.f6668b);
            m5884a((HashMap) hashMap, koVar);
            if (fhVar.f6540c.f6237a >= 2 && fhVar.f6540c.f6247k != null) {
                m5881a((HashMap) hashMap, fhVar.f6540c.f6247k);
            }
            if (fhVar.f6538a >= 2) {
                hashMap.put("quality_signals", fhVar.f6549l);
            }
            if (fhVar.f6538a >= 4 && fhVar.f6553p) {
                hashMap.put("forceHttps", Boolean.valueOf(fhVar.f6553p));
            }
            if (fhVar.f6538a >= 3 && fhVar.f6552o != null) {
                hashMap.put("content_info", fhVar.f6552o);
            }
            if (ly.m6067a(2)) {
                ly.m6072d("Ad Request JSON: " + li.m6004a(hashMap).toString(2));
            }
            return li.m6004a(hashMap).toString();
        } catch (JSONException e) {
            ly.m6074e("Problem serializing ad request to JSON: " + e.getMessage());
            return null;
        }
    }

    private static void m5881a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    private static void m5882a(HashMap<String, Object> hashMap, av avVar) {
        String a = la.m5988a();
        if (a != null) {
            hashMap.put("abf", a);
        }
        if (avVar.f6238b != -1) {
            hashMap.put("cust_age", f6916a.format(new Date(avVar.f6238b)));
        }
        if (avVar.f6239c != null) {
            hashMap.put("extras", avVar.f6239c);
        }
        if (avVar.f6240d != -1) {
            hashMap.put("cust_gender", Integer.valueOf(avVar.f6240d));
        }
        if (avVar.f6241e != null) {
            hashMap.put("kw", avVar.f6241e);
        }
        if (avVar.f6243g != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(avVar.f6243g));
        }
        if (avVar.f6242f) {
            hashMap.put("adtest", "on");
        }
        if (avVar.f6237a >= 2) {
            if (avVar.f6244h) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(avVar.f6245i)) {
                hashMap.put("ppid", avVar.f6245i);
            }
            if (avVar.f6246j != null) {
                m5883a((HashMap) hashMap, avVar.f6246j);
            }
        }
        if (avVar.f6237a >= 3 && avVar.f6248l != null) {
            hashMap.put("url", avVar.f6248l);
        }
    }

    private static void m5883a(HashMap<String, Object> hashMap, bj bjVar) {
        Object obj;
        Object obj2 = null;
        if (Color.alpha(bjVar.f6271b) != 0) {
            hashMap.put("acolor", m5879a(bjVar.f6271b));
        }
        if (Color.alpha(bjVar.f6272c) != 0) {
            hashMap.put("bgcolor", m5879a(bjVar.f6272c));
        }
        if (!(Color.alpha(bjVar.f6273d) == 0 || Color.alpha(bjVar.f6274e) == 0)) {
            hashMap.put("gradientto", m5879a(bjVar.f6273d));
            hashMap.put("gradientfrom", m5879a(bjVar.f6274e));
        }
        if (Color.alpha(bjVar.f6275f) != 0) {
            hashMap.put("bcolor", m5879a(bjVar.f6275f));
        }
        hashMap.put("bthick", Integer.toString(bjVar.f6276g));
        switch (bjVar.f6277h) {
            case C0607c.AdsAttrs_adSize /*0*/:
                obj = "none";
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                obj = "dashed";
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                obj = "dotted";
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                obj = "solid";
                break;
            default:
                obj = null;
                break;
        }
        if (obj != null) {
            hashMap.put("btype", obj);
        }
        switch (bjVar.f6278i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                obj2 = "light";
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                obj2 = "medium";
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                obj2 = "dark";
                break;
        }
        if (obj2 != null) {
            hashMap.put("callbuttoncolor", obj2);
        }
        if (bjVar.f6279j != null) {
            hashMap.put("channel", bjVar.f6279j);
        }
        if (Color.alpha(bjVar.f6280k) != 0) {
            hashMap.put("dcolor", m5879a(bjVar.f6280k));
        }
        if (bjVar.f6281l != null) {
            hashMap.put("font", bjVar.f6281l);
        }
        if (Color.alpha(bjVar.f6282m) != 0) {
            hashMap.put("hcolor", m5879a(bjVar.f6282m));
        }
        hashMap.put("headersize", Integer.toString(bjVar.f6283n));
        if (bjVar.f6284o != null) {
            hashMap.put("q", bjVar.f6284o);
        }
    }

    private static void m5884a(HashMap<String, Object> hashMap, ko koVar) {
        hashMap.put("am", Integer.valueOf(koVar.f6952a));
        hashMap.put("cog", m5878a(koVar.f6953b));
        hashMap.put("coh", m5878a(koVar.f6954c));
        if (!TextUtils.isEmpty(koVar.f6955d)) {
            hashMap.put("carrier", koVar.f6955d);
        }
        hashMap.put("gl", koVar.f6956e);
        if (koVar.f6957f) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        hashMap.put("ma", m5878a(koVar.f6958g));
        hashMap.put("sp", m5878a(koVar.f6959h));
        hashMap.put("hl", koVar.f6960i);
        if (!TextUtils.isEmpty(koVar.f6961j)) {
            hashMap.put("mv", koVar.f6961j);
        }
        hashMap.put("muv", Integer.valueOf(koVar.f6962k));
        if (koVar.f6963l != -2) {
            hashMap.put("cnt", Integer.valueOf(koVar.f6963l));
        }
        hashMap.put("gnt", Integer.valueOf(koVar.f6964m));
        hashMap.put("pt", Integer.valueOf(koVar.f6965n));
        hashMap.put("rm", Integer.valueOf(koVar.f6966o));
        hashMap.put("riv", Integer.valueOf(koVar.f6967p));
        hashMap.put("u_sd", Float.valueOf(koVar.f6968q));
        hashMap.put("sh", Integer.valueOf(koVar.f6970s));
        hashMap.put("sw", Integer.valueOf(koVar.f6969r));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", koVar.f6974w);
        bundle.putBoolean("active_network_metered", koVar.f6973v);
        hashMap.put("connectivity", bundle);
        bundle = new Bundle();
        bundle.putBoolean("is_charging", koVar.f6972u);
        bundle.putDouble("battery_level", koVar.f6971t);
        hashMap.put("battery", bundle);
    }
}
