package com.google.android.p033a.p034a;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* renamed from: com.google.android.a.a.t */
public class C0580t implements C0577q {
    private long f6035a;
    private long f6036b;
    private long f6037c;
    private long f6038d;
    private long f6039e;
    private int f6040f;
    private C0578r f6041g;

    public C0580t(Context context, C0562p c0562p) {
        this.f6039e = 0;
        this.f6041g = new C0578r(context.getSharedPreferences("com.android.vending.licensing.ServerManagedPolicy", 0), c0562p);
        this.f6040f = Integer.parseInt(this.f6041g.m4867b("lastResponse", Integer.toString(291)));
        this.f6035a = Long.parseLong(this.f6041g.m4867b("validityTimestamp", "0"));
        this.f6036b = Long.parseLong(this.f6041g.m4867b("retryUntil", "0"));
        this.f6037c = Long.parseLong(this.f6041g.m4867b("maxRetries", "0"));
        this.f6038d = Long.parseLong(this.f6041g.m4867b("retryCount", "0"));
    }

    private void m4869a(int i) {
        this.f6039e = System.currentTimeMillis();
        this.f6040f = i;
        this.f6041g.m4866a("lastResponse", Integer.toString(i));
    }

    private void m4870a(long j) {
        this.f6038d = j;
        this.f6041g.m4866a("retryCount", Long.toString(j));
    }

    private void m4871a(String str) {
        Long valueOf;
        try {
            valueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
            valueOf = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(valueOf.longValue());
        }
        this.f6035a = valueOf.longValue();
        this.f6041g.m4866a("validityTimestamp", str);
    }

    private void m4872b(String str) {
        Long valueOf;
        try {
            valueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
            str = "0";
            valueOf = Long.valueOf(0);
        }
        this.f6036b = valueOf.longValue();
        this.f6041g.m4866a("retryUntil", str);
    }

    private void m4873c(String str) {
        Long valueOf;
        try {
            valueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
            str = "0";
            valueOf = Long.valueOf(0);
        }
        this.f6037c = valueOf.longValue();
        this.f6041g.m4866a("maxRetries", str);
    }

    private Map<String, String> m4874d(String str) {
        Map<String, String> hashMap = new HashMap();
        try {
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI("?" + str), "UTF-8")) {
                hashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        } catch (URISyntaxException e) {
            Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return hashMap;
    }

    public void m4875a(int i, C0579s c0579s) {
        if (i != 291) {
            m4870a(0);
        } else {
            m4870a(this.f6038d + 1);
        }
        if (i == 256) {
            Map d = m4874d(c0579s.f6034g);
            this.f6040f = i;
            m4871a((String) d.get("VT"));
            m4872b((String) d.get("GT"));
            m4873c((String) d.get("GR"));
        } else if (i == 561) {
            m4871a("0");
            m4872b("0");
            m4873c("0");
        }
        m4869a(i);
        this.f6041g.m4865a();
    }

    public boolean m4876a() {
        long currentTimeMillis = System.currentTimeMillis();
        return this.f6040f == 256 ? currentTimeMillis <= this.f6035a : (this.f6040f != 291 || currentTimeMillis >= this.f6039e + 60000) ? false : currentTimeMillis <= this.f6036b || this.f6038d <= this.f6037c;
    }
}
