package com.google.api.client.p051b;

import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0734v;
import com.google.api.client.p050d.at;
import com.google.api.client.p050d.p065a.C0707a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.b.aj */
public class aj {
    static final Map<Character, ak> f7399a;

    static {
        f7399a = new HashMap();
        ak.values();
    }

    static ak m6628a(String str) {
        ak akVar = (ak) f7399a.get(Character.valueOf(str.charAt(0)));
        return akVar == null ? ak.SIMPLE : akVar;
    }

    public static String m6629a(String str, Object obj, boolean z) {
        Map a = aj.m6633a(obj);
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int length = str.length();
        while (i < length) {
            int indexOf = str.indexOf(123, i);
            if (indexOf != -1) {
                stringBuilder.append(str.substring(i, indexOf));
                i = str.indexOf(125, indexOf + 2);
                String substring = str.substring(indexOf + 1, i);
                int i2 = i + 1;
                boolean endsWith = substring.endsWith("*");
                ak a2 = aj.m6628a(substring);
                int d = a2.m6638d();
                i = substring.length();
                if (endsWith) {
                    i--;
                }
                substring = substring.substring(d, i);
                Object remove = a.remove(substring);
                if (remove == null) {
                    i = i2;
                } else {
                    if (remove instanceof Iterator) {
                        remove = aj.m6631a(substring, (Iterator) remove, endsWith, a2);
                    } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                        remove = aj.m6631a(substring, at.m6929a(remove).iterator(), endsWith, a2);
                    } else if (remove.getClass().isEnum()) {
                        substring = C0734v.m6980a((Enum) remove).m6987b();
                        if (substring != null) {
                            remove = C0707a.m6871c(substring);
                        }
                    } else {
                        remove = !C0728p.m6971d(remove) ? aj.m6632a(substring, aj.m6633a(remove), endsWith, a2) : C0707a.m6871c(remove.toString());
                    }
                    stringBuilder.append(remove);
                    i = i2;
                }
            } else if (i == 0 && !z) {
                return str;
            } else {
                stringBuilder.append(str.substring(i));
                if (z) {
                    C0686k.m6700a(a.entrySet(), stringBuilder);
                }
                return stringBuilder.toString();
            }
        }
        if (z) {
            C0686k.m6700a(a.entrySet(), stringBuilder);
        }
        return stringBuilder.toString();
    }

    public static String m6630a(String str, String str2, Object obj, boolean z) {
        if (str2.startsWith("/")) {
            C0686k c0686k = new C0686k(str);
            c0686k.m6708b(null);
            str2 = c0686k.m6707b() + str2;
        } else if (!(str2.startsWith("http://") || str2.startsWith("https://"))) {
            str2 = str + str2;
        }
        return aj.m6629a(str2, obj, z);
    }

    private static String m6631a(String str, Iterator<?> it, boolean z, ak akVar) {
        if (!it.hasNext()) {
            return "";
        }
        String b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(akVar.m6634a());
        if (z) {
            b = akVar.m6636b();
        } else {
            b = ",";
            if (akVar.m6637c()) {
                stringBuilder.append(C0707a.m6871c(str));
                stringBuilder.append("=");
            }
        }
        while (it.hasNext()) {
            stringBuilder.append(akVar.m6635a(it.next().toString()));
            if (it.hasNext()) {
                stringBuilder.append(b);
            }
        }
        return stringBuilder.toString();
    }

    private static String m6632a(String str, Map<String, Object> map, boolean z, ak akVar) {
        if (map.isEmpty()) {
            return "";
        }
        String str2;
        String b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(akVar.m6634a());
        if (z) {
            str2 = "=";
            b = akVar.m6636b();
        } else {
            String str3 = ",";
            String str4 = ",";
            if (akVar.m6637c()) {
                stringBuilder.append(C0707a.m6871c(str));
                stringBuilder.append("=");
            }
            str2 = str4;
            b = str3;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            str3 = akVar.m6635a((String) entry.getKey());
            str4 = akVar.m6635a(entry.getValue().toString());
            stringBuilder.append(str3);
            stringBuilder.append(str2);
            stringBuilder.append(str4);
            if (it.hasNext()) {
                stringBuilder.append(b);
            }
        }
        return stringBuilder.toString();
    }

    private static Map<String, Object> m6633a(Object obj) {
        Map<String, Object> linkedHashMap = new LinkedHashMap();
        for (Entry entry : C0728p.m6969b(obj).entrySet()) {
            Object value = entry.getValue();
            if (!(value == null || C0728p.m6965a(value))) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }
}
