package com.google.api.client.p051b;

import com.google.api.client.p050d.C0656w;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.p065a.C0707a;
import com.google.api.client.p050d.p065a.C0708b;
import com.google.api.client.p050d.p065a.C0710c;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.api.client.b.k */
public class C0686k extends C0656w {
    private static final C0708b f7448a;
    private String f7449b;
    private String f7450c;
    private int f7451d;
    private List<String> f7452e;
    private String f7453f;

    static {
        f7448a = new C0710c("=&-_.!~*'()@:$,;/?:", false);
    }

    public C0686k() {
        this.f7451d = -1;
    }

    public C0686k(String str) {
        this(C0686k.m6703d(str));
    }

    private C0686k(String str, String str2, int i, String str3, String str4, String str5) {
        this.f7451d = -1;
        this.f7449b = str.toLowerCase();
        this.f7450c = str2;
        this.f7451d = i;
        this.f7452e = C0686k.m6702c(str3);
        this.f7453f = str4;
        if (str5 != null) {
            am.m6645a(str5, (Object) this);
        }
    }

    public C0686k(URI uri) {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getFragment(), uri.getRawQuery());
    }

    public C0686k(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery());
    }

    private void m6699a(StringBuilder stringBuilder) {
        int size = this.f7452e.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f7452e.get(i);
            if (i != 0) {
                stringBuilder.append('/');
            }
            if (str.length() != 0) {
                stringBuilder.append(C0707a.m6871c(str));
            }
        }
    }

    static void m6700a(Set<Entry<String, Object>> set, StringBuilder stringBuilder) {
        boolean z = true;
        for (Entry entry : set) {
            boolean z2;
            Object value = entry.getValue();
            if (value != null) {
                String d = C0707a.m6872d((String) entry.getKey());
                if (value instanceof Collection) {
                    for (Object value2 : (Collection) value2) {
                        z = C0686k.m6701a(z, stringBuilder, d, value2);
                    }
                    z2 = z;
                } else {
                    z2 = C0686k.m6701a(z, stringBuilder, d, value2);
                }
            } else {
                z2 = z;
            }
            z = z2;
        }
    }

    private static boolean m6701a(boolean z, StringBuilder stringBuilder, String str, Object obj) {
        if (z) {
            z = false;
            stringBuilder.append('?');
        } else {
            stringBuilder.append('&');
        }
        stringBuilder.append(str);
        String d = C0707a.m6872d(obj.toString());
        if (d.length() != 0) {
            stringBuilder.append('=').append(d);
        }
        return z;
    }

    public static List<String> m6702c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        List<String> arrayList = new ArrayList();
        Object obj = 1;
        int i = 0;
        while (obj != null) {
            int indexOf = str.indexOf(47, i);
            obj = indexOf != -1 ? 1 : null;
            arrayList.add(C0707a.m6870b(obj != null ? str.substring(i, indexOf) : str.substring(i)));
            i = indexOf + 1;
        }
        return arrayList;
    }

    private static URI m6703d(String str) {
        try {
            return new URI(str);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C0686k m6704a() {
        C0686k c0686k = (C0686k) super.clone();
        if (this.f7452e != null) {
            c0686k.f7452e = new ArrayList(this.f7452e);
        }
        return c0686k;
    }

    public C0686k m6705a(String str, Object obj) {
        return (C0686k) super.set(str, obj);
    }

    public final URL m6706a(String str) {
        try {
            return new URL(m6711e(), str);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final String m6707b() {
        return m6709c() + m6710d();
    }

    public void m6708b(String str) {
        this.f7452e = C0686k.m6702c(str);
    }

    public final String m6709c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String) am.m6911a(this.f7449b));
        stringBuilder.append("://");
        stringBuilder.append((String) am.m6911a(this.f7450c));
        int i = this.f7451d;
        if (i != -1) {
            stringBuilder.append(':').append(i);
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ C0656w clone() {
        return m6704a();
    }

    public /* synthetic */ Object m7190clone() {
        return m6704a();
    }

    public final String m6710d() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f7452e != null) {
            m6699a(stringBuilder);
        }
        C0686k.m6700a(entrySet(), stringBuilder);
        String str = this.f7453f;
        if (str != null) {
            stringBuilder.append('#').append(f7448a.m6873a(str));
        }
        return stringBuilder.toString();
    }

    public final URL m6711e() {
        try {
            return new URL(m6707b());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C0686k)) {
            return false;
        }
        return m6707b().equals(((C0686k) obj).toString());
    }

    public int hashCode() {
        return m6707b().hashCode();
    }

    public /* synthetic */ C0656w set(String str, Object obj) {
        return m6705a(str, obj);
    }

    public String toString() {
        return m6707b();
    }
}
