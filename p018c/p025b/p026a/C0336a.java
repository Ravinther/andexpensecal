package p018c.p025b.p026a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.b.a.a */
public class C0336a extends ArrayList implements C0335b, List {
    public static String m2258a(List list) {
        if (list == null) {
            return "null";
        }
        Object obj = 1;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        for (Object next : list) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuffer.append(',');
            }
            if (next == null) {
                stringBuffer.append("null");
            } else {
                stringBuffer.append(C0338d.m2265a(next));
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public String m2259a() {
        return C0336a.m2258a(this);
    }

    public String toString() {
        return m2259a();
    }
}
