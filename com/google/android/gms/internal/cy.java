package com.google.android.gms.internal;

import java.util.Map;

final class cy implements cz {
    cy() {
    }

    public void m5302a(ma maVar, Map<String, String> map) {
        String str = (String) map.get("ty");
        String str2 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt((String) map.get("tx"));
            int parseInt2 = Integer.parseInt(str);
            int parseInt3 = Integer.parseInt(str2);
            oc h = maVar.m6099h();
            if (h != null) {
                h.m6328a().m5944a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            ly.m6074e("Could not parse touch parameters from gmsg.");
        }
    }
}
