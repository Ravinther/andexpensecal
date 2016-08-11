package com.google.api.client.p051b;

import com.google.api.client.p050d.C0656w;
import com.google.api.client.p050d.C0717e;
import com.google.api.client.p050d.C0724l;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0734v;
import com.google.api.client.p050d.C0737z;
import com.google.api.client.p050d.ab;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.aq;
import com.google.api.client.p050d.as;
import com.google.api.client.p050d.at;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.b.p */
public class C0688p extends C0656w {
    @ab(a = "Accept-Encoding")
    private List<String> f7456a;
    @ab(a = "Authorization")
    private List<String> f7457b;
    @ab(a = "Cache-Control")
    private List<String> f7458c;
    @ab(a = "Content-Encoding")
    private List<String> f7459d;
    @ab(a = "Content-Length")
    private List<Long> f7460e;
    @ab(a = "Content-Range")
    private List<String> f7461f;
    @ab(a = "Content-Type")
    private List<String> f7462g;
    @ab(a = "If-Modified-Since")
    private List<String> f7463h;
    @ab(a = "If-Match")
    private List<String> f7464i;
    @ab(a = "If-None-Match")
    private List<String> f7465j;
    @ab(a = "If-Unmodified-Since")
    private List<String> f7466k;
    @ab(a = "If-Range")
    private List<String> f7467l;
    @ab(a = "Location")
    private List<String> f7468m;
    @ab(a = "Range")
    private List<String> f7469n;
    @ab(a = "User-Agent")
    private List<String> f7470o;
    @ab(a = "Age")
    private List<Long> f7471p;

    public C0688p() {
        super(EnumSet.of(C0737z.IGNORE_CASE));
        this.f7456a = new ArrayList(Collections.singleton("gzip"));
    }

    private static Object m6713a(Type type, List<Type> list, String str) {
        return C0728p.m6962a(C0728p.m6963a((List) list, type), str);
    }

    private static String m6714a(Object obj) {
        return obj instanceof Enum ? C0734v.m6980a((Enum) obj).m6987b() : obj.toString();
    }

    static void m6715a(C0688p c0688p, StringBuilder stringBuilder, StringBuilder stringBuilder2, Logger logger, af afVar) {
        C0688p.m6716a(c0688p, stringBuilder, stringBuilder2, logger, afVar, null);
    }

