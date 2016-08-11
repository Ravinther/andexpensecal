package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

@id
public class iv extends lb implements jl {
    private final C0638if f6805a;
    private final Object f6806b;
    private final Context f6807c;
    private final Object f6808d;
    private final jq f6809e;
    private final oc f6810f;
    private lb f6811g;
    private fj f6812h;
    private du f6813i;

    public iv(Context context, jq jqVar, oc ocVar, C0638if c0638if) {
        this.f6806b = new Object();
        this.f6808d = new Object();
        this.f6805a = c0638if;
        this.f6807c = context;
        this.f6809e = jqVar;
        this.f6810f = ocVar;
    }

    private ay m5772a(fh fhVar) {
        if (this.f6812h.f6567m == null) {
            throw new iy("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f6812h.f6567m.split("x");
        if (split.length != 2) {
            throw new iy("Could not parse the ad size from the ad response: " + this.f6812h.f6567m, 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (ay ayVar : fhVar.f6541d.f6260h) {
                float f = this.f6807c.getResources().getDisplayMetrics().density;
                int i = ayVar.f6258f == -1 ? (int) (((float) ayVar.f6259g) / f) : ayVar.f6258f;
                int i2 = ayVar.f6255c == -2 ? (int) (((float) ayVar.f6256d) / f) : ayVar.f6255c;
                if (parseInt == i && parseInt2 == i2) {
                    return new ay(ayVar, fhVar.f6541d.f6260h);
                }
            }
            throw new iy("The ad size from the ad response was not one of the requested sizes: " + this.f6812h.f6567m, 0);
        } catch (NumberFormatException e) {
            throw new iy("Could not parse the ad size from the ad response: " + this.f6812h.f6567m, 0);
        }
    }

    private void m5774a(long j) {
        while (m5777b(j)) {
            if (this.f6812h != null) {
                synchronized (this.f6806b) {
                    this.f6811g = null;
                }
                if (this.f6812h.f6559e != -2 && this.f6812h.f6559e != -3) {
                    throw new iy("There was a problem getting an ad response. ErrorCode: " + this.f6812h.f6559e, this.f6812h.f6559e);
                }
                return;
            }
        }
        throw new iy("Timed out waiting for ad response.", 2);
    }

    private void m5775a(boolean z) {
        kw.m5947a().m5964a(z);
        ad a = kw.m5947a().m5959a(this.f6807c);
        if (a != null && !a.isAlive()) {
            ly.m6065a("start fetching content...");
            a.m5022a();
        }
    }

    private boolean m5777b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f6808d.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new iy("Ad request cancelled.", -1);
        }
    }

    private void m5778c() {
        if (this.f6812h.f6559e != -3) {
            if (TextUtils.isEmpty(this.f6812h.f6557c)) {
                throw new iy("No fill from ad server.", 3);
            }
            kw.m5950a(this.f6807c, this.f6812h.f6575u);
            if (this.f6812h.f6562h) {
                try {
                    this.f6813i = new du(this.f6812h.f6557c);
                } catch (JSONException e) {
                    throw new iy("Could not parse mediation config: " + this.f6812h.f6557c, 0);
                }
            }
        }
    }

    public void m5779a() {
        long elapsedRealtime;
        ay a;
        iy e;
        JSONObject jSONObject;
        synchronized (this.f6808d) {
            ly.m6065a("AdLoaderBackgroundTask started.");
            fh fhVar = new fh(this.f6809e, this.f6810f.m6328a().m5942a(this.f6807c));
            int i = -2;
            long j = -1;
            try {
                elapsedRealtime = SystemClock.elapsedRealtime();
                lb a2 = jk.m5813a(this.f6807c, fhVar, this);
                synchronized (this.f6806b) {
                    this.f6811g = a2;
                    if (this.f6811g == null) {
                        throw new iy("Could not start the ad request service.", 0);
                    }
                }
                m5774a(elapsedRealtime);
                j = SystemClock.elapsedRealtime();
                m5778c();
                a = fhVar.f6541d.f6260h != null ? m5772a(fhVar) : null;
                try {
                    m5775a(this.f6812h.f6576v);
                    elapsedRealtime = j;
                } catch (iy e2) {
                    e = e2;
                    i = e.m5782a();
                    if (i == 3 || i == -1) {
                        ly.m6070c(e.getMessage());
                    } else {
                        ly.m6074e(e.getMessage());
                    }
                    if (this.f6812h == null) {
                        this.f6812h = new fj(i);
                    } else {
                        this.f6812h = new fj(i, this.f6812h.f6565k);
                    }
                    lx.f7093a.post(new iw(this));
                    elapsedRealtime = j;
                    if (!TextUtils.isEmpty(this.f6812h.f6572r)) {
                        try {
                            jSONObject = new JSONObject(this.f6812h.f6572r);
                        } catch (Throwable e3) {
                            ly.m6069b("Error parsing the JSON for Active View.", e3);
                        }
                        lx.f7093a.post(new ix(this, new ks(fhVar, this.f6812h, this.f6813i, a, i, elapsedRealtime, this.f6812h.f6568n, jSONObject)));
                    }
                    jSONObject = null;
                    lx.f7093a.post(new ix(this, new ks(fhVar, this.f6812h, this.f6813i, a, i, elapsedRealtime, this.f6812h.f6568n, jSONObject)));
                }
            } catch (iy e4) {
                e = e4;
                a = null;
            }
            if (TextUtils.isEmpty(this.f6812h.f6572r)) {
                jSONObject = new JSONObject(this.f6812h.f6572r);
                lx.f7093a.post(new ix(this, new ks(fhVar, this.f6812h, this.f6813i, a, i, elapsedRealtime, this.f6812h.f6568n, jSONObject)));
            }
            jSONObject = null;
            lx.f7093a.post(new ix(this, new ks(fhVar, this.f6812h, this.f6813i, a, i, elapsedRealtime, this.f6812h.f6568n, jSONObject)));
        }
    }

    public void m5780a(fj fjVar) {
        synchronized (this.f6808d) {
            ly.m6065a("Received ad response.");
            this.f6812h = fjVar;
            this.f6808d.notify();
        }
    }

    public void m5781b() {
        synchronized (this.f6806b) {
            if (this.f6811g != null) {
                this.f6811g.m5625f();
            }
        }
    }
}
