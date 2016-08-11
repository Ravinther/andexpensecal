package com.google.api.client.json;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.api.client.p050d.C0656w;
import com.google.api.client.p050d.C0724l;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0734v;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.at;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.api.client.json.h */
public abstract class C0775h {
    private final Object m7098a(Field field, Type type, ArrayList<Type> arrayList, Object obj, C0778a c0778a) {
        Type type2 = null;
        int i = 1;
        Type a = C0728p.m6963a((List) arrayList, type);
        Class cls = a instanceof Class ? (Class) a : null;
        if (a instanceof ParameterizedType) {
            cls = at.m6926a((ParameterizedType) a);
        }
        C0783k d = m7112d();
        String e = m7113e();
        StringBuilder stringBuilder = new StringBuilder();
        if (!(e == null && field == null)) {
            stringBuilder.append(" [");
            if (e != null) {
                stringBuilder.append("key ").append(e);
            }
            if (field != null) {
                if (e != null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("field ").append(field);
            }
            stringBuilder.append("]");
        }
        e = stringBuilder.toString();
        boolean z;
        boolean z2;
        switch (C0781i.f7741a[d.ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                am.m6916a(!at.m6937a(a), "expected object or map type but got %s%s", a, e);
                Object a2 = (cls == null || c0778a == null) ? null : c0778a.m7140a(obj, cls);
                if (cls == null || !at.m6936a(cls, Map.class)) {
                    i = 0;
                }
                if (a2 == null) {
                    a2 = (i != 0 || cls == null) ? C0728p.m6968b(cls) : at.m6930a(cls);
                }
                int size = arrayList.size();
                if (a != null) {
                    arrayList.add(a);
                }
                if (!(i == 0 || C0656w.class.isAssignableFrom(cls))) {
                    if (Map.class.isAssignableFrom(cls)) {
                        type2 = at.m6940d(a);
                    }
                    if (type2 != null) {
                        m7100a(field, (Map) a2, type2, (ArrayList) arrayList, c0778a);
                        return a2;
                    }
                }
                m7101a((ArrayList) arrayList, a2, c0778a);
                if (a == null) {
                    return a2;
                }
                arrayList.remove(size);
                return a2;
            case C0607c.LoadingImageView_circleCrop /*2*/:
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                boolean a3 = at.m6937a(a);
                z = a == null || a3 || (cls != null && at.m6936a(cls, Collection.class));
                am.m6916a(z, "expected collection or array type but got %s%s", a, e);
                Collection a4 = (c0778a == null || field == null) ? null : c0778a.m7141a(obj, field);
                if (a4 == null) {
                    a4 = C0728p.m6967b(a);
                }
                if (a3) {
                    type2 = at.m6938b(a);
                } else if (cls != null && Iterable.class.isAssignableFrom(cls)) {
                    type2 = at.m6939c(a);
                }
                type2 = C0728p.m6963a((List) arrayList, type2);
                m7099a(field, a4, type2, (ArrayList) arrayList, c0778a);
                return a3 ? at.m6931a(a4, at.m6927a((List) arrayList, type2)) : a4;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                z2 = a == null || cls == Boolean.TYPE || (cls != null && cls.isAssignableFrom(Boolean.class));
                am.m6916a(z2, "expected type Boolean or boolean but got %s%s", a, e);
                return d == C0783k.VALUE_TRUE ? Boolean.TRUE : Boolean.FALSE;
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                z = field == null || field.getAnnotation(C0782j.class) == null;
                am.m6916a(z, "number type formatted as a JSON number cannot use @JsonString annotation%s", e);
                if (cls == null || cls.isAssignableFrom(BigDecimal.class)) {
                    return m7123o();
                }
                if (cls == BigInteger.class) {
                    return m7122n();
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(m7121m());
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(m7120l());
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(m7119k());
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(m7118j());
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(m7117i());
                }
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(m7116h());
                }
                throw new IllegalArgumentException("expected numeric type but got " + a + e);
            case adv.TitlePageIndicator_footerPadding /*10*/:
                z2 = (cls != null && Number.class.isAssignableFrom(cls) && (field == null || field.getAnnotation(C0782j.class) == null)) ? false : true;
                am.m6916a(z2, "number field formatted as a JSON string must use the @JsonString annotation%s", e);
                try {
                    return C0728p.m6962a(a, m7115g());
                } catch (Throwable e2) {
                    throw new IllegalArgumentException(e, e2);
                }
            case adv.TitlePageIndicator_linePosition /*11*/:
                z = cls == null || !cls.isPrimitive();
                am.m6916a(z, "primitive number field but found a JSON null%s", e);
                if (!(cls == null || (cls.getModifiers() & 1536) == 0)) {
                    if (at.m6936a(cls, Collection.class)) {
                        return C0728p.m6961a(C0728p.m6967b(a).getClass());
                    }
                    if (at.m6936a(cls, Map.class)) {
                        return C0728p.m6961a(C0728p.m6968b(cls).getClass());
                    }
                }
                return C0728p.m6961a(at.m6927a((List) arrayList, a));
            default:
                throw new IllegalArgumentException("unexpected JSON node type: " + d + e);
        }
    }

    private <T> void m7099a(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, C0778a c0778a) {
        C0783k q = m7103q();
        while (q != C0783k.END_ARRAY) {
            collection.add(m7098a(field, type, (ArrayList) arrayList, (Object) collection, c0778a));
            q = m7111c();
        }
    }

    private void m7100a(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, C0778a c0778a) {
        C0783k q = m7103q();
        while (q == C0783k.FIELD_NAME) {
            String g = m7115g();
            m7111c();
            if (c0778a == null || !c0778a.m7142a((Object) map, g)) {
                map.put(g, m7098a(field, type, (ArrayList) arrayList, (Object) map, c0778a));
                q = m7111c();
            } else {
                return;
            }
        }
    }

    private void m7101a(ArrayList<Type> arrayList, Object obj, C0778a c0778a) {
        if (obj instanceof C0657b) {
            ((C0657b) obj).setFactory(m7104a());
        }
        C0783k q = m7103q();
        Class cls = obj.getClass();
        C0724l a = C0724l.m6952a(cls);
        boolean isAssignableFrom = C0656w.class.isAssignableFrom(cls);
        if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            while (q == C0783k.FIELD_NAME) {
                String g = m7115g();
                m7111c();
                if (c0778a == null || !c0778a.m7142a(obj, g)) {
                    C0734v a2 = a.m6954a(g);
                    if (a2 != null) {
                        if (!a2.m6990e() || a2.m6991f()) {
                            Field a3 = a2.m6985a();
                            int size = arrayList.size();
                            arrayList.add(a3.getGenericType());
                            Object a4 = m7098a(a3, a2.m6989d(), (ArrayList) arrayList, obj, c0778a);
                            arrayList.remove(size);
                            a2.m6986a(obj, a4);
                        } else {
                            throw new IllegalArgumentException("final array/object fields are not supported");
                        }
                    } else if (isAssignableFrom) {
                        ((C0656w) obj).set(g, m7098a(null, null, (ArrayList) arrayList, obj, c0778a));
                    } else {
                        if (c0778a != null) {
                            c0778a.m7143b(obj, g);
                        }
                        m7114f();
                    }
                    q = m7111c();
                } else {
                    return;
                }
            }
            return;
        }
        m7100a(null, (Map) obj, at.m6940d(cls), (ArrayList) arrayList, c0778a);
    }

