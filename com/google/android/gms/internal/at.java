package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@id
public class at {
    public static final at f6236a;

    static {
        f6236a = new at();
    }

    private at() {
    }

    public static at m5069a() {
        return f6236a;
    }

    public av m5070a(Context context, bm bmVar) {
        Date a = bmVar.m5137a();
        long time = a != null ? a.getTime() : -1;
        String b = bmVar.m5140b();
        int c = bmVar.m5141c();
        Collection d = bmVar.m5143d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a2 = bmVar.m5138a(context);
        int k = bmVar.m5150k();
        Location e = bmVar.m5144e();
        Bundle b2 = bmVar.m5139b(AdMobAdapter.class);
        boolean f = bmVar.m5145f();
        String g = bmVar.m5146g();
        SearchAdRequest h = bmVar.m5147h();
        return new av(4, time, b2, c, unmodifiableList, a2, k, f, g, h != null ? new bj(h) : null, e, b, bmVar.m5149j());
    }
}
