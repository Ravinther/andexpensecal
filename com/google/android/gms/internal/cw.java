package com.google.android.gms.internal;

import java.util.Map;

final class cw implements cz {
    cw() {
    }

    public void m5300a(ma maVar, Map<String, String> map) {
        String str = (String) map.get("u");
        if (str == null) {
            ly.m6074e("URL missing from httpTrack GMSG.");
        } else {
            new lw(maVar.getContext(), maVar.m6100i().f6668b, str).m5624e();
        }
    }
}
