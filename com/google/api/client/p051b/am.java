package com.google.api.client.p051b;

import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.api.client.p050d.C0656w;
import com.google.api.client.p050d.C0717e;
import com.google.api.client.p050d.C0723k;
import com.google.api.client.p050d.C0724l;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0734v;
import com.google.api.client.p050d.aj;
import com.google.api.client.p050d.as;
import com.google.api.client.p050d.at;
import com.google.api.client.p050d.p065a.C0707a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.api.client.b.am */
public class am implements aj {
    public static final String f7415a;

    static {
        f7415a = new C0691s("application/x-www-form-urlencoded").m6757a(C0723k.f7601a).m6762c();
    }

    private static Object m6643a(Type type, List<Type> list, String str) {
        return C0728p.m6962a(C0728p.m6963a((List) list, type), str);
    }

    public static void m6644a(Reader reader, Object obj) {
        Class cls = obj.getClass();
        C0724l a = C0724l.m6952a(cls);
        List asList = Arrays.asList(new Type[]{cls});
        C0656w c0656w = C0656w.class.isAssignableFrom(cls) ? (C0656w) obj : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj : null;
        C0717e c0717e = new C0717e(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        int i = 1;
        while (true) {
            int read = reader.read();
            switch (read) {
                case MediationAdRequest.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED /*-1*/:
                case 38:
                    String b = C0707a.m6870b(stringWriter.toString());
                    if (b.length() != 0) {
                        String b2 = C0707a.m6870b(stringWriter2.toString());
                        C0734v a2 = a.m6954a(b);
                        if (a2 != null) {
                            Type a3 = C0728p.m6963a(asList, a2.m6989d());
                            if (at.m6937a(a3)) {
                                Type a4 = at.m6927a(asList, at.m6938b(a3));
                                c0717e.m6944a(a2.m6985a(), a4, am.m6643a(a4, asList, b2));
                            } else if (at.m6936a(at.m6927a(asList, a3), Iterable.class)) {
                                Collection collection = (Collection) a2.m6984a(obj);
                                if (collection == null) {
                                    collection = C0728p.m6967b(a3);
                                    a2.m6986a(obj, (Object) collection);
                                }
                                collection.add(am.m6643a(a3 == Object.class ? null : at.m6939c(a3), asList, b2));
                            } else {
                                a2.m6986a(obj, am.m6643a(a3, asList, b2));
                            }
                        } else if (map != null) {
                            ArrayList arrayList = (ArrayList) map.get(b);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (c0656w != null) {
                                    c0656w.set(b, arrayList);
                                } else {
                                    map.put(b, arrayList);
                                }
                            }
                            arrayList.add(b2);
                        }
                    }
                    stringWriter = new StringWriter();
                    stringWriter2 = new StringWriter();
                    if (read != -1) {
                        i = 1;
                        break;
                    } else {
                        c0717e.m6943a();
                        return;
                    }
                case 61:
                    i = 0;
                    break;
                default:
                    if (i == 0) {
                        stringWriter2.write(read);
                        break;
                    } else {
                        stringWriter.write(read);
                        break;
                    }
            }
        }
    }

    public static void m6645a(String str, Object obj) {
        if (str != null) {
            try {
                am.m6644a(new StringReader(str), obj);
            } catch (Throwable e) {
                throw as.m6925a(e);
            }
        }
    }

    public <T> T m6646a(InputStream inputStream, Charset charset, Class<T> cls) {
        return m6647a(new InputStreamReader(inputStream, charset), (Class) cls);
    }

    public <T> T m6647a(Reader reader, Class<T> cls) {
        return m6648a(reader, (Type) cls);
    }

    public Object m6648a(Reader reader, Type type) {
        com.google.api.client.p050d.am.m6915a(type instanceof Class, (Object) "dataType has to be of type Class<?>");
        Object a = at.m6930a((Class) type);
        am.m6644a(new BufferedReader(reader), a);
        return a;
    }
}
