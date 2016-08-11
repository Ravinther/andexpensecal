package com.google.api.client.p050d;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.api.client.d.v */
public class C0734v {
    private static final Map<Field, C0734v> f7641a;
    private final boolean f7642b;
    private final Field f7643c;
    private final String f7644d;

    static {
        f7641a = new WeakHashMap();
    }

    C0734v(Field field, String str) {
        this.f7643c = field;
        this.f7644d = str == null ? null : str.intern();
        this.f7642b = C0728p.m6966a(m6988c());
    }

    public static C0734v m6980a(Enum<?> enumR) {
        boolean z = true;
        try {
            C0734v a = C0734v.m6981a(enumR.getClass().getField(enumR.name()));
            if (a == null) {
                z = false;
            }
            am.m6916a(z, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static C0734v m6981a(Field field) {
        C0734v c0734v = null;
        if (field != null) {
            synchronized (f7641a) {
                C0734v c0734v2 = (C0734v) f7641a.get(field);
                boolean isEnumConstant = field.isEnumConstant();
                if (c0734v2 != null || (!isEnumConstant && Modifier.isStatic(field.getModifiers()))) {
                    c0734v = c0734v2;
                } else {
                    String a;
                    if (isEnumConstant) {
                        aw awVar = (aw) field.getAnnotation(aw.class);
                        if (awVar != null) {
                            a = awVar.m6941a();
                        } else if (((ai) field.getAnnotation(ai.class)) != null) {
                            a = null;
                        }
                    } else {
                        ab abVar = (ab) field.getAnnotation(ab.class);
                        if (abVar == null) {
                        } else {
                            a = abVar.m6902a();
                            field.setAccessible(true);
                        }
                    }
                    c0734v2 = new C0734v(field, "##default".equals(a) ? field.getName() : a);
                    f7641a.put(field, c0734v2);
                    c0734v = c0734v2;
                }
            }
        }
        return c0734v;
    }

    public static Object m6982a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void m6983a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a = C0734v.m6982a(field, obj);
            if (obj2 == null) {
                if (a == null) {
                    return;
                }
            } else if (obj2.equals(a)) {
                return;
            }
            throw new IllegalArgumentException("expected final value <" + a + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
        }
        try {
            field.set(obj, obj2);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public Object m6984a(Object obj) {
        return C0734v.m6982a(this.f7643c, obj);
    }

    public Field m6985a() {
        return this.f7643c;
    }

    public void m6986a(Object obj, Object obj2) {
        C0734v.m6983a(this.f7643c, obj, obj2);
    }

    public String m6987b() {
        return this.f7644d;
    }

    public Class<?> m6988c() {
        return this.f7643c.getType();
    }

    public Type m6989d() {
        return this.f7643c.getGenericType();
    }

    public boolean m6990e() {
        return Modifier.isFinal(this.f7643c.getModifiers());
    }

    public boolean m6991f() {
        return this.f7642b;
    }

    public <T extends Enum<T>> T m6992g() {
        return Enum.valueOf(this.f7643c.getDeclaringClass(), this.f7643c.getName());
    }
}
