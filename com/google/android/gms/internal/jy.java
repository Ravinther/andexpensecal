package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@id
public class jy implements Callable<kr> {
    private final Context f6888a;
    private final lr f6889b;
    private final pb f6890c;
    private final C0646s f6891d;
    private final Object f6892e;
    private final ks f6893f;
    private boolean f6894g;
    private int f6895h;
    private List<String> f6896i;

    public jy(Context context, pb pbVar, C0646s c0646s, lr lrVar, ks ksVar) {
        this.f6892e = new Object();
        this.f6888a = context;
        this.f6890c = pbVar;
        this.f6889b = lrVar;
        this.f6891d = c0646s;
        this.f6893f = ksVar;
        this.f6894g = false;
        this.f6895h = -2;
        this.f6896i = null;
    }

    private cg m5847a(C0645q c0645q, kb kbVar, JSONObject jSONObject) {
        if (m5857b()) {
            return null;
        }
        String[] a = m5850a(jSONObject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        this.f6896i = a == null ? null : Arrays.asList(a);
        cg a2 = kbVar.m5865a(this, jSONObject);
        if (a2 == null) {
            ly.m6068b("Failed to retrieve ad assets.");
            return null;
        }
        a2.m5258a(new cf(this.f6890c, c0645q, jSONObject));
        return a2;
    }

    private kr m5848a(cg cgVar) {
        int i;
        synchronized (this.f6892e) {
            i = this.f6895h;
            if (cgVar == null && this.f6895h == -2) {
                i = 0;
            }
        }
        return new kr(this.f6893f.f6998a.f6540c, null, this.f6893f.f6999b.f6558d, i, this.f6893f.f6999b.f6560f, this.f6896i, this.f6893f.f6999b.f6566l, this.f6893f.f6999b.f6565k, this.f6893f.f6998a.f6546i, false, null, null, null, null, null, 0, this.f6893f.f7001d, this.f6893f.f6999b.f6561g, this.f6893f.f7003f, this.f6893f.f7004g, this.f6893f.f6999b.f6569o, this.f6893f.f7005h, i != -2 ? null : cgVar);
    }

    private JSONObject m5849a(C0645q c0645q) {
        if (m5857b()) {
            return null;
        }
        ll llVar = new ll();
        c0645q.m6499a("/nativeAdPreProcess", new jz(this, c0645q, llVar));
        c0645q.m6500a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(this.f6893f.f6999b.f6557c));
        return (JSONObject) llVar.get();
    }

    private String[] m5850a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private C0645q m5851c() {
        if (m5857b()) {
            return null;
        }
        C0645q c0645q = (C0645q) this.f6891d.m6505a(this.f6888a, this.f6893f.f6998a.f6548k, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html").get();
        c0645q.m6496a(this.f6890c, this.f6890c, this.f6890c, this.f6890c, false, this.f6890c);
        return c0645q;
    }

    protected kb m5852a(JSONObject jSONObject) {
        if (m5857b()) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        if ("2".equals(string)) {
            return new kc();
        }
        if ("1".equals(string)) {
            return new kd();
        }
        m5855a(0);
        return null;
    }

    public kr m5853a() {
        try {
            C0645q c = m5851c();
            JSONObject a = m5849a(c);
            return m5848a(m5847a(c, m5852a(a), a));
        } catch (CancellationException e) {
            if (!this.f6894g) {
                m5855a(0);
            }
            return m5848a(null);
        } catch (ExecutionException e2) {
            if (this.f6894g) {
                m5855a(0);
            }
            return m5848a(null);
        } catch (InterruptedException e3) {
            if (this.f6894g) {
                m5855a(0);
            }
            return m5848a(null);
        } catch (Throwable e4) {
            ly.m6073d("Malformed native JSON response.", e4);
            if (this.f6894g) {
                m5855a(0);
            }
            return m5848a(null);
        } catch (Throwable e42) {
            ly.m6073d("Timeout when loading native ad.", e42);
            if (this.f6894g) {
                m5855a(0);
            }
            return m5848a(null);
        }
    }

    public Future<Drawable> m5854a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        Object string = z ? jSONObject2.getString("url") : jSONObject2.optString("url");
        if (!TextUtils.isEmpty(string)) {
            return this.f6889b.m6047a(string, new ka(this, z));
        }
        m5856a(0, z);
        return new lm(null);
    }

    public void m5855a(int i) {
        synchronized (this.f6892e) {
            this.f6894g = true;
            this.f6895h = i;
        }
    }

    public void m5856a(int i, boolean z) {
        if (z) {
            m5855a(i);
        }
    }

    public boolean m5857b() {
        boolean z;
        synchronized (this.f6892e) {
            z = this.f6894g;
        }
        return z;
    }

    public /* synthetic */ Object call() {
        return m5853a();
    }
}
