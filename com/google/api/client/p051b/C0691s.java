package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.api.client.b.s */
public final class C0691s {
    private static final Pattern f7478a;
    private static final Pattern f7479b;
    private static final Pattern f7480c;
    private static final Pattern f7481d;
    private String f7482e;
    private String f7483f;
    private final SortedMap<String, String> f7484g;
    private String f7485h;

    static {
        f7478a = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
        f7479b = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
        String str = "[^\\s/=;\"]+";
        f7480c = Pattern.compile("\\s*(" + str + ")/(" + str + ")" + "\\s*(" + ";.*" + ")?", 32);
        f7481d = Pattern.compile("\\s*;\\s*(" + str + ")" + "=(" + ("\"([^\"]*)\"" + "|" + "[^\\s;\"]*") + ")");
    }

    public C0691s(String str) {
        this.f7482e = "application";
        this.f7483f = "octet-stream";
        this.f7484g = new TreeMap();
        m6753f(str);
    }

    public static boolean m6751b(String str, String str2) {
        return (str == null && str2 == null) || !(str == null || str2 == null || !new C0691s(str).m6759a(new C0691s(str2)));
    }

    static boolean m6752e(String str) {
        return f7479b.matcher(str).matches();
    }

    private C0691s m6753f(String str) {
        Matcher matcher = f7480c.matcher(str);
        am.m6915a(matcher.matches(), (Object) "Type must be in the 'maintype/subtype; parameter=value' format");
        m6755a(matcher.group(1));
        m6760b(matcher.group(2));
        CharSequence group = matcher.group(3);
        if (group != null) {
            Matcher matcher2 = f7481d.matcher(group);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                String group3 = matcher2.group(3);
                if (group3 == null) {
                    group3 = matcher2.group(2);
                }
                m6756a(group2, group3);
            }
        }
        return this;
    }

    private static String m6754g(String str) {
        return "\"" + str.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    public C0691s m6755a(String str) {
        am.m6915a(f7478a.matcher(str).matches(), (Object) "Type contains reserved characters");
        this.f7482e = str;
        this.f7485h = null;
        return this;
    }

    public C0691s m6756a(String str, String str2) {
        if (str2 == null) {
            m6764d(str);
        } else {
            am.m6915a(f7479b.matcher(str).matches(), (Object) "Name contains reserved characters");
            this.f7485h = null;
            this.f7484g.put(str.toLowerCase(), str2);
        }
        return this;
    }

    public C0691s m6757a(Charset charset) {
        m6756a("charset", charset == null ? null : charset.name());
        return this;
    }

    public String m6758a() {
        return this.f7482e;
    }

    public boolean m6759a(C0691s c0691s) {
        return c0691s != null && m6758a().equalsIgnoreCase(c0691s.m6758a()) && m6761b().equalsIgnoreCase(c0691s.m6761b());
    }

    public C0691s m6760b(String str) {
        am.m6915a(f7478a.matcher(str).matches(), (Object) "Subtype contains reserved characters");
        this.f7483f = str;
        this.f7485h = null;
        return this;
    }

    public String m6761b() {
        return this.f7483f;
    }

    public String m6762c() {
        if (this.f7485h != null) {
            return this.f7485h;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f7482e);
        stringBuilder.append('/');
        stringBuilder.append(this.f7483f);
        if (this.f7484g != null) {
            for (Entry entry : this.f7484g.entrySet()) {
                String str = (String) entry.getValue();
                stringBuilder.append("; ");
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append("=");
                if (!C0691s.m6752e(str)) {
                    str = C0691s.m6754g(str);
                }
                stringBuilder.append(str);
            }
        }
        this.f7485h = stringBuilder.toString();
        return this.f7485h;
    }

    public String m6763c(String str) {
        return (String) this.f7484g.get(str.toLowerCase());
    }

    public C0691s m6764d(String str) {
        this.f7485h = null;
        this.f7484g.remove(str.toLowerCase());
        return this;
    }

    public Charset m6765d() {
        String c = m6763c("charset");
        return c == null ? null : Charset.forName(c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0691s)) {
            return false;
        }
        C0691s c0691s = (C0691s) obj;
        return m6759a(c0691s) && this.f7484g.equals(c0691s.f7484g);
    }

    public int hashCode() {
        return m6762c().hashCode();
    }

    public String toString() {
        return m6762c();
    }
}
