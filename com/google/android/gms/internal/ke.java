package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@id
public final class ke extends ju {
    private static final Object f6903a;
    private static ke f6904b;
    private final Context f6905c;
    private final kp f6906d;
    private final dn f6907e;
    private final bs f6908f;

    static {
        f6903a = new Object();
    }

    ke(Context context, bs bsVar, dn dnVar, kp kpVar) {
        this.f6905c = context;
        this.f6906d = kpVar;
        this.f6907e = dnVar;
        this.f6908f = bsVar;
    }

    private static fj m5870a(Context context, bs bsVar, dn dnVar, kp kpVar, fh fhVar) {
        ly.m6065a("Starting ad request from service.");
        dnVar.m5360a();
        ko koVar = new ko(context);
        if (koVar.f6963l == -1) {
            ly.m6065a("Device is offline.");
            return new fj(2);
        }
        String string;
        kj kjVar = new kj(fhVar.f6543f.packageName);
        if (fhVar.f6540c.f6239c != null) {
            string = fhVar.f6540c.f6239c.getString("_ad");
            if (string != null) {
                return ki.m5877a(context, fhVar, string);
            }
        }
        Location a = dnVar.m5359a(250);
        String a2 = bsVar.m5220a();
        string = ki.m5880a(fhVar, koVar, a, bsVar.m5221b(), bsVar.m5222c(), bsVar.m5223d());
        if (string == null) {
            return new fj(0);
        }
        lx.f7093a.post(new kf(context, fhVar, kjVar, m5873a(string), a2));
        fj fjVar;
        try {
            kn knVar = (kn) kjVar.m5888a().get(10, TimeUnit.SECONDS);
            if (knVar == null) {
                fjVar = new fj(0);
                return fjVar;
            } else if (knVar.m5917a() != -2) {
                fj fjVar2 = new fj(knVar.m5917a());
                lx.f7093a.post(new kg(kjVar));
                return fjVar2;
            } else {
                String str = null;
                if (knVar.m5923f()) {
                    str = kpVar.m5927a(fhVar.f6544g.packageName);
                }
                fjVar = m5871a(context, fhVar.f6548k.f6668b, knVar.m5921d(), str, knVar);
                lx.f7093a.post(new kg(kjVar));
                return fjVar;
            }
        } catch (Exception e) {
            fjVar = new fj(0);
            return fjVar;
        } finally {
            lx.f7093a.post(new kg(kjVar));
        }
    }

    public static fj m5871a(Context context, String str, String str2, String str3, kn knVar) {
        HttpURLConnection httpURLConnection;
        try {
            int responseCode;
            fj fjVar;
            km kmVar = new km();
            ly.m6065a("AdRequestServiceImpl: Sending request: " + str2);
            URL url = new URL(str2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            URL url2 = url;
            int i = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                li.m6009a(context, str, false, httpURLConnection);
                if (!TextUtils.isEmpty(str3)) {
                    httpURLConnection.addRequestProperty("x-afma-drt-cookie", str3);
                }
                if (!(knVar == null || TextUtils.isEmpty(knVar.m5920c()))) {
                    httpURLConnection.setDoOutput(true);
                    byte[] bytes = knVar.m5920c().getBytes();
                    httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                }
                responseCode = httpURLConnection.getResponseCode();
                Map headerFields = httpURLConnection.getHeaderFields();
                if (responseCode < 200 || responseCode >= 300) {
                    m5874a(url2.toString(), headerFields, null, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    Object headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        ly.m6074e("No location header to follow redirect.");
                        fjVar = new fj(0);
                        httpURLConnection.disconnect();
                        return fjVar;
                    }
                    url2 = new URL(headerField);
                    i++;
                    if (i > 5) {
                        ly.m6074e("Too many redirects.");
                        fjVar = new fj(0);
                        httpURLConnection.disconnect();
                        return fjVar;
                    }
                    kmVar.m5913a(headerFields);
                    httpURLConnection.disconnect();
                } else {
                    String url3 = url2.toString();
                    String a = li.m5998a(new InputStreamReader(httpURLConnection.getInputStream()));
                    m5874a(url3, headerFields, a, responseCode);
                    kmVar.m5912a(url3, headerFields, a);
                    fjVar = kmVar.m5911a(elapsedRealtime);
                    httpURLConnection.disconnect();
                    return fjVar;
                }
            }
            ly.m6074e("Received error HTTP response code: " + responseCode);
            fjVar = new fj(0);
            httpURLConnection.disconnect();
            return fjVar;
        } catch (IOException e) {
            ly.m6074e("Error while connecting to ad server: " + e.getMessage());
            return new fj(2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    public static ke m5872a(Context context, bs bsVar, dn dnVar, kp kpVar) {
        ke keVar;
        synchronized (f6903a) {
            if (f6904b == null) {
                f6904b = new ke(context.getApplicationContext(), bsVar, dnVar, kpVar);
            }
            keVar = f6904b;
        }
        return keVar;
    }

    private static me m5873a(String str) {
        return new kh(str);
    }

    private static void m5874a(String str, Map<String, List<String>> map, String str2, int i) {
        if (ly.m6067a(2)) {
            ly.m6072d("Http Response: {\n  URL:\n    " + str + "\n  Headers:");
            if (map != null) {
                for (String str3 : map.keySet()) {
                    ly.m6072d("    " + str3 + ":");
                    for (String str32 : (List) map.get(str32)) {
                        ly.m6072d("      " + str32);
                    }
                }
            }
            ly.m6072d("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    ly.m6072d(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                ly.m6072d("    null");
            }
            ly.m6072d("  Response Code:\n    " + i + "\n}");
        }
    }

    public fj m5875a(fh fhVar) {
        return m5870a(this.f6905c, this.f6908f, this.f6907e, this.f6906d, fhVar);
    }
}
