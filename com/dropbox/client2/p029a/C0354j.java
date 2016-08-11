package com.dropbox.client2.p029a;

import java.util.Map;

/* renamed from: com.dropbox.client2.a.j */
public class C0354j {
    public String f2334a;
    public String f2335b;
    public Map<String, Object> f2336c;

    public C0354j(Map<String, Object> map) {
        this.f2336c = map;
        Object obj = map.get("error");
        if (obj instanceof String) {
            this.f2334a = (String) obj;
        } else if (obj instanceof Map) {
            for (Object obj2 : ((Map) obj2).values()) {
                if (obj2 instanceof String) {
                    this.f2334a = (String) obj2;
                }
            }
        }
        obj2 = map.get("user_error");
        if (obj2 instanceof String) {
            this.f2335b = (String) obj2;
        }
    }
}
