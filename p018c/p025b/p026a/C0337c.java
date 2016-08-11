package p018c.p025b.p026a;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: c.b.a.c */
public class C0337c extends HashMap implements C0335b, Map {
    private static String m2260a(String str, Object obj, StringBuffer stringBuffer) {
        stringBuffer.append('\"');
        if (str == null) {
            stringBuffer.append("null");
        } else {
            C0338d.m2266a(str, stringBuffer);
        }
        stringBuffer.append('\"').append(':');
        stringBuffer.append(C0338d.m2265a(obj));
        return stringBuffer.toString();
    }

    public static String m2261a(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Object obj = 1;
        stringBuffer.append('{');
        for (Entry entry : map.entrySet()) {
            Object obj2;
            if (obj != null) {
                obj2 = null;
            } else {
                stringBuffer.append(',');
                obj2 = obj;
            }
            C0337c.m2260a(String.valueOf(entry.getKey()), entry.getValue(), stringBuffer);
            obj = obj2;
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public String m2262a() {
        return C0337c.m2261a(this);
    }

    public String toString() {
        return m2262a();
    }
}
