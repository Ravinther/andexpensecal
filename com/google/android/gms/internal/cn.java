package com.google.android.gms.internal;

import java.util.Map;

@id
public final class cn implements cz {
    private final co f6386a;

    public cn(co coVar) {
        this.f6386a = coVar;
    }

    public void m5292a(ma maVar, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            ly.m6074e("App event with no name parameter.");
        } else {
            this.f6386a.m5293a(str, (String) map.get("info"));
        }
    }
}
