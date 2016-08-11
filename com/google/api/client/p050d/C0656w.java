package com.google.api.client.p050d;

import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.api.client.d.w */
public class C0656w extends AbstractMap<String, Object> implements Cloneable {
    final C0724l classInfo;
    Map<String, Object> unknownFields;

    public C0656w() {
        this(EnumSet.noneOf(C0737z.class));
    }

    public C0656w(EnumSet<C0737z> enumSet) {
        this.unknownFields = C0713a.m6885a();
        this.classInfo = C0724l.m6953a(getClass(), enumSet.contains(C0737z.IGNORE_CASE));
    }

    public C0656w clone() {
        try {
            Object obj = (C0656w) super.clone();
            C0728p.m6964a((Object) this, obj);
            obj.unknownFields = (Map) C0728p.m6970c(this.unknownFields);
            return obj;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public Set<Entry<String, Object>> entrySet() {
        return new C0736y(this);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        obj = (String) obj;
        C0734v a = this.classInfo.m6954a((String) obj);
        if (a != null) {
            return a.m6984a((Object) this);
        }
        if (this.classInfo.m6955a()) {
            obj = obj.toLowerCase();
        }
        return this.unknownFields.get(obj);
    }

    public final C0724l getClassInfo() {
        return this.classInfo;
    }

    public final Map<String, Object> getUnknownKeys() {
        return this.unknownFields;
    }

    public final Object put(String str, Object obj) {
        C0734v a = this.classInfo.m6954a(str);
        if (a != null) {
            Object a2 = a.m6984a((Object) this);
            a.m6986a((Object) this, obj);
            return a2;
        }
        Object toLowerCase;
        if (this.classInfo.m6955a()) {
            toLowerCase = str.toLowerCase();
        }
        return this.unknownFields.put(toLowerCase, obj);
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Entry entry : map.entrySet()) {
            set((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        obj = (String) obj;
        if (this.classInfo.m6954a((String) obj) != null) {
            throw new UnsupportedOperationException();
        }
        if (this.classInfo.m6955a()) {
            obj = obj.toLowerCase();
        }
        return this.unknownFields.remove(obj);
    }

    public C0656w set(String str, Object obj) {
        C0734v a = this.classInfo.m6954a(str);
        if (a != null) {
            a.m6986a((Object) this, obj);
        } else {
            Object toLowerCase;
            if (this.classInfo.m6955a()) {
                toLowerCase = str.toLowerCase();
            }
            this.unknownFields.put(toLowerCase, obj);
        }
        return this;
    }

    public final void setUnknownKeys(Map<String, Object> map) {
        this.unknownFields = map;
    }
}
