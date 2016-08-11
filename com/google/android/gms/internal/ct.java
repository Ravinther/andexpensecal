package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

final class ct implements cz {
    ct() {
    }

    public void m5297a(ma maVar, Map<String, String> map) {
        String str = (String) map.get("u");
        if (str == null) {
            ly.m6074e("URL missing from click GMSG.");
            return;
        }
        Uri a;
        Uri parse = Uri.parse(str);
        try {
            oc h = maVar.m6099h();
            if (h != null && h.m6331b(parse)) {
                a = h.m6327a(parse, maVar.getContext());
                new lw(maVar.getContext(), maVar.m6100i().f6668b, a.toString()).m5624e();
            }
        } catch (od e) {
            ly.m6074e("Unable to append parameter to URL: " + str);
        }
        a = parse;
        new lw(maVar.getContext(), maVar.m6100i().f6668b, a.toString()).m5624e();
    }
}
