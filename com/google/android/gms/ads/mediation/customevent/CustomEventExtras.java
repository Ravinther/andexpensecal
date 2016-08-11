package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras implements NetworkExtras {
    private final HashMap<String, Object> f6076a;

    public CustomEventExtras() {
        this.f6076a = new HashMap();
    }

    public Object getExtra(String str) {
        return this.f6076a.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.f6076a.put(str, obj);
    }
}