    private C0783k m7102p() {
        C0783k d = m7112d();
        C0783k c = d == null ? m7111c() : d;
        am.m6915a(c != null, (Object) "no JSON input found");
        return c;
    }

    private C0783k m7103q() {
        C0783k p = m7102p();
        switch (C0781i.f7741a[p.ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                C0783k c = m7111c();
                boolean z = c == C0783k.FIELD_NAME || c == C0783k.END_OBJECT;
                am.m6915a(z, (Object) c);
                return c;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return m7111c();
            default:
                return p;
        }
    }

    public abstract C0771d m7104a();

    public final <T> T m7105a(Class<T> cls, C0778a c0778a) {
        try {
            T b = m7109b(cls, c0778a);
            return b;
        } finally {
            m7110b();
        }
    }

    public Object m7106a(Type type, boolean z, C0778a c0778a) {
        try {
            m7102p();
            Object a = m7098a(null, type, new ArrayList(), null, c0778a);
            return a;
        } finally {
            if (z) {
                m7110b();
            }
        }
    }

    public final String m7107a(Set<String> set) {
        C0783k q = m7103q();
        while (q == C0783k.FIELD_NAME) {
            String g = m7115g();
            m7111c();
            if (set.contains(g)) {
                return g;
            }
            m7114f();
            q = m7111c();
        }
        return null;
    }

    public final void m7108a(String str) {
        m7107a(Collections.singleton(str));
    }

    public final <T> T m7109b(Class<T> cls, C0778a c0778a) {
        m7102p();
        return m7106a((Type) cls, false, c0778a);
    }

    public abstract void m7110b();

    public abstract C0783k m7111c();

    public abstract C0783k m7112d();

    public abstract String m7113e();

    public abstract C0775h m7114f();

    public abstract String m7115g();

    public abstract byte m7116h();

    public abstract short m7117i();

    public abstract int m7118j();

    public abstract float m7119k();

    public abstract long m7120l();

    public abstract double m7121m();

    public abstract BigInteger m7122n();

    public abstract BigDecimal m7123o();
}
