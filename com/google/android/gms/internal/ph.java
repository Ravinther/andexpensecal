package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import java.util.List;

@id
class ph {
    public final pg f7301a;
    public final String f7302b;
    public final Context f7303c;
    public final oc f7304d;
    public final gs f7305e;
    public az f7306f;
    public lb f7307g;
    public lb f7308h;
    public ay f7309i;
    public kr f7310j;
    public ks f7311k;
    public kt f7312l;
    public bi f7313m;
    public ht f7314n;
    public hh f7315o;
    public cl f7316p;
    public cm f7317q;
    public bz f7318r;
    public List<String> f7319s;
    public hc f7320t;
    public kz f7321u;
    public View f7322v;
    public int f7323w;
    public boolean f7324x;
    public boolean f7325y;
    private HashSet<kt> f7326z;

    public ph(Context context, ay ayVar, String str, gs gsVar) {
        this.f7321u = null;
        this.f7322v = null;
        this.f7323w = 0;
        this.f7324x = false;
        this.f7325y = false;
        this.f7326z = null;
        if (ayVar.f6257e) {
            this.f7301a = null;
        } else {
            this.f7301a = new pg(context);
            this.f7301a.setMinimumWidth(ayVar.f6259g);
            this.f7301a.setMinimumHeight(ayVar.f6256d);
            this.f7301a.setVisibility(4);
        }
        this.f7309i = ayVar;
        this.f7302b = str;
        this.f7303c = context;
        this.f7305e = gsVar;
        this.f7304d = new oc(new pm(this));
    }

    public HashSet<kt> m6475a() {
        return this.f7326z;
    }

    public void m6476a(HashSet<kt> hashSet) {
        this.f7326z = hashSet;
    }
}
