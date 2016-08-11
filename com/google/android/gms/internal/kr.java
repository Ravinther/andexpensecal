package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@id
public final class kr {
    public final av f6975a;
    public final ma f6976b;
    public final List<String> f6977c;
    public final int f6978d;
    public final List<String> f6979e;
    public final List<String> f6980f;
    public final int f6981g;
    public final long f6982h;
    public final String f6983i;
    public final JSONObject f6984j;
    public final boolean f6985k;
    public final dt f6986l;
    public final eh f6987m;
    public final String f6988n;
    public final du f6989o;
    public final dw f6990p;
    public final long f6991q;
    public final ay f6992r;
    public final long f6993s;
    public final long f6994t;
    public final long f6995u;
    public final String f6996v;
    public final cg f6997w;

    public kr(av avVar, ma maVar, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, dt dtVar, eh ehVar, String str2, du duVar, dw dwVar, long j2, ay ayVar, long j3, long j4, long j5, String str3, JSONObject jSONObject, cg cgVar) {
        this.f6975a = avVar;
        this.f6976b = maVar;
        this.f6977c = list != null ? Collections.unmodifiableList(list) : null;
        this.f6978d = i;
        this.f6979e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f6980f = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f6981g = i2;
        this.f6982h = j;
        this.f6983i = str;
        this.f6985k = z;
        this.f6986l = dtVar;
        this.f6987m = ehVar;
        this.f6988n = str2;
        this.f6989o = duVar;
        this.f6990p = dwVar;
        this.f6991q = j2;
        this.f6992r = ayVar;
        this.f6993s = j3;
        this.f6994t = j4;
        this.f6995u = j5;
        this.f6996v = str3;
        this.f6984j = jSONObject;
        this.f6997w = cgVar;
    }

    public kr(ks ksVar, ma maVar, dt dtVar, eh ehVar, String str, dw dwVar, cg cgVar) {
        ma maVar2 = maVar;
        dt dtVar2 = dtVar;
        eh ehVar2 = ehVar;
        String str2 = str;
        dw dwVar2 = dwVar;
        this(ksVar.f6998a.f6540c, maVar2, ksVar.f6999b.f6558d, ksVar.f7002e, ksVar.f6999b.f6560f, ksVar.f6999b.f6564j, ksVar.f6999b.f6566l, ksVar.f6999b.f6565k, ksVar.f6998a.f6546i, ksVar.f6999b.f6562h, dtVar2, ehVar2, str2, ksVar.f7000c, dwVar2, ksVar.f6999b.f6563i, ksVar.f7001d, ksVar.f6999b.f6561g, ksVar.f7003f, ksVar.f7004g, ksVar.f6999b.f6569o, ksVar.f7005h, cgVar);
    }
}
