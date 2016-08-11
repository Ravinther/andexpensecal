package com.google.api.client.p051b;

import com.google.api.client.p050d.C0723k;
import com.google.api.client.p050d.aa;
import com.google.api.client.p050d.aq;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.b.x */
public final class C0695x {
    ag f7517a;
    private InputStream f7518b;
    private final String f7519c;
    private final String f7520d;
    private final C0691s f7521e;
    private final int f7522f;
    private final String f7523g;
    private final C0692t f7524h;
    private int f7525i;
    private boolean f7526j;
    private boolean f7527k;

    C0695x(C0692t c0692t, ag agVar) {
        StringBuilder stringBuilder;
        C0691s c0691s = null;
        this.f7524h = c0692t;
        this.f7525i = c0692t.m6784e();
        this.f7526j = c0692t.m6785f();
        this.f7517a = agVar;
        this.f7519c = agVar.m6559b();
        int e = agVar.m6563e();
        this.f7522f = e;
        String f = agVar.m6564f();
        this.f7523g = f;
        Logger logger = ac.f7381a;
        Object obj = (this.f7526j && logger.isLoggable(Level.CONFIG)) ? 1 : null;
        if (obj != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("-------------- RESPONSE --------------").append(aq.f7582a);
            String d = agVar.m6562d();
            if (d != null) {
                stringBuilder.append(d);
            } else {
                stringBuilder.append(e);
                if (f != null) {
                    stringBuilder.append(' ').append(f);
                }
            }
            stringBuilder.append(aq.f7582a);
        } else {
            stringBuilder = null;
        }
        c0692t.m6787h().m6726a(agVar, obj != null ? stringBuilder : null);
        String c = agVar.m6561c();
        if (c == null) {
            c = c0692t.m6787h().m6736e();
        }
        this.f7520d = c;
        if (c != null) {
            c0691s = new C0691s(c);
        }
        this.f7521e = c0691s;
        if (obj != null) {
            logger.config(stringBuilder.toString());
        }
    }

    private boolean m6805l() {
        int d = m6811d();
        if (!m6813f().m6780b().equals("HEAD") && d / 100 != 1 && d != 204 && d != 304) {
            return true;
        }
        m6815h();
        return false;
    }

    public <T> T m6806a(Class<T> cls) {
        return !m6805l() ? null : this.f7524h.m6790k().m6642a(m6814g(), m6818k(), cls);
    }

    public String m6807a() {
        return this.f7520d;
    }

    public void m6808a(OutputStream outputStream) {
        aa.m6900a(m6814g(), outputStream);
    }

    public C0688p m6809b() {
        return this.f7524h.m6787h();
    }

    public boolean m6810c() {
        return ab.m6602a(this.f7522f);
    }

    public int m6811d() {
        return this.f7522f;
    }

    public String m6812e() {
        return this.f7523g;
    }

    public C0692t m6813f() {
        return this.f7524h;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream m6814g() {
        /*
        r6 = this;
        r0 = r6.f7527k;
        if (r0 != 0) goto L_0x003b;
    L_0x0004:
        r0 = r6.f7517a;
        r0 = r0.m6557a();
        if (r0 == 0) goto L_0x0038;
    L_0x000c:
        r1 = r6.f7519c;	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        if (r1 == 0) goto L_0x001e;
    L_0x0010:
        r2 = "gzip";
        r1 = r1.contains(r2);	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        if (r1 == 0) goto L_0x001e;
    L_0x0018:
        r1 = new java.util.zip.GZIPInputStream;	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        r1.<init>(r0);	 Catch:{ EOFException -> 0x003e, all -> 0x0043 }
        r0 = r1;
    L_0x001e:
        r2 = com.google.api.client.p051b.ac.f7381a;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r1 = r6.f7526j;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        if (r1 == 0) goto L_0x0036;
    L_0x0024:
        r1 = java.util.logging.Level.CONFIG;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r1 = r2.isLoggable(r1);	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        if (r1 == 0) goto L_0x0036;
    L_0x002c:
        r1 = new com.google.api.client.d.ad;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r3 = java.util.logging.Level.CONFIG;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r4 = r6.f7525i;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r1.<init>(r0, r2, r3, r4);	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
        r0 = r1;
    L_0x0036:
        r6.f7518b = r0;	 Catch:{ EOFException -> 0x003e, all -> 0x004b }
    L_0x0038:
        r0 = 1;
        r6.f7527k = r0;
    L_0x003b:
        r0 = r6.f7518b;
        return r0;
    L_0x003e:
        r1 = move-exception;
        r0.close();
        goto L_0x0038;
    L_0x0043:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x0047:
        r1.close();
        throw r0;
    L_0x004b:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.b.x.g():java.io.InputStream");
    }

    public void m6815h() {
        InputStream g = m6814g();
        if (g != null) {
            g.close();
        }
    }

    public void m6816i() {
        m6815h();
        this.f7517a.m6566h();
    }

    public String m6817j() {
        InputStream g = m6814g();
        if (g == null) {
            return "";
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aa.m6900a(g, byteArrayOutputStream);
        return byteArrayOutputStream.toString(m6818k().name());
    }

    public Charset m6818k() {
        return (this.f7521e == null || this.f7521e.m6765d() == null) ? C0723k.f7602b : this.f7521e.m6765d();
    }
}
