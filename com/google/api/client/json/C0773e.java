package com.google.api.client.json;

import com.google.api.client.p050d.C0656w;
import com.google.api.client.p050d.C0724l;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0733u;
import com.google.api.client.p050d.C0734v;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.at;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.json.e */
public abstract class C0773e {
    private void m7064a(boolean z, Object obj) {
        boolean z2 = true;
        if (obj != null) {
            Class cls = obj.getClass();
            if (C0728p.m6965a(obj)) {
                m7080f();
            } else if (obj instanceof String) {
                m7076b((String) obj);
            } else if (obj instanceof Number) {
                if (z) {
                    m7076b(obj.toString());
                } else if (obj instanceof BigDecimal) {
                    m7072a((BigDecimal) obj);
                } else if (obj instanceof BigInteger) {
                    m7073a((BigInteger) obj);
                } else if (obj instanceof Long) {
                    m7069a(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    float floatValue = ((Number) obj).floatValue();
                    boolean z3 = (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) ? false : true;
                    am.m6914a(z3);
                    m7067a(floatValue);
                } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    m7068a(((Number) obj).intValue());
                } else {
                    double doubleValue = ((Number) obj).doubleValue();
                    if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                        z2 = false;
                    }
                    am.m6914a(z2);
                    m7066a(doubleValue);
                }
            } else if (obj instanceof Boolean) {
                m7074a(((Boolean) obj).booleanValue());
            } else if (obj instanceof C0733u) {
                m7076b(((C0733u) obj).m6979a());
            } else if ((obj instanceof Iterable) || cls.isArray()) {
                m7075b();
                for (Object a : at.m6929a(obj)) {
                    m7064a(z, a);
                }
                m7077c();
            } else if (cls.isEnum()) {
                r0 = C0734v.m6980a((Enum) obj).m6987b();
                if (r0 == null) {
                    m7080f();
                } else {
                    m7076b(r0);
                }
            } else {
                m7078d();
                boolean z4 = (obj instanceof Map) && !(obj instanceof C0656w);
                C0724l a2 = z4 ? null : C0724l.m6952a(cls);
                for (Entry entry : C0728p.m6969b(obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        boolean z5;
                        r0 = (String) entry.getKey();
                        if (z4) {
                            z5 = z;
                        } else {
                            Field b = a2.m6956b(r0);
                            z5 = (b == null || b.getAnnotation(C0782j.class) == null) ? false : true;
                        }
                        m7071a(r0);
                        m7064a(z5, value);
                    }
                }
                m7079e();
            }
        }
    }

    public abstract void m7065a();

    public abstract void m7066a(double d);

    public abstract void m7067a(float f);

    public abstract void m7068a(int i);

    public abstract void m7069a(long j);

    public final void m7070a(Object obj) {
        m7064a(false, obj);
    }

    public abstract void m7071a(String str);

    public abstract void m7072a(BigDecimal bigDecimal);

    public abstract void m7073a(BigInteger bigInteger);

    public abstract void m7074a(boolean z);

    public abstract void m7075b();

    public abstract void m7076b(String str);

    public abstract void m7077c();

    public abstract void m7078d();

    public abstract void m7079e();

    public abstract void m7080f();

    public void m7081g() {
    }
}