    static void m6716a(C0688p c0688p, StringBuilder stringBuilder, StringBuilder stringBuilder2, Logger logger, af afVar, Writer writer) {
        HashSet hashSet = new HashSet();
        for (Entry entry : c0688p.entrySet()) {
            String str = (String) entry.getKey();
            am.m6916a(hashSet.add(str), "multiple headers of the same name (headers are case insensitive): %s", str);
            Object value = entry.getValue();
            if (value != null) {
                C0734v a = c0688p.getClassInfo().m6954a(str);
                String b = a != null ? a.m6987b() : str;
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object value2 : at.m6929a(value2)) {
                        C0688p.m6718a(logger, stringBuilder, stringBuilder2, afVar, b, value2, writer);
                    }
                } else {
                    C0688p.m6718a(logger, stringBuilder, stringBuilder2, afVar, b, value2, writer);
                }
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    public static void m6717a(C0688p c0688p, StringBuilder stringBuilder, Logger logger, Writer writer) {
        C0688p.m6716a(c0688p, stringBuilder, null, logger, null, writer);
    }

    private static void m6718a(Logger logger, StringBuilder stringBuilder, StringBuilder stringBuilder2, af afVar, String str, Object obj, Writer writer) {
        if (obj != null && !C0728p.m6965a(obj)) {
            String a = C0688p.m6714a(obj);
            String str2 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : a;
            if (stringBuilder != null) {
                stringBuilder.append(str).append(": ");
                stringBuilder.append(str2);
                stringBuilder.append(aq.f7582a);
            }
            if (stringBuilder2 != null) {
                stringBuilder2.append(" -H '").append(str).append(": ").append(str2).append("'");
            }
            if (afVar != null) {
                afVar.m6548a(str, a);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(a);
                writer.write("\r\n");
            }
        }
    }

    private <T> T m6719b(List<T> list) {
        return list == null ? null : list.get(0);
    }

    private <T> List<T> m6720b(T t) {
        if (t == null) {
            return null;
        }
        List<T> arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    public C0688p m6721a() {
        return (C0688p) super.clone();
    }

    public C0688p m6722a(Long l) {
        this.f7460e = m6720b((Object) l);
        return this;
    }

    public C0688p m6723a(String str) {
        this.f7456a = m6720b((Object) str);
        return this;
    }

    public C0688p m6724a(String str, Object obj) {
        return (C0688p) super.set(str, obj);
    }

    public C0688p m6725a(List<String> list) {
        this.f7457b = list;
        return this;
    }

    public final void m6726a(ag agVar, StringBuilder stringBuilder) {
        clear();
        C0690r c0690r = new C0690r(this, stringBuilder);
        int g = agVar.m6565g();
        for (int i = 0; i < g; i++) {
            m6728a(agVar.m6558a(i), agVar.m6560b(i), c0690r);
        }
        c0690r.m6750a();
    }

    public final void m6727a(C0688p c0688p) {
        try {
            C0690r c0690r = new C0690r(this, null);
            C0688p.m6715a(c0688p, null, null, null, new C0689q(this, c0690r));
            c0690r.m6750a();
        } catch (Throwable e) {
            throw as.m6925a(e);
        }
    }

    void m6728a(String str, String str2, C0690r c0690r) {
        List list = c0690r.f7477d;
        C0724l c0724l = c0690r.f7476c;
        C0717e c0717e = c0690r.f7474a;
        StringBuilder stringBuilder = c0690r.f7475b;
        if (stringBuilder != null) {
            stringBuilder.append(str + ": " + str2).append(aq.f7582a);
        }
        C0734v a = c0724l.m6954a(str);
        if (a != null) {
            Type a2 = C0728p.m6963a(list, a.m6989d());
            if (at.m6937a(a2)) {
                Type a3 = at.m6927a(list, at.m6938b(a2));
                c0717e.m6944a(a.m6985a(), a3, C0688p.m6713a(a3, list, str2));
                return;
            } else if (at.m6936a(at.m6927a(list, a2), Iterable.class)) {
                Collection collection = (Collection) a.m6984a((Object) this);
                if (collection == null) {
                    collection = C0728p.m6967b(a2);
                    a.m6986a((Object) this, (Object) collection);
                }
                collection.add(C0688p.m6713a(a2 == Object.class ? null : at.m6939c(a2), list, str2));
                return;
            } else {
                a.m6986a((Object) this, C0688p.m6713a(a2, list, str2));
                return;
            }
        }
        ArrayList arrayList = (ArrayList) get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            m6724a(str, (Object) arrayList);
        }
        arrayList.add(str2);
    }

    public C0688p m6729b(String str) {
        return m6725a(m6720b((Object) str));
    }

    public final String m6730b() {
        return (String) m6719b(this.f7458c);
    }

    public C0688p m6731c(String str) {
        this.f7459d = m6720b((Object) str);
        return this;
    }

    public final Long m6732c() {
        return (Long) m6719b(this.f7460e);
    }

    public /* synthetic */ C0656w clone() {
        return m6721a();
    }

    public /* synthetic */ Object m7191clone() {
        return m6721a();
    }

    public C0688p m6733d(String str) {
        this.f7461f = m6720b((Object) str);
        return this;
    }

    public final String m6734d() {
        return (String) m6719b(this.f7461f);
    }

    public C0688p m6735e(String str) {
        this.f7462g = m6720b((Object) str);
        return this;
    }

    public final String m6736e() {
        return (String) m6719b(this.f7462g);
    }

    public C0688p m6737f(String str) {
        this.f7463h = m6720b((Object) str);
        return this;
    }

    public final String m6738f() {
        return (String) m6719b(this.f7468m);
    }

    public C0688p m6739g(String str) {
        this.f7464i = m6720b((Object) str);
        return this;
    }

    public final String m6740g() {
        return (String) m6719b(this.f7469n);
    }

    public C0688p m6741h(String str) {
        this.f7465j = m6720b((Object) str);
        return this;
    }

    public final String m6742h() {
        return (String) m6719b(this.f7470o);
    }

    public C0688p m6743i(String str) {
        this.f7466k = m6720b((Object) str);
        return this;
    }

    public final Long m6744i() {
        return (Long) m6719b(this.f7471p);
    }

    public C0688p m6745j(String str) {
        this.f7467l = m6720b((Object) str);
        return this;
    }

    public C0688p m6746k(String str) {
        this.f7469n = m6720b((Object) str);
        return this;
    }

    public C0688p m6747l(String str) {
        this.f7470o = m6720b((Object) str);
        return this;
    }

    public /* synthetic */ C0656w set(String str, Object obj) {
        return m6724a(str, obj);
    }
}
