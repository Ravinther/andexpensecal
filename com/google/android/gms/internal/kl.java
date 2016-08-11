package com.google.android.gms.internal;

import java.util.Map;

class kl implements cz {
    final /* synthetic */ kj f6924a;

    kl(kj kjVar) {
        this.f6924a = kjVar;
    }

    public void m5892a(ma maVar, Map<String, String> map) {
        synchronized (this.f6924a.f6920d) {
            if (this.f6924a.f6922f.isDone()) {
                return;
            }
            kn knVar = new kn(-2, map);
            String d = knVar.m5921d();
            if (d == null) {
                ly.m6074e("URL missing in loadAdUrl GMSG.");
                return;
            }
            if (d.contains("%40mediation_adapters%40")) {
                String replaceAll = d.replaceAll("%40mediation_adapters%40", la.m5989a(maVar.getContext(), (String) map.get("check_adapters"), this.f6924a.f6921e));
                knVar.m5918a(replaceAll);
                ly.m6072d("Ad request URL modified to " + replaceAll);
            }
            this.f6924a.f6922f.m6035a(knVar);
        }
    }
}
