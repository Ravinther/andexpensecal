package com.google.api.client.p050d;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.api.client.d.p */
public class C0728p {
    public static final Boolean f7611a;
    public static final String f7612b;
    public static final Character f7613c;
    public static final Byte f7614d;
    public static final Short f7615e;
    public static final Integer f7616f;
    public static final Float f7617g;
    public static final Long f7618h;
    public static final Double f7619i;
    public static final BigInteger f7620j;
    public static final BigDecimal f7621k;
    public static final C0733u f7622l;
    private static final ConcurrentHashMap<Class<?>, Object> f7623m;

    static {
        f7611a = new Boolean(true);
        f7612b = new String();
        f7613c = new Character('\u0000');
        f7614d = new Byte((byte) 0);
        f7615e = new Short((short) 0);
        f7616f = new Integer(0);
        f7617g = new Float(0.0f);
        f7618h = new Long(0);
        f7619i = new Double(0.0d);
        f7620j = new BigInteger("0");
        f7621k = new BigDecimal("0");
        f7622l = new C0733u(0);
        f7623m = new ConcurrentHashMap();
        f7623m.put(Boolean.class, f7611a);
        f7623m.put(String.class, f7612b);
        f7623m.put(Character.class, f7613c);
        f7623m.put(Byte.class, f7614d);
        f7623m.put(Short.class, f7615e);
        f7623m.put(Integer.class, f7616f);
        f7623m.put(Float.class, f7617g);
        f7623m.put(Long.class, f7618h);
        f7623m.put(Double.class, f7619i);
        f7623m.put(BigInteger.class, f7620j);
        f7623m.put(BigDecimal.class, f7621k);
        f7623m.put(C0733u.class, f7622l);
    }

    public static <T> T m6961a(Class<?> cls) {
        int i = 0;
        T t = f7623m.get(cls);
        if (t == null) {
            synchronized (f7623m) {
                t = f7623m.get(cls);
                if (t == null) {
                    if (cls.isArray()) {
                        Class cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        t = Array.newInstance(cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        Object a = C0724l.m6952a((Class) cls).m6954a(null);
                        am.m6913a(a, "enum missing constant with @NullValue annotation: %s", cls);
                        t = a.m6992g();
                    } else {
                        t = at.m6930a((Class) cls);
                    }
                    f7623m.put(cls, t);
                }
            }
        }
        return t;
    }

    public static Object m6962a(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                throw new IllegalArgumentException("expected type Character/char but got " + cls);
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == C0733u.class) {
                    return C0733u.m6977a(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    return C0724l.m6952a(cls).m6954a(str).m6992g();
                }
            }
        }
        throw new IllegalArgumentException("expected primitive class, but got: " + type);
    }

    public static Type m6963a(List<Type> list, Type type) {
        Type a = type instanceof WildcardType ? at.m6934a((WildcardType) type) : type;
        while (a instanceof TypeVariable) {
            Type a2 = at.m6935a((List) list, (TypeVariable) a);
            if (a2 == null) {
                a2 = a;
            }
            a = a2 instanceof TypeVariable ? ((TypeVariable) a2).getBounds()[0] : a2;
        }
        return a;
    }

    public static void m6964a(Object obj, Object obj2) {
        boolean z = true;
        int i = 0;
        Class cls = obj.getClass();
        am.m6914a(cls == obj2.getClass());
        int i2;
        Object a;
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            am.m6914a(z);
            for (Object a2 : at.m6929a(obj)) {
                i2 = i + 1;
                Array.set(obj2, i, C0728p.m6970c(a2));
                i = i2;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object c : collection) {
                collection2.add(C0728p.m6970c(c));
            }
        } else {
            boolean isAssignableFrom = C0656w.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                C0724l a3 = isAssignableFrom ? ((C0656w) obj).classInfo : C0724l.m6952a(cls);
                for (String a4 : a3.f7605a) {
                    C0734v a5 = a3.m6954a(a4);
                    if (!(a5.m6990e() || (isAssignableFrom && a5.m6991f()))) {
                        a2 = a5.m6984a(obj);
                        if (a2 != null) {
                            a5.m6986a(obj2, C0728p.m6970c(a2));
                        }
                    }
                }
            } else if (C0713a.class.isAssignableFrom(cls)) {
                C0713a c0713a = (C0713a) obj2;
                C0713a c0713a2 = (C0713a) obj;
                i2 = c0713a2.size();
                while (i < i2) {
                    c0713a.m6893a(i, C0728p.m6970c(c0713a2.m6896b(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), C0728p.m6970c(entry.getValue()));
                }
            }
        }
    }

    public static boolean m6965a(Object obj) {
        return obj != null && obj == f7623m.get(obj.getClass());
    }

    public static boolean m6966a(Type type) {
        Type a = type instanceof WildcardType ? at.m6934a((WildcardType) type) : type;
        if (!(a instanceof Class)) {
            return false;
        }
        Class cls = (Class) a;
        boolean z = cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == C0733u.class || cls == Boolean.class;
        return z;
    }

    public static Collection<Object> m6967b(Type type) {
        Object rawType;
        Type a = type instanceof WildcardType ? at.m6934a((WildcardType) type) : type;
        if (a instanceof ParameterizedType) {
            rawType = ((ParameterizedType) a).getRawType();
        } else {
            Type type2 = a;
        }
        Class cls = rawType instanceof Class ? (Class) rawType : null;
        if (rawType == null || (rawType instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls != null) {
            return cls.isAssignableFrom(HashSet.class) ? new HashSet() : cls.isAssignableFrom(TreeSet.class) ? new TreeSet() : (Collection) at.m6930a(cls);
        } else {
            throw new IllegalArgumentException("unable to create new instance of type: " + rawType);
        }
    }

    public static Map<String, Object> m6968b(Class<?> cls) {
        return (cls == null || cls.isAssignableFrom(C0713a.class)) ? C0713a.m6885a() : cls.isAssignableFrom(TreeMap.class) ? new TreeMap() : (Map) at.m6930a((Class) cls);
    }

    public static Map<String, Object> m6969b(Object obj) {
        return (obj == null || C0728p.m6965a(obj)) ? Collections.emptyMap() : obj instanceof Map ? (Map) obj : new C0729q(obj, false);
    }

    public static <T> T m6970c(T t) {
        if (t == null || C0728p.m6966a(t.getClass())) {
            return t;
        }
        if (t instanceof C0656w) {
            return ((C0656w) t).clone();
        }
        Class cls = t.getClass();
        Object newInstance = cls.isArray() ? Array.newInstance(cls.getComponentType(), Array.getLength(t)) : t instanceof C0713a ? ((C0713a) t).m6895b() : at.m6930a(cls);
        C0728p.m6964a((Object) t, newInstance);
        return newInstance;
    }

    public static boolean m6971d(Object obj) {
        return obj == null || C0728p.m6966a(obj.getClass());
    }
}
