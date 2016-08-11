package com.google.api.client.googleapis.p073c;

import com.google.api.client.p050d.aa;
import com.google.api.client.p050d.am;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0680f;
import com.google.api.client.p051b.C0686k;
import com.google.api.client.p051b.C0688p;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0694v;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.ac;
import java.io.OutputStream;

/* renamed from: com.google.api.client.googleapis.c.a */
public final class C0751a {
    private final C0694v f7682a;
    private final ac f7683b;
    private boolean f7684c;
    private boolean f7685d;
    private C0753c f7686e;
    private int f7687f;
    private long f7688g;
    private C0752b f7689h;
    private long f7690i;
    private long f7691j;

    public C0751a(ac acVar, C0659w c0659w) {
        this.f7684c = true;
        this.f7685d = false;
        this.f7687f = 33554432;
        this.f7689h = C0752b.NOT_STARTED;
        this.f7691j = -1;
        this.f7683b = (ac) am.m6911a((Object) acVar);
        this.f7682a = c0659w == null ? acVar.m6578a() : acVar.m6579a(c0659w);
    }

    private long m7021a(String str) {
        return str == null ? 0 : Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    private C0695x m7022a(long j, C0686k c0686k, C0688p c0688p, OutputStream outputStream) {
        C0692t a = this.f7682a.m6800a(c0686k);
        if (c0688p != null) {
            a.m6786g().putAll(c0688p);
        }
        if (!(this.f7690i == 0 && j == -1)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bytes=").append(this.f7690i).append("-");
            if (j != -1) {
                stringBuilder.append(j);
            }
            a.m6786g().m6746k(stringBuilder.toString());
        }
        if (this.f7684c) {
            a.m6770a(new C0680f());
        }
        C0695x n = a.m6793n();
        try {
            aa.m6900a(n.m6814g(), outputStream);
            return n;
        } finally {
            n.m6816i();
        }
    }

    private void m7023a(C0752b c0752b) {
        this.f7689h = c0752b;
        if (this.f7686e != null) {
            this.f7686e.m7026a(this);
        }
    }

    private void m7024b(String str) {
        if (str != null && this.f7688g == 0) {
            this.f7688g = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    public void m7025a(C0686k c0686k, C0688p c0688p, OutputStream outputStream) {
        am.m6914a(this.f7689h == C0752b.NOT_STARTED);
        c0686k.put("alt", (Object) "media");
        if (this.f7685d) {
            m7023a(C0752b.MEDIA_IN_PROGRESS);
            this.f7688g = m7022a(this.f7691j, c0686k, c0688p, outputStream).m6809b().m6732c().longValue();
            this.f7690i = this.f7688g;
            m7023a(C0752b.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long j = (this.f7690i + ((long) this.f7687f)) - 1;
            if (this.f7691j != -1) {
                j = Math.min(this.f7691j, j);
            }
            String d = m7022a(j, c0686k, c0688p, outputStream).m6809b().m6734d();
            j = m7021a(d);
            m7024b(d);
            if (this.f7688g <= j) {
                this.f7690i = this.f7688g;
                m7023a(C0752b.MEDIA_COMPLETE);
                return;
            }
            this.f7690i = j;
            m7023a(C0752b.MEDIA_IN_PROGRESS);
        }
    }
}
